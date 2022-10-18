package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageIlm extends StObject {
  
  var policy_count: integer
  
  var policy_stats: js.Array[XpackUsageIlmPolicyStatistics]
}
object XpackUsageIlm {
  
  inline def apply(policy_count: integer, policy_stats: js.Array[XpackUsageIlmPolicyStatistics]): XpackUsageIlm = {
    val __obj = js.Dynamic.literal(policy_count = policy_count.asInstanceOf[js.Any], policy_stats = policy_stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageIlm]
  }
  
  extension [Self <: XpackUsageIlm](x: Self) {
    
    inline def setPolicy_count(value: integer): Self = StObject.set(x, "policy_count", value.asInstanceOf[js.Any])
    
    inline def setPolicy_stats(value: js.Array[XpackUsageIlmPolicyStatistics]): Self = StObject.set(x, "policy_stats", value.asInstanceOf[js.Any])
    
    inline def setPolicy_statsVarargs(value: XpackUsageIlmPolicyStatistics*): Self = StObject.set(x, "policy_stats", js.Array(value*))
  }
}
