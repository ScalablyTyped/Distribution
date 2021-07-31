package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichExecutePolicy
  extends StObject
     with Generic {
  
  var name: String
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object EnrichExecutePolicy {
  
  @scala.inline
  def apply(name: String): EnrichExecutePolicy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichExecutePolicy]
  }
  
  @scala.inline
  implicit class EnrichExecutePolicyMutableBuilder[Self <: EnrichExecutePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
