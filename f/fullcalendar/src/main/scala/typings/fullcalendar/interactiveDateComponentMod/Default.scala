package typings.fullcalendar.interactiveDateComponentMod

import typings.moment.momentMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/InteractiveDateComponent", "Default")
@js.native
abstract class Default ()
  extends typings.fullcalendar.dateComponentMod.default {
  def this(_view: js.Any) = this()
  def this(_view: js.Any, _options: js.Any) = this()
  var dateClicking: js.Any = js.native
  var dateClickingClass: js.Any = js.native
  var dateSelecting: js.Any = js.native
  var dateSelectingClass: js.Any = js.native
  var eventDragging: js.Any = js.native
  var eventDraggingClass: js.Any = js.native
  var eventPointing: js.Any = js.native
  var eventPointingClass: js.Any = js.native
  var eventResizing: js.Any = js.native
  var eventResizingClass: js.Any = js.native
  var externalDropping: js.Any = js.native
  var externalDroppingClass: js.Any = js.native
  var largeUnit: js.Any = js.native
  var segSelector: String = js.native
  def bindAllSegHandlersToEl(el: js.Any): Unit = js.native
  def bindDateHandlerToEl(el: js.Any, name: js.Any, handler: js.Any): Unit = js.native
  def bindSegHandlerToEl(el: js.Any, name: js.Any, handler: js.Any): Unit = js.native
  def canStartDrag(seg: js.Any, ev: js.Any): js.Any = js.native
  def canStartResize(seg: js.Any, ev: js.Any): Boolean = js.native
  def canStartSelection(seg: js.Any, ev: js.Any): js.Any = js.native
  def diffDates(a: js.Any, b: js.Any): Duration = js.native
  def endInteractions(): Unit = js.native
  def isEventDefDraggable(eventDef: js.Any): js.Any = js.native
  def isEventDefGenerallyEditable(eventDef: js.Any): js.Any = js.native
  def isEventDefResizable(eventDef: js.Any): js.Any = js.native
  def isEventDefResizableFromEnd(eventDef: js.Any): js.Any = js.native
  def isEventDefResizableFromStart(eventDef: js.Any): js.Any = js.native
  def isEventDefStartEditable(eventDef: js.Any): js.Any = js.native
  def isEventInstanceGroupAllowed(eventInstanceGroup: js.Any): js.Any = js.native
  def isExternalInstanceGroupAllowed(eventInstanceGroup: js.Any): Boolean = js.native
  def shouldIgnoreEventPointing(): js.Any = js.native
  def shouldIgnoreMouse(): js.Any = js.native
  def shouldIgnoreTouch(): js.Any = js.native
}

@JSImport("fullcalendar/InteractiveDateComponent", JSImport.Default)
@js.native
abstract class default () extends Default {
  def this(_view: js.Any) = this()
  def this(_view: js.Any, _options: js.Any) = this()
}

