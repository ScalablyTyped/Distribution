package typings.framesync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelta extends js.Object {
  var delta: Double
  var timestamp: Double
}

object AnonDelta {
  @scala.inline
  def apply(delta: Double, timestamp: Double): AnonDelta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelta]
  }
}

