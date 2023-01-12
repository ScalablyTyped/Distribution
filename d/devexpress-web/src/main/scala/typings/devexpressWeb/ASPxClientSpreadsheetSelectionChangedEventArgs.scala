package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.SelectionChanged event.
  */
trait ASPxClientSpreadsheetSelectionChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets an object that determines the currently selected region within the Spreadsheet.
    */
  var selection: ASPxClientSpreadsheetSelection
}
object ASPxClientSpreadsheetSelectionChangedEventArgs {
  
  inline def apply(selection: ASPxClientSpreadsheetSelection): ASPxClientSpreadsheetSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientSpreadsheetSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setSelection(value: ASPxClientSpreadsheetSelection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
