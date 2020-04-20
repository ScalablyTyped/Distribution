package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScaleX extends js.Object {
  var scaleX: Double
  var scaleY: Double
}

object AnonScaleX {
  @scala.inline
  def apply(scaleX: Double, scaleY: Double): AnonScaleX = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScaleX]
  }
}

