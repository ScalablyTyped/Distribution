package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccesspoliciesAccesslevelsList extends StandardParameters {
  
  /**
    * Whether to return `BasicLevels` in the Cloud Common Expression language,
    * as `CustomLevels`, rather than as `BasicLevels`. Defaults to returning
    * `AccessLevels` in the format they were defined.
    */
  var accessLevelFormat: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Number of Access Levels to include in the list. Default 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Next page token for the next batch of Access Level instances. Defaults to
    * the first page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required. Resource name for the access policy to list Access Levels from.
    * Format: `accessPolicies/{policy_id}`
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceAccesspoliciesAccesslevelsList {
  
  @scala.inline
  def apply(): ParamsResourceAccesspoliciesAccesslevelsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccesspoliciesAccesslevelsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAccesspoliciesAccesslevelsListMutableBuilder[Self <: ParamsResourceAccesspoliciesAccesslevelsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessLevelFormat(value: String): Self = StObject.set(x, "accessLevelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLevelFormatUndefined: Self = StObject.set(x, "accessLevelFormat", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
