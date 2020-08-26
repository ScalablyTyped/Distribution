package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.RowCollapsing and ASPxClientGridView.RowExpanding events.
  */
@js.native
trait ASPxClientGridViewRowCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientGridViewRowCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, visibleIndex: Double): ASPxClientGridViewRowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewRowCancelEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewRowCancelEventArgsOps[Self <: ASPxClientGridViewRowCancelEventArgs] (val x: Self) extends AnyVal {
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

