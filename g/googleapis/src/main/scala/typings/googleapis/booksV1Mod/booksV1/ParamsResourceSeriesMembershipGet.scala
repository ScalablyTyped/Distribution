package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceSeriesMembershipGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Number of maximum results per page to be included in the response.
    */
  var page_size: js.UndefOr[Double] = js.native
  
  /**
    * The value of the nextToken from the previous page.
    */
  var page_token: js.UndefOr[String] = js.native
  
  /**
    * String that identifies the series
    */
  var series_id: js.UndefOr[String] = js.native
}
object ParamsResourceSeriesMembershipGet {
  
  @scala.inline
  def apply(): ParamsResourceSeriesMembershipGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSeriesMembershipGet]
  }
  
  @scala.inline
  implicit class ParamsResourceSeriesMembershipGetOps[Self <: ParamsResourceSeriesMembershipGet] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setPage_size(value: Double): Self = this.set("page_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage_size: Self = this.set("page_size", js.undefined)
    
    @scala.inline
    def setPage_token(value: String): Self = this.set("page_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage_token: Self = this.set("page_token", js.undefined)
    
    @scala.inline
    def setSeries_id(value: String): Self = this.set("series_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries_id: Self = this.set("series_id", js.undefined)
  }
}
