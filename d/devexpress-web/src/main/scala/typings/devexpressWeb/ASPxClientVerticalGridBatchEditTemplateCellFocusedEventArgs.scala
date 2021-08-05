package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditTemplateCellFocused event.
  */
trait ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean
  
  /**
    * Gets the currently processed row.
    */
  var row: ASPxClientVerticalGridRow
}
object ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs {
  
  inline def apply(handled: Boolean, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs]
  }
  
  extension [Self <: ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs](x: Self) {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setRow(value: ASPxClientVerticalGridRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
