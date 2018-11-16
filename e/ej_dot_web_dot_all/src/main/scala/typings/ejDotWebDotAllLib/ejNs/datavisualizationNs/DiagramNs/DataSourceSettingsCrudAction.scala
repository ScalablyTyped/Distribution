package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSourceSettingsCrudAction extends js.Object {
  /** Specifies the create method which is used to get the nodes to be added from client side to the server side
               * @Default {null}
               */
  var create: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the destroy method which is used to get the deleted items data from client side to the server side
               * @Default {null}
               */
  var destroy: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the read method to get the created nodes from client side to the server side
               * @Default {null}
               */
  var read: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the update method which is used to get the updated data from client side to the server side
               * @Default {null}
               */
  var update: js.UndefOr[java.lang.String] = js.undefined
}

