package typings.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageResolution extends js.Object {
  var height: Double
  var width: Double
}

object ImageResolution {
  @scala.inline
  def apply(height: Double, width: Double): ImageResolution = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResolution]
  }
}

