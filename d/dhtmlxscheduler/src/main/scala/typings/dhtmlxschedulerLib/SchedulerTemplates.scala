package typings
package dhtmlxschedulerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerTemplates extends js.Object {
  /**
  	 * specifies the date in the header of the view
  	 * @param start the start date of the view
  	 * @param end the end date of the view
  	*/
  def agenda_date(start: stdLib.Date, end: stdLib.Date): java.lang.String
  /**
  	 * specifies the text in the second column of the Agenda view
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def agenda_text(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the date in the first column of the Agenda view
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def agenda_time(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the format of dates that are set by means of API methods. Used to parse incoming dates
  	 * @param date the date which needs formatting
  	*/
  def api_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the format of the date in a cell
  	 * @param date the cell's date
  	*/
  def calendar_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the date in the header of the calendar
  	 * @param date the date which needs formatting
  	*/
  def calendar_month(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the day name in the week sub-header of the view
  	 * @param date the date which needs formatting
  	*/
  def calendar_scale_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the date format of the lightbox's start and end date inputs
  	 * @param date the date which needs formatting
  	*/
  def calendar_time(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the date in the header of the Day and Units views
  	 * @param date the date which needs formatting
  	*/
  def day_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the date in the sub-header of the Day view
  	 * @param date the date which needs formatting
  	*/
  def day_scale_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the CSS class that will be applied to the highlighted event's duration on the time scale
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param ev the event's object
  	*/
  def drag_marker_class(start: stdLib.Date, end: stdLib.Date, ev: js.Any): scala.Unit
  /**
  	 * specifies the content of the highlighted block  on the time scale
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param ev the event's object
  	*/
  def drag_marker_content(start: stdLib.Date, end: stdLib.Date, ev: js.Any): scala.Unit
  /**
  	 * specifies the date of an event. Applied to one-day events only
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def event_bar_date(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the event's text. Applied to multi-day events only
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event's object
  	*/
  def event_bar_text(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the CSS class that will be applied to the event's container
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param ev the event's object
  	*/
  def event_class(start: stdLib.Date, end: stdLib.Date, ev: js.Any): java.lang.String
  /**
  	 * specifies the time part of the start and end dates of the event. Mostly used by other templates for presenting time periods
  	 * @param date the date which needs formatting
  	*/
  def event_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the event's header
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event's object
  	*/
  def event_header(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the event's text
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def event_text(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the date in the header of the view
  	 * @param start the start date of the view
  	 * @param end the end date of the view
  	*/
  def grid_date(start: stdLib.Date, end: stdLib.Date): java.lang.String
  /**
  	 * specifies the text in the columns
  	 * @param field_name the column's id
  	 * @param event the event object
  	*/
  def grid_field(field_name: java.lang.String, event: js.Any): java.lang.String
  /**
  	 * specifies the format of dates in columns with id='date'
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param ev the event object
  	*/
  def grid_full_date(start: stdLib.Date, end: stdLib.Date, ev: js.Any): java.lang.String
  /**
  	 * specifies the format of dates in columns with id='start_date' or id='end_date'
  	 * @param date the date which needs formatting
  	*/
  def grid_single_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the items of the Y-Axis
  	 * @param date the date which needs formatting
  	*/
  def hour_scale(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the lightbox's header
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def lightbox_header(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the format of requests in the dynamic loading mode
  	 * @param date the date which needs formatting
  	*/
  def load_format(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the date in the header of the view
  	 * @param start the start date of the view
  	 * @param end the end date of the view
  	*/
  def map_date(start: stdLib.Date, end: stdLib.Date): java.lang.String
  /**
  	 * specifies the text in the second column of the view
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def map_text(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the date in the first column of the view
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def map_time(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the date of the event in the Google Maps popup marker
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def marker_date(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the text of the event in the Google Maps popup marker
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def marker_text(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the date in the header of the view
  	 * @param date the date which needs formatting
  	*/
  def month_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the CSS class that will be applied to a day cell
  	 * @param date the date which needs formatting
  	*/
  def month_date_class(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the format of the day in a cell
  	 * @param date the date which needs formatting
  	*/
  def month_day(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the presentation of the 'View more' link in the cell of the Month view
  	 * @param date the date of a month cell
  	 * @param count the number of events in the cell
  	*/
  def month_events_link(date: stdLib.Date, count: scala.Double): java.lang.String
  /**
  	 * specifies the date format of the X-Axis of the view
  	 * @param date the date which needs formatting
  	*/
  def month_scale_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the content of the pop-up edit form
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def quick_info_content(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the date of the pop-up edit form
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def quick_info_date(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the title of the pop-up edit form
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def quick_info_title(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the drop-down time selector in the lightbox
  	*/
  def time_picker(): java.lang.String
  /**
  	 * specifies the CSS class that will be applied to a cell of the view
  	 * @param evs an array of objects of events contained in a cell (defined only in the 'cell' mode)
  	 * @param date the date of a column
  	 * @param section the section object
  	*/
  def timeline_cell_class(evs: js.Array[_], date: stdLib.Date, section: js.Any): java.lang.String
  /**
  	 * specifies the number of scheduled events in a cell of the view
  	 * @param evs an array of objects of events contained in a cell
  	 * @param date the date of a cell
  	*/
  def timeline_cell_value(evs: js.Array[_], date: stdLib.Date): java.lang.String
  /**
  	 * specifies the date in the header of the view
  	 * @param date1 the date when an event is scheduled to begin
  	 * @param date2 the date when an event is scheduled to be completed
  	*/
  def timeline_date(date1: stdLib.Date, date2: stdLib.Date): java.lang.String
  /**
  	 * specifies items of the X-Axis
  	 * @param date the date which needs formatting
  	*/
  def timeline_scale_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies items of the Y-Axis
  	 * @param key the section's id (key)
  	 * @param label the section's label
  	 * @param section the section object containing the 'key' and 'label' properties
  	*/
  def timeline_scale_label(key: java.lang.String, label: java.lang.String, section: js.Any): java.lang.String
  /**
  	 * specifies the name of a CSS class that will be applied to items of the X-Axis
  	 * @param date the date which needs formatting
  	*/
  def timeline_scalex_class(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the name of a CSS class that will be applied to items of the Y-Axis
  	 * @param key the section's id
  	 * @param label the section's label
  	 * @param section the section object that contains the 'key' and 'label' properties
  	*/
  def timeline_scaley_class(key: java.lang.String, label: java.lang.String, section: js.Any): java.lang.String
  /**
  	 * specifies items of the second X-Axis
  	 * @param date the date which needs formatting
  	*/
  def timeline_second_scale_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the name of a CSS class that will be applied to items of the second X-Axis
  	 * @param date the date which needs formatting
  	*/
  def timeline_second_scalex_class(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the tooltip over a day cell containing some scheduled event(s)
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def timeline_tooltip(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the format of start and end dates displayed in the tooltip
  	 * @param date the date which needs formatting
  	*/
  def tooltip_date_format(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the text of tooltips
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def tooltip_text(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the date in the header of the view
  	 * @param date the date which needs formatting
  	*/
  def units_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies items of the X-Axis
  	 * @param key the unit's id (key)
  	 * @param label the unit's label
  	 * @param unit the unit object containing the 'key' and 'label' properties
  	*/
  def units_scale_text(key: java.lang.String, label: java.lang.String, unit: js.Any): java.lang.String
  /**
  	 * specifies the event's text
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	 * @param cellDate the date of a day cell that a one-day event or a single occurrence of <br> the recurring event displays in
  	 * @param pos the position of a single occurrence in the recurring event: 'start' - the first occurrence, 'end' - the last occurrence, 'middle' - for remaining occurrences
  	*/
  def week_agenda_event_text(start: stdLib.Date, end: stdLib.Date, event: js.Any, cellDate: stdLib.Date, pos: java.lang.String): java.lang.String
  /**
  	 * the date of a day cell of the view
  	 * @param date the date which needs formatting
  	*/
  def week_agenda_scale_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the date in the header of the view
  	 * @param start the start date of the view
  	 * @param end the end date of the view
  	*/
  def week_date(start: stdLib.Date, end: stdLib.Date): java.lang.String
  /**
  	 * specifies the CSS class that will be applied to a day cell
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def week_date_class(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
  /**
  	 * specifies the date in the sub-header of the view
  	 * @param date the date which needs formatting
  	*/
  def week_scale_date(date: stdLib.Date): java.lang.String
  /**
  	 * a string from an XML file is converted into a date object in conformity with this template
  	 * @param date the string which need to be parsed
  	*/
  def xml_date(date: stdLib.Date): stdLib.Date
  /**
  	 * a date object is converted into a string in conformity with this template. Used to send data back to the server
  	 * @param date the date which needs formatting
  	*/
  def xml_format(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the date in the header of the view
  	 * @param date the date which needs formatting
  	*/
  def year_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the month's name in the header of a month block of the view.
  	 * @param date the date which needs formatting
  	*/
  def year_month(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the day's name in the sub-header of a month block of the view
  	 * @param date the date which needs formatting
  	*/
  def year_scale_date(date: stdLib.Date): java.lang.String
  /**
  	 * specifies the tooltip over a day cell containing some scheduled event(s)
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def year_tooltip(start: stdLib.Date, end: stdLib.Date, event: js.Any): java.lang.String
}

object SchedulerTemplates {
  @scala.inline
  def apply(
    agenda_date: js.Function2[stdLib.Date, stdLib.Date, java.lang.String],
    agenda_text: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    agenda_time: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    api_date: js.Function1[stdLib.Date, java.lang.String],
    calendar_date: js.Function1[stdLib.Date, java.lang.String],
    calendar_month: js.Function1[stdLib.Date, java.lang.String],
    calendar_scale_date: js.Function1[stdLib.Date, java.lang.String],
    calendar_time: js.Function1[stdLib.Date, java.lang.String],
    day_date: js.Function1[stdLib.Date, java.lang.String],
    day_scale_date: js.Function1[stdLib.Date, java.lang.String],
    drag_marker_class: js.Function3[stdLib.Date, stdLib.Date, js.Any, scala.Unit],
    drag_marker_content: js.Function3[stdLib.Date, stdLib.Date, js.Any, scala.Unit],
    event_bar_date: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    event_bar_text: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    event_class: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    event_date: js.Function1[stdLib.Date, java.lang.String],
    event_header: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    event_text: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    grid_date: js.Function2[stdLib.Date, stdLib.Date, java.lang.String],
    grid_field: js.Function2[java.lang.String, js.Any, java.lang.String],
    grid_full_date: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    grid_single_date: js.Function1[stdLib.Date, java.lang.String],
    hour_scale: js.Function1[stdLib.Date, java.lang.String],
    lightbox_header: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    load_format: js.Function1[stdLib.Date, java.lang.String],
    map_date: js.Function2[stdLib.Date, stdLib.Date, java.lang.String],
    map_text: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    map_time: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    marker_date: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    marker_text: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    month_date: js.Function1[stdLib.Date, java.lang.String],
    month_date_class: js.Function1[stdLib.Date, java.lang.String],
    month_day: js.Function1[stdLib.Date, java.lang.String],
    month_events_link: js.Function2[stdLib.Date, scala.Double, java.lang.String],
    month_scale_date: js.Function1[stdLib.Date, java.lang.String],
    quick_info_content: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    quick_info_date: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    quick_info_title: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    time_picker: js.Function0[java.lang.String],
    timeline_cell_class: js.Function3[js.Array[_], stdLib.Date, js.Any, java.lang.String],
    timeline_cell_value: js.Function2[js.Array[_], stdLib.Date, java.lang.String],
    timeline_date: js.Function2[stdLib.Date, stdLib.Date, java.lang.String],
    timeline_scale_date: js.Function1[stdLib.Date, java.lang.String],
    timeline_scale_label: js.Function3[java.lang.String, java.lang.String, js.Any, java.lang.String],
    timeline_scalex_class: js.Function1[stdLib.Date, java.lang.String],
    timeline_scaley_class: js.Function3[java.lang.String, java.lang.String, js.Any, java.lang.String],
    timeline_second_scale_date: js.Function1[stdLib.Date, java.lang.String],
    timeline_second_scalex_class: js.Function1[stdLib.Date, java.lang.String],
    timeline_tooltip: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    tooltip_date_format: js.Function1[stdLib.Date, java.lang.String],
    tooltip_text: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    units_date: js.Function1[stdLib.Date, java.lang.String],
    units_scale_text: js.Function3[java.lang.String, java.lang.String, js.Any, java.lang.String],
    week_agenda_event_text: js.Function5[stdLib.Date, stdLib.Date, js.Any, stdLib.Date, java.lang.String, java.lang.String],
    week_agenda_scale_date: js.Function1[stdLib.Date, java.lang.String],
    week_date: js.Function2[stdLib.Date, stdLib.Date, java.lang.String],
    week_date_class: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String],
    week_scale_date: js.Function1[stdLib.Date, java.lang.String],
    xml_date: js.Function1[stdLib.Date, stdLib.Date],
    xml_format: js.Function1[stdLib.Date, java.lang.String],
    year_date: js.Function1[stdLib.Date, java.lang.String],
    year_month: js.Function1[stdLib.Date, java.lang.String],
    year_scale_date: js.Function1[stdLib.Date, java.lang.String],
    year_tooltip: js.Function3[stdLib.Date, stdLib.Date, js.Any, java.lang.String]
  ): SchedulerTemplates = {
    val __obj = js.Dynamic.literal(agenda_date = agenda_date, agenda_text = agenda_text, agenda_time = agenda_time, api_date = api_date, calendar_date = calendar_date, calendar_month = calendar_month, calendar_scale_date = calendar_scale_date, calendar_time = calendar_time, day_date = day_date, day_scale_date = day_scale_date, drag_marker_class = drag_marker_class, drag_marker_content = drag_marker_content, event_bar_date = event_bar_date, event_bar_text = event_bar_text, event_class = event_class, event_date = event_date, event_header = event_header, event_text = event_text, grid_date = grid_date, grid_field = grid_field, grid_full_date = grid_full_date, grid_single_date = grid_single_date, hour_scale = hour_scale, lightbox_header = lightbox_header, load_format = load_format, map_date = map_date, map_text = map_text, map_time = map_time, marker_date = marker_date, marker_text = marker_text, month_date = month_date, month_date_class = month_date_class, month_day = month_day, month_events_link = month_events_link, month_scale_date = month_scale_date, quick_info_content = quick_info_content, quick_info_date = quick_info_date, quick_info_title = quick_info_title, time_picker = time_picker, timeline_cell_class = timeline_cell_class, timeline_cell_value = timeline_cell_value, timeline_date = timeline_date, timeline_scale_date = timeline_scale_date, timeline_scale_label = timeline_scale_label, timeline_scalex_class = timeline_scalex_class, timeline_scaley_class = timeline_scaley_class, timeline_second_scale_date = timeline_second_scale_date, timeline_second_scalex_class = timeline_second_scalex_class, timeline_tooltip = timeline_tooltip, tooltip_date_format = tooltip_date_format, tooltip_text = tooltip_text, units_date = units_date, units_scale_text = units_scale_text, week_agenda_event_text = week_agenda_event_text, week_agenda_scale_date = week_agenda_scale_date, week_date = week_date, week_date_class = week_date_class, week_scale_date = week_scale_date, xml_date = xml_date, xml_format = xml_format, year_date = year_date, year_month = year_month, year_scale_date = year_scale_date, year_tooltip = year_tooltip)
  
    __obj.asInstanceOf[SchedulerTemplates]
  }
}

