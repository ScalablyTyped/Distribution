package typings
package gapiDotClientDotAppsactivityLib.gapiNs.clientNs.appsactivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /** A boolean which indicates whether the specified User was deleted. If true, name, photo and permission_id will be omitted. */
  var isDeleted: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the user is the authenticated user. */
  var isMe: js.UndefOr[scala.Boolean] = js.undefined
  /** The displayable name of the user. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The permission ID associated with this user. Equivalent to the Drive API's permission ID for this user, returned as part of the Drive Permissions
    * resource.
    */
  var permissionId: js.UndefOr[java.lang.String] = js.undefined
  /** The profile photo of the user. Not present if the user has no profile photo. */
  var photo: js.UndefOr[Photo] = js.undefined
}

object User {
  @scala.inline
  def apply(
    isDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    isMe: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    permissionId: java.lang.String = null,
    photo: Photo = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDeleted)) __obj.updateDynamic("isDeleted")(isDeleted)
    if (!js.isUndefined(isMe)) __obj.updateDynamic("isMe")(isMe)
    if (name != null) __obj.updateDynamic("name")(name)
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    __obj.asInstanceOf[User]
  }
}

