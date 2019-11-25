package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSettingsCrudAction extends js.Object {
  /** Specifies the create method which is used to get the nodes to be added from client side to the server side
    * @Default {null}
    */
  var create: js.UndefOr[String] = js.undefined
  /** Specifies the destroy method which is used to get the deleted items data from client side to the server side
    * @Default {null}
    */
  var destroy: js.UndefOr[String] = js.undefined
  /** Specifies the read method to get the created nodes from client side to the server side
    * @Default {null}
    */
  var read: js.UndefOr[String] = js.undefined
  /** Specifies the update method which is used to get the updated data from client side to the server side
    * @Default {null}
    */
  var update: js.UndefOr[String] = js.undefined
}

object DataSourceSettingsCrudAction {
  @scala.inline
  def apply(create: String = null, destroy: String = null, read: String = null, update: String = null): DataSourceSettingsCrudAction = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSettingsCrudAction]
  }
}

