package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayNameFederatedId extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var federatedId: js.UndefOr[String] = js.native
  var photoUrl: js.UndefOr[String] = js.native
  var providerId: js.UndefOr[String] = js.native
}

object AnonDisplayNameFederatedId {
  @scala.inline
  def apply(
    displayName: String = null,
    federatedId: String = null,
    photoUrl: String = null,
    providerId: String = null
  ): AnonDisplayNameFederatedId = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (federatedId != null) __obj.updateDynamic("federatedId")(federatedId.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (providerId != null) __obj.updateDynamic("providerId")(providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayNameFederatedId]
  }
}

