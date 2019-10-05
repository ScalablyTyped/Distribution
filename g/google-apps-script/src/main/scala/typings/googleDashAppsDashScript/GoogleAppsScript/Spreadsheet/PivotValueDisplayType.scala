package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PivotValueDisplayType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.PivotValueDisplayType")
@js.native
object PivotValueDisplayType extends js.Object {
  @js.native
  sealed trait DEFAULT extends PivotValueDisplayType
  
  @js.native
  sealed trait PERCENT_OF_COLUMN_TOTAL extends PivotValueDisplayType
  
  @js.native
  sealed trait PERCENT_OF_GRAND_TOTAL extends PivotValueDisplayType
  
  @js.native
  sealed trait PERCENT_OF_ROW_TOTAL extends PivotValueDisplayType
  
  /* 0 */ val DEFAULT: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType.DEFAULT with Double = js.native
  /* 2 */ val PERCENT_OF_COLUMN_TOTAL: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType.PERCENT_OF_COLUMN_TOTAL with Double = js.native
  /* 3 */ val PERCENT_OF_GRAND_TOTAL: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType.PERCENT_OF_GRAND_TOTAL with Double = js.native
  /* 1 */ val PERCENT_OF_ROW_TOTAL: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType.PERCENT_OF_ROW_TOTAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PivotValueDisplayType with Double] = js.native
}

