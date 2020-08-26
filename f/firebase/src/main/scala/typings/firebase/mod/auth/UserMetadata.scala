package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a user's metadata.
  */
@js.native
trait UserMetadata extends js.Object {
  var creationTime: js.UndefOr[String] = js.native
  var lastSignInTime: js.UndefOr[String] = js.native
}

object UserMetadata {
  @scala.inline
  def apply(): UserMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserMetadata]
  }
  @scala.inline
  implicit class UserMetadataOps[Self <: UserMetadata] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setLastSignInTime(value: String): Self = this.set("lastSignInTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSignInTime: Self = this.set("lastSignInTime", js.undefined)
  }
  
}

