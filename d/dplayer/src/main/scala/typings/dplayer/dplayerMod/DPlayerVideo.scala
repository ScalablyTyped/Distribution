package typings.dplayer.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerVideo extends js.Object {
  var customType: js.UndefOr[js.Any] = js.undefined
  var defaultQuality: js.UndefOr[Double] = js.undefined
  var pic: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[js.Array[DPlayerVideoQuality]] = js.undefined
  var thumbnails: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[VideoType | String] = js.undefined
  var url: String
}

object DPlayerVideo {
  @scala.inline
  def apply(
    url: String,
    customType: js.Any = null,
    defaultQuality: Int | Double = null,
    pic: String = null,
    quality: js.Array[DPlayerVideoQuality] = null,
    thumbnails: String = null,
    `type`: VideoType | String = null
  ): DPlayerVideo = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (defaultQuality != null) __obj.updateDynamic("defaultQuality")(defaultQuality.asInstanceOf[js.Any])
    if (pic != null) __obj.updateDynamic("pic")(pic.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerVideo]
  }
}

