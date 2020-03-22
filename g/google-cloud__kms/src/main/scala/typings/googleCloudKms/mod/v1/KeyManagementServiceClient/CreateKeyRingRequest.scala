package typings.googleCloudKms.mod.v1.KeyManagementServiceClient

import typings.googleCloudKms.PartialKeyRing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateKeyRingRequest extends js.Object {
  var keyRing: js.UndefOr[PartialKeyRing] = js.undefined
  var keyRingId: String
  var parent: String
}

object CreateKeyRingRequest {
  @scala.inline
  def apply(keyRingId: String, parent: String, keyRing: PartialKeyRing = null): CreateKeyRingRequest = {
    val __obj = js.Dynamic.literal(keyRingId = keyRingId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (keyRing != null) __obj.updateDynamic("keyRing")(keyRing.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyRingRequest]
  }
}

