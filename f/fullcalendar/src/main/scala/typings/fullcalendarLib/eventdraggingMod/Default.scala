package typings
package fullcalendarLib.eventdraggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventDragging", "Default")
@js.native
class Default protected ()
  extends fullcalendarLib.interactionMod.default {
  def this(component: js.Any, eventPointing: js.Any) = this()
  var dragListener: js.Any = js.native
  var eventPointing: js.Any = js.native
  var isDragging: scala.Boolean = js.native
  def bindToEl(el: js.Any): scala.Unit = js.native
  def buildDragListener(seg: js.Any): js.Any = js.native
  def buildSelectListener(seg: js.Any): js.Any = js.native
  def computeEventDateMutation(startFootprint: js.Any, endFootprint: js.Any): js.Any = js.native
  def computeEventDropMutation(startFootprint: js.Any, endFootprint: js.Any, eventDef: js.Any): fullcalendarLib.eventdefmutationMod.default = js.native
  def getSelectionDelay(): js.Any = js.native
  def handleMousedown(seg: js.Any, ev: js.Any): scala.Unit = js.native
  def handleTouchStart(seg: js.Any, ev: js.Any): scala.Unit = js.native
  def segDragStart(seg: js.Any, ev: js.Any): scala.Unit = js.native
  def segDragStop(seg: js.Any, ev: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/EventDragging", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(component: js.Any, eventPointing: js.Any) = this()
}

