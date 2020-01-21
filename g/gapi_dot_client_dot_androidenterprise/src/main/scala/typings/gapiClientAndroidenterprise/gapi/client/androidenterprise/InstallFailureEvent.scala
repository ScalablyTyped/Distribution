package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallFailureEvent extends js.Object {
  /** The Android ID of the device. This field will always be present. */
  var deviceId: js.UndefOr[String] = js.undefined
  /** Additional details on the failure if applicable. */
  var failureDetails: js.UndefOr[String] = js.undefined
  /** The reason for the installation failure. This field will always be present. */
  var failureReason: js.UndefOr[String] = js.undefined
  /** The id of the product (e.g. "app:com.google.android.gm") for which the install failure event occured. This field will always be present. */
  var productId: js.UndefOr[String] = js.undefined
  /** The ID of the user. This field will always be present. */
  var userId: js.UndefOr[String] = js.undefined
}

object InstallFailureEvent {
  @scala.inline
  def apply(
    deviceId: String = null,
    failureDetails: String = null,
    failureReason: String = null,
    productId: String = null,
    userId: String = null
  ): InstallFailureEvent = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (failureDetails != null) __obj.updateDynamic("failureDetails")(failureDetails.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallFailureEvent]
  }
}

