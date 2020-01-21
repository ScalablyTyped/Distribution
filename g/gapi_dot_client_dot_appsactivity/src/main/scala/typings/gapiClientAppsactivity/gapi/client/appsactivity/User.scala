package typings.gapiClientAppsactivity.gapi.client.appsactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /** A boolean which indicates whether the specified User was deleted. If true, name, photo and permission_id will be omitted. */
  var isDeleted: js.UndefOr[Boolean] = js.undefined
  /** Whether the user is the authenticated user. */
  var isMe: js.UndefOr[Boolean] = js.undefined
  /** The displayable name of the user. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The permission ID associated with this user. Equivalent to the Drive API's permission ID for this user, returned as part of the Drive Permissions
    * resource.
    */
  var permissionId: js.UndefOr[String] = js.undefined
  /** The profile photo of the user. Not present if the user has no profile photo. */
  var photo: js.UndefOr[Photo] = js.undefined
}

object User {
  @scala.inline
  def apply(
    isDeleted: js.UndefOr[Boolean] = js.undefined,
    isMe: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    permissionId: String = null,
    photo: Photo = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDeleted)) __obj.updateDynamic("isDeleted")(isDeleted.asInstanceOf[js.Any])
    if (!js.isUndefined(isMe)) __obj.updateDynamic("isMe")(isMe.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

