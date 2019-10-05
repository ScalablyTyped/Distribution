package typings.fullcalendar

import typings.fullcalendar.dateComponentMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DateComponent", JSImport.Namespace)
@js.native
object dateComponentMod extends js.Object {
  @js.native
  abstract class Default ()
    extends typings.fullcalendar.componentMod.default {
    def this(_view: js.Any) = this()
    def this(_view: js.Any, _options: js.Any) = this()
    var businessHourRenderer: js.Any = js.native
    var businessHourRendererClass: js.Any = js.native
    var childrenByUid: js.Any = js.native
    var dateProfile: js.Any = js.native
    var eventRenderer: js.Any = js.native
    var eventRendererClass: js.Any = js.native
    var fillRenderer: js.Any = js.native
    var fillRendererClass: js.Any = js.native
    var hasAllDayBusinessHours: Boolean = js.native
    var helperRenderer: js.Any = js.native
    var helperRendererClass: js.Any = js.native
    var hitsNeededDepth: Double = js.native
    var isDatesRendered: Boolean = js.native
    var isRTL: Boolean = js.native
    var nextDayThreshold: js.Any = js.native
    var uid: js.Any = js.native
    def _getCalendar(): js.Any = js.native
    def _getDateProfile(): js.Any = js.native
    def _getView(): js.Any = js.native
    def addChild(child: js.Any): Boolean = js.native
    def buildGotoAnchorHtml(gotoOptions: js.Any, attrs: js.Any, innerHtml: js.Any): String = js.native
    def callChildren(methodName: js.Any, args: js.Any): Unit = js.native
    def componentFootprintToSegs(componentFootprint: js.Any): js.Array[_] = js.native
    def computeDayRange(unzonedRange: js.Any): Anon_End = js.native
    def currentRangeAs(unit: js.Any): js.Any = js.native
    def eventFootprintToSegs(eventFootprint: js.Any): js.Any = js.native
    def eventFootprintsToSegs(eventFootprints: js.Any): js.Array[_] = js.native
    def eventRangeToEventFootprints(eventRange: js.Any): js.Array[typings.fullcalendar.eventFootprintMod.default] = js.native
    def eventRangesToEventFootprints(eventRanges: js.Any): js.Array[_] = js.native
    def executeDateRender(dateProfile: js.Any): Unit = js.native
    def executeDateUnrender(): Unit = js.native
    def executeEventRender(eventsPayload: js.Any): Unit = js.native
    def executeEventUnrender(): Unit = js.native
    def formatRange(range: js.Any, isAllDay: js.Any, formatStr: js.Any, separator: js.Any): js.Any = js.native
    def getAllDayHtml(): js.Any = js.native
    def getBusinessHourSegs(): js.Any = js.native
    def getDayClasses(date: js.Any): js.Array[_] = js.native
    def getDayClasses(date: js.Any, noThemeHighlight: js.Any): js.Array[_] = js.native
    def getEventSegs(): js.Any = js.native
    def getHitEl(hit: js.Any): js.Any = js.native
    def getHitFootprint(hit: js.Any): js.Any = js.native
    def getNowIndicatorUnit(): Unit = js.native
    def getOwnBusinessHourSegs(): js.Any = js.native
    def getOwnEventSegs(): js.Any = js.native
    def getSafeHitFootprint(hit: js.Any): js.Any = js.native
    def hasPublicHandlers(args: js.Any*): js.Any = js.native
    def hideEventsWithId(eventDefId: js.Any): Unit = js.native
    def hitsNeeded(): Unit = js.native
    def hitsNotNeeded(): Unit = js.native
    def isMultiDayRange(unzonedRange: js.Any): Boolean = js.native
    def iterChildren(func: js.Any): Unit = js.native
    def opt(name: js.Any): js.Any = js.native
    def prepareHits(): Unit = js.native
    def publiclyTrigger(args: js.Any*): js.Any = js.native
    def queryHit(leftOffset: js.Any, topOffset: js.Any): js.Any = js.native
    def releaseHits(): Unit = js.native
    def removeChild(child: js.Any): Boolean = js.native
    def renderBusinessHours(businessHourGenerator: js.Any): Unit = js.native
    def renderDates(dateProfile: js.Any): Unit = js.native
    def renderDrag(eventFootprints: js.Any, seg: js.Any, isTouch: js.Any): Boolean = js.native
    def renderEventResize(eventFootprints: js.Any, seg: js.Any, isTouch: js.Any): Unit = js.native
    def renderHighlight(componentFootprint: js.Any): Unit = js.native
    def renderNowIndicator(date: js.Any): Unit = js.native
    def renderSelectionFootprint(componentFootprint: js.Any): Unit = js.native
    def showEventsWithId(eventDefId: js.Any): Unit = js.native
    def triggerAfterEventSegsRendered(segs: js.Any): Unit = js.native
    def triggerAfterEventsRendered(): Unit = js.native
    def triggerBeforeEventSegsDestroyed(segs: js.Any): Unit = js.native
    def triggerBeforeEventsDestroyed(): Unit = js.native
    def unrenderBusinessHours(): Unit = js.native
    def unrenderDates(): Unit = js.native
    def unrenderDrag(): Unit = js.native
    def unrenderEventResize(): Unit = js.native
    def unrenderHighlight(): Unit = js.native
    def unrenderNowIndicator(): Unit = js.native
    def unrenderSelection(): Unit = js.native
    def updateSize(totalHeight: js.Any, isAuto: js.Any, isResize: js.Any): Unit = js.native
  }
  
  @js.native
  abstract class default () extends Default {
    def this(_view: js.Any) = this()
    def this(_view: js.Any, _options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object Default extends js.Object {
    var guid: Double = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var guid: Double = js.native
  }
  
}

