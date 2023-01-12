package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRuleUsageTrackingResponse extends StObject {
  
  var ruleUsage: js.Array[RuleUsage]
}
object StopRuleUsageTrackingResponse {
  
  inline def apply(ruleUsage: js.Array[RuleUsage]): StopRuleUsageTrackingResponse = {
    val __obj = js.Dynamic.literal(ruleUsage = ruleUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRuleUsageTrackingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopRuleUsageTrackingResponse] (val x: Self) extends AnyVal {
    
    inline def setRuleUsage(value: js.Array[RuleUsage]): Self = StObject.set(x, "ruleUsage", value.asInstanceOf[js.Any])
    
    inline def setRuleUsageVarargs(value: RuleUsage*): Self = StObject.set(x, "ruleUsage", js.Array(value*))
  }
}
