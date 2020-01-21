package typings.dv.mod

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
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Skew]
  }
}

