package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsecuritypoliciesGetrule
  extends StObject
     with StandardParameters {
  
  /**
    * The priority of the rule to get from the security policy.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of the security policy to which the queried rule belongs.
    */
  var securityPolicy: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsecuritypoliciesGetrule {
  
  inline def apply(): ParamsResourceOrganizationsecuritypoliciesGetrule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsecuritypoliciesGetrule]
  }
  
  extension [Self <: ParamsResourceOrganizationsecuritypoliciesGetrule](x: Self) {
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
  }
}
