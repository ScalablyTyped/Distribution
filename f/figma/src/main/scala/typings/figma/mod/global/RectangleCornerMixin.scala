package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectangleCornerMixin extends js.Object {
  var bottomLeftRadius: Double
  var bottomRightRadius: Double
  var topLeftRadius: Double
  var topRightRadius: Double
}

object RectangleCornerMixin {
  @scala.inline
  def apply(bottomLeftRadius: Double, bottomRightRadius: Double, topLeftRadius: Double, topRightRadius: Double): RectangleCornerMixin = {
    val __obj = js.Dynamic.literal(bottomLeftRadius = bottomLeftRadius.asInstanceOf[js.Any], bottomRightRadius = bottomRightRadius.asInstanceOf[js.Any], topLeftRadius = topLeftRadius.asInstanceOf[js.Any], topRightRadius = topRightRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectangleCornerMixin]
  }
}

