package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SetIamPolicyRequest. */
trait ISetIamPolicyRequest extends StObject {
  
  /** SetIamPolicyRequest policy */
  var policy: js.UndefOr[IPolicy | Null] = js.undefined
  
  /** SetIamPolicyRequest resource */
  var resource: js.UndefOr[String | Null] = js.undefined
}
object ISetIamPolicyRequest {
  
  @scala.inline
  def apply(): ISetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetIamPolicyRequest]
  }
  
  @scala.inline
  implicit class ISetIamPolicyRequestMutableBuilder[Self <: ISetIamPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: IPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNull: Self = StObject.set(x, "policy", null)
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNull: Self = StObject.set(x, "resource", null)
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
