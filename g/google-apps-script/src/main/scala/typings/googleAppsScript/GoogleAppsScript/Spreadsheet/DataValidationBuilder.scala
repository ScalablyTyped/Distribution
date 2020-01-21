package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for data validation rules.
  *
  *     // Set the data validation for cell A1 to require a value from B1:B10.
  *     var cell = SpreadsheetApp.getActive().getRange('A1');
  *     var range = SpreadsheetApp.getActive().getRange('B1:B10');
  *     var rule = SpreadsheetApp.newDataValidation().requireValueInRange(range).build();
  *     cell.setDataValidation(rule);
  */
@js.native
trait DataValidationBuilder extends js.Object {
  def build(): DataValidation = js.native
  def copy(): DataValidationBuilder = js.native
  def getAllowInvalid(): Boolean = js.native
  def getCriteriaType(): DataValidationCriteria = js.native
  def getCriteriaValues(): js.Array[_] = js.native
  def getHelpText(): String | Null = js.native
  def requireCheckbox(): DataValidationBuilder = js.native
  def requireCheckbox(checkedValue: js.Any): DataValidationBuilder = js.native
  def requireCheckbox(checkedValue: js.Any, uncheckedValue: js.Any): DataValidationBuilder = js.native
  def requireDate(): DataValidationBuilder = js.native
  def requireDateAfter(date: Date): DataValidationBuilder = js.native
  def requireDateBefore(date: Date): DataValidationBuilder = js.native
  def requireDateBetween(start: Date, end: Date): DataValidationBuilder = js.native
  def requireDateEqualTo(date: Date): DataValidationBuilder = js.native
  def requireDateNotBetween(start: Date, end: Date): DataValidationBuilder = js.native
  def requireDateOnOrAfter(date: Date): DataValidationBuilder = js.native
  def requireDateOnOrBefore(date: Date): DataValidationBuilder = js.native
  def requireFormulaSatisfied(formula: String): DataValidationBuilder = js.native
  def requireNumberBetween(start: Double, end: Double): DataValidationBuilder = js.native
  def requireNumberEqualTo(number: Double): DataValidationBuilder = js.native
  def requireNumberGreaterThan(number: Double): DataValidationBuilder = js.native
  def requireNumberGreaterThanOrEqualTo(number: Double): DataValidationBuilder = js.native
  def requireNumberLessThan(number: Double): DataValidationBuilder = js.native
  def requireNumberLessThanOrEqualTo(number: Double): DataValidationBuilder = js.native
  def requireNumberNotBetween(start: Double, end: Double): DataValidationBuilder = js.native
  def requireNumberNotEqualTo(number: Double): DataValidationBuilder = js.native
  def requireTextContains(text: String): DataValidationBuilder = js.native
  def requireTextDoesNotContain(text: String): DataValidationBuilder = js.native
  def requireTextEqualTo(text: String): DataValidationBuilder = js.native
  def requireTextIsEmail(): DataValidationBuilder = js.native
  def requireTextIsUrl(): DataValidationBuilder = js.native
  def requireValueInList(values: js.Array[String]): DataValidationBuilder = js.native
  def requireValueInList(values: js.Array[String], showDropdown: Boolean): DataValidationBuilder = js.native
  def requireValueInRange(range: Range): DataValidationBuilder = js.native
  def requireValueInRange(range: Range, showDropdown: Boolean): DataValidationBuilder = js.native
  def setAllowInvalid(allowInvalidData: Boolean): DataValidationBuilder = js.native
  def setHelpText(helpText: String): DataValidationBuilder = js.native
  def withCriteria(criteria: DataValidationCriteria, args: js.Array[_]): DataValidationBuilder = js.native
}

