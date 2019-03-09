package typings
package dvLib.dvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Skew extends js.Object {
  var angle: scala.Double
  var confidence: scala.Double
}

object Skew {
  @scala.inline
  def apply(angle: scala.Double, confidence: scala.Double): Skew = {
    val __obj = js.Dynamic.literal(angle = angle, confidence = confidence)
  
    __obj.asInstanceOf[Skew]
  }
}

