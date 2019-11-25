package typings.firebaseDashAdmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BundleId extends js.Object {
  /**
    * Defines the required iOS bundle ID of the app where the link should be
    * handled if the application is already installed on the device.
    */
  var bundleId: String
}

object Anon_BundleId {
  @scala.inline
  def apply(bundleId: String): Anon_BundleId = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BundleId]
  }
}

