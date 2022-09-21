package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFirewallpoliciesGetiampolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Requested IAM Policy version.
    */
  var optionsRequestedPolicyVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * Name or id of the resource for this request.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceFirewallpoliciesGetiampolicy {
  
  inline def apply(): ParamsResourceFirewallpoliciesGetiampolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFirewallpoliciesGetiampolicy]
  }
  
  extension [Self <: ParamsResourceFirewallpoliciesGetiampolicy](x: Self) {
    
    inline def setOptionsRequestedPolicyVersion(value: Double): Self = StObject.set(x, "optionsRequestedPolicyVersion", value.asInstanceOf[js.Any])
    
    inline def setOptionsRequestedPolicyVersionUndefined: Self = StObject.set(x, "optionsRequestedPolicyVersion", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
