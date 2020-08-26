package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1TransientCryptoKey extends js.Object {
  /**
    * Name of the key. [required]
    * This is an arbitrary string used to differentiate different keys.
    * A unique key is generated per name: two separate `TransientCryptoKey`
    * protos share the same generated key if their names are the same.
    * When the data crypto key is generated, this name is not used in any way
    * (repeating the api call will result in a different key being generated).
    */
  var name: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1TransientCryptoKey {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1TransientCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1TransientCryptoKey]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1TransientCryptoKeyOps[Self <: GooglePrivacyDlpV2beta1TransientCryptoKey] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

