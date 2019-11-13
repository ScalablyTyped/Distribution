package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient

import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyRing
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateKeyRingRequest extends js.Object {
  var keyRing: js.UndefOr[Partial[KeyRing]] = js.undefined
  var keyRingId: String
  var parent: String
}

object CreateKeyRingRequest {
  @scala.inline
  def apply(keyRingId: String, parent: String, keyRing: Partial[KeyRing] = null): CreateKeyRingRequest = {
    val __obj = js.Dynamic.literal(keyRingId = keyRingId, parent = parent)
    if (keyRing != null) __obj.updateDynamic("keyRing")(keyRing)
    __obj.asInstanceOf[CreateKeyRingRequest]
  }
}

