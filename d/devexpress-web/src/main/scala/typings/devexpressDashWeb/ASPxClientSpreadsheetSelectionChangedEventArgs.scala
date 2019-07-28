package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the SelectionChanged event.
  */
trait ASPxClientSpreadsheetSelectionChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an object that determines the currently selected region within the Spreadsheet.
    * Value: A <see cref="ASPxClientSpreadsheetSelection" /> object defining the current selection.
    */
  var selection: ASPxClientSpreadsheetSelection
}

object ASPxClientSpreadsheetSelectionChangedEventArgs {
  @scala.inline
  def apply(selection: ASPxClientSpreadsheetSelection): ASPxClientSpreadsheetSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(selection = selection)
  
    __obj.asInstanceOf[ASPxClientSpreadsheetSelectionChangedEventArgs]
  }
}

