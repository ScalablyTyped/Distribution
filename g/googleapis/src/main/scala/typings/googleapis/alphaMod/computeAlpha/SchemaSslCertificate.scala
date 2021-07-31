package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An SslCertificate resource. This resource provides a mechanism to upload an
  * SSL key and certificate to the load balancer to serve secure connections
  * from the user. (== resource_for beta.sslCertificates ==) (== resource_for
  * v1.sslCertificates ==)
  */
trait SchemaSslCertificate extends StObject {
  
  /**
    * A local certificate file. The certificate must be in PEM format. The
    * certificate chain must be no greater than 5 certs long. The chain must
    * include at least one intermediate cert.
    */
  var certificate: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Expire time of the certificate. RFC3339
    */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#sslCertificate for SSL
    * certificates.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration and status of a managed SSL certificate.
    */
  var managed: js.UndefOr[SchemaSslCertificateManagedSslCertificate] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A write-only private key in PEM format. Only insert requests will include
    * this field.
    */
  var privateKey: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] URL of the region where the regional SSL Certificate
    * resides. This field is not applicable to global SSL Certificate.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration and status of a self-managed SSL certificate.
    */
  var selfManaged: js.UndefOr[SchemaSslCertificateSelfManagedSslCertificate] = js.undefined
  
  /**
    * [Output Only] Domains associated with the certificate via Subject
    * Alternative Name.
    */
  var subjectAlternativeNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * (Optional) Specifies the type of SSL certificate, either
    * &quot;SELF_MANAGED&quot; or &quot;MANAGED&quot;. If not specified, the
    * certificate is self-managed and the fields certificate and private_key
    * are used.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaSslCertificate {
  
  @scala.inline
  def apply(): SchemaSslCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertificate]
  }
  
  @scala.inline
  implicit class SchemaSslCertificateMutableBuilder[Self <: SchemaSslCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setManaged(value: SchemaSslCertificateManagedSslCertificate): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedUndefined: Self = StObject.set(x, "managed", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    @scala.inline
    def setSelfManaged(value: SchemaSslCertificateSelfManagedSslCertificate): Self = StObject.set(x, "selfManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfManagedUndefined: Self = StObject.set(x, "selfManaged", js.undefined)
    
    @scala.inline
    def setSubjectAlternativeNames(value: js.Array[String]): Self = StObject.set(x, "subjectAlternativeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "subjectAlternativeNames", js.undefined)
    
    @scala.inline
    def setSubjectAlternativeNamesVarargs(value: String*): Self = StObject.set(x, "subjectAlternativeNames", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
