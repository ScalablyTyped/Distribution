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
  def requireCheckbox(): DataValidationBuilder = js.native
  def requireCheckbox(checkedValue: js.Object): DataValidationBuilder = js.native
  def requireCheckbox(checkedValue: js.Object, uncheckedValue: js.Object): DataValidationBuilder = js.native
  def requireDate(): DataValidationBuilder = js.native
  def requireDateAfter(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): DataValidationBuilder = js.native
  def requireDateBefore(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): DataValidationBuilder = js.native
  def requireDateBetween(
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date,
    end: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date
  ): DataValidationBuilder = js.native
  def requireDateEqualTo(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): DataValidationBuilder = js.native
  def requireDateNotBetween(
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date,
    end: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date
  ): DataValidationBuilder = js.native
  def requireDateOnOrAfter(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): DataValidationBuilder = js.native
  def requireDateOnOrBefore(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): DataValidationBuilder = js.native
  def requireFormulaSatisfied(formula: java.lang.String): DataValidationBuilder = js.native
  def requireNumberBetween(start: scala.Double, end: scala.Double): DataValidationBuilder = js.native
  def requireNumberEqualTo(number: scala.Double): DataValidationBuilder = js.native
  def requireNumberGreaterThan(number: scala.Double): DataValidationBuilder = js.native
  def requireNumberGreaterThanOrEqualTo(number: scala.Double): DataValidationBuilder = js.native
  def requireNumberLessThan(number: scala.Double): DataValidationBuilder = js.native
  def requireNumberLessThanOrEqualTo(number: scala.Double): DataValidationBuilder = js.native
  def requireNumberNotBetween(start: scala.Double, end: scala.Double): DataValidationBuilder = js.native
  def requireNumberNotEqualTo(number: scala.Double): DataValidationBuilder = js.native
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

