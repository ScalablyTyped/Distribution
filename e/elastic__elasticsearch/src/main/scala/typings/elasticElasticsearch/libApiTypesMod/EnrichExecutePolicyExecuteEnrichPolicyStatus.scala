package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichExecutePolicyExecuteEnrichPolicyStatus extends StObject {
  
  var phase: EnrichExecutePolicyEnrichPolicyPhase
}
object EnrichExecutePolicyExecuteEnrichPolicyStatus {
  
  inline def apply(phase: EnrichExecutePolicyEnrichPolicyPhase): EnrichExecutePolicyExecuteEnrichPolicyStatus = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichExecutePolicyExecuteEnrichPolicyStatus]
  }
  
  extension [Self <: EnrichExecutePolicyExecuteEnrichPolicyStatus](x: Self) {
    
    inline def setPhase(value: EnrichExecutePolicyEnrichPolicyPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
  }
}
