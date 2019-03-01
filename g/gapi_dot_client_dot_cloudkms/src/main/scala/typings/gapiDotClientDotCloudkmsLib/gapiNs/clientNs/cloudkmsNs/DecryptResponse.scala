package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptResponse extends js.Object {
  /** The decrypted data originally supplied in EncryptRequest.plaintext. */
  var plaintext: js.UndefOr[java.lang.String] = js.undefined
}

object DecryptResponse {
  @scala.inline
  def apply(plaintext: java.lang.String = null): DecryptResponse = {
    val __obj = js.Dynamic.literal()
    if (plaintext != null) __obj.updateDynamic("plaintext")(plaintext)
    __obj.asInstanceOf[DecryptResponse]
  }
}

