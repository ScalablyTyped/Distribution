package typings.expo.buildARMod

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
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[ImageResolution]
  }
}

