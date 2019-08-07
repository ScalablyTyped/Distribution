package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.ViewModeChanged event.
  */
@JSGlobal("ASPxClientSpreadsheetViewModeChangedEventArgs")
@js.native
class ASPxClientSpreadsheetViewModeChangedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetViewModeChangedEventArgs class.
    * @param oldViewMode Specifies the control's current view mode.
    */
  def this(oldViewMode: js.Any) = this()
  /**
    * Gets the control's current view mode when the event is triggered.
    */
  var oldViewMode: ASPxClientSpreadsheetViewMode = js.native
}

