package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.RowExpandedChanging event.
  */
@js.native
trait ASPxClientVerticalGridRowExpandingEventArgs extends ASPxClientVerticalGridRowExpandedEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
}

object ASPxClientVerticalGridRowExpandingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridRowExpandingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRowExpandingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientVerticalGridRowExpandingEventArgsOps[Self <: ASPxClientVerticalGridRowExpandingEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
  }
  
}

