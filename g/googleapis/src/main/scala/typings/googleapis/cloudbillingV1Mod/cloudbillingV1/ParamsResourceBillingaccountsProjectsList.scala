package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBillingaccountsProjectsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The resource name of the billing account associated with the projects
    * that you want to list. For example,
    * `billingAccounts/012345-567890-ABCDEF`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. The maximum page size is 100; this is also the
    * default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results to be returned. This should be a
    * `next_page_token` value returned from a previous `ListProjectBillingInfo`
    * call. If unspecified, the first page of results is returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceBillingaccountsProjectsList {
  
  @scala.inline
  def apply(): ParamsResourceBillingaccountsProjectsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBillingaccountsProjectsList]
  }
  
  @scala.inline
  implicit class ParamsResourceBillingaccountsProjectsListMutableBuilder[Self <: ParamsResourceBillingaccountsProjectsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
