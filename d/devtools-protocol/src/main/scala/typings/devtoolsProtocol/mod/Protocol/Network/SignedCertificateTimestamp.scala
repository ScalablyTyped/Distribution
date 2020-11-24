package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedCertificateTimestamp extends js.Object {
  
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
  implicit class SignedCertificateTimestampOps[Self <: SignedCertificateTimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHashAlgorithm(value: String): Self = this.set("hashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDescription(value: String): Self = this.set("logDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogId(value: String): Self = this.set("logId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureAlgorithm(value: String): Self = this.set("signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureData(value: String): Self = this.set("signatureData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: TimeSinceEpoch): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
