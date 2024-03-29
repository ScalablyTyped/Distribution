package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsecuritypoliciesCopyrules
  extends StObject
     with StandardParameters {
  
  /**
    * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the security policy to update.
    */
  var securityPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The security policy from which to copy rules.
    */
  var sourceSecurityPolicy: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsecuritypoliciesCopyrules {
  
  inline def apply(): ParamsResourceOrganizationsecuritypoliciesCopyrules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsecuritypoliciesCopyrules]
  }
  
  extension [Self <: ParamsResourceOrganizationsecuritypoliciesCopyrules](x: Self) {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
    
    inline def setSourceSecurityPolicy(value: String): Self = StObject.set(x, "sourceSecurityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSourceSecurityPolicyUndefined: Self = StObject.set(x, "sourceSecurityPolicy", js.undefined)
  }
}
