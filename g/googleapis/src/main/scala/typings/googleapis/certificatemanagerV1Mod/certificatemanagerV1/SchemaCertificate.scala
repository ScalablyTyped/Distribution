package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificate extends StObject {
  
  /**
    * Output only. The creation timestamp of a Certificate.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One or more paragraphs of text description of a certificate.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The expiry timestamp of a Certificate.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set of labels associated with a Certificate.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * If set, contains configuration and state of a managed certificate.
    */
  var managed: js.UndefOr[SchemaManagedCertificate] = js.undefined
  
  /**
    * A user-defined name of the certificate. Certificate names must be unique globally and match pattern `projects/x/locations/x/certificates/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The PEM-encoded certificate chain.
    */
  var pemCertificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The list of Subject Alternative Names of dnsName type defined in the certificate (see RFC 5280 4.2.1.6). Managed certificates that haven't been provisioned yet have this field populated with a value of the managed.domains field.
    */
  var sanDnsnames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Immutable. The scope of the certificate.
    */
  var scope: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, defines data of a self-managed certificate.
    */
  var selfManaged: js.UndefOr[SchemaSelfManagedCertificate] = js.undefined
  
  /**
    * Output only. The last update timestamp of a Certificate.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCertificate {
  
  inline def apply(): SchemaCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificate]
  }
  
  extension [Self <: SchemaCertificate](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setManaged(value: SchemaManagedCertificate): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
    
    inline def setManagedUndefined: Self = StObject.set(x, "managed", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPemCertificate(value: String): Self = StObject.set(x, "pemCertificate", value.asInstanceOf[js.Any])
    
    inline def setPemCertificateNull: Self = StObject.set(x, "pemCertificate", null)
    
    inline def setPemCertificateUndefined: Self = StObject.set(x, "pemCertificate", js.undefined)
    
    inline def setSanDnsnames(value: js.Array[String]): Self = StObject.set(x, "sanDnsnames", value.asInstanceOf[js.Any])
    
    inline def setSanDnsnamesNull: Self = StObject.set(x, "sanDnsnames", null)
    
    inline def setSanDnsnamesUndefined: Self = StObject.set(x, "sanDnsnames", js.undefined)
    
    inline def setSanDnsnamesVarargs(value: String*): Self = StObject.set(x, "sanDnsnames", js.Array(value*))
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSelfManaged(value: SchemaSelfManagedCertificate): Self = StObject.set(x, "selfManaged", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedUndefined: Self = StObject.set(x, "selfManaged", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
