package typings.googleCloudTasks.mod

import typings.googleCloudTasks.anon.PartialPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIamPolicyRequest extends StObject {
  
  var policy: PartialPolicy
}
object SetIamPolicyRequest {
  
  inline def apply(policy: PartialPolicy): SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIamPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetIamPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: PartialPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
