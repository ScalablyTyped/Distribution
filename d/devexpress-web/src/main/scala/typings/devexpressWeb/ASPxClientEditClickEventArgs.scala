package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client-side events which concern clicking within editors.
  */
@js.native
trait ASPxClientEditClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the HTML element related to the event.
    */
  var htmlElement: js.Any = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}

object ASPxClientEditClickEventArgs {
  @scala.inline
  def apply(htmlElement: js.Any, htmlEvent: js.Any): ASPxClientEditClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientEditClickEventArgs]
  }
  @scala.inline
  implicit class ASPxClientEditClickEventArgsOps[Self <: ASPxClientEditClickEventArgs] (val x: Self) extends AnyVal {
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

