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
  def getCriteriaValues(): js.Array[js.Object] = js.native
  def getHiddenValues(): js.Array[java.lang.String] = js.native
  def getVisibleValues(): js.Array[java.lang.String] = js.native
  def setHiddenValues(values: js.Array[java.lang.String]): FilterCriteriaBuilder = js.native
  def setVisibleValues(values: js.Array[java.lang.String]): FilterCriteriaBuilder = js.native
  def whenCellEmpty(): FilterCriteriaBuilder = js.native
  def whenCellNotEmpty(): FilterCriteriaBuilder = js.native
  def whenDateAfter(date: RelativeDate): FilterCriteriaBuilder = js.native
  def whenDateAfter(date: stdLib.Date): FilterCriteriaBuilder = js.native
  def whenDateBefore(date: RelativeDate): FilterCriteriaBuilder = js.native
  def whenDateBefore(date: stdLib.Date): FilterCriteriaBuilder = js.native
  def whenDateEqualTo(date: RelativeDate): FilterCriteriaBuilder = js.native
  def whenDateEqualTo(date: stdLib.Date): FilterCriteriaBuilder = js.native
  def whenFormulaSatisfied(formula: java.lang.String): FilterCriteriaBuilder = js.native
  def whenNumberBetween(start: stdLib.Number, end: stdLib.Number): FilterCriteriaBuilder = js.native
  def whenNumberEqualTo(number: stdLib.Number): FilterCriteriaBuilder = js.native
  def whenNumberGreaterThan(number: stdLib.Number): FilterCriteriaBuilder = js.native
  def whenNumberGreaterThanOrEqualTo(number: stdLib.Number): FilterCriteriaBuilder = js.native
  def whenNumberLessThan(number: stdLib.Number): FilterCriteriaBuilder = js.native
  def whenNumberLessThanOrEqualTo(number: stdLib.Number): FilterCriteriaBuilder = js.native
  def whenNumberNotBetween(start: stdLib.Number, end: stdLib.Number): FilterCriteriaBuilder = js.native
  def whenNumberNotEqualTo(number: stdLib.Number): FilterCriteriaBuilder = js.native
  def whenTextContains(text: java.lang.String): FilterCriteriaBuilder = js.native
  def whenTextDoesNotContain(text: java.lang.String): FilterCriteriaBuilder = js.native
  def whenTextEndsWith(text: java.lang.String): FilterCriteriaBuilder = js.native
  def whenTextEqualTo(text: java.lang.String): FilterCriteriaBuilder = js.native
  def whenTextStartsWith(text: java.lang.String): FilterCriteriaBuilder = js.native
  def withCriteria(criteria: BooleanCriteria, args: js.Array[js.Object]): FilterCriteriaBuilder = js.native
}

