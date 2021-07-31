package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait ConditionalFormattingRule extends StObject
object ConditionalFormattingRule {
  
  @scala.inline
  def AboveAverageRuleType(aboveAverage: Boolean, priority: Double): typings.exceljs.mod.AboveAverageRuleType = {
    val __obj = js.Dynamic.literal(aboveAverage = aboveAverage.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("aboveAverage")
    __obj.asInstanceOf[typings.exceljs.mod.AboveAverageRuleType]
  }
  
  @scala.inline
  def CellIsRuleType(priority: Double): typings.exceljs.mod.CellIsRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cellIs")
    __obj.asInstanceOf[typings.exceljs.mod.CellIsRuleType]
  }
  
  @scala.inline
  def ColorScaleRuleType(priority: Double): typings.exceljs.mod.ColorScaleRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("colorScale")
    __obj.asInstanceOf[typings.exceljs.mod.ColorScaleRuleType]
  }
  
  @scala.inline
  def ContainsTextRuleType(priority: Double): typings.exceljs.mod.ContainsTextRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("containsText")
    __obj.asInstanceOf[typings.exceljs.mod.ContainsTextRuleType]
  }
  
  @scala.inline
  def DataBarRuleType(priority: Double): typings.exceljs.mod.DataBarRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dataBar")
    __obj.asInstanceOf[typings.exceljs.mod.DataBarRuleType]
  }
  
  @scala.inline
  def ExpressionRuleType(priority: Double): typings.exceljs.mod.ExpressionRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("expression")
    __obj.asInstanceOf[typings.exceljs.mod.ExpressionRuleType]
  }
  
  @scala.inline
  def IconSetRuleType(priority: Double): typings.exceljs.mod.IconSetRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("iconSet")
    __obj.asInstanceOf[typings.exceljs.mod.IconSetRuleType]
  }
  
  @scala.inline
  def TimePeriodRuleType(priority: Double): typings.exceljs.mod.TimePeriodRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timePeriod")
    __obj.asInstanceOf[typings.exceljs.mod.TimePeriodRuleType]
  }
  
  @scala.inline
  def Top10RuleType(bottom: Boolean, percent: Boolean, priority: Double, rank: Double): typings.exceljs.mod.Top10RuleType = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("top10")
    __obj.asInstanceOf[typings.exceljs.mod.Top10RuleType]
  }
}
