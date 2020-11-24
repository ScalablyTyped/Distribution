package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProductsList extends StandardParameters {
  
  /**
    * Specifies whether to search among all products (false) or among only
    * products that have been approved (true). Only "true" is supported, and
    * should be specified.
    */
  var approved: js.UndefOr[Boolean] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  
  /**
    * The BCP47 tag for the user's preferred language (e.g. "en-US", "de").
    * Results are returned in the language best matching the preferred
    * language.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Specifies the maximum number of products that can be returned per
    * request. If not specified, uses a default value of 100, which is also the
    * maximum retrievable within a single response.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The search query as typed in the Google Play store search box. If
    * omitted, all approved apps will be returned (using the pagination
    * parameters), including apps that are not available in the store (e.g.
    * unpublished apps).
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * A pagination token is contained in a request's response when there are
    * more products. The token can be used in a subsequent request to obtain
    * more products, and so forth. This parameter cannot be used in the initial
    * request.
    */
  var token: js.UndefOr[String] = js.native
}
object ParamsResourceProductsList {
  
  @scala.inline
  def apply(): ParamsResourceProductsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProductsListOps[Self <: ParamsResourceProductsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApproved(value: Boolean): Self = this.set("approved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproved: Self = this.set("approved", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setEnterpriseId(value: String): Self = this.set("enterpriseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseId: Self = this.set("enterpriseId", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
