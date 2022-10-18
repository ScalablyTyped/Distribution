package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslCertificatesCertificateInformation extends StObject {
  
  var alias: String | Null
  
  var expiry: DateTime
  
  var format: String
  
  var has_private_key: Boolean
  
  var path: String
  
  var serial_number: String
  
  var subject_dn: String
}
object SslCertificatesCertificateInformation {
  
  inline def apply(
    expiry: DateTime,
    format: String,
    has_private_key: Boolean,
    path: String,
    serial_number: String,
    subject_dn: String
  ): SslCertificatesCertificateInformation = {
    val __obj = js.Dynamic.literal(expiry = expiry.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], has_private_key = has_private_key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serial_number = serial_number.asInstanceOf[js.Any], subject_dn = subject_dn.asInstanceOf[js.Any], alias = null)
    __obj.asInstanceOf[SslCertificatesCertificateInformation]
  }
  
  extension [Self <: SslCertificatesCertificateInformation](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasNull: Self = StObject.set(x, "alias", null)
    
    inline def setExpiry(value: DateTime): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setHas_private_key(value: Boolean): Self = StObject.set(x, "has_private_key", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSerial_number(value: String): Self = StObject.set(x, "serial_number", value.asInstanceOf[js.Any])
    
    inline def setSubject_dn(value: String): Self = StObject.set(x, "subject_dn", value.asInstanceOf[js.Any])
  }
}
