package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedCertificateTimestamp extends StObject {
  
  /**
    * Hash algorithm.
    */
  var hashAlgorithm: String = js.native
  
  /**
    * Log name / description.
    */
  var logDescription: String = js.native
  
  /**
    * Log ID.
    */
  var logId: String = js.native
  
  /**
    * Origin.
    */
  var origin: String = js.native
  
  /**
    * Signature algorithm.
    */
  var signatureAlgorithm: String = js.native
  
  /**
    * Signature data.
    */
  var signatureData: String = js.native
  
  /**
    * Validation status.
    */
  var status: String = js.native
  
  /**
    * Issuance date.
    */
  var timestamp: TimeSinceEpoch = js.native
}
object SignedCertificateTimestamp {
  
  @scala.inline
  def apply(
    hashAlgorithm: String,
    logDescription: String,
    logId: String,
    origin: String,
    signatureAlgorithm: String,
    signatureData: String,
    status: String,
    timestamp: TimeSinceEpoch
  ): SignedCertificateTimestamp = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], logDescription = logDescription.asInstanceOf[js.Any], logId = logId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureData = signatureData.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedCertificateTimestamp]
  }
  
  @scala.inline
  implicit class SignedCertificateTimestampMutableBuilder[Self <: SignedCertificateTimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDescription(value: String): Self = StObject.set(x, "logDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogId(value: String): Self = StObject.set(x, "logId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureData(value: String): Self = StObject.set(x, "signatureData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: TimeSinceEpoch): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
