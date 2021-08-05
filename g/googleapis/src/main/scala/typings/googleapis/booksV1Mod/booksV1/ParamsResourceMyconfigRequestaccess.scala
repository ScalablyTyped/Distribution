package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMyconfigRequestaccess
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The device/version ID from which to request the restrictions.
    */
  var cpksver: js.UndefOr[String] = js.undefined
  
  /**
    * The type of access license to request. If not specified, the default is
    * BOTH.
    */
  var licenseTypes: js.UndefOr[String] = js.undefined
  
  /**
    * ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The client nonce value.
    */
  var nonce: js.UndefOr[String] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The volume to request concurrent/download restrictions for.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMyconfigRequestaccess {
  
  inline def apply(): ParamsResourceMyconfigRequestaccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMyconfigRequestaccess]
  }
  
  extension [Self <: ParamsResourceMyconfigRequestaccess](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCpksver(value: String): Self = StObject.set(x, "cpksver", value.asInstanceOf[js.Any])
    
    inline def setCpksverUndefined: Self = StObject.set(x, "cpksver", js.undefined)
    
    inline def setLicenseTypes(value: String): Self = StObject.set(x, "licenseTypes", value.asInstanceOf[js.Any])
    
    inline def setLicenseTypesUndefined: Self = StObject.set(x, "licenseTypes", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
