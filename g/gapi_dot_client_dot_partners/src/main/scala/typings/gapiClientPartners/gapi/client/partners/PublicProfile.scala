package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicProfile extends js.Object {
  /** The URL to the main display image of the public profile. Being deprecated. */
  var displayImageUrl: js.UndefOr[String] = js.native
  /** The display name of the public profile. */
  var displayName: js.UndefOr[String] = js.native
  /** The ID which can be used to retrieve more details about the public profile. */
  var id: js.UndefOr[String] = js.native
  /** The URL to the main profile image of the public profile. */
  var profileImage: js.UndefOr[String] = js.native
  /** The URL of the public profile. */
  var url: js.UndefOr[String] = js.native
}

object PublicProfile {
  @scala.inline
  def apply(): PublicProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicProfile]
  }
  @scala.inline
  implicit class PublicProfileOps[Self <: PublicProfile] (val x: Self) extends AnyVal {
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
    def setDisplayImageUrl(value: String): Self = this.set("displayImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayImageUrl: Self = this.set("displayImageUrl", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setProfileImage(value: String): Self = this.set("profileImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileImage: Self = this.set("profileImage", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

