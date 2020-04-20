package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOldPosition extends js.Object {
  var oldPosition: Double
  var oldWindowId: Double
}

object AnonOldPosition {
  @scala.inline
  def apply(oldPosition: Double, oldWindowId: Double): AnonOldPosition = {
    val __obj = js.Dynamic.literal(oldPosition = oldPosition.asInstanceOf[js.Any], oldWindowId = oldWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOldPosition]
  }
}

