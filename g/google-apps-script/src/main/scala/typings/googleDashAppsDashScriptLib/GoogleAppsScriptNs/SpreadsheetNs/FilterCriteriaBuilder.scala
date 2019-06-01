package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterCriteriaBuilder extends js.Object {
  def build(): FilterCriteria = js.native
  def copy(): FilterCriteriaBuilder = js.native
  def getCriteriaType(): BooleanCriteria = js.native
  def getCriteriaValues(): js.Array[_] = js.native
  def getHiddenValues(): js.Array[java.lang.String] = js.native
  def getVisibleValues(): js.Array[java.lang.String] = js.native
  def setHiddenValues(values: js.Array[java.lang.String]): FilterCriteriaBuilder = js.native
  def setVisibleValues(values: js.Array[java.lang.String]): FilterCriteriaBuilder = js.native
  def whenCellEmpty(): FilterCriteriaBuilder = js.native
  def whenCellNotEmpty(): FilterCriteriaBuilder = js.native
  def whenDateAfter(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): FilterCriteriaBuilder = js.native
  def whenDateAfter(date: RelativeDate): FilterCriteriaBuilder = js.native
  def whenDateBefore(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): FilterCriteriaBuilder = js.native
  def whenDateBefore(date: RelativeDate): FilterCriteriaBuilder = js.native
  def whenDateEqualTo(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): FilterCriteriaBuilder = js.native
  def whenDateEqualTo(date: RelativeDate): FilterCriteriaBuilder = js.native
  def whenFormulaSatisfied(formula: java.lang.String): FilterCriteriaBuilder = js.native
  def whenNumberBetween(start: scala.Double, end: scala.Double): FilterCriteriaBuilder = js.native
  def whenNumberEqualTo(number: scala.Double): FilterCriteriaBuilder = js.native
  def whenNumberGreaterThan(number: scala.Double): FilterCriteriaBuilder = js.native
  def whenNumberGreaterThanOrEqualTo(number: scala.Double): FilterCriteriaBuilder = js.native
  def whenNumberLessThan(number: scala.Double): FilterCriteriaBuilder = js.native
  def whenNumberLessThanOrEqualTo(number: scala.Double): FilterCriteriaBuilder = js.native
  def whenNumberNotBetween(start: scala.Double, end: scala.Double): FilterCriteriaBuilder = js.native
  def whenNumberNotEqualTo(number: scala.Double): FilterCriteriaBuilder = js.native
  def whenTextContains(text: java.lang.String): FilterCriteriaBuilder = js.native
  def whenTextDoesNotContain(text: java.lang.String): FilterCriteriaBuilder = js.native
  def whenTextEndsWith(text: java.lang.String): FilterCriteriaBuilder = js.native
  def whenTextEqualTo(text: java.lang.String): FilterCriteriaBuilder = js.native
  def whenTextStartsWith(text: java.lang.String): FilterCriteriaBuilder = js.native
  def withCriteria(criteria: BooleanCriteria, args: js.Array[_]): FilterCriteriaBuilder = js.native
}

