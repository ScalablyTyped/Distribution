package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsSearch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The default page size is 200 (max 1000) for the BASIC view, and 50 (max
    * 500) for the FULL view.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value returned from a previous search request, if
    * any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Query string for performing search on groups. Users can search on
    * namespace and label attributes of groups. EXACT match ('=') is supported
    * on namespace, and CONTAINS match (':') is supported on labels. This is a
    * `required` field. Multiple queries can be combined using `AND` operator.
    * The operator is case sensitive. An example query would be:
    * "namespace=<namespace_value> AND labels:<labels_value>".
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Group resource view to be returned. Defaults to [GroupView.BASIC]().
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceGroupsSearch {
  
  @scala.inline
  def apply(): ParamsResourceGroupsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsSearch]
  }
  
  @scala.inline
  implicit class ParamsResourceGroupsSearchMutableBuilder[Self <: ParamsResourceGroupsSearch] (val x: Self) extends AnyVal {
    
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
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
