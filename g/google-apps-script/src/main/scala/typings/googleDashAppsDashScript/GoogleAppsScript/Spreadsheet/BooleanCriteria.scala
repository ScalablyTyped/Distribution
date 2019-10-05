package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BooleanCriteria extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.BooleanCriteria")
@js.native
object BooleanCriteria extends js.Object {
  @js.native
  sealed trait CELL_EMPTY extends BooleanCriteria
  
  @js.native
  sealed trait CELL_NOT_EMPTY extends BooleanCriteria
  
  @js.native
  sealed trait CUSTOM_FORMULA extends BooleanCriteria
  
  @js.native
  sealed trait DATE_AFTER extends BooleanCriteria
  
  @js.native
  sealed trait DATE_AFTER_RELATIVE extends BooleanCriteria
  
  @js.native
  sealed trait DATE_BEFORE extends BooleanCriteria
  
  @js.native
  sealed trait DATE_BEFORE_RELATIVE extends BooleanCriteria
  
  @js.native
  sealed trait DATE_EQUAL_TO extends BooleanCriteria
  
  @js.native
  sealed trait DATE_EQUAL_TO_RELATIVE extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_BETWEEN extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_EQUAL_TO extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_GREATER_THAN extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_GREATER_THAN_OR_EQUAL_TO extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_LESS_THAN extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_LESS_THAN_OR_EQUAL_TO extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_NOT_BETWEEN extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_NOT_EQUAL_TO extends BooleanCriteria
  
  @js.native
  sealed trait TEXT_CONTAINS extends BooleanCriteria
  
  @js.native
  sealed trait TEXT_DOES_NOT_CONTAIN extends BooleanCriteria
  
  @js.native
  sealed trait TEXT_ENDS_WITH extends BooleanCriteria
  
  @js.native
  sealed trait TEXT_EQUAL_TO extends BooleanCriteria
  
  @js.native
  sealed trait TEXT_STARTS_WITH extends BooleanCriteria
  
  /* 0 */ val CELL_EMPTY: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.CELL_EMPTY with Double = js.native
  /* 1 */ val CELL_NOT_EMPTY: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.CELL_NOT_EMPTY with Double = js.native
  /* 21 */ val CUSTOM_FORMULA: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.CUSTOM_FORMULA with Double = js.native
  /* 2 */ val DATE_AFTER: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_AFTER with Double = js.native
  /* 5 */ val DATE_AFTER_RELATIVE: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_AFTER_RELATIVE with Double = js.native
  /* 3 */ val DATE_BEFORE: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_BEFORE with Double = js.native
  /* 6 */ val DATE_BEFORE_RELATIVE: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_BEFORE_RELATIVE with Double = js.native
  /* 4 */ val DATE_EQUAL_TO: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_EQUAL_TO with Double = js.native
  /* 7 */ val DATE_EQUAL_TO_RELATIVE: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_EQUAL_TO_RELATIVE with Double = js.native
  /* 8 */ val NUMBER_BETWEEN: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_BETWEEN with Double = js.native
  /* 9 */ val NUMBER_EQUAL_TO: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_EQUAL_TO with Double = js.native
  /* 10 */ val NUMBER_GREATER_THAN: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_GREATER_THAN with Double = js.native
  /* 11 */ val NUMBER_GREATER_THAN_OR_EQUAL_TO: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_GREATER_THAN_OR_EQUAL_TO with Double = js.native
  /* 12 */ val NUMBER_LESS_THAN: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_LESS_THAN with Double = js.native
  /* 13 */ val NUMBER_LESS_THAN_OR_EQUAL_TO: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_LESS_THAN_OR_EQUAL_TO with Double = js.native
  /* 14 */ val NUMBER_NOT_BETWEEN: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_NOT_BETWEEN with Double = js.native
  /* 15 */ val NUMBER_NOT_EQUAL_TO: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_NOT_EQUAL_TO with Double = js.native
  /* 16 */ val TEXT_CONTAINS: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_CONTAINS with Double = js.native
  /* 17 */ val TEXT_DOES_NOT_CONTAIN: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_DOES_NOT_CONTAIN with Double = js.native
  /* 20 */ val TEXT_ENDS_WITH: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_ENDS_WITH with Double = js.native
  /* 18 */ val TEXT_EQUAL_TO: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_EQUAL_TO with Double = js.native
  /* 19 */ val TEXT_STARTS_WITH: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_STARTS_WITH with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BooleanCriteria with Double] = js.native
}

