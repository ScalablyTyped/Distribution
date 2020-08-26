package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for KeyManagementService.UpdateCryptoKeyPrimaryVersion.
  */
@js.native
trait SchemaUpdateCryptoKeyPrimaryVersionRequest extends js.Object {
  /**
    * The id of the child CryptoKeyVersion to use as primary.
    */
  var cryptoKeyVersionId: js.UndefOr[String] = js.native
}

object SchemaUpdateCryptoKeyPrimaryVersionRequest {
  @scala.inline
  def apply(): SchemaUpdateCryptoKeyPrimaryVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateCryptoKeyPrimaryVersionRequest]
  }
  @scala.inline
  implicit class SchemaUpdateCryptoKeyPrimaryVersionRequestOps[Self <: SchemaUpdateCryptoKeyPrimaryVersionRequest] (val x: Self) extends AnyVal {
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
    def setCryptoKeyVersionId(value: String): Self = this.set("cryptoKeyVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCryptoKeyVersionId: Self = this.set("cryptoKeyVersionId", js.undefined)
  }
  
}

