package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsecuritypoliciesListassociations
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The target resource to list associations. It is an organization, or a
    * folder.
    */
  var targetResource: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsecuritypoliciesListassociations {
  
  inline def apply(): ParamsResourceOrganizationsecuritypoliciesListassociations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsecuritypoliciesListassociations]
  }
  
  extension [Self <: ParamsResourceOrganizationsecuritypoliciesListassociations](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setTargetResource(value: String): Self = StObject.set(x, "targetResource", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceUndefined: Self = StObject.set(x, "targetResource", js.undefined)
  }
}
