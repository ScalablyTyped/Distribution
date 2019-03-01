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

object DataSourceSettingsCrudAction {
  @scala.inline
  def apply(
    create: java.lang.String = null,
    destroy: java.lang.String = null,
    read: java.lang.String = null,
    update: java.lang.String = null
  ): DataSourceSettingsCrudAction = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (read != null) __obj.updateDynamic("read")(read)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[DataSourceSettingsCrudAction]
  }
}

