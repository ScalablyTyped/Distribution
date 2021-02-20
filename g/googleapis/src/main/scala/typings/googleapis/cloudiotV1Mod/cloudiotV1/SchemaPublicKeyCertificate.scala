package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A public key certificate format and data.
  */
@js.native
trait SchemaPublicKeyCertificate extends StObject {
  
  /**
    * The certificate data.
    */
  var certificate: js.UndefOr[String] = js.native
  
  /**
    * The certificate format.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * [Output only] The certificate details. Used only for X.509 certificates.
    */
  var x509Details: js.UndefOr[SchemaX509CertificateDetails] = js.native
}
object SchemaPublicKeyCertificate {
  
  @scala.inline
  def apply(): SchemaPublicKeyCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicKeyCertificate]
  }
  
  @scala.inline
  implicit class SchemaPublicKeyCertificateMutableBuilder[Self <: SchemaPublicKeyCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setX509Details(value: SchemaX509CertificateDetails): Self = StObject.set(x, "x509Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX509DetailsUndefined: Self = StObject.set(x, "x509Details", js.undefined)
  }
}
