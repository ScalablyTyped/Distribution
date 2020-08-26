package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfile extends js.Object {
  /**
    * Email address of the user.
    *
    * Read-only.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Identifier of the user.
    *
    * Read-only.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of the user.
    *
    * Read-only.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * Global permissions of the user.
    *
    * Read-only.
    */
  var permissions: js.UndefOr[js.Array[GlobalPermission]] = js.native
  /**
    * URL of user's profile photo.
    *
    * Read-only.
    */
  var photoUrl: js.UndefOr[String] = js.native
  /**
    * Represents whether a G Suite for Education user's domain administrator has
    * explicitly verified them as being a teacher. If the user is not a member of
    * a G Suite for Education domain, than this field is always false.
    *
    * Read-only
    */
  var verifiedTeacher: js.UndefOr[Boolean] = js.native
}

object UserProfile {
  @scala.inline
  def apply(): UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfile]
  }
  @scala.inline
  implicit class UserProfileOps[Self <: UserProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPermissionsVarargs(value: GlobalPermission*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[GlobalPermission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
    @scala.inline
    def setVerifiedTeacher(value: Boolean): Self = this.set("verifiedTeacher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifiedTeacher: Self = this.set("verifiedTeacher", js.undefined)
  }
  
}

