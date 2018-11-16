package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataValidationCriteria extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.DataValidationCriteria")
@js.native
object DataValidationCriteria extends js.Object {
  @js.native
  sealed trait CHECKBOX
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait CUSTOM_FORMULA
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait DATE_AFTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait DATE_BEFORE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait DATE_BETWEEN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait DATE_EQUAL_TO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait DATE_IS_VALID_DATE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait DATE_NOT_BETWEEN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait DATE_ON_OR_AFTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait DATE_ON_OR_BEFORE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_BETWEEN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_EQUAL_TO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_GREATER_THAN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_GREATER_THAN_OR_EQUAL_TO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_LESS_THAN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_LESS_THAN_OR_EQUAL_TO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_NOT_BETWEEN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_NOT_EQUAL_TO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait TEXT_CONTAINS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait TEXT_DOES_NOT_CONTAIN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait TEXT_EQUAL_TO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait TEXT_IS_VALID_EMAIL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait TEXT_IS_VALID_URL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait VALUE_IN_LIST
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  @js.native
  sealed trait VALUE_IN_RANGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria
  
  val CHECKBOX: CHECKBOX with java.lang.String = js.native
  val CUSTOM_FORMULA: CUSTOM_FORMULA with java.lang.String = js.native
  val DATE_AFTER: DATE_AFTER with java.lang.String = js.native
  val DATE_BEFORE: DATE_BEFORE with java.lang.String = js.native
  val DATE_BETWEEN: DATE_BETWEEN with java.lang.String = js.native
  val DATE_EQUAL_TO: DATE_EQUAL_TO with java.lang.String = js.native
  val DATE_IS_VALID_DATE: DATE_IS_VALID_DATE with java.lang.String = js.native
  val DATE_NOT_BETWEEN: DATE_NOT_BETWEEN with java.lang.String = js.native
  val DATE_ON_OR_AFTER: DATE_ON_OR_AFTER with java.lang.String = js.native
  val DATE_ON_OR_BEFORE: DATE_ON_OR_BEFORE with java.lang.String = js.native
  val NUMBER_BETWEEN: NUMBER_BETWEEN with java.lang.String = js.native
  val NUMBER_EQUAL_TO: NUMBER_EQUAL_TO with java.lang.String = js.native
  val NUMBER_GREATER_THAN: NUMBER_GREATER_THAN with java.lang.String = js.native
  val NUMBER_GREATER_THAN_OR_EQUAL_TO: NUMBER_GREATER_THAN_OR_EQUAL_TO with java.lang.String = js.native
  val NUMBER_LESS_THAN: NUMBER_LESS_THAN with java.lang.String = js.native
  val NUMBER_LESS_THAN_OR_EQUAL_TO: NUMBER_LESS_THAN_OR_EQUAL_TO with java.lang.String = js.native
  val NUMBER_NOT_BETWEEN: NUMBER_NOT_BETWEEN with java.lang.String = js.native
  val NUMBER_NOT_EQUAL_TO: NUMBER_NOT_EQUAL_TO with java.lang.String = js.native
  val TEXT_CONTAINS: TEXT_CONTAINS with java.lang.String = js.native
  val TEXT_DOES_NOT_CONTAIN: TEXT_DOES_NOT_CONTAIN with java.lang.String = js.native
  val TEXT_EQUAL_TO: TEXT_EQUAL_TO with java.lang.String = js.native
  val TEXT_IS_VALID_EMAIL: TEXT_IS_VALID_EMAIL with java.lang.String = js.native
  val TEXT_IS_VALID_URL: TEXT_IS_VALID_URL with java.lang.String = js.native
  val VALUE_IN_LIST: VALUE_IN_LIST with java.lang.String = js.native
  val VALUE_IN_RANGE: VALUE_IN_RANGE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataValidationCriteria with java.lang.String
  ] = js.native
}

