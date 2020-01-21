package typings.fullcalendar.jqueryHooksMod._Global_

import typings.fullcalendar.calendarMod.default
import typings.fullcalendar.fullcalendarStrings.addEventSource
import typings.fullcalendar.fullcalendarStrings.changeView
import typings.fullcalendar.fullcalendarStrings.clientEvents
import typings.fullcalendar.fullcalendarStrings.destroy
import typings.fullcalendar.fullcalendarStrings.getCalendar
import typings.fullcalendar.fullcalendarStrings.getDate
import typings.fullcalendar.fullcalendarStrings.getEventSourceById
import typings.fullcalendar.fullcalendarStrings.getEventSources
import typings.fullcalendar.fullcalendarStrings.getNow
import typings.fullcalendar.fullcalendarStrings.getView
import typings.fullcalendar.fullcalendarStrings.gotoDate
import typings.fullcalendar.fullcalendarStrings.incrementDate
import typings.fullcalendar.fullcalendarStrings.isValidViewType
import typings.fullcalendar.fullcalendarStrings.moment
import typings.fullcalendar.fullcalendarStrings.next
import typings.fullcalendar.fullcalendarStrings.nextYear
import typings.fullcalendar.fullcalendarStrings.option
import typings.fullcalendar.fullcalendarStrings.prev
import typings.fullcalendar.fullcalendarStrings.prevYear
import typings.fullcalendar.fullcalendarStrings.refetchEventSources
import typings.fullcalendar.fullcalendarStrings.refetchEvents
import typings.fullcalendar.fullcalendarStrings.removeEventSource
import typings.fullcalendar.fullcalendarStrings.removeEventSources
import typings.fullcalendar.fullcalendarStrings.removeEvents
import typings.fullcalendar.fullcalendarStrings.render
import typings.fullcalendar.fullcalendarStrings.renderEvent
import typings.fullcalendar.fullcalendarStrings.renderEvents
import typings.fullcalendar.fullcalendarStrings.rerenderEvents
import typings.fullcalendar.fullcalendarStrings.select
import typings.fullcalendar.fullcalendarStrings.today
import typings.fullcalendar.fullcalendarStrings.unselect
import typings.fullcalendar.fullcalendarStrings.updateEvent
import typings.fullcalendar.fullcalendarStrings.updateEvents
import typings.fullcalendar.fullcalendarStrings.zoomTo
import typings.fullcalendar.inputTypesMod.EventObjectInput
import typings.fullcalendar.inputTypesMod.EventSourceInput
import typings.fullcalendar.inputTypesMod.MomentInput
import typings.fullcalendar.inputTypesMod.OptionsInput
import typings.fullcalendar.inputTypesMod.RangeInput
import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def fullCalendar(): JQuery = js.native
  def fullCalendar(options: OptionsInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_addEventSource(method: addEventSource, sourceInput: EventSourceInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_changeView(method: changeView, viewName: String): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_changeView(method: changeView, viewName: String, dateOrRange: MomentInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_changeView(method: changeView, viewName: String, dateOrRange: RangeInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_clientEvents(method: clientEvents, legacyQuery: js.Any): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_destroy(method: destroy): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_getCalendar(method: getCalendar): default = js.native
  @JSName("fullCalendar")
  def fullCalendar_getDate(method: getDate): Moment = js.native
  @JSName("fullCalendar")
  def fullCalendar_getEventSourceById(method: getEventSourceById, id: js.Any): typings.fullcalendar.eventSourceMod.default = js.native
  @JSName("fullCalendar")
  def fullCalendar_getEventSources(method: getEventSources): typings.fullcalendar.eventSourceMod.default = js.native
  @JSName("fullCalendar")
  def fullCalendar_getNow(method: getNow): Moment = js.native
  @JSName("fullCalendar")
  def fullCalendar_getView(method: getView): typings.fullcalendar.viewMod.default = js.native
  @JSName("fullCalendar")
  def fullCalendar_gotoDate(method: gotoDate, zonedDateInput: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_incrementDate(method: incrementDate, delta: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_isValidViewType(method: isValidViewType, viewType: String): Boolean = js.native
  @JSName("fullCalendar")
  def fullCalendar_moment(method: moment, args: js.Any*): Moment = js.native
  @JSName("fullCalendar")
  def fullCalendar_next(method: next): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_nextYear(method: nextYear): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: option, name: String): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: option, name: String, value: js.Any): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: option, name: js.Object): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: option, name: js.Object, value: js.Any): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_prev(method: prev): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_prevYear(method: prevYear): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_refetchEventSources(method: refetchEventSources, sourceMultiQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_refetchEvents(method: refetchEvents): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEventSource(method: removeEventSource, sourceQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEventSources(method: removeEventSources, sourceMultiQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEvents(method: removeEvents): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEvents(method: removeEvents, legacyQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_render(method: render): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvent(method: renderEvent, eventInput: EventObjectInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvent(method: renderEvent, eventInput: EventObjectInput, isSticky: Boolean): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvents(method: renderEvents, eventInputs: js.Array[EventObjectInput]): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvents(method: renderEvents, eventInputs: js.Array[EventObjectInput], isSticky: Boolean): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_rerenderEvents(method: rerenderEvents): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_select(method: select, zonedStartInput: MomentInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_select(method: select, zonedStartInput: MomentInput, zonedEndInput: MomentInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_select(method: select, zonedStartInput: MomentInput, zonedEndInput: MomentInput, resourceId: String): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_today(method: today): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_unselect(method: unselect): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_updateEvent(method: updateEvent, eventProps: EventObjectInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_updateEvents(method: updateEvents, eventPropsArray: js.Array[EventObjectInput]): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_zoomTo(method: zoomTo, newDate: Moment): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_zoomTo(method: zoomTo, newDate: Moment, viewType: String): JQuery = js.native
}

