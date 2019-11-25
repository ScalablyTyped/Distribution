package typings.gapiDotClientDotIam.gapi.client.iam

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
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignBlobResponse]
  }
}

