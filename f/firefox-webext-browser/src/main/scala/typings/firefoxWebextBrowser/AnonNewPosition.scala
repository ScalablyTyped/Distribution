package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewPosition extends js.Object {
  var newPosition: Double
  var newWindowId: Double
}

object AnonNewPosition {
  @scala.inline
  def apply(newPosition: Double, newWindowId: Double): AnonNewPosition = {
    val __obj = js.Dynamic.literal(newPosition = newPosition.asInstanceOf[js.Any], newWindowId = newWindowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNewPosition]
  }
}

