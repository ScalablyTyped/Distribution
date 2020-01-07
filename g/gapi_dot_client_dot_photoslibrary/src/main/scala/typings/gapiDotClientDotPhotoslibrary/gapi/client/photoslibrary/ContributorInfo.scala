package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributorInfo extends js.Object {
  /** Display name of the contributor. */
  var displayName: js.UndefOr[String] = js.undefined
  /** URL to the profile picture of the contributor. */
  var profilePictureBaseUrl: js.UndefOr[String] = js.undefined
}

object ContributorInfo {
  @scala.inline
  def apply(displayName: String = null, profilePictureBaseUrl: String = null): ContributorInfo = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (profilePictureBaseUrl != null) __obj.updateDynamic("profilePictureBaseUrl")(profilePictureBaseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributorInfo]
  }
}

