package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSettingsConnectionDataSourceCrudAction extends js.Object {
  /** Specifies the create method which is used to get the connectors to be added from client side to the server side
    * @Default {null}
    */
  var create: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the destroy method which is used to get the deleted items data from client side to the server side
    * @Default {null}
    */
  var destroy: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the read method which is used to get the data from client side to the server side
    * @Default {null}
    */
  var read: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the update method which is used to get the updated connectors from client side to the server side
    * @Default {null}
    */
  var update: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceSettingsConnectionDataSourceCrudAction {
  @scala.inline
  def apply(
    create: java.lang.String = null,
    destroy: java.lang.String = null,
    read: java.lang.String = null,
    update: java.lang.String = null
  ): DataSourceSettingsConnectionDataSourceCrudAction = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (read != null) __obj.updateDynamic("read")(read)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[DataSourceSettingsConnectionDataSourceCrudAction]
  }
}

