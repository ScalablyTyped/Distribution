package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.SelectionChanged event.
  */
@JSGlobal("ASPxClientSpreadsheetSelectionChangedEventArgs")
@js.native
class ASPxClientSpreadsheetSelectionChangedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientSpreadsheetSelectionChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetSelectionChangedEventArgs within the specified setting.
    * @param selection An ASPxClientSpreadsheetSelection object defining the selection in the Spreadsheet.
    */
  def this(selection: typings.devexpressWeb.ASPxClientSpreadsheetSelection) = this()
  /**
    * Gets an object that determines the currently selected region within the Spreadsheet.
    */
  /* CompleteClass */
  override var selection: typings.devexpressWeb.ASPxClientSpreadsheetSelection = js.native
}

