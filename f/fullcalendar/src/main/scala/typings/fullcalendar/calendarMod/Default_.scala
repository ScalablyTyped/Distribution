package typings.fullcalendar.calendarMod

import org.scalablytyped.runtime.StringDictionary
import typings.fullcalendar.anon.ExtraClasses
import typings.fullcalendar.inputTypesMod.EventObjectInput
import typings.fullcalendar.inputTypesMod.EventSourceInput
import typings.fullcalendar.inputTypesMod.MomentInput
import typings.fullcalendar.inputTypesMod.OptionsInput
import typings.fullcalendar.inputTypesMod.RangeInput
import typings.fullcalendar.jqueryHooksMod.global.JQuery
import typings.jquery.JQueryEventObject
import typings.moment.mod.Duration_
import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Calendar", "Default")
@js.native
class Default_ protected () extends js.Object {
  def this(el: JQuery, overrides: OptionsInput) = this()
  var businessHourGenerator: typings.fullcalendar.businessHourGeneratorMod.default = js.native
  var constraints: typings.fullcalendar.constraintsMod.default = js.native
  var contentEl: JQuery = js.native
  var currentDate: Moment = js.native
  var defaultAllDayEventDuration: Duration_ = js.native
  var defaultTimedEventDuration: Duration_ = js.native
  var el: JQuery = js.native
  var eventManager: typings.fullcalendar.eventManagerMod.default = js.native
  var footer: typings.fullcalendar.toolbarMod.default = js.native
  var freezeContentHeightDepth: Double = js.native
  @JSName("hasHandlers")
  var hasHandlers_Original: js.Function1[/* type */ js.Any, _] = js.native
  var header: typings.fullcalendar.toolbarMod.default = js.native
  var ignoreUpdateViewSize: Double = js.native
  @JSName("listenTo")
  var listenTo_Original: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
  var loadingLevel: Double = js.native
  var localeData: js.Object = js.native
  @JSName("off")
  var off_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  @JSName("on")
  var on_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  @JSName("one")
  var one_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var optionsManager: typings.fullcalendar.optionsManagerMod.default = js.native
  @JSName("stopListeningTo")
  var stopListeningTo_Original: js.Function2[/* other */ js.Any, /* eventName */ js.UndefOr[js.Any], _] = js.native
  var suggestedViewHeight: Double = js.native
  var theme: typings.fullcalendar.themeMod.default = js.native
  var toolbarsManager: typings.fullcalendar.iteratorMod.default = js.native
  @JSName("triggerWith")
  var triggerWith_Original: js.Function3[/* types */ js.Any, /* context */ js.Any, /* args */ js.Any, _] = js.native
  @JSName("trigger")
  var trigger_Original: js.Function2[/* types */ js.Any, /* repeated */ js.Any, _] = js.native
  var view: typings.fullcalendar.viewMod.default = js.native
  var viewSpecManager: typings.fullcalendar.viewSpecManagerMod.default = js.native
  var viewsByType: StringDictionary[typings.fullcalendar.viewMod.default] = js.native
  var windowResizeProxy: js.Any = js.native
  def _calcSize(): Unit = js.native
  def addEventSource(sourceInput: EventSourceInput): Unit = js.native
  def applyTimezone(date: Moment): Moment = js.native
  def bindViewHandlers(view: js.Any): Unit = js.native
  def buildSelectFootprint(zonedStartInput: MomentInput): typings.fullcalendar.componentFootprintMod.default = js.native
  def buildSelectFootprint(zonedStartInput: MomentInput, zonedEndInput: MomentInput): typings.fullcalendar.componentFootprintMod.default = js.native
  def calcSize(): Unit = js.native
  def changeView(viewName: String, dateOrRange: MomentInput): Unit = js.native
  def changeView(viewName: String, dateOrRange: RangeInput): Unit = js.native
  def clearView(): Unit = js.native
  def clientEvents(legacyQuery: js.Any): js.Any = js.native
  def computeFooterOptions(): ExtraClasses = js.native
  def computeHeaderOptions(): ExtraClasses = js.native
  def constructed(): Unit = js.native
  def destroy(): Unit = js.native
  def elementVisible(): Boolean = js.native
  def footprintToDateProfile(componentFootprint: js.Any): typings.fullcalendar.eventDateProfileMod.default = js.native
  def footprintToDateProfile(componentFootprint: js.Any, ignoreEnd: Boolean): typings.fullcalendar.eventDateProfileMod.default = js.native
  def forceFreezeContentHeight(): Unit = js.native
  def freezeContentHeight(): Unit = js.native
  def getDate(): Moment = js.native
  def getDefaultEventEnd(allDay: Boolean, zonedStart: Moment): Moment = js.native
  def getEventEnd(event: js.Any): Moment = js.native
  def getEventSourceById(id: js.Any): typings.fullcalendar.eventSourceMod.default = js.native
  def getEventSources(): typings.fullcalendar.eventSourceMod.default = js.native
  def getIsAmbigTimezone(): Boolean = js.native
  def getNow(): Moment = js.native
  def getSuggestedViewHeight(): Double = js.native
  def getView(): typings.fullcalendar.viewMod.default = js.native
  def gotoDate(zonedDateInput: js.Any): Unit = js.native
  def hasHandlers(`type`: js.Any): js.Any = js.native
  def hasPublicHandlers(name: String): Boolean = js.native
  def humanizeDuration(duration: Duration_): String = js.native
  def incrementDate(delta: js.Any): Unit = js.native
  def initCurrentDate(): Unit = js.native
  def initEventManager(): Unit = js.native
  def initMomentInternals(): Unit = js.native
  def initToolbars(): Unit = js.native
  def initialRender(): Unit = js.native
  def instantiateView(viewType: String): typings.fullcalendar.viewMod.default = js.native
  def isHeightAuto(): Boolean = js.native
  def isValidViewType(viewType: String): Boolean = js.native
  def listenTo(other: js.Any, arg: js.Any): js.Any = js.native
  def listenTo(other: js.Any, arg: js.Any, callback: js.Any): js.Any = js.native
  def localizeMoment(mom: js.Any): Unit = js.native
  def moment(args: js.Any*): Moment = js.native
  def msToMoment(ms: Double, forceAllDay: Boolean): Moment = js.native
  def msToUtcMoment(ms: Double, forceAllDay: Boolean): Moment = js.native
  def next(): Unit = js.native
  def nextYear(): Unit = js.native
  def off(types: js.Any, handler: js.Any): js.Any = js.native
  def on(types: js.Any, handler: js.Any): js.Any = js.native
  def one(types: js.Any, handler: js.Any): js.Any = js.native
  def opt(name: String): js.Any = js.native
  def option(name: String): js.Any = js.native
  def option(name: String, value: js.Any): js.Any = js.native
  def option(name: js.Object): js.Any = js.native
  def option(name: js.Object, value: js.Any): js.Any = js.native
  def parseUnzonedRange(rangeInput: RangeInput): typings.fullcalendar.unzonedRangeMod.default = js.native
  def popLoading(): Unit = js.native
  def prev(): Unit = js.native
  def prevYear(): Unit = js.native
  def publiclyTrigger(name: String, triggerInfo: js.Any): js.Any = js.native
  def pushLoading(): Unit = js.native
  def queryToolbarsHeight(): js.Any = js.native
  def refetchEventSources(sourceMultiQuery: js.Any): Unit = js.native
  def refetchEvents(): Unit = js.native
  def reinitView(): Unit = js.native
  def removeEventSource(sourceQuery: js.Any): Unit = js.native
  def removeEventSources(sourceMultiQuery: js.Any): Unit = js.native
  def removeEvents(legacyQuery: js.Any): Unit = js.native
  def render(): Unit = js.native
  def renderEvent(eventInput: EventObjectInput): Unit = js.native
  def renderEvent(eventInput: EventObjectInput, isSticky: Boolean): Unit = js.native
  def renderEvents(eventInputs: js.Array[EventObjectInput]): Unit = js.native
  def renderEvents(eventInputs: js.Array[EventObjectInput], isSticky: Boolean): Unit = js.native
  def renderFooter(): Unit = js.native
  def renderHeader(): Unit = js.native
  def renderView(): Unit = js.native
  def renderView(viewType: String): Unit = js.native
  def requestEvents(start: Moment, end: Moment): js.Any = js.native
  def rerenderEvents(): Unit = js.native
  def select(zonedStartInput: MomentInput): Unit = js.native
  def select(zonedStartInput: MomentInput, zonedEndInput: MomentInput): Unit = js.native
  def setToolbarsTitle(title: String): Unit = js.native
  def stopListeningTo(other: js.Any): js.Any = js.native
  def stopListeningTo(other: js.Any, eventName: js.Any): js.Any = js.native
  def thawContentHeight(): Unit = js.native
  def today(): Unit = js.native
  def trigger(types: js.Any, args: js.Any*): js.Any = js.native
  def triggerWith(types: js.Any, context: js.Any, args: js.Any): js.Any = js.native
  def unbindViewHandlers(view: js.Any): Unit = js.native
  def unselect(): Unit = js.native
  def updateEvent(eventProps: EventObjectInput): Unit = js.native
  def updateEvents(eventPropsArray: js.Array[EventObjectInput]): Unit = js.native
  def updateToolbarButtons(dateProfile: js.Any): Unit = js.native
  def updateViewSize(): Boolean = js.native
  def updateViewSize(isResize: Boolean): Boolean = js.native
  def windowResize(ev: JQueryEventObject): Unit = js.native
  def zoomTo(newDate: Moment): Unit = js.native
  def zoomTo(newDate: Moment, viewType: String): Unit = js.native
}

/* static members */
@JSImport("fullcalendar/Calendar", "Default")
@js.native
object Default_ extends js.Object {
  var defaults: js.Any = js.native
  var englishDefaults: js.Any = js.native
  var rtlDefaults: js.Any = js.native
}

