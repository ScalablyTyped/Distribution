package typings.fullcalendar

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/View", JSImport.Namespace)
@js.native
object viewMod extends js.Object {
  @js.native
  abstract class Default protected ()
    extends typings.fullcalendar.interactiveDateComponentMod.default {
    def this(calendar: js.Any, viewSpec: js.Any) = this()
    var batchRenderDepth: Double = js.native
    var calendar: typings.fullcalendar.calendarMod.default = js.native
    var dateProfileGenerator: js.Any = js.native
    var dateProfileGeneratorClass: js.Any = js.native
    var end: Moment = js.native
    var eventOrderSpecs: js.Any = js.native
    var initialNowDate: Moment = js.native
    var initialNowQueriedMs: Double = js.native
    var intervalEnd: Moment = js.native
    var intervalStart: Moment = js.native
    var isHiddenDayHash: js.Array[Boolean] = js.native
    var isNowIndicatorRendered: Boolean = js.native
    var isSelected: Boolean = js.native
    var name: String = js.native
    var nowIndicatorIntervalID: js.Any = js.native
    var nowIndicatorTimeoutID: js.Any = js.native
    var options: js.Any = js.native
    var queuedScroll: js.Object = js.native
    var renderQueue: typings.fullcalendar.renderQueueMod.default = js.native
    var selectedEventInstance: typings.fullcalendar.eventInstanceMod.default = js.native
    var start: Moment = js.native
    var title: String = js.native
    var `type`: String = js.native
    var usesMinMaxTime: Boolean = js.native
    var viewSpec: js.Any = js.native
    def addScroll(scroll: js.Any): Unit = js.native
    def applyDateScroll(scroll: js.Any): Unit = js.native
    def applyQueuedScroll(): Unit = js.native
    def applyScroll(scroll: js.Any): Unit = js.native
    def bindBaseRenderHandlers(): Unit = js.native
    def bindEventChanges(): Unit = js.native
    def computeInitialDateScroll(): js.Object = js.native
    def computeTitle(dateProfile: js.Any): js.Any = js.native
    def computeTitleFormat(dateProfile: js.Any): js.Any = js.native
    def fetchInitialEvents(dateProfile: js.Any): js.Any = js.native
    def getUnzonedRangeOption(name: js.Any): typings.fullcalendar.unzonedRangeMod.default = js.native
    def handleDocumentMousedown(ev: js.Any): Unit = js.native
    def initHiddenDays(): Unit = js.native
    def initRenderQueue(): Unit = js.native
    def isDateInOtherMonth(date: js.Any, dateProfile: js.Any): Boolean = js.native
    def isEventDefSelected(eventDef: js.Any): Boolean = js.native
    def isHiddenDay(day: js.Any): Boolean = js.native
    def onRenderQueueStart(): Unit = js.native
    def onRenderQueueStop(): Unit = js.native
    def popScroll(): Unit = js.native
    def processEventUnselect(ev: js.Any): Unit = js.native
    def processRangeUnselect(ev: js.Any): Unit = js.native
    def processUnselect(ev: js.Any): Unit = js.native
    def queryDateScroll(): js.Object = js.native
    def queryScroll(): js.Object = js.native
    def reportEventDrop(eventInstance: js.Any, eventMutation: js.Any, el: js.Any, ev: js.Any): Unit = js.native
    def reportEventResize(eventInstance: js.Any, eventMutation: js.Any, el: js.Any, ev: js.Any): Unit = js.native
    def reportExternalDrop(singleEventDef: js.Any, isEvent: js.Any, isSticky: js.Any, el: js.Any, ev: js.Any, ui: js.Any): Unit = js.native
    def reportSelection(footprint: js.Any): Unit = js.native
    def reportSelection(footprint: js.Any, ev: js.Any): Unit = js.native
    def requestBusinessHoursRender(businessHourGenerator: js.Any): Unit = js.native
    def requestBusinessHoursUnrender(): Unit = js.native
    def requestDateRender(dateProfile: js.Any): Unit = js.native
    def requestDateUnrender(): Unit = js.native
    def requestEventsRender(eventsPayload: js.Any): Unit = js.native
    def requestEventsUnrender(): Unit = js.native
    def requestRender(func: js.Any, namespace: js.Any, actionType: js.Any): Unit = js.native
    def resetEvents(eventsPayload: js.Any): Unit = js.native
    def select(footprint: js.Any): Unit = js.native
    def select(footprint: js.Any, ev: js.Any): Unit = js.native
    def selectEventInstance(eventInstance: js.Any): Unit = js.native
    def setDate(date: js.Any): Unit = js.native
    def setEvents(eventsPayload: js.Any): Unit = js.native
    def skipHiddenDays(date: js.Any): js.Any = js.native
    def skipHiddenDays(date: js.Any, inc: Double): js.Any = js.native
    def skipHiddenDays(date: js.Any, inc: Double, isExclusive: Boolean): js.Any = js.native
    def startBatchRender(): Unit = js.native
    def startNowIndicator(): Unit = js.native
    def stopBatchRender(): Unit = js.native
    def stopNowIndicator(): Unit = js.native
    def triggerBaseRendered(): Unit = js.native
    def triggerBaseUnrendered(): Unit = js.native
    def triggerDayClick(footprint: js.Any, dayEl: js.Any, ev: js.Any): Unit = js.native
    def triggerEventDrop(eventInstance: js.Any, dateDelta: js.Any, undoFunc: js.Any, el: js.Any, ev: js.Any): Unit = js.native
    def triggerEventResize(eventInstance: js.Any, resizeDelta: js.Any, undoFunc: js.Any, el: js.Any, ev: js.Any): Unit = js.native
    def triggerExternalDrop(singleEventDef: js.Any, isEvent: js.Any, el: js.Any, ev: js.Any, ui: js.Any): Unit = js.native
    def triggerSelect(footprint: js.Any): Unit = js.native
    def triggerSelect(footprint: js.Any, ev: js.Any): Unit = js.native
    def triggerViewDestroy(): Unit = js.native
    def triggerViewRender(): Unit = js.native
    def trimHiddenDays(inputUnzonedRange: js.Any): typings.fullcalendar.unzonedRangeMod.default = js.native
    def unbindEventChanges(): Unit = js.native
    def unselect(): Unit = js.native
    def unselect(ev: js.Any): Unit = js.native
    def unselectEventInstance(): Unit = js.native
    def unsetDate(): Unit = js.native
    def unsetEvents(): Unit = js.native
    def updateNowIndicator(): Unit = js.native
    def whenSizeUpdated(func: js.Any): Unit = js.native
  }
  
  @js.native
  abstract class default protected () extends Default {
    def this(calendar: js.Any, viewSpec: js.Any) = this()
  }
  
}

