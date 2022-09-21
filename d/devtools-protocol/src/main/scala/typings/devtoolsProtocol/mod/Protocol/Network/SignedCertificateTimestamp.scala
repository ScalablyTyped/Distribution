package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedCertificateTimestamp extends StObject {
  
  /**
    * Hash algorithm.
    */
  var hashAlgorithm: String
  
  /**
    * Log name / description.
    */
  var logDescription: String
  
  /**
    * Log ID.
    */
  var logId: String
  
  /**
    * Origin.
    */
  var origin: String
  
  /**
    * Signature algorithm.
    */
  var signatureAlgorithm: String
  
  /**
    * Signature data.
    */
  var signatureData: String
  
  /**
    * Validation status.
    */
  var status: String
  
  /**
    * Issuance date. Unlike TimeSinceEpoch, this contains the number of
    * milliseconds since January 1, 1970, UTC, not the number of seconds.
    */
  var timestamp: Double
}
object SignedCertificateTimestamp {
  
  inline def apply(
    hashAlgorithm: String,
    logDescription: String,
    logId: String,
    origin: String,
    signatureAlgorithm: String,
    signatureData: String,
    status: String,
    timestamp: Double
  ): SignedCertificateTimestamp = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], logDescription = logDescription.asInstanceOf[js.Any], logId = logId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureData = signatureData.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedCertificateTimestamp]
  }
  
  extension [Self <: SignedCertificateTimestamp](x: Self) {
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setLogDescription(value: String): Self = StObject.set(x, "logDescription", value.asInstanceOf[js.Any])
    
    inline def setLogId(value: String): Self = StObject.set(x, "logId", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureData(value: String): Self = StObject.set(x, "signatureData", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
