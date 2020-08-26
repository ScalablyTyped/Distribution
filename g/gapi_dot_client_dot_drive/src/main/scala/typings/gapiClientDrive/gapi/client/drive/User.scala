package typings.gapiClientDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /** A plain text displayable name for this user. */
  var displayName: js.UndefOr[String] = js.native
  /** The email address of the user. This may not be present in certain contexts if the user has not made their email address visible to the requester. */
  var emailAddress: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "drive#user". */
  var kind: js.UndefOr[String] = js.native
  /** Whether this user is the requesting user. */
  var me: js.UndefOr[Boolean] = js.native
  /** The user's ID as visible in Permission resources. */
  var permissionId: js.UndefOr[String] = js.native
  /** A link to the user's profile photo, if available. */
  var photoLink: js.UndefOr[String] = js.native
}

object User {
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMe(value: Boolean): Self = this.set("me", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMe: Self = this.set("me", js.undefined)
    @scala.inline
    def setPermissionId(value: String): Self = this.set("permissionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionId: Self = this.set("permissionId", js.undefined)
    @scala.inline
    def setPhotoLink(value: String): Self = this.set("photoLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoLink: Self = this.set("photoLink", js.undefined)
  }
  
}

