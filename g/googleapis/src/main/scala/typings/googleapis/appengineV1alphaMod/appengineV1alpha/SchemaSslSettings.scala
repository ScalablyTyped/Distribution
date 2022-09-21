package typings.googleapis.appengineV1alphaMod.appengineV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSslSettings extends StObject {
  
  /**
    * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify no_managed_certificate on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
    */
  var certificateId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the mapped certificate is an App Engine managed certificate. Managed certificates are created by default with a domain mapping. To opt out, specify no_managed_certificate on a CREATE or UPDATE request.@OutputOnly
    */
  var isManagedCertificate: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSslSettings {
  
  inline def apply(): SchemaSslSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslSettings]
  }
  
  extension [Self <: SchemaSslSettings](x: Self) {
    
    inline def setCertificateId(value: String): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdNull: Self = StObject.set(x, "certificateId", null)
    
    inline def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
    
    inline def setIsManagedCertificate(value: Boolean): Self = StObject.set(x, "isManagedCertificate", value.asInstanceOf[js.Any])
    
    inline def setIsManagedCertificateNull: Self = StObject.set(x, "isManagedCertificate", null)
    
    inline def setIsManagedCertificateUndefined: Self = StObject.set(x, "isManagedCertificate", js.undefined)
  }
}
