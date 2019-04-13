package typings
package fullcalendarLib.srcTypesJqueryDashHooksMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def fullCalendar(): JQuery = js.native
  def fullCalendar(options: fullcalendarLib.srcTypesInputDashTypesMod.OptionsInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_addEventSource(
    method: fullcalendarLib.fullcalendarLibStrings.addEventSource,
    sourceInput: fullcalendarLib.srcTypesInputDashTypesMod.EventSourceInput
  ): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_changeView(method: fullcalendarLib.fullcalendarLibStrings.changeView, viewName: java.lang.String): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_changeView(
    method: fullcalendarLib.fullcalendarLibStrings.changeView,
    viewName: java.lang.String,
    dateOrRange: fullcalendarLib.srcTypesInputDashTypesMod.MomentInput
  ): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_changeView(
    method: fullcalendarLib.fullcalendarLibStrings.changeView,
    viewName: java.lang.String,
    dateOrRange: fullcalendarLib.srcTypesInputDashTypesMod.RangeInput
  ): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_clientEvents(method: fullcalendarLib.fullcalendarLibStrings.clientEvents, legacyQuery: js.Any): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_destroy(method: fullcalendarLib.fullcalendarLibStrings.destroy): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_getCalendar(method: fullcalendarLib.fullcalendarLibStrings.getCalendar): fullcalendarLib.calendarMod.default = js.native
  @JSName("fullCalendar")
  def fullCalendar_getDate(method: fullcalendarLib.fullcalendarLibStrings.getDate): momentLib.momentMod.Moment = js.native
  @JSName("fullCalendar")
  def fullCalendar_getEventSourceById(method: fullcalendarLib.fullcalendarLibStrings.getEventSourceById, id: js.Any): fullcalendarLib.eventSourceMod.default = js.native
  @JSName("fullCalendar")
  def fullCalendar_getEventSources(method: fullcalendarLib.fullcalendarLibStrings.getEventSources): fullcalendarLib.eventSourceMod.default = js.native
  @JSName("fullCalendar")
  def fullCalendar_getNow(method: fullcalendarLib.fullcalendarLibStrings.getNow): momentLib.momentMod.Moment = js.native
  @JSName("fullCalendar")
  def fullCalendar_getView(method: fullcalendarLib.fullcalendarLibStrings.getView): fullcalendarLib.viewMod.default = js.native
  @JSName("fullCalendar")
  def fullCalendar_gotoDate(method: fullcalendarLib.fullcalendarLibStrings.gotoDate, zonedDateInput: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_incrementDate(method: fullcalendarLib.fullcalendarLibStrings.incrementDate, delta: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_isValidViewType(method: fullcalendarLib.fullcalendarLibStrings.isValidViewType, viewType: java.lang.String): scala.Boolean = js.native
  @JSName("fullCalendar")
  def fullCalendar_moment(method: fullcalendarLib.fullcalendarLibStrings.moment, args: js.Any*): momentLib.momentMod.Moment = js.native
  @JSName("fullCalendar")
  def fullCalendar_next(method: fullcalendarLib.fullcalendarLibStrings.next): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_nextYear(method: fullcalendarLib.fullcalendarLibStrings.nextYear): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: fullcalendarLib.fullcalendarLibStrings.option, name: java.lang.String): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: fullcalendarLib.fullcalendarLibStrings.option, name: java.lang.String, value: js.Any): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: fullcalendarLib.fullcalendarLibStrings.option, name: js.Object): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: fullcalendarLib.fullcalendarLibStrings.option, name: js.Object, value: js.Any): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_prev(method: fullcalendarLib.fullcalendarLibStrings.prev): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_prevYear(method: fullcalendarLib.fullcalendarLibStrings.prevYear): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_refetchEventSources(method: fullcalendarLib.fullcalendarLibStrings.refetchEventSources, sourceMultiQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_refetchEvents(method: fullcalendarLib.fullcalendarLibStrings.refetchEvents): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEventSource(method: fullcalendarLib.fullcalendarLibStrings.removeEventSource, sourceQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEventSources(method: fullcalendarLib.fullcalendarLibStrings.removeEventSources, sourceMultiQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEvents(method: fullcalendarLib.fullcalendarLibStrings.removeEvents): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEvents(method: fullcalendarLib.fullcalendarLibStrings.removeEvents, legacyQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_render(method: fullcalendarLib.fullcalendarLibStrings.render): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvent(
    method: fullcalendarLib.fullcalendarLibStrings.renderEvent,
    eventInput: fullcalendarLib.srcTypesInputDashTypesMod.EventObjectInput
  ): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvent(
    method: fullcalendarLib.fullcalendarLibStrings.renderEvent,
    eventInput: fullcalendarLib.srcTypesInputDashTypesMod.EventObjectInput,
    isSticky: scala.Boolean
  ): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvents(
    method: fullcalendarLib.fullcalendarLibStrings.renderEvents,
    eventInputs: js.Array[fullcalendarLib.srcTypesInputDashTypesMod.EventObjectInput]
  ): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvents(
    method: fullcalendarLib.fullcalendarLibStrings.renderEvents,
    eventInputs: js.Array[fullcalendarLib.srcTypesInputDashTypesMod.EventObjectInput],
    isSticky: scala.Boolean
  ): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_rerenderEvents(method: fullcalendarLib.fullcalendarLibStrings.rerenderEvents): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_select(
    method: fullcalendarLib.fullcalendarLibStrings.select,
    zonedStartInput: fullcalendarLib.srcTypesInputDashTypesMod.MomentInput
  ): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_select(
    method: fullcalendarLib.fullcalendarLibStrings.select,
    zonedStartInput: fullcalendarLib.srcTypesInputDashTypesMod.MomentInput,
    zonedEndInput: fullcalendarLib.srcTypesInputDashTypesMod.MomentInput
  ): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_select(
    method: fullcalendarLib.fullcalendarLibStrings.select,
    zonedStartInput: fullcalendarLib.srcTypesInputDashTypesMod.MomentInput,
    zonedEndInput: fullcalendarLib.srcTypesInputDashTypesMod.MomentInput,
    resourceId: java.lang.String
  ): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_today(method: fullcalendarLib.fullcalendarLibStrings.today): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_unselect(method: fullcalendarLib.fullcalendarLibStrings.unselect): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_updateEvent(
    method: fullcalendarLib.fullcalendarLibStrings.updateEvent,
    eventProps: fullcalendarLib.srcTypesInputDashTypesMod.EventObjectInput
  ): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_updateEvents(
    method: fullcalendarLib.fullcalendarLibStrings.updateEvents,
    eventPropsArray: js.Array[fullcalendarLib.srcTypesInputDashTypesMod.EventObjectInput]
  ): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_zoomTo(method: fullcalendarLib.fullcalendarLibStrings.zoomTo, newDate: momentLib.momentMod.Moment): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_zoomTo(
    method: fullcalendarLib.fullcalendarLibStrings.zoomTo,
    newDate: momentLib.momentMod.Moment,
    viewType: java.lang.String
  ): JQuery = js.native
}

