package typings.flatpickr

import typings.flatpickr.flatpickrStrings.increment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelta extends js.Object {
  var delta: Double
  var `type`: increment
}

object AnonDelta {
  @scala.inline
  def apply(delta: Double, `type`: increment): AnonDelta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelta]
  }
}

