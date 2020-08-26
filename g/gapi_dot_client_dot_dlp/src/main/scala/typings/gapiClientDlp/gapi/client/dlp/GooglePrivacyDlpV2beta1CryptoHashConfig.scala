package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1CryptoHashConfig extends js.Object {
  /** The key used by the hash function. */
  var cryptoKey: js.UndefOr[GooglePrivacyDlpV2beta1CryptoKey] = js.native
}

object GooglePrivacyDlpV2beta1CryptoHashConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1CryptoHashConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CryptoHashConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1CryptoHashConfigOps[Self <: GooglePrivacyDlpV2beta1CryptoHashConfig] (val x: Self) extends AnyVal {
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
    def setCryptoKey(value: GooglePrivacyDlpV2beta1CryptoKey): Self = this.set("cryptoKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCryptoKey: Self = this.set("cryptoKey", js.undefined)
  }
  
}

