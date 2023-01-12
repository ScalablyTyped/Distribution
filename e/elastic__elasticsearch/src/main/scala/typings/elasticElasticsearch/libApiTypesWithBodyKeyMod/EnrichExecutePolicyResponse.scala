package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichExecutePolicyResponse extends StObject {
  
  var status: EnrichExecutePolicyExecuteEnrichPolicyStatus
  
  var task_id: js.UndefOr[TaskId] = js.undefined
}
object EnrichExecutePolicyResponse {
  
  inline def apply(status: EnrichExecutePolicyExecuteEnrichPolicyStatus): EnrichExecutePolicyResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichExecutePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnrichExecutePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: EnrichExecutePolicyExecuteEnrichPolicyStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTask_id(value: TaskId): Self = StObject.set(x, "task_id", value.asInstanceOf[js.Any])
    
    inline def setTask_idUndefined: Self = StObject.set(x, "task_id", js.undefined)
  }
}
