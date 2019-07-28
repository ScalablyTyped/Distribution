package typings.fullcalendar.dateSelectingMod

import typings.fullcalendar.fullcalendarNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DateSelecting", "Default")
@js.native
class Default protected ()
  extends typings.fullcalendar.interactionMod.default {
  def this(component: js.Any) = this()
  var dragListener: js.Any = js.native
  def bindToEl(el: js.Any): Unit = js.native
  def buildDragListener(): typings.fullcalendar.hitDragListenerMod.default = js.native
  def computeSelection(footprint0: js.Any, footprint1: js.Any): `false` | typings.fullcalendar.componentFootprintMod.default = js.native
  def computeSelectionFootprint(footprint0: js.Any, footprint1: js.Any): typings.fullcalendar.componentFootprintMod.default = js.native
  def getDelay(): js.Any = js.native
  def isSelectionFootprintAllowed(componentFootprint: js.Any): js.Any = js.native
}

@JSImport("fullcalendar/DateSelecting", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(component: js.Any) = this()
}

