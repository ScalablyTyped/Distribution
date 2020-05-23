package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shadow extends js.Object {
  // properties
  var blur: Double
  var color: String
  var offsetX: Double
  var offsetY: Double
}

object Shadow {
  @scala.inline
  def apply(blur: Double, color: String, offsetX: Double, offsetY: Double): Shadow = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shadow]
  }
}

