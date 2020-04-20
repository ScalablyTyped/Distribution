package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlipX extends js.Object {
  var angle: Double
  var flipX: Boolean
  var flipY: Boolean
  var left: Double
  var scaleX: Double
  var scaleY: Double
  var skewX: Double
  var skewY: Double
  var top: Double
}

object AnonFlipX {
  @scala.inline
  def apply(
    angle: Double,
    flipX: Boolean,
    flipY: Boolean,
    left: Double,
    scaleX: Double,
    scaleY: Double,
    skewX: Double,
    skewY: Double,
    top: Double
  ): AnonFlipX = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlipX]
  }
}

