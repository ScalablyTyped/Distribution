package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern tail clicking within the control's items.
  */
@js.native
trait ASPxClientNewsControlItemEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
  /**
    * Gets the name that uniquely identifies the processed item.
    */
  var name: js.Any = js.native
}

object ASPxClientNewsControlItemEventArgs {
  @scala.inline
  def apply(htmlElement: js.Any, htmlEvent: js.Any, name: js.Any, processOnServer: Boolean): ASPxClientNewsControlItemEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNewsControlItemEventArgs]
  }
  @scala.inline
  implicit class ASPxClientNewsControlItemEventArgsOps[Self <: ASPxClientNewsControlItemEventArgs] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

