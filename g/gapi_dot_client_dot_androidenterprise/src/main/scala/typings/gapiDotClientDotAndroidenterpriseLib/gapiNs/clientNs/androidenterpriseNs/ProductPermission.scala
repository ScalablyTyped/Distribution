package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductPermission extends js.Object {
  /** An opaque string uniquely identifying the permission. */
  var permissionId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the permission has been accepted or not. */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object ProductPermission {
  @scala.inline
  def apply(permissionId: java.lang.String = null, state: java.lang.String = null): ProductPermission = {
    val __obj = js.Dynamic.literal()
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ProductPermission]
  }
}

