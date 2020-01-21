package typings.ejWebAll.ej.datavisualization.SymbolPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultSettings extends js.Object {
  /** Defines the default properties of the connectors
    * @Default {null}
    */
  var connector: js.UndefOr[js.Any] = js.undefined
  /** Defines the default properties of the nodes
    * @Default {null}
    */
  var node: js.UndefOr[js.Any] = js.undefined
}

object DefaultSettings {
  @scala.inline
  def apply(connector: js.Any = null, node: js.Any = null): DefaultSettings = {
    val __obj = js.Dynamic.literal()
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSettings]
  }
}

