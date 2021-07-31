package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ASPxClientSpreadsheetViewMode extends StObject
/**
  * Lists values identifying the Spreadsheet's view modes.
  */
@JSGlobal("ASPxClientSpreadsheetViewMode")
@js.native
object ASPxClientSpreadsheetViewMode extends StObject {
  
  /**
    * Specifies that the Spreadsheet is in Editing view mode. In this view mode, users can edit a document's content.
    */
  @js.native
  sealed trait Editing
    extends StObject
       with ASPxClientSpreadsheetViewMode
  
  /**
    * Specifies that the Spreadsheet is in Reading view mode. In this view mode, users cannot edit a document's content.
    */
  @js.native
  sealed trait Reading
    extends StObject
       with ASPxClientSpreadsheetViewMode
}
