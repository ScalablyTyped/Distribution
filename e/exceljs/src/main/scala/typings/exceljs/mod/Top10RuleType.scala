package typings.exceljs.mod

import typings.exceljs.exceljsStrings.top10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Top10RuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var bottom: Boolean = js.native
  
  var percent: Boolean = js.native
  
  var rank: Double = js.native
  
  var `type`: top10 = js.native
}
object Top10RuleType {
  
  @scala.inline
  def apply(bottom: Boolean, percent: Boolean, priority: Double, rank: Double, `type`: top10): Top10RuleType = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top10RuleType]
  }
  
  @scala.inline
  implicit class Top10RuleTypeMutableBuilder[Self <: Top10RuleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: Boolean): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: top10): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
