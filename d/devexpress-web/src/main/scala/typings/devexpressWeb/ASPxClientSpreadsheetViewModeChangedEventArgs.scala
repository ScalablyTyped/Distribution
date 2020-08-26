package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.ViewModeChanged event.
  */
@js.native
trait ASPxClientSpreadsheetViewModeChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the control's current view mode when the event is triggered.
    */
  var oldViewMode: ASPxClientSpreadsheetViewMode = js.native
}

object ASPxClientSpreadsheetViewModeChangedEventArgs {
  @scala.inline
  def apply(oldViewMode: ASPxClientSpreadsheetViewMode): ASPxClientSpreadsheetViewModeChangedEventArgs = {
    val __obj = js.Dynamic.literal(oldViewMode = oldViewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetViewModeChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientSpreadsheetViewModeChangedEventArgsOps[Self <: ASPxClientSpreadsheetViewModeChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setOldViewMode(value: ASPxClientSpreadsheetViewMode): Self = this.set("oldViewMode", value.asInstanceOf[js.Any])
  }
  
}

