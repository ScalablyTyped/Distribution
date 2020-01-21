package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CopyPasteType extends js.Object

/**
  * An enumeration of possible special paste types.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.CopyPasteType")
@js.native
object CopyPasteType extends js.Object {
  @js.native
  sealed trait PASTE_COLUMN_WIDTHS extends CopyPasteType
  
  @js.native
  sealed trait PASTE_CONDITIONAL_FORMATTING extends CopyPasteType
  
  @js.native
  sealed trait PASTE_DATA_VALIDATION extends CopyPasteType
  
  @js.native
  sealed trait PASTE_FORMAT extends CopyPasteType
  
  @js.native
  sealed trait PASTE_FORMULA extends CopyPasteType
  
  @js.native
  sealed trait PASTE_NORMAL extends CopyPasteType
  
  @js.native
  sealed trait PASTE_NO_BORDERS extends CopyPasteType
  
  @js.native
  sealed trait PASTE_VALUES extends CopyPasteType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CopyPasteType with Double] = js.native
  /* 7 */ @js.native
  object PASTE_COLUMN_WIDTHS extends TopLevel[PASTE_COLUMN_WIDTHS with Double]
  
  /* 6 */ @js.native
  object PASTE_CONDITIONAL_FORMATTING extends TopLevel[PASTE_CONDITIONAL_FORMATTING with Double]
  
  /* 4 */ @js.native
  object PASTE_DATA_VALIDATION extends TopLevel[PASTE_DATA_VALIDATION with Double]
  
  /* 2 */ @js.native
  object PASTE_FORMAT extends TopLevel[PASTE_FORMAT with Double]
  
  /* 3 */ @js.native
  object PASTE_FORMULA extends TopLevel[PASTE_FORMULA with Double]
  
  /* 0 */ @js.native
  object PASTE_NORMAL extends TopLevel[PASTE_NORMAL with Double]
  
  /* 1 */ @js.native
  object PASTE_NO_BORDERS extends TopLevel[PASTE_NO_BORDERS with Double]
  
  /* 5 */ @js.native
  object PASTE_VALUES extends TopLevel[PASTE_VALUES with Double]
  
}

