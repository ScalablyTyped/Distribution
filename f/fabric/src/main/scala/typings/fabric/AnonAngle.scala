package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAngle extends js.Object {
  var angle: Double
  var scaleX: Double
  var scaleY: Double
  var skewX: Double
  var skewY: Double
  var translateX: Double
  var translateY: Double
}

object AnonAngle {
  @scala.inline
  def apply(
    angle: Double,
    scaleX: Double,
    scaleY: Double,
    skewX: Double,
    skewY: Double,
    translateX: Double,
    translateY: Double
  ): AnonAngle = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAngle]
  }
}

