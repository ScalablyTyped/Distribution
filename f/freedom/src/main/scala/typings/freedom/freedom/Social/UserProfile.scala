package typings.freedom.freedom.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The profile of a user on a social network.
trait UserProfile extends js.Object {
  // Image URI (e.g. data:image/png;base64,adkwe329...)
  var imageData: js.UndefOr[String] = js.undefined
  var name: String
  var status: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var userId: String
}

object UserProfile {
  @scala.inline
  def apply(
    name: String,
    userId: String,
    imageData: String = null,
    status: Int | Double = null,
    timestamp: Int | Double = null,
    url: String = null
  ): UserProfile = {
    val __obj = js.Dynamic.literal(name = name, userId = userId)
    if (imageData != null) __obj.updateDynamic("imageData")(imageData)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[UserProfile]
  }
}

