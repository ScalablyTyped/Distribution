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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def AboveAverageRuleType(aboveAverage: Boolean, priority: Double, `type`: aboveAverage): typings.exceljs.mod.AboveAverageRuleType = {
    val __obj = js.Dynamic.literal(aboveAverage = aboveAverage.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.AboveAverageRuleType]
  }
  
  @scala.inline
  def CellIsRuleType(priority: Double, `type`: cellIs): typings.exceljs.mod.CellIsRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.CellIsRuleType]
  }
  
  @scala.inline
  def ColorScaleRuleType(priority: Double, `type`: colorScale): typings.exceljs.mod.ColorScaleRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.ColorScaleRuleType]
  }
  
  @scala.inline
  def ContainsTextRuleType(priority: Double, `type`: containsText): typings.exceljs.mod.ContainsTextRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.ContainsTextRuleType]
  }
  
  @scala.inline
  def DataBarRuleType(priority: Double, `type`: dataBar): typings.exceljs.mod.DataBarRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.DataBarRuleType]
  }
  
  @scala.inline
  def ExpressionRuleType(priority: Double, `type`: expression): typings.exceljs.mod.ExpressionRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.ExpressionRuleType]
  }
  
  @scala.inline
  def IconSetRuleType(priority: Double, `type`: iconSet): typings.exceljs.mod.IconSetRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.IconSetRuleType]
  }
  
  @scala.inline
  def TimePeriodRuleType(priority: Double, `type`: timePeriod): typings.exceljs.mod.TimePeriodRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.TimePeriodRuleType]
  }
  
  @scala.inline
  def Top10RuleType(bottom: Boolean, percent: Boolean, priority: Double, rank: Double, `type`: top10): typings.exceljs.mod.Top10RuleType = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.Top10RuleType]
  }
}
