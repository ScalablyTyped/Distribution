package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.FocusedCellChanging event.
  */
@js.native
trait ASPxClientTreeListFocusedCellChangingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides information on a cell currently being focused.
    */
  var cellInfo: ASPxClientTreeListCellInfo = js.native
}

object ASPxClientTreeListFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cellInfo: ASPxClientTreeListCellInfo): ASPxClientTreeListFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListFocusedCellChangingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientTreeListFocusedCellChangingEventArgsOps[Self <: ASPxClientTreeListFocusedCellChangingEventArgs] (val x: Self) extends AnyVal {
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
    def setCellInfo(value: ASPxClientTreeListCellInfo): Self = this.set("cellInfo", value.asInstanceOf[js.Any])
  }
  
}

