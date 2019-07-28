package typings.gapiDotClientDotIam.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignBlobResponse extends js.Object {
  /** The id of the key used to sign the blob. */
  var keyId: js.UndefOr[String] = js.undefined
  /** The signed blob. */
  var signature: js.UndefOr[String] = js.undefined
}

object SignBlobResponse {
  @scala.inline
  def apply(keyId: String = null, signature: String = null): SignBlobResponse = {
    val __obj = js.Dynamic.literal()
    if (keyId != null) __obj.updateDynamic("keyId")(keyId)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[SignBlobResponse]
  }
}

