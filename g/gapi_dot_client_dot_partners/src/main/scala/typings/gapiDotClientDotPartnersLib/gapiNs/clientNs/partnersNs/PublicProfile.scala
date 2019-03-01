package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicProfile extends js.Object {
  /** The URL to the main display image of the public profile. Being deprecated. */
  var displayImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The display name of the public profile. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The ID which can be used to retrieve more details about the public profile. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The URL to the main profile image of the public profile. */
  var profileImage: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the public profile. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object PublicProfile {
  @scala.inline
  def apply(
    displayImageUrl: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    profileImage: java.lang.String = null,
    url: java.lang.String = null
  ): PublicProfile = {
    val __obj = js.Dynamic.literal()
    if (displayImageUrl != null) __obj.updateDynamic("displayImageUrl")(displayImageUrl)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (profileImage != null) __obj.updateDynamic("profileImage")(profileImage)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PublicProfile]
  }
}

