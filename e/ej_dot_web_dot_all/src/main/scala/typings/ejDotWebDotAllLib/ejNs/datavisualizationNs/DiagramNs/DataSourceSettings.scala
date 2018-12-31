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

