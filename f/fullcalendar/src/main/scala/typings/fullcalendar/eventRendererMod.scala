package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventRenderer", JSImport.Namespace)
@js.native
object eventRendererMod extends js.Object {
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
    def beforeFgSegHtml(seg: js.Any): Unit = js.native
    def compareEventSegs(seg1: js.Any, seg2: js.Any): js.Any = js.native
    def computeDisplayEventEnd(): Boolean = js.native
    def computeDisplayEventTime(): Boolean = js.native
    def computeEventTimeFormat(): js.Any = js.native
    def fgSegHtml(seg: js.Any, disableResizing: js.Any): Unit = js.native
    def filterEventRenderEl(eventFootprint: js.Any, el: js.Any): js.Any = js.native
    def getBgClasses(eventDef: js.Any): js.Array[_] = js.native
    def getBgColor(eventDef: js.Any): js.Any = js.native
    def getBorderColor(eventDef: js.Any): js.Any = js.native
    def getClasses(eventDef: js.Any): js.Array[_] = js.native
    def getFallbackStylingObjs(eventDef: js.Any): js.Array[_] = js.native
    def getSegClasses(seg: js.Any, isDraggable: js.Any, isResizable: js.Any): js.Array[String] = js.native
    def getSegs(): js.Any = js.native
    def getSkinCss(eventDef: js.Any): Anon_Backgroundcolor = js.native
    def getStylingObjs(eventDef: js.Any): js.Array[_] = js.native
    def getTextColor(eventDef: js.Any): js.Any = js.native
    def getTimeText(eventFootprint: js.Any): js.Any = js.native
    def getTimeText(eventFootprint: js.Any, formatStr: js.Any): js.Any = js.native
    def getTimeText(eventFootprint: js.Any, formatStr: js.Any, displayEnd: js.Any): js.Any = js.native
    def opt(name: js.Any): js.Any = js.native
    def rangeUpdated(): Unit = js.native
    def render(eventsPayload: js.Any): Unit = js.native
    def renderBgRanges(eventRanges: js.Any): Unit = js.native
    def renderBgSegs(segs: js.Any): Boolean = js.native
    def renderFgRanges(eventRanges: js.Any): Unit = js.native
    def renderFgSegEls(segs: js.Any): js.Array[_] = js.native
    def renderFgSegEls(segs: js.Any, disableResizing: Boolean): js.Array[_] = js.native
    def renderFgSegs(segs: js.Any): Boolean | Unit = js.native
    def sortEventSegs(segs: js.Any): Unit = js.native
    def unrender(): Unit = js.native
    def unrenderBgRanges(): Unit = js.native
    def unrenderBgSegs(): Unit = js.native
    def unrenderFgRanges(): Unit = js.native
    def unrenderFgSegs(segs: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(component: js.Any, fillRenderer: js.Any) = this()
  }
  
}

