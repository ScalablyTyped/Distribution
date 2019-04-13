package typings
package fullcalendarLib.calendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Calendar", "Default")
@js.native
class Default protected () extends js.Object {
  def this(el: fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery, overrides: fullcalendarLib.srcTypesInputDashTypesMod.OptionsInput) = this()
  var businessHourGenerator: fullcalendarLib.businessHourGeneratorMod.default = js.native
  var constraints: fullcalendarLib.constraintsMod.default = js.native
  var contentEl: fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery = js.native
  var currentDate: momentLib.momentMod.Moment = js.native
  var defaultAllDayEventDuration: momentLib.momentMod.Duration = js.native
  var defaultTimedEventDuration: momentLib.momentMod.Duration = js.native
  var el: fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery = js.native
  var eventManager: fullcalendarLib.eventManagerMod.default = js.native
  var footer: fullcalendarLib.toolbarMod.default = js.native
  var freezeContentHeightDepth: scala.Double = js.native
  @JSName("hasHandlers")
  var hasHandlers_Original: js.Function1[/* type */ js.Any, _] = js.native
  var header: fullcalendarLib.toolbarMod.default = js.native
  var ignoreUpdateViewSize: scala.Double = js.native
  @JSName("listenTo")
  var listenTo_Original: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
  var loadingLevel: scala.Double = js.native
  var localeData: js.Object = js.native
  @JSName("off")
  var off_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  @JSName("on")
  var on_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  @JSName("one")
  var one_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var optionsManager: fullcalendarLib.optionsManagerMod.default = js.native
  @JSName("stopListeningTo")
  var stopListeningTo_Original: js.Function2[/* other */ js.Any, /* eventName */ js.UndefOr[js.Any], _] = js.native
  var suggestedViewHeight: scala.Double = js.native
  var theme: fullcalendarLib.themeMod.default = js.native
  var toolbarsManager: fullcalendarLib.iteratorMod.default = js.native
  @JSName("triggerWith")
  var triggerWith_Original: js.Function3[/* types */ js.Any, /* context */ js.Any, /* args */ js.Any, _] = js.native
  @JSName("trigger")
  var trigger_Original: js.Function2[/* types */ js.Any, /* repeated */ js.Any, _] = js.native
  var view: fullcalendarLib.viewMod.default = js.native
  var viewSpecManager: fullcalendarLib.viewSpecManagerMod.default = js.native
  var viewsByType: org.scalablytyped.runtime.StringDictionary[fullcalendarLib.viewMod.default] = js.native
  var windowResizeProxy: js.Any = js.native
  def _calcSize(): scala.Unit = js.native
  def addEventSource(sourceInput: fullcalendarLib.srcTypesInputDashTypesMod.EventSourceInput): scala.Unit = js.native
  def applyTimezone(date: momentLib.momentMod.Moment): momentLib.momentMod.Moment = js.native
  def bindViewHandlers(view: js.Any): scala.Unit = js.native
  def buildSelectFootprint(zonedStartInput: fullcalendarLib.srcTypesInputDashTypesMod.MomentInput): fullcalendarLib.componentFootprintMod.default = js.native
  def buildSelectFootprint(
    zonedStartInput: fullcalendarLib.srcTypesInputDashTypesMod.MomentInput,
    zonedEndInput: fullcalendarLib.srcTypesInputDashTypesMod.MomentInput
  ): fullcalendarLib.componentFootprintMod.default = js.native
  def calcSize(): scala.Unit = js.native
  def changeView(viewName: java.lang.String, dateOrRange: fullcalendarLib.srcTypesInputDashTypesMod.MomentInput): scala.Unit = js.native
  def changeView(viewName: java.lang.String, dateOrRange: fullcalendarLib.srcTypesInputDashTypesMod.RangeInput): scala.Unit = js.native
  def clearView(): scala.Unit = js.native
  def clientEvents(legacyQuery: js.Any): js.Any = js.native
  def computeFooterOptions(): fullcalendarLib.Anon_ExtraClasses = js.native
  def computeHeaderOptions(): fullcalendarLib.Anon_ExtraClasses = js.native
  def constructed(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def elementVisible(): scala.Boolean = js.native
  def footprintToDateProfile(componentFootprint: js.Any): fullcalendarLib.eventDateProfileMod.default = js.native
  def footprintToDateProfile(componentFootprint: js.Any, ignoreEnd: scala.Boolean): fullcalendarLib.eventDateProfileMod.default = js.native
  def forceFreezeContentHeight(): scala.Unit = js.native
  def freezeContentHeight(): scala.Unit = js.native
  def getDate(): momentLib.momentMod.Moment = js.native
  def getDefaultEventEnd(allDay: scala.Boolean, zonedStart: momentLib.momentMod.Moment): momentLib.momentMod.Moment = js.native
  def getEventEnd(event: js.Any): momentLib.momentMod.Moment = js.native
  def getEventSourceById(id: js.Any): fullcalendarLib.eventSourceMod.default = js.native
  def getEventSources(): fullcalendarLib.eventSourceMod.default = js.native
  def getIsAmbigTimezone(): scala.Boolean = js.native
  def getNow(): momentLib.momentMod.Moment = js.native
  def getSuggestedViewHeight(): scala.Double = js.native
  def getView(): fullcalendarLib.viewMod.default = js.native
  def gotoDate(zonedDateInput: js.Any): scala.Unit = js.native
  def hasHandlers(`type`: js.Any): js.Any = js.native
  def hasPublicHandlers(name: java.lang.String): scala.Boolean = js.native
  def humanizeDuration(duration: momentLib.momentMod.Duration): java.lang.String = js.native
  def incrementDate(delta: js.Any): scala.Unit = js.native
  def initCurrentDate(): scala.Unit = js.native
  def initEventManager(): scala.Unit = js.native
  def initMomentInternals(): scala.Unit = js.native
  def initToolbars(): scala.Unit = js.native
  def initialRender(): scala.Unit = js.native
  def instantiateView(viewType: java.lang.String): fullcalendarLib.viewMod.default = js.native
  def isHeightAuto(): scala.Boolean = js.native
  def isValidViewType(viewType: java.lang.String): scala.Boolean = js.native
  def listenTo(other: js.Any, arg: js.Any): js.Any = js.native
  def listenTo(other: js.Any, arg: js.Any, callback: js.Any): js.Any = js.native
  def localizeMoment(mom: js.Any): scala.Unit = js.native
  def moment(args: js.Any*): momentLib.momentMod.Moment = js.native
  def msToMoment(ms: scala.Double, forceAllDay: scala.Boolean): momentLib.momentMod.Moment = js.native
  def msToUtcMoment(ms: scala.Double, forceAllDay: scala.Boolean): momentLib.momentMod.Moment = js.native
  def next(): scala.Unit = js.native
  def nextYear(): scala.Unit = js.native
  def off(types: js.Any, handler: js.Any): js.Any = js.native
  def on(types: js.Any, handler: js.Any): js.Any = js.native
  def one(types: js.Any, handler: js.Any): js.Any = js.native
  def opt(name: java.lang.String): js.Any = js.native
  def option(name: java.lang.String): js.Any = js.native
  def option(name: java.lang.String, value: js.Any): js.Any = js.native
  def option(name: js.Object): js.Any = js.native
  def option(name: js.Object, value: js.Any): js.Any = js.native
  def parseUnzonedRange(rangeInput: fullcalendarLib.srcTypesInputDashTypesMod.RangeInput): fullcalendarLib.unzonedRangeMod.default = js.native
  def popLoading(): scala.Unit = js.native
  def prev(): scala.Unit = js.native
  def prevYear(): scala.Unit = js.native
  def publiclyTrigger(name: java.lang.String, triggerInfo: js.Any): js.Any = js.native
  def pushLoading(): scala.Unit = js.native
  def queryToolbarsHeight(): js.Any = js.native
  def refetchEventSources(sourceMultiQuery: js.Any): scala.Unit = js.native
  def refetchEvents(): scala.Unit = js.native
  def reinitView(): scala.Unit = js.native
  def removeEventSource(sourceQuery: js.Any): scala.Unit = js.native
  def removeEventSources(sourceMultiQuery: js.Any): scala.Unit = js.native
  def removeEvents(legacyQuery: js.Any): scala.Unit = js.native
  def render(): scala.Unit = js.native
  def renderEvent(eventInput: fullcalendarLib.srcTypesInputDashTypesMod.EventObjectInput): scala.Unit = js.native
  def renderEvent(eventInput: fullcalendarLib.srcTypesInputDashTypesMod.EventObjectInput, isSticky: scala.Boolean): scala.Unit = js.native
  def renderEvents(eventInputs: js.Array[fullcalendarLib.srcTypesInputDashTypesMod.EventObjectInput]): scala.Unit = js.native
  def renderEvents(
    eventInputs: js.Array[fullcalendarLib.srcTypesInputDashTypesMod.EventObjectInput],
    isSticky: scala.Boolean
  ): scala.Unit = js.native
  def renderFooter(): scala.Unit = js.native
  def renderHeader(): scala.Unit = js.native
  def renderView(): scala.Unit = js.native
  def renderView(viewType: java.lang.String): scala.Unit = js.native
  def requestEvents(start: momentLib.momentMod.Moment, end: momentLib.momentMod.Moment): js.Any = js.native
  def rerenderEvents(): scala.Unit = js.native
  def select(zonedStartInput: fullcalendarLib.srcTypesInputDashTypesMod.MomentInput): scala.Unit = js.native
  def select(
    zonedStartInput: fullcalendarLib.srcTypesInputDashTypesMod.MomentInput,
    zonedEndInput: fullcalendarLib.srcTypesInputDashTypesMod.MomentInput
  ): scala.Unit = js.native
  def setToolbarsTitle(title: java.lang.String): scala.Unit = js.native
  def stopListeningTo(other: js.Any): js.Any = js.native
  def stopListeningTo(other: js.Any, eventName: js.Any): js.Any = js.native
  def thawContentHeight(): scala.Unit = js.native
  def today(): scala.Unit = js.native
  def trigger(types: js.Any, args: js.Any*): js.Any = js.native
  def triggerWith(types: js.Any, context: js.Any, args: js.Any): js.Any = js.native
  def unbindViewHandlers(view: js.Any): scala.Unit = js.native
  def unselect(): scala.Unit = js.native
  def updateEvent(eventProps: fullcalendarLib.srcTypesInputDashTypesMod.EventObjectInput): scala.Unit = js.native
  def updateEvents(eventPropsArray: js.Array[fullcalendarLib.srcTypesInputDashTypesMod.EventObjectInput]): scala.Unit = js.native
  def updateToolbarButtons(dateProfile: js.Any): scala.Unit = js.native
  def updateViewSize(): scala.Boolean = js.native
  def updateViewSize(isResize: scala.Boolean): scala.Boolean = js.native
  def windowResize(ev: jqueryLib.JQueryEventObject): scala.Unit = js.native
  def zoomTo(newDate: momentLib.momentMod.Moment): scala.Unit = js.native
  def zoomTo(newDate: momentLib.momentMod.Moment, viewType: java.lang.String): scala.Unit = js.native
}

@JSImport("fullcalendar/Calendar", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(el: fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery, overrides: fullcalendarLib.srcTypesInputDashTypesMod.OptionsInput) = this()
}

/* static members */
@JSImport("fullcalendar/Calendar", "Default")
@js.native
object Default extends js.Object {
  var defaults: js.Any = js.native
  var englishDefaults: js.Any = js.native
  var rtlDefaults: js.Any = js.native
}

/* static members */
@JSImport("fullcalendar/Calendar", JSImport.Default)
@js.native
object default extends js.Object {
  var defaults: js.Any = js.native
  var englishDefaults: js.Any = js.native
  var rtlDefaults: js.Any = js.native
}

