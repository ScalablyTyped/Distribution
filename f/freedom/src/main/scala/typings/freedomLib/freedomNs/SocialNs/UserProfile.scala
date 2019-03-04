package typings
package freedomLib.freedomNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The profile of a user on a social network.
trait UserProfile extends js.Object {
  // Image URI (e.g. data:image/png;base64,adkwe329...)
  var imageData: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var status: js.UndefOr[scala.Double] = js.undefined
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var userId: java.lang.String
}

object UserProfile {
  @scala.inline
  def apply(
    name: java.lang.String,
    userId: java.lang.String,
    imageData: java.lang.String = null,
    status: scala.Int | scala.Double = null,
    timestamp: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): UserProfile = {
    val __obj = js.Dynamic.literal(name = name, userId = userId)
    if (imageData != null) __obj.updateDynamic("imageData")(imageData)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[UserProfile]
  }
}

