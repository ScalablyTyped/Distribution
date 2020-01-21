package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfile extends js.Object {
  var emailAddress: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[Name] = js.undefined
  var permissions: js.UndefOr[js.Array[GlobalPermission]] = js.undefined
  var photoUrl: js.UndefOr[String] = js.undefined
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
    if (!js.isUndefined(verifiedTeacher)) __obj.updateDynamic("verifiedTeacher")(verifiedTeacher.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfile]
  }
}

