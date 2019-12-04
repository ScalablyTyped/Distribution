package typings.atFirebaseMessaging.distSrcInterfacesVapidDashDetailsMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VapidDetails extends js.Object {
  var swScope: String
  var vapidKey: Uint8Array
}

object VapidDetails {
  @scala.inline
  def apply(swScope: String, vapidKey: Uint8Array): VapidDetails = {
    val __obj = js.Dynamic.literal(swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VapidDetails]
  }
}

