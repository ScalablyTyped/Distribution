package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration and status of a self-managed SSL certificate.
  */
trait SchemaSslCertificateSelfManagedSslCertificate extends StObject {
  
  /**
    * A local certificate file. The certificate must be in PEM format. The
    * certificate chain must be no greater than 5 certs long. The chain must
    * include at least one intermediate cert.
    */
  var certificate: js.UndefOr[String] = js.undefined
  
  /**
    * A write-only private key in PEM format. Only insert requests will include
    * this field.
    */
  var privateKey: js.UndefOr[String] = js.undefined
}
object SchemaSslCertificateSelfManagedSslCertificate {
  
  @scala.inline
  def apply(): SchemaSslCertificateSelfManagedSslCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertificateSelfManagedSslCertificate]
  }
  
  @scala.inline
  implicit class SchemaSslCertificateSelfManagedSslCertificateMutableBuilder[Self <: SchemaSslCertificateSelfManagedSslCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
  }
}
