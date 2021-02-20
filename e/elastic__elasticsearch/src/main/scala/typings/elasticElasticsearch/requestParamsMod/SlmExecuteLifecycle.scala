package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlmExecuteLifecycle extends Generic {
  
  var policy_id: String = js.native
}
object SlmExecuteLifecycle {
  
  @scala.inline
  def apply(policy_id: String): SlmExecuteLifecycle = {
    val __obj = js.Dynamic.literal(policy_id = policy_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmExecuteLifecycle]
  }
  
  @scala.inline
  implicit class SlmExecuteLifecycleMutableBuilder[Self <: SlmExecuteLifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy_id(value: String): Self = StObject.set(x, "policy_id", value.asInstanceOf[js.Any])
  }
}
