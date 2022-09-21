package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedCertificate extends StObject {
  
  /**
    * Time at which the certificate was last renewed. The renewal process is fully managed. Certificate renewal will automatically occur before the certificate expires. Renewal errors can be tracked via ManagementStatus.@OutputOnly
    */
  var lastRenewalTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of certificate management. Refers to the most recent certificate acquisition or renewal attempt.@OutputOnly
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedCertificate {
  
  inline def apply(): SchemaManagedCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedCertificate]
  }
  
  extension [Self <: SchemaManagedCertificate](x: Self) {
    
    inline def setLastRenewalTime(value: String): Self = StObject.set(x, "lastRenewalTime", value.asInstanceOf[js.Any])
    
    inline def setLastRenewalTimeNull: Self = StObject.set(x, "lastRenewalTime", null)
    
    inline def setLastRenewalTimeUndefined: Self = StObject.set(x, "lastRenewalTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
