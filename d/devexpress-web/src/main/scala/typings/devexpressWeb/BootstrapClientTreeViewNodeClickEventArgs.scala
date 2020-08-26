package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.NodeClick event.
  */
@js.native
trait BootstrapClientTreeViewNodeClickEventArgs extends BootstrapClientTreeViewNodeProcessingModeEventArgs {
  /**
    * Gets an HTML object that contains the processed Tree View node.
    */
  var htmlElement: js.Any = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}

object BootstrapClientTreeViewNodeClickEventArgs {
  @scala.inline
  def apply(
    htmlElement: js.Any,
    htmlEvent: js.Any,
    node: BootstrapClientTreeViewNode,
    processOnServer: Boolean
  ): BootstrapClientTreeViewNodeClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeViewNodeClickEventArgs]
  }
  @scala.inline
  implicit class BootstrapClientTreeViewNodeClickEventArgsOps[Self <: BootstrapClientTreeViewNodeClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHtmlElement(value: js.Any): Self = this.set("htmlElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = this.set("htmlEvent", value.asInstanceOf[js.Any])
  }
  
}

