package typings.gapiDotClientDotAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationPermission extends js.Object {
  /** A longer description of the permission, giving more details of what it affects. Localized. */
  var description: js.UndefOr[String] = js.undefined
  /** The name of the permission. Localized. */
  var name: js.UndefOr[String] = js.undefined
  /** An opaque string uniquely identifying the permission. Not localized. */
  var permissionId: js.UndefOr[String] = js.undefined
}

object ApplicationPermission {
  @scala.inline
  def apply(description: String = null, name: String = null, permissionId: String = null): ApplicationPermission = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationPermission]
  }
}

