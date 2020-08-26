package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedExchangeHeader extends js.Object {
  /**
    * Signed exchange header integrity hash in the form of "sha256-<base64-hash-value>".
    */
  var headerIntegrity: String = js.native
  /**
    * Signed exchange request URL.
    */
  var requestUrl: String = js.native
  /**
    * Signed exchange response code.
    */
  var responseCode: integer = js.native
  /**
    * Signed exchange response headers.
    */
  var responseHeaders: Headers = js.native
  /**
    * Signed exchange response signature.
    */
  var signatures: js.Array[SignedExchangeSignature] = js.native
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
  implicit class SignedExchangeHeaderOps[Self <: SignedExchangeHeader] (val x: Self) extends AnyVal {
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
    def setHeaderIntegrity(value: String): Self = this.set("headerIntegrity", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestUrl(value: String): Self = this.set("requestUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseCode(value: integer): Self = this.set("responseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseHeaders(value: Headers): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignaturesVarargs(value: SignedExchangeSignature*): Self = this.set("signatures", js.Array(value :_*))
    @scala.inline
    def setSignatures(value: js.Array[SignedExchangeSignature]): Self = this.set("signatures", value.asInstanceOf[js.Any])
  }
  
}

