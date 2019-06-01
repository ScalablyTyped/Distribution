package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalFormatRuleBuilder extends js.Object {
  def build(): ConditionalFormatRule = js.native
  def copy(): ConditionalFormatRuleBuilder = js.native
  def getBooleanCondition(): BooleanCondition = js.native
  def getGradientCondition(): GradientCondition = js.native
  def getRanges(): js.Array[Range] = js.native
  def setBackground(color: java.lang.String): ConditionalFormatRuleBuilder = js.native
  def setBold(bold: scala.Boolean): ConditionalFormatRuleBuilder = js.native
  def setFontColor(color: java.lang.String): ConditionalFormatRuleBuilder = js.native
  def setGradientMaxpoint(color: java.lang.String): ConditionalFormatRuleBuilder = js.native
  def setGradientMaxpointWithValue(color: java.lang.String, `type`: InterpolationType, value: java.lang.String): ConditionalFormatRuleBuilder = js.native
  def setGradientMidpointWithValue(color: java.lang.String, `type`: InterpolationType, value: java.lang.String): ConditionalFormatRuleBuilder = js.native
  def setGradientMinpoint(color: java.lang.String): ConditionalFormatRuleBuilder = js.native
  def setGradientMinpointWithValue(color: java.lang.String, `type`: InterpolationType, value: java.lang.String): ConditionalFormatRuleBuilder = js.native
  def setItalic(italic: scala.Boolean): ConditionalFormatRuleBuilder = js.native
  def setRanges(ranges: js.Array[Range]): ConditionalFormatRuleBuilder = js.native
  def setStrikethrough(strikethrough: scala.Boolean): ConditionalFormatRuleBuilder = js.native
  def setUnderline(underline: scala.Boolean): ConditionalFormatRuleBuilder = js.native
  def whenCellEmpty(): ConditionalFormatRuleBuilder = js.native
  def whenCellNotEmpty(): ConditionalFormatRuleBuilder = js.native
  def whenDateAfter(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): ConditionalFormatRuleBuilder = js.native
  def whenDateAfter(date: RelativeDate): ConditionalFormatRuleBuilder = js.native
  def whenDateBefore(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): ConditionalFormatRuleBuilder = js.native
  def whenDateBefore(date: RelativeDate): ConditionalFormatRuleBuilder = js.native
  def whenDateEqualTo(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): ConditionalFormatRuleBuilder = js.native
  def whenDateEqualTo(date: RelativeDate): ConditionalFormatRuleBuilder = js.native
  def whenFormulaSatisfied(formula: java.lang.String): ConditionalFormatRuleBuilder = js.native
  def whenNumberBetween(start: scala.Double, end: scala.Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberEqualTo(number: scala.Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberGreaterThan(number: scala.Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberGreaterThanOrEqualTo(number: scala.Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberLessThan(number: scala.Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberLessThanOrEqualTo(number: scala.Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberNotBetween(start: scala.Double, end: scala.Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberNotEqualTo(number: scala.Double): ConditionalFormatRuleBuilder = js.native
  def whenTextContains(text: java.lang.String): ConditionalFormatRuleBuilder = js.native
  def whenTextDoesNotContain(text: java.lang.String): ConditionalFormatRuleBuilder = js.native
  def whenTextEndsWith(text: java.lang.String): ConditionalFormatRuleBuilder = js.native
  def whenTextEqualTo(text: java.lang.String): ConditionalFormatRuleBuilder = js.native
  def whenTextStartsWith(text: java.lang.String): ConditionalFormatRuleBuilder = js.native
  def withCriteria(criteria: BooleanCriteria, args: js.Array[_]): ConditionalFormatRuleBuilder = js.native
}

