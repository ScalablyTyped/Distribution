package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.SelectionChanged event.
  */
@JSGlobal("ASPxClientSpreadsheetSelectionChangedEventArgs")
@js.native
class ASPxClientSpreadsheetSelectionChangedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetSelectionChangedEventArgs within the specified setting.
    * @param selection An ASPxClientSpreadsheetSelection object defining the selection in the Spreadsheet.
    */
  def this(selection: ASPxClientSpreadsheetSelection) = this()
  /**
    * Gets an object that determines the currently selected region within the Spreadsheet.
    */
  var selection: ASPxClientSpreadsheetSelection = js.native
}

