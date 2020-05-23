package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.ViewModeChanged event.
  */
trait ASPxClientSpreadsheetViewModeChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the control's current view mode when the event is triggered.
    */
  var oldViewMode: ASPxClientSpreadsheetViewMode
}

object ASPxClientSpreadsheetViewModeChangedEventArgs {
  @scala.inline
  def apply(oldViewMode: ASPxClientSpreadsheetViewMode): ASPxClientSpreadsheetViewModeChangedEventArgs = {
    val __obj = js.Dynamic.literal(oldViewMode = oldViewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetViewModeChangedEventArgs]
  }
}

