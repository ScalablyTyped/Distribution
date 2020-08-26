package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1CryptoKey extends js.Object {
  var kmsWrapped: js.UndefOr[GooglePrivacyDlpV2beta1KmsWrappedCryptoKey] = js.native
  var transient: js.UndefOr[GooglePrivacyDlpV2beta1TransientCryptoKey] = js.native
  var unwrapped: js.UndefOr[GooglePrivacyDlpV2beta1UnwrappedCryptoKey] = js.native
}

object GooglePrivacyDlpV2beta1CryptoKey {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1CryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CryptoKey]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1CryptoKeyOps[Self <: GooglePrivacyDlpV2beta1CryptoKey] (val x: Self) extends AnyVal {
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
    def setKmsWrapped(value: GooglePrivacyDlpV2beta1KmsWrappedCryptoKey): Self = this.set("kmsWrapped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsWrapped: Self = this.set("kmsWrapped", js.undefined)
    @scala.inline
    def setTransient(value: GooglePrivacyDlpV2beta1TransientCryptoKey): Self = this.set("transient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransient: Self = this.set("transient", js.undefined)
    @scala.inline
    def setUnwrapped(value: GooglePrivacyDlpV2beta1UnwrappedCryptoKey): Self = this.set("unwrapped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnwrapped: Self = this.set("unwrapped", js.undefined)
  }
  
}

