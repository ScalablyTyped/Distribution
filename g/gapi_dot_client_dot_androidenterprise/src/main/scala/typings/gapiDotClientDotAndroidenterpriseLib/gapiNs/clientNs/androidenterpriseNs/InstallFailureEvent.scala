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

