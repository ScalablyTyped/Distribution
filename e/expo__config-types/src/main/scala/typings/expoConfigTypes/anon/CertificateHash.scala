package typings.expoConfigTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateHash extends StObject {
  
  /**
    * The Android API key. Can be found in the credentials section of the developer console or in `google-services.json`.
    */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /**
    * The SHA-1 hash of the signing certificate used to build the APK without any separator (`:`). Can be found in `google-services.json`. https://developers.google.com/android/guides/client-auth
    */
  var certificateHash: js.UndefOr[String] = js.undefined
}
object CertificateHash {
  
  inline def apply(): CertificateHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateHash]
  }
  
  extension [Self <: CertificateHash](x: Self) {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setCertificateHash(value: String): Self = StObject.set(x, "certificateHash", value.asInstanceOf[js.Any])
    
    inline def setCertificateHashUndefined: Self = StObject.set(x, "certificateHash", js.undefined)
  }
}
