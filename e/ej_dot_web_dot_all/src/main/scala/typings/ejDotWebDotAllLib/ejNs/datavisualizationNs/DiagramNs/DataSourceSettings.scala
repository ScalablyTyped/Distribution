package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the parent id of the data source item
    * @Default {''}
    */
  var parent: js.UndefOr[java.lang.String] = js.undefined
  /** Describes query to retrieve a set of data from the specified datasource
    * @Default {null}
    */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the unique id of the root data source item
    */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /** Describes the name of the table on which the specified query has to be executed
    * @Default {null}
    */
  var tableName: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceSettings {
  @scala.inline
  def apply(
    connectionDataSource: DataSourceSettingsConnectionDataSource = null,
    crudAction: DataSourceSettingsCrudAction = null,
    customFields: js.Array[_] = null,
    dataSource: js.Any = null,
    id: java.lang.String = null,
    parent: java.lang.String = null,
    query: java.lang.String = null,
    root: java.lang.String = null,
    tableName: java.lang.String = null
  ): DataSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (connectionDataSource != null) __obj.updateDynamic("connectionDataSource")(connectionDataSource)
    if (crudAction != null) __obj.updateDynamic("crudAction")(crudAction)
    if (customFields != null) __obj.updateDynamic("customFields")(customFields)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (id != null) __obj.updateDynamic("id")(id)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (query != null) __obj.updateDynamic("query")(query)
    if (root != null) __obj.updateDynamic("root")(root)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[DataSourceSettings]
  }
}

