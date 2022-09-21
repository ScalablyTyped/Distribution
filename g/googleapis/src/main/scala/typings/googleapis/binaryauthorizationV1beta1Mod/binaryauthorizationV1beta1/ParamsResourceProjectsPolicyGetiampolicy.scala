package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsPolicyGetiampolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    */
  @JSName("options.requestedPolicyVersion")
  var optionsDotrequestedPolicyVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsPolicyGetiampolicy {
  
  inline def apply(): ParamsResourceProjectsPolicyGetiampolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsPolicyGetiampolicy]
  }
  
  extension [Self <: ParamsResourceProjectsPolicyGetiampolicy](x: Self) {
    
    inline def setOptionsDotrequestedPolicyVersion(value: Double): Self = StObject.set(x, "options.requestedPolicyVersion", value.asInstanceOf[js.Any])
    
    inline def setOptionsDotrequestedPolicyVersionUndefined: Self = StObject.set(x, "options.requestedPolicyVersion", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
