package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldPosition extends js.Object {
  var oldPosition: Double
  var oldWindowId: Double
}

object OldPosition {
  @scala.inline
  def apply(oldPosition: Double, oldWindowId: Double): OldPosition = {
    val __obj = js.Dynamic.literal(oldPosition = oldPosition.asInstanceOf[js.Any], oldWindowId = oldWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldPosition]
  }
}

