package typings.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormat extends js.Object {
  var framesPerSecond: Double
  var imageResolution: ImageResolution
  var `type`: String
}

object VideoFormat {
  @scala.inline
  def apply(framesPerSecond: Double, imageResolution: ImageResolution, `type`: String): VideoFormat = {
    val __obj = js.Dynamic.literal(framesPerSecond = framesPerSecond.asInstanceOf[js.Any], imageResolution = imageResolution.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFormat]
  }
}

