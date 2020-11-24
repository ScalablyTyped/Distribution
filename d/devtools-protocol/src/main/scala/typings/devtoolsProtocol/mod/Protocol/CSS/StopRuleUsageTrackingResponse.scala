package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopRuleUsageTrackingResponse extends js.Object {
  
  var ruleUsage: js.Array[RuleUsage] = js.native
}
object StopRuleUsageTrackingResponse {
  
  @scala.inline
  def apply(ruleUsage: js.Array[RuleUsage]): StopRuleUsageTrackingResponse = {
    val __obj = js.Dynamic.literal(ruleUsage = ruleUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRuleUsageTrackingResponse]
  }
  
  @scala.inline
  implicit class StopRuleUsageTrackingResponseOps[Self <: StopRuleUsageTrackingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRuleUsageVarargs(value: RuleUsage*): Self = this.set("ruleUsage", js.Array(value :_*))
    
    @scala.inline
    def setRuleUsage(value: js.Array[RuleUsage]): Self = this.set("ruleUsage", value.asInstanceOf[js.Any])
  }
}
