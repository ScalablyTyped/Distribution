package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.RowClick event.
  */
@js.native
trait ASPxClientGridViewRowClickEventArgs extends ASPxClientGridViewRowCancelEventArgs {
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.RowClick event.
    */
  var htmlEvent: js.Any = js.native
}

object ASPxClientGridViewRowClickEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, visibleIndex: Double): ASPxClientGridViewRowClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewRowClickEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewRowClickEventArgsOps[Self <: ASPxClientGridViewRowClickEventArgs] (val x: Self) extends AnyVal {
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

