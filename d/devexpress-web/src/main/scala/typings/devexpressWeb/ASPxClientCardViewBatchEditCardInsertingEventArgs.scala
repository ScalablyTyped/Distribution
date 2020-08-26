package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditCardInserting event.
  */
@js.native
trait ASPxClientCardViewBatchEditCardInsertingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed card visible index.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientCardViewBatchEditCardInsertingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, visibleIndex: Double): ASPxClientCardViewBatchEditCardInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardInsertingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCardViewBatchEditCardInsertingEventArgsOps[Self <: ASPxClientCardViewBatchEditCardInsertingEventArgs] (val x: Self) extends AnyVal {
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
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
  }
  
}

