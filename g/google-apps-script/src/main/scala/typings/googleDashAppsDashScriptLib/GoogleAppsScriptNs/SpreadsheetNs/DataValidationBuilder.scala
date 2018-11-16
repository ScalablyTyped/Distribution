package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataValidationBuilder extends js.Object {
  def build(): DataValidation = js.native
  def copy(): DataValidationBuilder = js.native
  def getAllowInvalid(): scala.Boolean = js.native
  def getCriteriaType(): DataValidationCriteria = js.native
  def getCriteriaValues(): js.Array[js.Object] = js.native
  def getHelpText(): java.lang.String = js.native
  def requireDate(): DataValidationBuilder = js.native
  def requireDateAfter(date: stdLib.Date): DataValidationBuilder = js.native
  def requireDateBefore(date: stdLib.Date): DataValidationBuilder = js.native
  def requireDateBetween(start: stdLib.Date, end: stdLib.Date): DataValidationBuilder = js.native
  def requireDateEqualTo(date: stdLib.Date): DataValidationBuilder = js.native
  def requireDateNotBetween(start: stdLib.Date, end: stdLib.Date): DataValidationBuilder = js.native
  def requireDateOnOrAfter(date: stdLib.Date): DataValidationBuilder = js.native
  def requireDateOnOrBefore(date: stdLib.Date): DataValidationBuilder = js.native
  def requireFormulaSatisfied(formula: java.lang.String): DataValidationBuilder = js.native
  def requireNumberBetween(start: stdLib.Number, end: stdLib.Number): DataValidationBuilder = js.native
  def requireNumberEqualTo(number: stdLib.Number): DataValidationBuilder = js.native
  def requireNumberGreaterThan(number: stdLib.Number): DataValidationBuilder = js.native
  def requireNumberGreaterThanOrEqualTo(number: stdLib.Number): DataValidationBuilder = js.native
  def requireNumberLessThan(number: stdLib.Number): DataValidationBuilder = js.native
  def requireNumberLessThanOrEqualTo(number: stdLib.Number): DataValidationBuilder = js.native
  def requireNumberNotBetween(start: stdLib.Number, end: stdLib.Number): DataValidationBuilder = js.native
  def requireNumberNotEqualTo(number: stdLib.Number): DataValidationBuilder = js.native
  def requireTextContains(text: java.lang.String): DataValidationBuilder = js.native
  def requireTextDoesNotContain(text: java.lang.String): DataValidationBuilder = js.native
  def requireTextEqualTo(text: java.lang.String): DataValidationBuilder = js.native
  def requireTextIsEmail(): DataValidationBuilder = js.native
  def requireTextIsUrl(): DataValidationBuilder = js.native
  def requireValueInList(values: js.Array[java.lang.String]): DataValidationBuilder = js.native
  def requireValueInList(values: js.Array[java.lang.String], showDropdown: scala.Boolean): DataValidationBuilder = js.native
  def requireValueInRange(range: Range): DataValidationBuilder = js.native
  def requireValueInRange(range: Range, showDropdown: scala.Boolean): DataValidationBuilder = js.native
  def setAllowInvalid(allowInvalidData: scala.Boolean): DataValidationBuilder = js.native
  def setHelpText(helpText: java.lang.String): DataValidationBuilder = js.native
  def withCriteria(criteria: DataValidationCriteria, args: js.Array[js.Object]): DataValidationBuilder = js.native
}

