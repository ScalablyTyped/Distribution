package typings.googleDashImages.googleDashImagesMod

import typings.googleDashImages.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var height: Double
  var size: Double
  var thumbnail: Anon_Height
  var `type`: String
  var url: String
  var width: Double
}

object Image {
  @scala.inline
  def apply(height: Double, size: Double, thumbnail: Anon_Height, `type`: String, url: String, width: Double): Image = {
    val __obj = js.Dynamic.literal(height = height, size = size, thumbnail = thumbnail, url = url, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Image]
  }
}

