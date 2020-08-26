package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.CardClick event.
  */
@js.native
trait ASPxClientCardViewCardClickEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides access to the parameters associated with the ASPxClientCardView.CardClick event.
    */
  var htmlEvent: js.Any = js.native
  /**
    * Gets the processed card's visible index.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientCardViewCardClickEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, visibleIndex: Double): ASPxClientCardViewCardClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewCardClickEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCardViewCardClickEventArgsOps[Self <: ASPxClientCardViewCardClickEventArgs] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
  }
  
}

