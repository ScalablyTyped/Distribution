package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapTreeView control.
  */
@JSGlobal("BootstrapClientTreeView")
@js.native
class BootstrapClientTreeView () extends ASPxClientTreeView {
  /**
    * Selects the specified node within the Tree View control on the client side.
    * @param node A BootstrapClientTreeViewNode object specifying the node to select.
    */
  def SetSelectedNode(node: BootstrapClientTreeViewNode): Unit = js.native
}

