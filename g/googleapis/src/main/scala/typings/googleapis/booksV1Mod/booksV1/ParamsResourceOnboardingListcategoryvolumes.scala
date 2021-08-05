package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOnboardingListcategoryvolumes
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * List of category ids requested.
    */
  var categoryId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * ISO-639-1 language and ISO-3166-1 country code. Default is en-US if
    * unset.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum allowed maturity rating of returned volumes. Books with a
    * higher maturity rating are filtered out.
    */
  var maxAllowedMaturityRating: js.UndefOr[String] = js.undefined
  
  /**
    * Number of maximum results per page to be included in the response.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The value of the nextToken from the previous page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceOnboardingListcategoryvolumes {
  
  inline def apply(): ParamsResourceOnboardingListcategoryvolumes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOnboardingListcategoryvolumes]
  }
  
  extension [Self <: ParamsResourceOnboardingListcategoryvolumes](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCategoryId(value: js.Array[String]): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    inline def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
    
    inline def setCategoryIdVarargs(value: String*): Self = StObject.set(x, "categoryId", js.Array(value :_*))
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxAllowedMaturityRating(value: String): Self = StObject.set(x, "maxAllowedMaturityRating", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowedMaturityRatingUndefined: Self = StObject.set(x, "maxAllowedMaturityRating", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
