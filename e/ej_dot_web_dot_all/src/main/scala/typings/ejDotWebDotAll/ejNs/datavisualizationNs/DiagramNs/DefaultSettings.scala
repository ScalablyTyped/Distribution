package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultSettings extends js.Object {
  /** Initializes the default connector properties
    * @Default {null}
    */
  var connector: js.UndefOr[js.Any] = js.undefined
  /** Initializes the default properties of groups
    * @Default {null}
    */
  var group: js.UndefOr[js.Any] = js.undefined
  /** Initializes the default properties for nodes
    * @Default {null}
    */
  var node: js.UndefOr[js.Any] = js.undefined
}

object DefaultSettings {
  @scala.inline
  def apply(connector: js.Any = null, group: js.Any = null, node: js.Any = null): DefaultSettings = {
    val __obj = js.Dynamic.literal()
    if (connector != null) __obj.updateDynamic("connector")(connector)
    if (group != null) __obj.updateDynamic("group")(group)
    if (node != null) __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[DefaultSettings]
  }
}

