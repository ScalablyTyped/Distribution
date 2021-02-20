package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedExchangeSignature extends StObject {
  
  /**
    * The hex string of signed exchange signature cert sha256.
    */
  var certSha256: js.UndefOr[String] = js.native
  
  /**
    * Signed exchange signature cert Url.
    */
  var certUrl: js.UndefOr[String] = js.native
  
  /**
    * The encoded certificates.
    */
  var certificates: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Signed exchange signature date.
    */
  var date: integer = js.native
  
  /**
    * Signed exchange signature expires.
    */
  var expires: integer = js.native
  
  /**
    * Signed exchange signature integrity.
    */
  var integrity: String = js.native
  
  /**
    * Signed exchange signature label.
    */
  var label: String = js.native
  
  /**
    * The hex string of signed exchange signature.
    */
  var signature: String = js.native
  
  /**
    * Signed exchange signature validity Url.
    */
  var validityUrl: String = js.native
}
object SignedExchangeSignature {
  
  @scala.inline
  def apply(
    date: integer,
    expires: integer,
    integrity: String,
    label: String,
    signature: String,
    validityUrl: String
  ): SignedExchangeSignature = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], validityUrl = validityUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedExchangeSignature]
  }
  
  @scala.inline
  implicit class SignedExchangeSignatureMutableBuilder[Self <: SignedExchangeSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertSha256(value: String): Self = StObject.set(x, "certSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertSha256Undefined: Self = StObject.set(x, "certSha256", js.undefined)
    
    @scala.inline
    def setCertUrl(value: String): Self = StObject.set(x, "certUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertUrlUndefined: Self = StObject.set(x, "certUrl", js.undefined)
    
    @scala.inline
    def setCertificates(value: js.Array[String]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: String*): Self = StObject.set(x, "certificates", js.Array(value :_*))
    
    @scala.inline
    def setDate(value: integer): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires(value: integer): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidityUrl(value: String): Self = StObject.set(x, "validityUrl", value.asInstanceOf[js.Any])
  }
}
