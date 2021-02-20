package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ASPxClientSpreadsheetSelectionChangedEventArgsMutableBuilder[Self <: ASPxClientSpreadsheetSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelection(value: ASPxClientSpreadsheetSelection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
