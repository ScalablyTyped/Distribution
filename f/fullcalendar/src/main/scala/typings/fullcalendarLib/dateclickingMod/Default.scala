package typings
package fullcalendarLib.dateclickingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DateClicking", "Default")
@js.native
class Default protected ()
  extends fullcalendarLib.interactionMod.default {
  def this(component: js.Any) = this()
  var dragListener: js.Any = js.native
  def bindToEl(el: js.Any): scala.Unit = js.native
  def buildDragListener(): fullcalendarLib.hitdraglistenerMod.default = js.native
}

@JSImport("fullcalendar/DateClicking", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(component: js.Any) = this()
}

