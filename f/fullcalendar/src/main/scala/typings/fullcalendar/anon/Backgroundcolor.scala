package typings.fullcalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backgroundcolor extends js.Object {
  var `background-color`: js.Any
  var `border-color`: js.Any
  var color: js.Any
}

object Backgroundcolor {
  @scala.inline
  def apply(`background-color`: js.Any, `border-color`: js.Any, color: js.Any): Backgroundcolor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backgroundcolor]
  }
}

