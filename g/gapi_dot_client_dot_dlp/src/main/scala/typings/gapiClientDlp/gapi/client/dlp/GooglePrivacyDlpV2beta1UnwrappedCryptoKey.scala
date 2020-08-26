package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1UnwrappedCryptoKey extends js.Object {
  /** The AES 128/192/256 bit key. [required] */
  var key: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1UnwrappedCryptoKey {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1UnwrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1UnwrappedCryptoKey]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1UnwrappedCryptoKeyOps[Self <: GooglePrivacyDlpV2beta1UnwrappedCryptoKey] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

