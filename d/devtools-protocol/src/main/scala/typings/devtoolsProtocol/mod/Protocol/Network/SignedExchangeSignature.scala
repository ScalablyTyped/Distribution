package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedExchangeSignature extends js.Object {
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
  implicit class SignedExchangeSignatureOps[Self <: SignedExchangeSignature] (val x: Self) extends AnyVal {
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
    def setDate(value: integer): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires(value: integer): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidityUrl(value: String): Self = this.set("validityUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertSha256(value: String): Self = this.set("certSha256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertSha256: Self = this.set("certSha256", js.undefined)
    @scala.inline
    def setCertUrl(value: String): Self = this.set("certUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertUrl: Self = this.set("certUrl", js.undefined)
    @scala.inline
    def setCertificatesVarargs(value: String*): Self = this.set("certificates", js.Array(value :_*))
    @scala.inline
    def setCertificates(value: js.Array[String]): Self = this.set("certificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificates: Self = this.set("certificates", js.undefined)
  }
  
}

