package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublicKeyCertificate extends StObject {
  
  /**
    * The certificate data.
    */
  var certificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The certificate format.
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] The certificate details. Used only for X.509 certificates.
    */
  var x509Details: js.UndefOr[SchemaX509CertificateDetails] = js.undefined
}
object SchemaPublicKeyCertificate {
  
  inline def apply(): SchemaPublicKeyCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicKeyCertificate]
  }
  
  extension [Self <: SchemaPublicKeyCertificate](x: Self) {
    
    inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateNull: Self = StObject.set(x, "certificate", null)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setX509Details(value: SchemaX509CertificateDetails): Self = StObject.set(x, "x509Details", value.asInstanceOf[js.Any])
    
    inline def setX509DetailsUndefined: Self = StObject.set(x, "x509Details", js.undefined)
  }
}
