package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignBlobResponse extends js.Object {
  /** The id of the key used to sign the blob. */
  var keyId: js.UndefOr[java.lang.String] = js.undefined
  /** The signed blob. */
  var signature: js.UndefOr[java.lang.String] = js.undefined
}

object SignBlobResponse {
  @scala.inline
  def apply(keyId: java.lang.String = null, signature: java.lang.String = null): SignBlobResponse = {
    val __obj = js.Dynamic.literal()
    if (keyId != null) __obj.updateDynamic("keyId")(keyId)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[SignBlobResponse]
  }
}

