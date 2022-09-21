package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.ViewModeChanged event.
  */
@JSGlobal("ASPxClientSpreadsheetViewModeChangedEventArgs")
@js.native
open class ASPxClientSpreadsheetViewModeChangedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientSpreadsheetViewModeChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetViewModeChangedEventArgs class.
    * @param oldViewMode Specifies the control's current view mode.
    */
  def this(oldViewMode: Any) = this()
  
  /**
    * Gets the control's current view mode when the event is triggered.
    */
  /* CompleteClass */
  var oldViewMode: typings.devexpressWeb.ASPxClientSpreadsheetViewMode = js.native
}
