package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Using raw keys is prone to security risks due to accidentally leaking the
  * key. Choose another type of key if possible.
  */
@js.native
trait Schema$GooglePrivacyDlpV2UnwrappedCryptoKey extends js.Object {
  /**
    * A 128/192/256 bit key. [required]
    */
  var key: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2UnwrappedCryptoKey {
  @scala.inline
  def apply(key: String = null): Schema$GooglePrivacyDlpV2UnwrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2UnwrappedCryptoKey]
  }
}

