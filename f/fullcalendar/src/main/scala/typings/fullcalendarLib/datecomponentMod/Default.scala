package typings
package fullcalendarLib.datecomponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DateComponent", "Default")
@js.native
abstract class Default ()
  extends fullcalendarLib.componentMod.default {
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
  var hasAllDayBusinessHours: scala.Boolean = js.native
  var helperRenderer: js.Any = js.native
  var helperRendererClass: js.Any = js.native
  var hitsNeededDepth: scala.Double = js.native
  var isDatesRendered: scala.Boolean = js.native
  var isRTL: scala.Boolean = js.native
  var nextDayThreshold: js.Any = js.native
  var uid: js.Any = js.native
  def _getCalendar(): js.Any = js.native
  def _getDateProfile(): js.Any = js.native
  def _getView(): js.Any = js.native
  def addChild(child: js.Any): scala.Boolean = js.native
  def buildGotoAnchorHtml(gotoOptions: js.Any, attrs: js.Any, innerHtml: js.Any): java.lang.String = js.native
  def callChildren(methodName: js.Any, args: js.Any): scala.Unit = js.native
  def componentFootprintToSegs(componentFootprint: js.Any): js.Array[_] = js.native
  def computeDayRange(unzonedRange: js.Any): fullcalendarLib.Anon_Start = js.native
  def currentRangeAs(unit: js.Any): js.Any = js.native
  def eventFootprintToSegs(eventFootprint: js.Any): js.Any = js.native
  def eventFootprintsToSegs(eventFootprints: js.Any): js.Array[_] = js.native
  def eventRangeToEventFootprints(eventRange: js.Any): js.Array[fullcalendarLib.eventfootprintMod.default] = js.native
  def eventRangesToEventFootprints(eventRanges: js.Any): js.Array[_] = js.native
  def executeDateRender(dateProfile: js.Any): scala.Unit = js.native
  def executeDateUnrender(): scala.Unit = js.native
  def executeEventRender(eventsPayload: js.Any): scala.Unit = js.native
  def executeEventUnrender(): scala.Unit = js.native
  def formatRange(range: js.Any, isAllDay: js.Any, formatStr: js.Any, separator: js.Any): js.Any = js.native
  def getAllDayHtml(): js.Any = js.native
  def getBusinessHourSegs(): js.Any = js.native
  def getDayClasses(date: js.Any): js.Array[_] = js.native
  def getDayClasses(date: js.Any, noThemeHighlight: js.Any): js.Array[_] = js.native
  def getEventSegs(): js.Any = js.native
  def getHitEl(hit: js.Any): js.Any = js.native
  def getHitFootprint(hit: js.Any): js.Any = js.native
  def getNowIndicatorUnit(): scala.Unit = js.native
  def getOwnBusinessHourSegs(): js.Any = js.native
  def getOwnEventSegs(): js.Any = js.native
  def getSafeHitFootprint(hit: js.Any): js.Any = js.native
  def hasPublicHandlers(args: js.Any*): js.Any = js.native
  def hideEventsWithId(eventDefId: js.Any): scala.Unit = js.native
  def hitsNeeded(): scala.Unit = js.native
  def hitsNotNeeded(): scala.Unit = js.native
  def isMultiDayRange(unzonedRange: js.Any): scala.Boolean = js.native
  def iterChildren(func: js.Any): scala.Unit = js.native
  def opt(name: js.Any): js.Any = js.native
  def prepareHits(): scala.Unit = js.native
  def publiclyTrigger(args: js.Any*): js.Any = js.native
  def queryHit(leftOffset: js.Any, topOffset: js.Any): js.Any = js.native
  def releaseHits(): scala.Unit = js.native
  def removeChild(child: js.Any): scala.Boolean = js.native
  def renderBusinessHours(businessHourGenerator: js.Any): scala.Unit = js.native
  def renderDates(dateProfile: js.Any): scala.Unit = js.native
  def renderDrag(eventFootprints: js.Any, seg: js.Any, isTouch: js.Any): scala.Boolean = js.native
  def renderEventResize(eventFootprints: js.Any, seg: js.Any, isTouch: js.Any): scala.Unit = js.native
  def renderHighlight(componentFootprint: js.Any): scala.Unit = js.native
  def renderNowIndicator(date: js.Any): scala.Unit = js.native
  def renderSelectionFootprint(componentFootprint: js.Any): scala.Unit = js.native
  def showEventsWithId(eventDefId: js.Any): scala.Unit = js.native
  def triggerAfterEventSegsRendered(segs: js.Any): scala.Unit = js.native
  def triggerAfterEventsRendered(): scala.Unit = js.native
  def triggerBeforeEventSegsDestroyed(segs: js.Any): scala.Unit = js.native
  def triggerBeforeEventsDestroyed(): scala.Unit = js.native
  def unrenderBusinessHours(): scala.Unit = js.native
  def unrenderDates(): scala.Unit = js.native
  def unrenderDrag(): scala.Unit = js.native
  def unrenderEventResize(): scala.Unit = js.native
  def unrenderHighlight(): scala.Unit = js.native
  def unrenderNowIndicator(): scala.Unit = js.native
  def unrenderSelection(): scala.Unit = js.native
  def updateSize(totalHeight: js.Any, isAuto: js.Any, isResize: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/DateComponent", JSImport.Default)
@js.native
abstract class default () extends Default {
  def this(_view: js.Any) = this()
  def this(_view: js.Any, _options: js.Any) = this()
}

@JSImport("fullcalendar/DateComponent", "Default")
@js.native
object Default extends js.Object {
  var guid: scala.Double = js.native
}

@JSImport("fullcalendar/DateComponent", JSImport.Default)
@js.native
object default extends js.Object {
  var guid: scala.Double = js.native
}

