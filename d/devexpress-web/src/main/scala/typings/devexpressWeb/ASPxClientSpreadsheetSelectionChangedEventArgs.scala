package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.SelectionChanged event.
  */
@js.native
trait ASPxClientSpreadsheetSelectionChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an object that determines the currently selected region within the Spreadsheet.
    */
  var selection: ASPxClientSpreadsheetSelection = js.native
}

object ASPxClientSpreadsheetSelectionChangedEventArgs {
  @scala.inline
  def apply(selection: ASPxClientSpreadsheetSelection): ASPxClientSpreadsheetSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetSelectionChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientSpreadsheetSelectionChangedEventArgsOps[Self <: ASPxClientSpreadsheetSelectionChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setSelection(value: ASPxClientSpreadsheetSelection): Self = this.set("selection", value.asInstanceOf[js.Any])
  }
  
}

