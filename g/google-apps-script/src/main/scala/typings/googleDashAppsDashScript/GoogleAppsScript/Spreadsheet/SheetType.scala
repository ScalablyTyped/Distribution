package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

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
  
  /* 0 */ val GRID: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.SheetType.GRID with Double = js.native
  /* 1 */ val OBJECT: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.SheetType.OBJECT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SheetType with Double] = js.native
}

