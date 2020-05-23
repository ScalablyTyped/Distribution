package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleX extends js.Object {
  var scaleX: Double
  var scaleY: Double
}

object ScaleX {
  @scala.inline
  def apply(scaleX: Double, scaleY: Double): ScaleX = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleX]
  }
}

