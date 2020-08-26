package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.FocusedCellChanging event.
  */
@js.native
trait ASPxClientVerticalGridFocusedCellChangingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides information on a cell currently being focused.
    */
  var cellInfo: ASPxClientVerticalGridCellInfo = js.native
}

object ASPxClientVerticalGridFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cellInfo: ASPxClientVerticalGridCellInfo): ASPxClientVerticalGridFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridFocusedCellChangingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientVerticalGridFocusedCellChangingEventArgsOps[Self <: ASPxClientVerticalGridFocusedCellChangingEventArgs] (val x: Self) extends AnyVal {
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
    def setCellInfo(value: ASPxClientVerticalGridCellInfo): Self = this.set("cellInfo", value.asInstanceOf[js.Any])
  }
  
}

