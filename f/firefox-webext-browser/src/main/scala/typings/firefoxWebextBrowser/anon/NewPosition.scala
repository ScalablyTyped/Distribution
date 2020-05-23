package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewPosition extends js.Object {
  var newPosition: Double
  var newWindowId: Double
}

object NewPosition {
  @scala.inline
  def apply(newPosition: Double, newWindowId: Double): NewPosition = {
    val __obj = js.Dynamic.literal(newPosition = newPosition.asInstanceOf[js.Any], newWindowId = newWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewPosition]
  }
}

