package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.SelectionChanged event.
  */
trait ASPxClientSpreadsheetSelectionChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an object that determines the currently selected region within the Spreadsheet.
    */
  var selection: ASPxClientSpreadsheetSelection
}

object ASPxClientSpreadsheetSelectionChangedEventArgs {
  @scala.inline
  def apply(selection: ASPxClientSpreadsheetSelection): ASPxClientSpreadsheetSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetSelectionChangedEventArgs]
  }
}

