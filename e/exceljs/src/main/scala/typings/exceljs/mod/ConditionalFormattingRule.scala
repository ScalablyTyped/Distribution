package typings.exceljs.mod

import typings.exceljs.exceljsStrings.aboveAverage
import typings.exceljs.exceljsStrings.cellIs
import typings.exceljs.exceljsStrings.colorScale
import typings.exceljs.exceljsStrings.containsText
import typings.exceljs.exceljsStrings.dataBar
import typings.exceljs.exceljsStrings.expression
import typings.exceljs.exceljsStrings.iconSet
import typings.exceljs.exceljsStrings.timePeriod
import typings.exceljs.exceljsStrings.top10
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.exceljs.mod.ExpressionRuleType
  - typings.exceljs.mod.CellIsRuleType
  - typings.exceljs.mod.Top10RuleType
  - typings.exceljs.mod.AboveAverageRuleType
  - typings.exceljs.mod.ColorScaleRuleType
  - typings.exceljs.mod.IconSetRuleType
  - typings.exceljs.mod.ContainsTextRuleType
  - typings.exceljs.mod.TimePeriodRuleType
  - typings.exceljs.mod.DataBarRuleType
*/
trait ConditionalFormattingRule extends js.Object

object ConditionalFormattingRule {
  @scala.inline
  def DataBarRuleType(priority: Double, `type`: dataBar): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def AboveAverageRuleType(aboveAverage: Boolean, priority: Double, `type`: aboveAverage): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(aboveAverage = aboveAverage.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def IconSetRuleType(priority: Double, `type`: iconSet): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def ColorScaleRuleType(priority: Double, `type`: colorScale): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def ExpressionRuleType(priority: Double, `type`: expression): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def ContainsTextRuleType(priority: Double, `type`: containsText): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def TimePeriodRuleType(priority: Double, `type`: timePeriod): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def CellIsRuleType(priority: Double, `type`: cellIs): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def Top10RuleType(bottom: Boolean, percent: Boolean, priority: Double, rank: Double, `type`: top10): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
}

