package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerVideo extends js.Object {
  var customType: js.UndefOr[js.Any] = js.undefined
  var defaultQuality: js.UndefOr[scala.Double] = js.undefined
  var pic: js.UndefOr[java.lang.String] = js.undefined
  var quality: js.UndefOr[js.Array[DPlayerVideoQuality]] = js.undefined
  var thumbnails: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[VideoType | java.lang.String] = js.undefined
  var url: java.lang.String
}

object DPlayerVideo {
  @scala.inline
  def apply(
    url: java.lang.String,
    customType: js.Any = null,
    defaultQuality: scala.Int | scala.Double = null,
    pic: java.lang.String = null,
    quality: js.Array[DPlayerVideoQuality] = null,
    thumbnails: java.lang.String = null,
    `type`: VideoType | java.lang.String = null
  ): DPlayerVideo = {
    val __obj = js.Dynamic.literal(url = url)
    if (customType != null) __obj.updateDynamic("customType")(customType)
    if (defaultQuality != null) __obj.updateDynamic("defaultQuality")(defaultQuality.asInstanceOf[js.Any])
    if (pic != null) __obj.updateDynamic("pic")(pic)
    if (quality != null) __obj.updateDynamic("quality")(quality)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerVideo]
  }
}

