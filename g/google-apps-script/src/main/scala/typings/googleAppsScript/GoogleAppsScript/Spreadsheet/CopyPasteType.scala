package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CopyPasteType extends StObject
/**
  * An enumeration of possible special paste types.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.CopyPasteType")
@js.native
object CopyPasteType extends StObject {
  
  @js.native
  sealed trait PASTE_COLUMN_WIDTHS
    extends StObject
       with CopyPasteType
  
  @js.native
  sealed trait PASTE_CONDITIONAL_FORMATTING
    extends StObject
       with CopyPasteType
  
  @js.native
  sealed trait PASTE_DATA_VALIDATION
    extends StObject
       with CopyPasteType
  
  @js.native
  sealed trait PASTE_FORMAT
    extends StObject
       with CopyPasteType
  
  @js.native
  sealed trait PASTE_FORMULA
    extends StObject
       with CopyPasteType
  
  @js.native
  sealed trait PASTE_NORMAL
    extends StObject
       with CopyPasteType
  
  @js.native
  sealed trait PASTE_NO_BORDERS
    extends StObject
       with CopyPasteType
  
  @js.native
  sealed trait PASTE_VALUES
    extends StObject
       with CopyPasteType
}
