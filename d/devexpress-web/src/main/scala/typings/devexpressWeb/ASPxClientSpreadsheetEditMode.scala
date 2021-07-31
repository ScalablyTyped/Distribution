package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ASPxClientSpreadsheetEditMode extends StObject
/**
  * Lists values identifying a type of the element currently being edited in the Spreadsheet control.
  */
@JSGlobal("ASPxClientSpreadsheetEditMode")
@js.native
object ASPxClientSpreadsheetEditMode extends StObject {
  
  /**
    * Specifies that the element currently being edited is the spreadsheet cell.
    */
  @js.native
  sealed trait Cell
    extends StObject
       with ASPxClientSpreadsheetEditMode
  
  /**
    * Specifies that the element currently being edited is the cell's comment.
    */
  @js.native
  sealed trait Comment
    extends StObject
       with ASPxClientSpreadsheetEditMode
  
  /**
    * Specifies that no elements are currently being edited.
    */
  @js.native
  sealed trait None
    extends StObject
       with ASPxClientSpreadsheetEditMode
}
