package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the NodeClick event.
  */
trait BootstrapClientTreeViewNodeClickEventArgs extends BootstrapClientTreeViewNodeProcessingModeEventArgs {
  /**
    * Gets an HTML object that contains the processed Tree View node.
    * Value: An HTML object.
    */
  var htmlElement: js.Object
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: A DHTML event object.
    */
  var htmlEvent: js.Object
}

object BootstrapClientTreeViewNodeClickEventArgs {
  @scala.inline
  def apply(
    htmlElement: js.Object,
    htmlEvent: js.Object,
    node: BootstrapClientTreeViewNode,
    processOnServer: scala.Boolean
  ): BootstrapClientTreeViewNodeClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement, htmlEvent = htmlEvent, node = node, processOnServer = processOnServer)
  
    __obj.asInstanceOf[BootstrapClientTreeViewNodeClickEventArgs]
  }
}

