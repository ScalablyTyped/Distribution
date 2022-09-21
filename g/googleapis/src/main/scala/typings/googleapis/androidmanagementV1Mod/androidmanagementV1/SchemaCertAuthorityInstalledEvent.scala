package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertAuthorityInstalledEvent extends StObject {
  
  /**
    * Subject of the certificate.
    */
  var certificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the installation event succeeded.
    */
  var success: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The user in which the certificate install event happened. Only available for devices running Android 11 and above.
    */
  var userId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCertAuthorityInstalledEvent {
  
  inline def apply(): SchemaCertAuthorityInstalledEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertAuthorityInstalledEvent]
  }
  
  extension [Self <: SchemaCertAuthorityInstalledEvent](x: Self) {
    
    inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateNull: Self = StObject.set(x, "certificate", null)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessNull: Self = StObject.set(x, "success", null)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
