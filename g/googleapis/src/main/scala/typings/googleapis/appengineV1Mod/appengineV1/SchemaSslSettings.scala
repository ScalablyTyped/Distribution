package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SSL configuration for a DomainMapping resource.
  */
trait SchemaSslSettings extends StObject {
  
  /**
    * ID of the AuthorizedCertificate resource configuring SSL for the
    * application. Clearing this field will remove SSL support.By default, a
    * managed certificate is automatically created for every domain mapping. To
    * omit SSL support or to configure SSL manually, specify
    * SslManagementType.MANUAL on a CREATE or UPDATE request. You must be
    * authorized to administer the AuthorizedCertificate resource to manually
    * map it to a DomainMapping resource. Example: 12345.
    */
  var certificateId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the managed AuthorizedCertificate resource currently being
    * provisioned, if applicable. Until the new managed certificate has been
    * successfully provisioned, the previous SSL state will be preserved. Once
    * the provisioning process completes, the certificate_id field will reflect
    * the new managed certificate and this field will be left empty. To remove
    * SSL support while there is still a pending managed certificate, clear the
    * certificate_id field with an UpdateDomainMappingRequest.@OutputOnly
    */
  var pendingManagedCertificateId: js.UndefOr[String] = js.undefined
  
  /**
    * SSL management type for this domain. If AUTOMATIC, a managed certificate
    * is automatically provisioned. If MANUAL, certificate_id must be manually
    * specified in order to configure SSL for this domain.
    */
  var sslManagementType: js.UndefOr[String] = js.undefined
}
object SchemaSslSettings {
  
  @scala.inline
  def apply(): SchemaSslSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslSettings]
  }
  
  @scala.inline
  implicit class SchemaSslSettingsMutableBuilder[Self <: SchemaSslSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateId(value: String): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
    
    @scala.inline
    def setPendingManagedCertificateId(value: String): Self = StObject.set(x, "pendingManagedCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingManagedCertificateIdUndefined: Self = StObject.set(x, "pendingManagedCertificateId", js.undefined)
    
    @scala.inline
    def setSslManagementType(value: String): Self = StObject.set(x, "sslManagementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslManagementTypeUndefined: Self = StObject.set(x, "sslManagementType", js.undefined)
  }
}
