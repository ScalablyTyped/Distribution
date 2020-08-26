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
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  @scala.inline
  implicit class SchemaUserOps[Self <: SchemaUser] (val x: Self) extends AnyVal {
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
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDeleted: Self = this.set("isDeleted", js.undefined)
    @scala.inline
    def setIsMe(value: Boolean): Self = this.set("isMe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMe: Self = this.set("isMe", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPermissionId(value: String): Self = this.set("permissionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionId: Self = this.set("permissionId", js.undefined)
    @scala.inline
    def setPhoto(value: SchemaPhoto): Self = this.set("photo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
  }
  
}

