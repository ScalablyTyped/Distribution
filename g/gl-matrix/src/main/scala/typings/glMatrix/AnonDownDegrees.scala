package typings.glMatrix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDownDegrees extends js.Object {
  var downDegrees: Double
  var leftDegrees: Double
  var rightDegrees: Double
  var upDegrees: Double
}

object AnonDownDegrees {
  @scala.inline
  def apply(downDegrees: Double, leftDegrees: Double, rightDegrees: Double, upDegrees: Double): AnonDownDegrees = {
    val __obj = js.Dynamic.literal(downDegrees = downDegrees.asInstanceOf[js.Any], leftDegrees = leftDegrees.asInstanceOf[js.Any], rightDegrees = rightDegrees.asInstanceOf[js.Any], upDegrees = upDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDownDegrees]
  }
}

