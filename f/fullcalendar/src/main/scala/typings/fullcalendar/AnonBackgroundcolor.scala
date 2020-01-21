package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundcolor extends js.Object {
  var `background-color`: js.Any
  var `border-color`: js.Any
  var color: js.Any
}

object AnonBackgroundcolor {
  @scala.inline
  def apply(`background-color`: js.Any, `border-color`: js.Any, color: js.Any): AnonBackgroundcolor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundcolor]
  }
}

