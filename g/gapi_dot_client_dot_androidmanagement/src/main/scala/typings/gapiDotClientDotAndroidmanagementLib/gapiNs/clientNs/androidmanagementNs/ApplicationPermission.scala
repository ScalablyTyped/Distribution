package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationPermission extends js.Object {
  /** A longer description of the permission, giving more details of what it affects. Localized. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the permission. Localized. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** An opaque string uniquely identifying the permission. Not localized. */
  var permissionId: js.UndefOr[java.lang.String] = js.undefined
}

object ApplicationPermission {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    name: java.lang.String = null,
    permissionId: java.lang.String = null
  ): ApplicationPermission = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId)
    __obj.asInstanceOf[ApplicationPermission]
  }
}

