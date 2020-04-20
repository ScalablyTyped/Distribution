package typings.firebaseAdmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBundleId extends js.Object {
  /**
    * Defines the required iOS bundle ID of the app where the link should be
    * handled if the application is already installed on the device.
    */
  var bundleId: String
}

object AnonBundleId {
  @scala.inline
  def apply(bundleId: String): AnonBundleId = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBundleId]
  }
}

