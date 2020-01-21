package typings.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a user.
  */
@js.native
trait SchemaUser extends js.Object {
  /**
    * A boolean which indicates whether the specified User was deleted. If
    * true, name, photo and permission_id will be omitted.
    */
  var isDeleted: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user is the authenticated user.
    */
  var isMe: js.UndefOr[Boolean] = js.native
  /**
    * The displayable name of the user.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The permission ID associated with this user. Equivalent to the Drive
    * API&#39;s permission ID for this user, returned as part of the Drive
    * Permissions resource.
    */
  var permissionId: js.UndefOr[String] = js.native
  /**
    * The profile photo of the user. Not present if the user has no profile
    * photo.
    */
  var photo: js.UndefOr[SchemaPhoto] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(
    isDeleted: js.UndefOr[Boolean] = js.undefined,
    isMe: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    permissionId: String = null,
    photo: SchemaPhoto = null
  ): SchemaUser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDeleted)) __obj.updateDynamic("isDeleted")(isDeleted.asInstanceOf[js.Any])
    if (!js.isUndefined(isMe)) __obj.updateDynamic("isMe")(isMe.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUser]
  }
}

