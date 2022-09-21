package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApnsCertificateExpirationInfo extends StObject {
  
  /**
    * The Apple ID used for the certificate, may be blank if admins did not enter it.
    */
  var appleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The expiration date of the APNS Certificate.
    */
  var expirationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The UID for the certificate.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
}
object SchemaApnsCertificateExpirationInfo {
  
  inline def apply(): SchemaApnsCertificateExpirationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApnsCertificateExpirationInfo]
  }
  
  extension [Self <: SchemaApnsCertificateExpirationInfo](x: Self) {
    
    inline def setAppleId(value: String): Self = StObject.set(x, "appleId", value.asInstanceOf[js.Any])
    
    inline def setAppleIdNull: Self = StObject.set(x, "appleId", null)
    
    inline def setAppleIdUndefined: Self = StObject.set(x, "appleId", js.undefined)
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
