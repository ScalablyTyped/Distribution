package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetType extends js.Object

/**
  * The different types of sheets that can exist in a spreadsheet.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.SheetType")
@js.native
object SheetType extends js.Object {
  @js.native
  sealed trait GRID extends SheetType
  
  @js.native
  sealed trait OBJECT extends SheetType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SheetType with Double] = js.native
  /* 0 */ @js.native
  object GRID extends TopLevel[GRID with Double]
  
  /* 1 */ @js.native
  object OBJECT extends TopLevel[OBJECT with Double]
  
}

