package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePersonalizedstreamGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for
    * generating recommendations.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum allowed maturity rating of returned recommendations. Books
    * with a higher maturity rating are filtered out.
    */
  var maxAllowedMaturityRating: js.UndefOr[String] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
}
object ParamsResourcePersonalizedstreamGet {
  
  inline def apply(): ParamsResourcePersonalizedstreamGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePersonalizedstreamGet]
  }
  
  extension [Self <: ParamsResourcePersonalizedstreamGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxAllowedMaturityRating(value: String): Self = StObject.set(x, "maxAllowedMaturityRating", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowedMaturityRatingUndefined: Self = StObject.set(x, "maxAllowedMaturityRating", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
