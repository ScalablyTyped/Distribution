package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductsList
  extends StObject
     with StandardParameters {
  
  /**
    * Specifies whether to search among all products (false) or among only
    * products that have been approved (true). Only "true" is supported, and
    * should be specified.
    */
  var approved: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.undefined
  
  /**
    * The BCP47 tag for the user's preferred language (e.g. "en-US", "de").
    * Results are returned in the language best matching the preferred
    * language.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the maximum number of products that can be returned per
    * request. If not specified, uses a default value of 100, which is also the
    * maximum retrievable within a single response.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The search query as typed in the Google Play store search box. If
    * omitted, all approved apps will be returned (using the pagination
    * parameters), including apps that are not available in the store (e.g.
    * unpublished apps).
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * A pagination token is contained in a request's response when there are
    * more products. The token can be used in a subsequent request to obtain
    * more products, and so forth. This parameter cannot be used in the initial
    * request.
    */
  var token: js.UndefOr[String] = js.undefined
}
object ParamsResourceProductsList {
  
  @scala.inline
  def apply(): ParamsResourceProductsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProductsListMutableBuilder[Self <: ParamsResourceProductsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproved(value: Boolean): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovedUndefined: Self = StObject.set(x, "approved", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
