package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for conditional format rules.
  *
  *     // Adds a conditional format rule to a sheet that causes cells in range A1:B3 to turn red if
  *     // they contain a number between 1 and 10.
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var range = sheet.getRange("A1:B3");
  *     var rule = SpreadsheetApp.newConditionalFormatRule()
  *         .whenNumberBetween(1, 10)
  *         .setBackground("#FF0000")
  *         .setRanges([range])
  *         .build();
  *     var rules = sheet.getConditionalFormatRules();
  *     rules.push(rule);
  *     sheet.setConditionalFormatRules(rules);
  */
@js.native
trait ConditionalFormatRuleBuilder extends StObject {
  
  def build(): ConditionalFormatRule = js.native
  
  def copy(): ConditionalFormatRuleBuilder = js.native
  
  def getBooleanCondition(): BooleanCondition | Null = js.native
  
  def getGradientCondition(): GradientCondition | Null = js.native
  
  def getRanges(): js.Array[Range] = js.native
  
  def setBackground(): ConditionalFormatRuleBuilder = js.native
  def setBackground(color: String): ConditionalFormatRuleBuilder = js.native
  
  def setBold(): ConditionalFormatRuleBuilder = js.native
  def setBold(bold: Boolean): ConditionalFormatRuleBuilder = js.native
  
  def setFontColor(): ConditionalFormatRuleBuilder = js.native
  def setFontColor(color: String): ConditionalFormatRuleBuilder = js.native
  
  def setGradientMaxpoint(color: String): ConditionalFormatRuleBuilder = js.native
  
  def setGradientMaxpointWithValue(color: String, `type`: InterpolationType, value: String): ConditionalFormatRuleBuilder = js.native
  
  def setGradientMidpointWithValue(color: String, `type`: InterpolationType, value: String): ConditionalFormatRuleBuilder = js.native
  
  def setGradientMinpoint(color: String): ConditionalFormatRuleBuilder = js.native
  
  def setGradientMinpointWithValue(color: String, `type`: InterpolationType, value: String): ConditionalFormatRuleBuilder = js.native
  
  def setItalic(): ConditionalFormatRuleBuilder = js.native
  def setItalic(italic: Boolean): ConditionalFormatRuleBuilder = js.native
  
  def setRanges(ranges: js.Array[Range]): ConditionalFormatRuleBuilder = js.native
  
  def setStrikethrough(): ConditionalFormatRuleBuilder = js.native
  def setStrikethrough(strikethrough: Boolean): ConditionalFormatRuleBuilder = js.native
  
  def setUnderline(): ConditionalFormatRuleBuilder = js.native
  def setUnderline(underline: Boolean): ConditionalFormatRuleBuilder = js.native
  
  def whenCellEmpty(): ConditionalFormatRuleBuilder = js.native
  
  def whenCellNotEmpty(): ConditionalFormatRuleBuilder = js.native
  
  def whenDateAfter(date: Date): ConditionalFormatRuleBuilder = js.native
  def whenDateAfter(date: RelativeDate): ConditionalFormatRuleBuilder = js.native
  
  def whenDateBefore(date: Date): ConditionalFormatRuleBuilder = js.native
  def whenDateBefore(date: RelativeDate): ConditionalFormatRuleBuilder = js.native
  
  def whenDateEqualTo(date: Date): ConditionalFormatRuleBuilder = js.native
  def whenDateEqualTo(date: RelativeDate): ConditionalFormatRuleBuilder = js.native
  
  def whenFormulaSatisfied(formula: String): ConditionalFormatRuleBuilder = js.native
  
  def whenNumberBetween(start: Double, end: Double): ConditionalFormatRuleBuilder = js.native
  
  def whenNumberEqualTo(number: Double): ConditionalFormatRuleBuilder = js.native
  
  def whenNumberGreaterThan(number: Double): ConditionalFormatRuleBuilder = js.native
  
  def whenNumberGreaterThanOrEqualTo(number: Double): ConditionalFormatRuleBuilder = js.native
  
  def whenNumberLessThan(number: Double): ConditionalFormatRuleBuilder = js.native
  
  def whenNumberLessThanOrEqualTo(number: Double): ConditionalFormatRuleBuilder = js.native
  
  def whenNumberNotBetween(start: Double, end: Double): ConditionalFormatRuleBuilder = js.native
  
  def whenNumberNotEqualTo(number: Double): ConditionalFormatRuleBuilder = js.native
  
  def whenTextContains(text: String): ConditionalFormatRuleBuilder = js.native
  
  def whenTextDoesNotContain(text: String): ConditionalFormatRuleBuilder = js.native
  
  def whenTextEndsWith(text: String): ConditionalFormatRuleBuilder = js.native
  
  def whenTextEqualTo(text: String): ConditionalFormatRuleBuilder = js.native
  
  def whenTextStartsWith(text: String): ConditionalFormatRuleBuilder = js.native
  
  def withCriteria(criteria: BooleanCriteria, args: js.Array[js.Any]): ConditionalFormatRuleBuilder = js.native
}
