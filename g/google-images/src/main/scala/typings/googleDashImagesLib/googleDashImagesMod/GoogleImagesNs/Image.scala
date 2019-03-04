package typings
package googleDashImagesLib.googleDashImagesMod.GoogleImagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var height: scala.Double
  var size: scala.Double
  var thumbnail: googleDashImagesLib.Anon_Height
  var `type`: java.lang.String
  var url: java.lang.String
  var width: scala.Double
}

object Image {
  @scala.inline
  def apply(
    height: scala.Double,
    size: scala.Double,
    thumbnail: googleDashImagesLib.Anon_Height,
    `type`: java.lang.String,
    url: java.lang.String,
    width: scala.Double
  ): Image = {
    val __obj = js.Dynamic.literal(height = height, size = size, thumbnail = thumbnail, url = url, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Image]
  }
}

