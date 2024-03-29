package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsecuritypoliciesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the security policy to get.
    */
  var securityPolicy: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsecuritypoliciesGet {
  
  inline def apply(): ParamsResourceOrganizationsecuritypoliciesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsecuritypoliciesGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsecuritypoliciesGet](x: Self) {
    
    inline def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
  }
}
