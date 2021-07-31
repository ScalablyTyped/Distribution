package typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The resource name of the Organization to fetch. This is the
    * organization's relative path in the API, formatted as
    * "organizations/[organizationId]". For example, "organizations/1234".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the Organization resource to fetch. This field is deprecated
    * and will be removed in v1. Use name instead.
    */
  var organizationId: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsGet {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsGetMutableBuilder[Self <: ParamsResourceOrganizationsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrganizationId(value: String): Self = StObject.set(x, "organizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationIdUndefined: Self = StObject.set(x, "organizationId", js.undefined)
  }
}
