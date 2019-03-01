package typings
package fullcalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backgroundcolor extends js.Object {
  var `background-color`: js.Any
  var `border-color`: js.Any
  var color: js.Any
}

object Anon_Backgroundcolor {
  @scala.inline
  def apply(`background-color`: js.Any, `border-color`: js.Any, color: js.Any): Anon_Backgroundcolor = {
    val __obj = js.Dynamic.literal(`background-color` = `background-color`, `border-color` = `border-color`)
    __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Anon_Backgroundcolor]
  }
}

