package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMyconfigSyncvolumelicenses
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The device/version ID from which to release the restriction.
    */
  var cpksver: js.UndefOr[String] = js.undefined
  
  /**
    * List of features supported by the client, i.e., 'RENTALS'
    */
  var features: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Set to true to include non-comics series. Defaults to false.
    */
  var includeNonComicsSeries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The client nonce value.
    */
  var nonce: js.UndefOr[String] = js.undefined
  
  /**
    * Set to true to show pre-ordered books. Defaults to false.
    */
  var showPreorders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The volume(s) to request download restrictions for.
    */
  var volumeIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceMyconfigSyncvolumelicenses {
  
  inline def apply(): ParamsResourceMyconfigSyncvolumelicenses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMyconfigSyncvolumelicenses]
  }
  
  extension [Self <: ParamsResourceMyconfigSyncvolumelicenses](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCpksver(value: String): Self = StObject.set(x, "cpksver", value.asInstanceOf[js.Any])
    
    inline def setCpksverUndefined: Self = StObject.set(x, "cpksver", js.undefined)
    
    inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setIncludeNonComicsSeries(value: Boolean): Self = StObject.set(x, "includeNonComicsSeries", value.asInstanceOf[js.Any])
    
    inline def setIncludeNonComicsSeriesUndefined: Self = StObject.set(x, "includeNonComicsSeries", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setShowPreorders(value: Boolean): Self = StObject.set(x, "showPreorders", value.asInstanceOf[js.Any])
    
    inline def setShowPreordersUndefined: Self = StObject.set(x, "showPreorders", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVolumeIds(value: js.Array[String]): Self = StObject.set(x, "volumeIds", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdsUndefined: Self = StObject.set(x, "volumeIds", js.undefined)
    
    inline def setVolumeIdsVarargs(value: String*): Self = StObject.set(x, "volumeIds", js.Array(value :_*))
  }
}
