package typings.fullcalendar.dateSelectingMod

import typings.fullcalendar.fullcalendarBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DateSelecting", "Default")
@js.native
class Default_ protected ()
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

