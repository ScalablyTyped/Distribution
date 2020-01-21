package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when an app installation failed on a device
  */
@js.native
trait SchemaInstallFailureEvent extends js.Object {
  /**
    * The Android ID of the device. This field will always be present.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Additional details on the failure if applicable.
    */
  var failureDetails: js.UndefOr[String] = js.native
  /**
    * The reason for the installation failure. This field will always be
    * present.
    */
  var failureReason: js.UndefOr[String] = js.native
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which the install failure event occured. This field will always be
    * present.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The ID of the user. This field will always be present.
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaInstallFailureEvent {
  @scala.inline
  def apply(
    deviceId: String = null,
    failureDetails: String = null,
    failureReason: String = null,
    productId: String = null,
    userId: String = null
  ): SchemaInstallFailureEvent = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (failureDetails != null) __obj.updateDynamic("failureDetails")(failureDetails.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstallFailureEvent]
  }
}

