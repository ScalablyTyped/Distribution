package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ASPxClientSpreadsheetViewModeChangedEventArgsMutableBuilder[Self <: ASPxClientSpreadsheetViewModeChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldViewMode(value: ASPxClientSpreadsheetViewMode): Self = StObject.set(x, "oldViewMode", value.asInstanceOf[js.Any])
  }
}
