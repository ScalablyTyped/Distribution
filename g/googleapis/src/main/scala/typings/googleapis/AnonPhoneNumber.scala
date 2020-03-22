package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPhoneNumber extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var federatedId: js.UndefOr[String] = js.native
  var phoneNumber: js.UndefOr[String] = js.native
  var photoUrl: js.UndefOr[String] = js.native
  var providerId: js.UndefOr[String] = js.native
  var rawId: js.UndefOr[String] = js.native
  var screenName: js.UndefOr[String] = js.native
}

object AnonPhoneNumber {
  @scala.inline
  def apply(
    displayName: String = null,
    email: String = null,
    federatedId: String = null,
    phoneNumber: String = null,
    photoUrl: String = null,
    providerId: String = null,
    rawId: String = null,
    screenName: String = null
  ): AnonPhoneNumber = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (federatedId != null) __obj.updateDynamic("federatedId")(federatedId.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (providerId != null) __obj.updateDynamic("providerId")(providerId.asInstanceOf[js.Any])
    if (rawId != null) __obj.updateDynamic("rawId")(rawId.asInstanceOf[js.Any])
    if (screenName != null) __obj.updateDynamic("screenName")(screenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPhoneNumber]
  }
}

