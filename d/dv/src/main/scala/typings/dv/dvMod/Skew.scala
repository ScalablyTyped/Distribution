package typings.dv.dvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Skew extends js.Object {
  var angle: Double
  var confidence: Double
}

object Skew {
  @scala.inline
  def apply(angle: Double, confidence: Double): Skew = {
    val __obj = js.Dynamic.literal(angle = angle, confidence = confidence)
  
    __obj.asInstanceOf[Skew]
  }
}

