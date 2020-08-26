package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.FocusedCellChanging event.
  */
@js.native
trait ASPxClientCardViewFocusedCellChangingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides information of a card's cell currently being focused.
    */
  var cellInfo: ASPxClientCardViewCellInfo = js.native
}

object ASPxClientCardViewFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cellInfo: ASPxClientCardViewCellInfo): ASPxClientCardViewFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewFocusedCellChangingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCardViewFocusedCellChangingEventArgsOps[Self <: ASPxClientCardViewFocusedCellChangingEventArgs] (val x: Self) extends AnyVal {
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
    def setCellInfo(value: ASPxClientCardViewCellInfo): Self = this.set("cellInfo", value.asInstanceOf[js.Any])
  }
  
}

