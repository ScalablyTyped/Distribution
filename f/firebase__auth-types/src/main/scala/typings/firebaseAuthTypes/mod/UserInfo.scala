package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserInfo extends js.Object {
  var displayName: String | Null = js.native
  var email: String | Null = js.native
  var phoneNumber: String | Null = js.native
  var photoURL: String | Null = js.native
  var providerId: String = js.native
  var uid: String = js.native
}

object UserInfo {
  @scala.inline
  def apply(providerId: String, uid: String): UserInfo = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
  @scala.inline
  implicit class UserInfoOps[Self <: UserInfo] (val x: Self) extends AnyVal {
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
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneNumberNull: Self = this.set("phoneNumber", null)
    @scala.inline
    def setPhotoURL(value: String): Self = this.set("photoURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotoURLNull: Self = this.set("photoURL", null)
  }
  
}

