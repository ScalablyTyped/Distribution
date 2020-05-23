package typings.firebaseAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundleId extends js.Object {
  /**
    * Defines the required iOS bundle ID of the app where the link should be
    * handled if the application is already installed on the device.
    */
  var bundleId: String
}

object BundleId {
  @scala.inline
  def apply(bundleId: String): BundleId = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleId]
  }
}

