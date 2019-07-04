package typings
package firebaseDashAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BundleId extends js.Object {
  /**
    * Defines the required iOS bundle ID of the app where the link should be
    * handled if the application is already installed on the device.
    */
  var bundleId: java.lang.String
}

object Anon_BundleId {
  @scala.inline
  def apply(bundleId: java.lang.String): Anon_BundleId = {
    val __obj = js.Dynamic.literal(bundleId = bundleId)
  
    __obj.asInstanceOf[Anon_BundleId]
  }
}

