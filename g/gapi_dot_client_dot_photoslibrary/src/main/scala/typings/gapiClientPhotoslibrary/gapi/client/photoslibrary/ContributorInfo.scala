package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContributorInfo extends js.Object {
  /** Display name of the contributor. */
  var displayName: js.UndefOr[String] = js.native
  /** URL to the profile picture of the contributor. */
  var profilePictureBaseUrl: js.UndefOr[String] = js.native
}

object ContributorInfo {
  @scala.inline
  def apply(): ContributorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContributorInfo]
  }
  @scala.inline
  implicit class ContributorInfoOps[Self <: ContributorInfo] (val x: Self) extends AnyVal {
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
    def setProfilePictureBaseUrl(value: String): Self = this.set("profilePictureBaseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfilePictureBaseUrl: Self = this.set("profilePictureBaseUrl", js.undefined)
  }
  
}

