package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the BootstrapTreeView control.
 */
@js.native
trait BootstrapClientTreeView extends ASPxClientTreeView {
  /**
       * Selects the specified node within the Tree View control on the client side.
       * @param node A BootstrapClientTreeViewNode object specifying the node to select.
       */
  def SetSelectedNode(node: BootstrapClientTreeViewNode): scala.Unit = js.native
}

