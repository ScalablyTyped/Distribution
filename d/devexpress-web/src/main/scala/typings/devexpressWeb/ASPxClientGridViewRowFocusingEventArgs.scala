package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.RowFocusing event.
  */
@js.native
trait ASPxClientGridViewRowFocusingEventArgs extends ASPxClientGridViewRowCancelEventArgs {
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.RowFocusing event.
    */
  var htmlEvent: js.Any = js.native
}

object ASPxClientGridViewRowFocusingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, visibleIndex: Double): ASPxClientGridViewRowFocusingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewRowFocusingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewRowFocusingEventArgsOps[Self <: ASPxClientGridViewRowFocusingEventArgs] (val x: Self) extends AnyVal {
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
    def setHtmlEvent(value: js.Any): Self = this.set("htmlEvent", value.asInstanceOf[js.Any])
  }
  
}

