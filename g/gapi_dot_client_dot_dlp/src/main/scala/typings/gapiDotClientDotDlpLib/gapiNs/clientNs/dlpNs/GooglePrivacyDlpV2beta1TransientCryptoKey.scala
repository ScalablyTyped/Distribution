package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1TransientCryptoKey extends js.Object {
  /**
    * Name of the key. [required]
    * This is an arbitrary string used to differentiate different keys.
    * A unique key is generated per name: two separate `TransientCryptoKey`
    * protos share the same generated key if their names are the same.
    * When the data crypto key is generated, this name is not used in any way
    * (repeating the api call will result in a different key being generated).
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1TransientCryptoKey {
  @scala.inline
  def apply(name: java.lang.String = null): GooglePrivacyDlpV2beta1TransientCryptoKey = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1TransientCryptoKey]
  }
}

