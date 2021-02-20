package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  @JSName("debugOptions.enableDebugging")
  var debugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.native
  
  /**
    *
    */
  var groupResourceName: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of items to fetch in a request. Defaults to 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The next_page_token value returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the identity source, in the following format:
    * identitysources/{source_id}}
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var userResourceName: js.UndefOr[String] = js.native
}
object ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity {
  
  @scala.inline
  def apply(): ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity]
  }
  
  @scala.inline
  implicit class ParamsResourceDebugIdentitysourcesItemsListforunmappedidentityMutableBuilder[Self <: ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDebugOptionsDotenableDebugging(value: Boolean): Self = StObject.set(x, "debugOptions.enableDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsDotenableDebuggingUndefined: Self = StObject.set(x, "debugOptions.enableDebugging", js.undefined)
    
    @scala.inline
    def setGroupResourceName(value: String): Self = StObject.set(x, "groupResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupResourceNameUndefined: Self = StObject.set(x, "groupResourceName", js.undefined)
    
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
    
    @scala.inline
    def setUserResourceName(value: String): Self = StObject.set(x, "userResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserResourceNameUndefined: Self = StObject.set(x, "userResourceName", js.undefined)
  }
}
