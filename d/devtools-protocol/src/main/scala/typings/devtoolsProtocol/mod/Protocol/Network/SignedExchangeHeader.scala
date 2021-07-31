package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedExchangeHeader extends StObject {
  
  /**
    * Signed exchange header integrity hash in the form of "sha256-<base64-hash-value>".
    */
  var headerIntegrity: String
  
  /**
    * Signed exchange request URL.
    */
  var requestUrl: String
  
  /**
    * Signed exchange response code.
    */
  var responseCode: integer
  
  /**
    * Signed exchange response headers.
    */
  var responseHeaders: Headers
  
  /**
    * Signed exchange response signature.
    */
  var signatures: js.Array[SignedExchangeSignature]
}
object SignedExchangeHeader {
  
  @scala.inline
  def apply(
    headerIntegrity: String,
    requestUrl: String,
    responseCode: integer,
    responseHeaders: Headers,
    signatures: js.Array[SignedExchangeSignature]
  ): SignedExchangeHeader = {
    val __obj = js.Dynamic.literal(headerIntegrity = headerIntegrity.asInstanceOf[js.Any], requestUrl = requestUrl.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedExchangeHeader]
  }
  
  @scala.inline
  implicit class SignedExchangeHeaderMutableBuilder[Self <: SignedExchangeHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderIntegrity(value: String): Self = StObject.set(x, "headerIntegrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUrl(value: String): Self = StObject.set(x, "requestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCode(value: integer): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeaders(value: Headers): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatures(value: js.Array[SignedExchangeSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: SignedExchangeSignature*): Self = StObject.set(x, "signatures", js.Array(value :_*))
  }
}
