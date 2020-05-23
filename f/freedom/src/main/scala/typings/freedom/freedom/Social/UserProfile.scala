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
    status: js.UndefOr[Double] = js.undefined,
    timestamp: js.UndefOr[Double] = js.undefined,
    url: String = null
  ): UserProfile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (imageData != null) __obj.updateDynamic("imageData")(imageData.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfile]
  }
}

