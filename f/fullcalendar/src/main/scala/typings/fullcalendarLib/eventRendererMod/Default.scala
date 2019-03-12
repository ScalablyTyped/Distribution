package typings
package fullcalendarLib.eventRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventRenderer", "Default")
@js.native
class Default protected () extends js.Object {
  def this(component: js.Any, fillRenderer: js.Any) = this()
  var bgSegs: js.Any = js.native
  var component: js.Any = js.native
  var displayEventEnd: js.Any = js.native
  var displayEventTime: js.Any = js.native
  var eventTimeFormat: js.Any = js.native
  var fgSegs: js.Any = js.native
  var fillRenderer: js.Any = js.native
  var view: js.Any = js.native
  def _getTimeText(start: js.Any, end: js.Any, isAllDay: js.Any): js.Any = js.native
  def _getTimeText(start: js.Any, end: js.Any, isAllDay: js.Any, formatStr: js.Any): js.Any = js.native
  def _getTimeText(start: js.Any, end: js.Any, isAllDay: js.Any, formatStr: js.Any, displayEnd: js.Any): js.Any = js.native
  def beforeFgSegHtml(seg: js.Any): scala.Unit = js.native
  def compareEventSegs(seg1: js.Any, seg2: js.Any): js.Any = js.native
  def computeDisplayEventEnd(): scala.Boolean = js.native
  def computeDisplayEventTime(): scala.Boolean = js.native
  def computeEventTimeFormat(): js.Any = js.native
  def fgSegHtml(seg: js.Any, disableResizing: js.Any): scala.Unit = js.native
  def filterEventRenderEl(eventFootprint: js.Any, el: js.Any): js.Any = js.native
  def getBgClasses(eventDef: js.Any): js.Array[_] = js.native
  def getBgColor(eventDef: js.Any): js.Any = js.native
  def getBorderColor(eventDef: js.Any): js.Any = js.native
  def getClasses(eventDef: js.Any): js.Array[_] = js.native
  def getFallbackStylingObjs(eventDef: js.Any): js.Array[_] = js.native
  def getSegClasses(seg: js.Any, isDraggable: js.Any, isResizable: js.Any): js.Array[java.lang.String] = js.native
  def getSegs(): js.Any = js.native
  def getSkinCss(eventDef: js.Any): fullcalendarLib.Anon_Backgroundcolor = js.native
  def getStylingObjs(eventDef: js.Any): js.Array[_] = js.native
  def getTextColor(eventDef: js.Any): js.Any = js.native
  def getTimeText(eventFootprint: js.Any): js.Any = js.native
  def getTimeText(eventFootprint: js.Any, formatStr: js.Any): js.Any = js.native
  def getTimeText(eventFootprint: js.Any, formatStr: js.Any, displayEnd: js.Any): js.Any = js.native
  def opt(name: js.Any): js.Any = js.native
  def rangeUpdated(): scala.Unit = js.native
  def render(eventsPayload: js.Any): scala.Unit = js.native
  def renderBgRanges(eventRanges: js.Any): scala.Unit = js.native
  def renderBgSegs(segs: js.Any): scala.Boolean = js.native
  def renderFgRanges(eventRanges: js.Any): scala.Unit = js.native
  def renderFgSegEls(segs: js.Any): js.Array[_] = js.native
  def renderFgSegEls(segs: js.Any, disableResizing: scala.Boolean): js.Array[_] = js.native
  def renderFgSegs(segs: js.Any): scala.Boolean | scala.Unit = js.native
  def sortEventSegs(segs: js.Any): scala.Unit = js.native
  def unrender(): scala.Unit = js.native
  def unrenderBgRanges(): scala.Unit = js.native
  def unrenderBgSegs(): scala.Unit = js.native
  def unrenderFgRanges(): scala.Unit = js.native
  def unrenderFgSegs(segs: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/EventRenderer", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(component: js.Any, fillRenderer: js.Any) = this()
}

