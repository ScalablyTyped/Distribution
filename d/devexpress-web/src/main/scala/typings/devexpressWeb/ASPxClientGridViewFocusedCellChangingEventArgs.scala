package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.FocusedCellChanging event.
  */
@js.native
trait ASPxClientGridViewFocusedCellChangingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides information on a cell currently being focused.
    */
  var cellInfo: ASPxClientGridViewCellInfo = js.native
}

object ASPxClientGridViewFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cellInfo: ASPxClientGridViewCellInfo): ASPxClientGridViewFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewFocusedCellChangingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewFocusedCellChangingEventArgsOps[Self <: ASPxClientGridViewFocusedCellChangingEventArgs] (val x: Self) extends AnyVal {
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
    def setCellInfo(value: ASPxClientGridViewCellInfo): Self = this.set("cellInfo", value.asInstanceOf[js.Any])
  }
  
}

