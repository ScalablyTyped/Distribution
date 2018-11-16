package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSourceSettingsConnectionDataSource extends js.Object {
  /** Specifies the method name which is used to get updated connectors from client side to the server side
               * @Default {null}
               */
  var crudAction: js.UndefOr[DataSourceSettingsConnectionDataSourceCrudAction] = js.undefined
  /** Specifies the custom fields to get the updated data from client side to the server side
               * @Default {[]}
               */
  var customFields: js.UndefOr[js.Array[_]] = js.undefined
  /** Sets the datasource for the connection datasource settings items.
               * @Default {null}
               */
  var dataSource: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the unique id of the connection data source item
               * @Default {null}
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the source node of the connection data source item
               * @Default {null}
               */
  var sourceNode: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the sourcePointX value of the connection data source item
               * @Default {null}
               */
  var sourcePointX: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the sourcePointY value of the connection data source item
               * @Default {null}
               */
  var sourcePointY: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the target node of the connection data source item
               * @Default {null}
               */
  var targetNode: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the targetPoint-x value of the connection data source item
               * @Default {null}
               */
  var targetPointX: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the targetPoint-y value of the connection data source item
               * @Default {null}
               */
  var targetPointY: js.UndefOr[java.lang.String] = js.undefined
}

