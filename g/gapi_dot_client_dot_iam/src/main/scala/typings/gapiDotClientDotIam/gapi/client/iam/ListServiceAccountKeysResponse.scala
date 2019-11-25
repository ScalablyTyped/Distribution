package typings.gapiDotClientDotIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServiceAccountKeysResponse extends js.Object {
  /** The public keys for the service account. */
  var keys: js.UndefOr[js.Array[ServiceAccountKey]] = js.undefined
}

object ListServiceAccountKeysResponse {
  @scala.inline
  def apply(keys: js.Array[ServiceAccountKey] = null): ListServiceAccountKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceAccountKeysResponse]
  }
}

