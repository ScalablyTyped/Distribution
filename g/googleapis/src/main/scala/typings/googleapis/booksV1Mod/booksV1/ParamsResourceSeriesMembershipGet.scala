package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSeriesMembershipGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Number of maximum results per page to be included in the response.
    */
  var page_size: js.UndefOr[Double] = js.undefined
  
  /**
    * The value of the nextToken from the previous page.
    */
  var page_token: js.UndefOr[String] = js.undefined
  
  /**
    * String that identifies the series
    */
  var series_id: js.UndefOr[String] = js.undefined
}
object ParamsResourceSeriesMembershipGet {
  
  inline def apply(): ParamsResourceSeriesMembershipGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSeriesMembershipGet]
  }
  
  extension [Self <: ParamsResourceSeriesMembershipGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
    
    inline def setPage_sizeUndefined: Self = StObject.set(x, "page_size", js.undefined)
    
    inline def setPage_token(value: String): Self = StObject.set(x, "page_token", value.asInstanceOf[js.Any])
    
    inline def setPage_tokenUndefined: Self = StObject.set(x, "page_token", js.undefined)
    
    inline def setSeries_id(value: String): Self = StObject.set(x, "series_id", value.asInstanceOf[js.Any])
    
    inline def setSeries_idUndefined: Self = StObject.set(x, "series_id", js.undefined)
  }
}
