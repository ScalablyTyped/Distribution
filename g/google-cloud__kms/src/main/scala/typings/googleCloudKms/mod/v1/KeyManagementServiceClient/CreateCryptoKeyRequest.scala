package typings.googleCloudKms.mod.v1.KeyManagementServiceClient

import typings.googleCloudKms.anon.PartialOmitCryptoKeypurpo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCryptoKeyRequest extends js.Object {
  var cryptoKey: PartialOmitCryptoKeypurpo = js.native
  var cryptoKeyId: String = js.native
  var parent: String = js.native
  var skipInitialVersionCreation: js.UndefOr[Boolean] = js.native
}

object CreateCryptoKeyRequest {
  @scala.inline
  def apply(cryptoKey: PartialOmitCryptoKeypurpo, cryptoKeyId: String, parent: String): CreateCryptoKeyRequest = {
    val __obj = js.Dynamic.literal(cryptoKey = cryptoKey.asInstanceOf[js.Any], cryptoKeyId = cryptoKeyId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCryptoKeyRequest]
  }
  @scala.inline
  implicit class CreateCryptoKeyRequestOps[Self <: CreateCryptoKeyRequest] (val x: Self) extends AnyVal {
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
    def setCryptoKey(value: PartialOmitCryptoKeypurpo): Self = this.set("cryptoKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setCryptoKeyId(value: String): Self = this.set("cryptoKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipInitialVersionCreation(value: Boolean): Self = this.set("skipInitialVersionCreation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipInitialVersionCreation: Self = this.set("skipInitialVersionCreation", js.undefined)
  }
  
}

