package typings.firebaseAdmin.libAuthAuthConfigMod

import typings.firebaseAdmin.anon.CallbackUri
import typings.firebaseAdmin.anon.IdpCertificates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAMLConfigServerResponse extends StObject {
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var idpConfig: js.UndefOr[IdpCertificates] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var spConfig: js.UndefOr[CallbackUri] = js.undefined
}
object SAMLConfigServerResponse {
  
  inline def apply(): SAMLConfigServerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAMLConfigServerResponse]
  }
  
  extension [Self <: SAMLConfigServerResponse](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIdpConfig(value: IdpCertificates): Self = StObject.set(x, "idpConfig", value.asInstanceOf[js.Any])
    
    inline def setIdpConfigUndefined: Self = StObject.set(x, "idpConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSpConfig(value: CallbackUri): Self = StObject.set(x, "spConfig", value.asInstanceOf[js.Any])
    
    inline def setSpConfigUndefined: Self = StObject.set(x, "spConfig", js.undefined)
  }
}
