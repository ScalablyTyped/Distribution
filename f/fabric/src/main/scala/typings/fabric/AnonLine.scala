package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLine extends js.Object {
  var line: Double
  var offset: Double
}

object AnonLine {
  @scala.inline
  def apply(line: Double, offset: Double): AnonLine = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLine]
  }
}

