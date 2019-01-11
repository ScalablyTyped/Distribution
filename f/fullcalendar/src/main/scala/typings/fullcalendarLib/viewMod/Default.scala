package typings
package fullcalendarLib.viewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/View", "Default")
@js.native
abstract class Default protected ()
  extends fullcalendarLib.interactivedatecomponentMod.default {
  def this(calendar: js.Any, viewSpec: js.Any) = this()
  var batchRenderDepth: scala.Double = js.native
  var calendar: fullcalendarLib.calendarMod.default = js.native
  var dateProfileGenerator: js.Any = js.native
  var dateProfileGeneratorClass: js.Any = js.native
  var end: momentLib.momentMod.momentNs.Moment = js.native
  var eventOrderSpecs: js.Any = js.native
  var initialNowDate: momentLib.momentMod.momentNs.Moment = js.native
  var initialNowQueriedMs: scala.Double = js.native
  var intervalEnd: momentLib.momentMod.momentNs.Moment = js.native
  var intervalStart: momentLib.momentMod.momentNs.Moment = js.native
  var isHiddenDayHash: js.Array[scala.Boolean] = js.native
  var isNowIndicatorRendered: scala.Boolean = js.native
  var isSelected: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var nowIndicatorIntervalID: js.Any = js.native
  var nowIndicatorTimeoutID: js.Any = js.native
  var options: js.Any = js.native
  var queuedScroll: js.Object = js.native
  var renderQueue: fullcalendarLib.renderqueueMod.default = js.native
  var selectedEventInstance: fullcalendarLib.eventinstanceMod.default = js.native
  var start: momentLib.momentMod.momentNs.Moment = js.native
  var title: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  var usesMinMaxTime: scala.Boolean = js.native
  var viewSpec: js.Any = js.native
  def addScroll(scroll: js.Any): scala.Unit = js.native
  def applyDateScroll(scroll: js.Any): scala.Unit = js.native
  def applyQueuedScroll(): scala.Unit = js.native
  def applyScroll(scroll: js.Any): scala.Unit = js.native
  def bindBaseRenderHandlers(): scala.Unit = js.native
  def bindEventChanges(): scala.Unit = js.native
  def computeInitialDateScroll(): js.Object = js.native
  def computeTitle(dateProfile: js.Any): js.Any = js.native
  def computeTitleFormat(dateProfile: js.Any): js.Any = js.native
  def fetchInitialEvents(dateProfile: js.Any): js.Any = js.native
  def getUnzonedRangeOption(name: js.Any): fullcalendarLib.unzonedrangeMod.default = js.native
  def handleDocumentMousedown(ev: js.Any): scala.Unit = js.native
  def initHiddenDays(): scala.Unit = js.native
  def initRenderQueue(): scala.Unit = js.native
  def isDateInOtherMonth(date: js.Any, dateProfile: js.Any): scala.Boolean = js.native
  def isEventDefSelected(eventDef: js.Any): scala.Boolean = js.native
  def isHiddenDay(day: js.Any): scala.Boolean = js.native
  def onRenderQueueStart(): scala.Unit = js.native
  def onRenderQueueStop(): scala.Unit = js.native
  def popScroll(): scala.Unit = js.native
  def processEventUnselect(ev: js.Any): scala.Unit = js.native
  def processRangeUnselect(ev: js.Any): scala.Unit = js.native
  def processUnselect(ev: js.Any): scala.Unit = js.native
  def queryDateScroll(): js.Object = js.native
  def queryScroll(): js.Object = js.native
  def reportEventDrop(eventInstance: js.Any, eventMutation: js.Any, el: js.Any, ev: js.Any): scala.Unit = js.native
  def reportEventResize(eventInstance: js.Any, eventMutation: js.Any, el: js.Any, ev: js.Any): scala.Unit = js.native
  def reportExternalDrop(singleEventDef: js.Any, isEvent: js.Any, isSticky: js.Any, el: js.Any, ev: js.Any, ui: js.Any): scala.Unit = js.native
  def reportSelection(footprint: js.Any): scala.Unit = js.native
  def reportSelection(footprint: js.Any, ev: js.Any): scala.Unit = js.native
  def requestBusinessHoursRender(businessHourGenerator: js.Any): scala.Unit = js.native
  def requestBusinessHoursUnrender(): scala.Unit = js.native
  def requestDateRender(dateProfile: js.Any): scala.Unit = js.native
  def requestDateUnrender(): scala.Unit = js.native
  def requestEventsRender(eventsPayload: js.Any): scala.Unit = js.native
  def requestEventsUnrender(): scala.Unit = js.native
  def requestRender(func: js.Any, namespace: js.Any, actionType: js.Any): scala.Unit = js.native
  def resetEvents(eventsPayload: js.Any): scala.Unit = js.native
  def select(footprint: js.Any): scala.Unit = js.native
  def select(footprint: js.Any, ev: js.Any): scala.Unit = js.native
  def selectEventInstance(eventInstance: js.Any): scala.Unit = js.native
  def setDate(date: js.Any): scala.Unit = js.native
  def setEvents(eventsPayload: js.Any): scala.Unit = js.native
  def skipHiddenDays(date: js.Any): js.Any = js.native
  def skipHiddenDays(date: js.Any, inc: scala.Double): js.Any = js.native
  def skipHiddenDays(date: js.Any, inc: scala.Double, isExclusive: scala.Boolean): js.Any = js.native
  def startBatchRender(): scala.Unit = js.native
  def startNowIndicator(): scala.Unit = js.native
  def stopBatchRender(): scala.Unit = js.native
  def stopNowIndicator(): scala.Unit = js.native
  def triggerBaseRendered(): scala.Unit = js.native
  def triggerBaseUnrendered(): scala.Unit = js.native
  def triggerDayClick(footprint: js.Any, dayEl: js.Any, ev: js.Any): scala.Unit = js.native
  def triggerEventDrop(eventInstance: js.Any, dateDelta: js.Any, undoFunc: js.Any, el: js.Any, ev: js.Any): scala.Unit = js.native
  def triggerEventResize(eventInstance: js.Any, resizeDelta: js.Any, undoFunc: js.Any, el: js.Any, ev: js.Any): scala.Unit = js.native
  def triggerExternalDrop(singleEventDef: js.Any, isEvent: js.Any, el: js.Any, ev: js.Any, ui: js.Any): scala.Unit = js.native
  def triggerSelect(footprint: js.Any): scala.Unit = js.native
  def triggerSelect(footprint: js.Any, ev: js.Any): scala.Unit = js.native
  def triggerViewDestroy(): scala.Unit = js.native
  def triggerViewRender(): scala.Unit = js.native
  def trimHiddenDays(inputUnzonedRange: js.Any): fullcalendarLib.unzonedrangeMod.default = js.native
  def unbindEventChanges(): scala.Unit = js.native
  def unselect(): scala.Unit = js.native
  def unselect(ev: js.Any): scala.Unit = js.native
  def unselectEventInstance(): scala.Unit = js.native
  def unsetDate(): scala.Unit = js.native
  def unsetEvents(): scala.Unit = js.native
  def updateNowIndicator(): scala.Unit = js.native
  def whenSizeUpdated(func: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/View", JSImport.Default)
@js.native
abstract class default protected () extends Default {
  def this(calendar: js.Any, viewSpec: js.Any) = this()
}

