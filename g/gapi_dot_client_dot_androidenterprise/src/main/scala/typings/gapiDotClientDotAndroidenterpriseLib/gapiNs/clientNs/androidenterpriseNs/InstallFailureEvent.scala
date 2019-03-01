package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallFailureEvent extends js.Object {
  /** The Android ID of the device. This field will always be present. */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /** Additional details on the failure if applicable. */
  var failureDetails: js.UndefOr[java.lang.String] = js.undefined
  /** The reason for the installation failure. This field will always be present. */
  var failureReason: js.UndefOr[java.lang.String] = js.undefined
  /** The id of the product (e.g. "app:com.google.android.gm") for which the install failure event occured. This field will always be present. */
  var productId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the user. This field will always be present. */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object InstallFailureEvent {
  @scala.inline
  def apply(
    deviceId: java.lang.String = null,
    failureDetails: java.lang.String = null,
    failureReason: java.lang.String = null,
    productId: java.lang.String = null,
    userId: java.lang.String = null
  ): InstallFailureEvent = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (failureDetails != null) __obj.updateDynamic("failureDetails")(failureDetails)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[InstallFailureEvent]
  }
}

