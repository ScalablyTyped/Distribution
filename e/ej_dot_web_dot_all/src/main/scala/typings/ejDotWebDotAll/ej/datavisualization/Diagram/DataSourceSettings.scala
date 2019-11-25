package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSettings extends js.Object {
  /** Defines the data source either as a collection of objects or as an instance of ej.DataManager
    * @Default {null}
    */
  var connectionDataSource: js.UndefOr[DataSourceSettingsConnectionDataSource] = js.undefined
  /** Specifies the method name which is used to get the updated data from client side to the server side
    * @Default {null}
    */
  var crudAction: js.UndefOr[DataSourceSettingsCrudAction] = js.undefined
  /** Specifies the custom fields to get the updated data from client side to the server side
    * @Default {[]}
    */
  var customFields: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the data source either as a collection of objects or as an instance of ej.DataManager
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Sets the unique id of the data source items
    */
  var id: js.UndefOr[String] = js.undefined
  /** Defines the parent id of the data source item
    * @Default {''}
    */
  var parent: js.UndefOr[String] = js.undefined
  /** Describes query to retrieve a set of data from the specified datasource
    * @Default {null}
    */
  var query: js.UndefOr[String] = js.undefined
  /** Sets the unique id of the root data source item
    */
  var root: js.UndefOr[String] = js.undefined
  /** Describes the name of the table on which the specified query has to be executed
    * @Default {null}
    */
  var tableName: js.UndefOr[String] = js.undefined
}

object DataSourceSettings {
  @scala.inline
  def apply(
    connectionDataSource: DataSourceSettingsConnectionDataSource = null,
    crudAction: DataSourceSettingsCrudAction = null,
    customFields: js.Array[_] = null,
    dataSource: js.Any = null,
    id: String = null,
    parent: String = null,
    query: String = null,
    root: String = null,
    tableName: String = null
  ): DataSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (connectionDataSource != null) __obj.updateDynamic("connectionDataSource")(connectionDataSource.asInstanceOf[js.Any])
    if (crudAction != null) __obj.updateDynamic("crudAction")(crudAction.asInstanceOf[js.Any])
    if (customFields != null) __obj.updateDynamic("customFields")(customFields.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSettings]
  }
}

