package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfile extends js.Object {
  /**
    * Email address of the user.
    *
    * Read-only.
    */
  var emailAddress: js.UndefOr[String] = js.undefined
  /**
    * Identifier of the user.
    *
    * Read-only.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Name of the user.
    *
    * Read-only.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * Global permissions of the user.
    *
    * Read-only.
    */
  var permissions: js.UndefOr[js.Array[GlobalPermission]] = js.undefined
  /**
    * URL of user's profile photo.
    *
    * Read-only.
    */
  var photoUrl: js.UndefOr[String] = js.undefined
  /**
    * Represents whether a G Suite for Education user's domain administrator has
    * explicitly verified them as being a teacher. If the user is not a member of
    * a G Suite for Education domain, than this field is always false.
    *
    * Read-only
    */
  var verifiedTeacher: js.UndefOr[Boolean] = js.undefined
}

object UserProfile {
  @scala.inline
  def apply(
    emailAddress: String = null,
    id: String = null,
    name: Name = null,
    permissions: js.Array[GlobalPermission] = null,
    photoUrl: String = null,
    verifiedTeacher: js.UndefOr[Boolean] = js.undefined
  ): UserProfile = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(verifiedTeacher)) __obj.updateDynamic("verifiedTeacher")(verifiedTeacher.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfile]
  }
}

