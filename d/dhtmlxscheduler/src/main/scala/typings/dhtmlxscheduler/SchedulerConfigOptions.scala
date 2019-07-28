package typings.dhtmlxscheduler

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerConfigOptions extends js.Object {
  /**
  	 * 'says' to present the numbers of days in the Month view as clickable links that open the related day in the specified view
  	*/
  var active_link_view: String
  /**
  	 * sets the date to display events until
  	*/
  var agenda_end: Date
  /**
  	 * sets the date to start displaying events from
  	*/
  var agenda_start: Date
  /**
  	 * specifies how to display the default error notification in case the XML data loading failed
  	*/
  var ajax_error: String | Boolean
  /**
  	 * 'says' to show multi-day events in  the regular way (as one-day events are displayed)
  	*/
  var all_timed: Boolean | String
  /**
  	 * sets the date format that will be used by the addEvent() method to parse the start_date, end_date properties in case they are specified as strings
  	*/
  var api_date: String
  /**
  	 * enables automatic changing of the end event date after changing the start date
  	*/
  var auto_end_date: Boolean
  /**
  	 * stores a collection of buttons resided in the left bottom corner of the lightbox
  	*/
  var buttons_left: js.Array[_]
  /**
  	 * stores a collection of buttons resided in the right bottom corner of the lightbox
  	*/
  var buttons_right: js.Array[_]
  /**
  	 * sets the maximum number of events in a cascade
  	*/
  var cascade_event_count: Double
  /**
  	 * sets the 'cascade' display mode
  	*/
  var cascade_event_display: Boolean
  /**
  	 * sets the left margin for a cascade of events
  	*/
  var cascade_event_margin: Double
  /**
  	 * activates/disables checking of limits
  	*/
  var check_limits: Boolean
  /**
  	 * sets the maximum allowable number of events per time slot
  	*/
  var collision_limit: Double
  /**
  	 * forces the scheduler container to automatically change its size to show the whole content without scrolling
  	*/
  var container_autoresize: Boolean
  /**
  	 * sets the date format for the X-Axis of the Week and Units views
  	*/
  var day_date: String
  /**
  	 * enables the possibility to create events by double click
  	*/
  var dblclick_create: Boolean
  /**
  	 * sets the date format used by the templates 'day_date', 'week_date', 'day_scale_date' for setting date in the views' headers
  	*/
  var default_date: String
  /**
  	 * sets a timeout (in milliseconds) that wraps the api/scheduler_updateview.md and api/scheduler_setcurrentview.md calls  ( that cause re-drawing of the scheduler )
  	*/
  var delay_render: Double
  /**
  	 * 'says' to use the extended form while creating new events by drag or double click
  	*/
  var details_on_create: Boolean
  /**
  	 * 'says' to open the lightbox after double clicking on an event
  	*/
  var details_on_dblclick: Boolean
  /**
  	 * defines whether the marked(blocked) time spans should be highlighted in the scheduler
  	*/
  var display_marked_timespans: Boolean
  /**
  	 * sets the default background color for the events retrieved by the showEvent() method
  	*/
  var displayed_event_color: String
  /**
  	 * sets the default font color for the events retrieved by the showEvent() method
  	*/
  var displayed_event_text_color: String
  /**
  	 * enables the possibility to create new events by drag-and-drop
  	*/
  var drag_create: Boolean
  /**
  	 * highlights the event's duration on the time scale when you drags an event over the scheduler
  	*/
  var drag_highlight: Boolean
  /**
  	 * restrict dragging events to the calling scheduler from any other scheduler(s)
  	*/
  var drag_in: Boolean
  /**
  	 * enables the possibility to drag the lightbox by the header
  	*/
  var drag_lightbox: Boolean
  /**
  	 * enables the possibility to move events by drag-and-drop
  	*/
  var drag_move: Boolean
  /**
  	 * restrict dragging events from the calling scheduler to any other scheduler(s)
  	*/
  var drag_out: Boolean
  /**
  	 * enables the possibility to resize events by drag-and-drop
  	*/
  var drag_resize: Boolean
  /**
  	 * 'says' to open the lightbox while creating new events
  	*/
  var edit_on_create: Boolean
  /**
  	 * sets the initial duration of events in minutes
  	*/
  var event_duration: Double
  /**
  	 * sets the minimum value for the hour scale (Y-Axis)
  	*/
  var first_hour: Double
  /**
  	 * moves views' tabs from the left to the right side
  	*/
  var fix_tab_position: Boolean
  /**
  	 * enables setting of the event's duration to the full day
  	*/
  var full_day: Boolean
  /**
  	 * specifies whether events retrieved by the showEvent method should be highlighted while displaying
  	*/
  var highlight_displayed_event: Boolean
  /**
  	 * sets the time format of Y-Axis. Also used in the default event and lighbox  templates for setting the time part.
  	*/
  var hour_date: String
  /**
  	 * sets the height of an hour unit in pixels
  	*/
  var hour_size_px: Double
  /**
  	 * stores a collection of icons visible in the side edit menu of the event's box
  	*/
  var icons_edit: js.Array[_]
  /**
  	 * stores a collection of icons visible in the side selection menu of the event's box
  	*/
  var icons_select: js.Array[_]
  /**
  	 * defines whether the date specified in the 'End by' field should be exclusive or inclusive
  	*/
  var include_end_by: Boolean
  /**
  	 * disables the keyboard navigation in the scheduler
  	*/
  var key_nav: Boolean
  /**
  	 * sets the maximum value of the hour scale (Y-Axis)
  	*/
  var last_hour: Double
  /**
  	 * adds the dotted left border to the scheduler
  	*/
  var left_border: Boolean
  /**
  	 * specifies the lightbox object
  	*/
  var lightbox: js.Any
  /**
  	 * defines the lightbox's behavior, when the user opens the lightbox to edit a recurring event
  	*/
  var lightbox_recurring: String
  /**
  	 * denies to drag events out of the visible area of the scheduler
  	*/
  var limit_drag_out: Boolean
  /**
  	 * sets the right border of the allowable date range
  	*/
  var limit_end: Date
  /**
  	 * sets the left border of the allowable date range
  	*/
  var limit_start: Date
  /**
  	 * sets the max and min values of the time selector in the lightbox to the values of the 'last_hour' and 'first_hour' options
  	*/
  var limit_time_select: Boolean
  /**
  	 * limits the date period during which the user can view the events
  	*/
  var limit_view: Boolean
  /**
  	 * sets the format of server request parameters 'from', 'to' in case of dynamic loading
  	*/
  var load_date: String
  /**
  	 * sets the date to display events until
  	*/
  var map_end: Date
  /**
  	 * sets the position that will be displayed on the map in case the event's location can't be identified
  	*/
  var map_error_position: js.Any
  /**
  	 * the maximum width of the Google Maps's popup marker in the Map view
  	*/
  var map_infowindow_max_width: Double
  /**
  	 * sets the initial position of the map
  	*/
  var map_initial_position: js.Any
  /**
  	 * sets the initial zoom of Google Maps in the Map view
  	*/
  var map_initial_zoom: Double
  /**
  	 * activates attempts to resolve the event's location, if the database doesn't have  the event's coordinates stored
  	*/
  var map_resolve_event_location: Boolean
  /**
  	 * enables/disables prompts asking the user to share his location for displaying on the map
  	*/
  var map_resolve_user_location: Boolean
  /**
  	 * sets the date to start displaying events from
  	*/
  var map_start: Date
  /**
  	 * sets the type of Google Maps
  	*/
  var map_type: js.Any
  /**
  	 * sets the zoom that will be used to show the user's location, if the user agrees to the browser's offer to show it
  	*/
  var map_zoom_after_resolve: Double
  /**
  	 * enables/disables the marker displaying the current time
  	*/
  var mark_now: Boolean
  /**
  	 * sets the maximum number of events displayable in a cell
  	*/
  var max_month_events: Double
  /**
  	 * specifies the mini calendar object
  	*/
  var minicalendar: js.Any
  /**
  	 * sets the format for the header of the Month view
  	*/
  var month_date: String
  /**
  	 * sets the format for the day in the cells of the Month and Year views
  	*/
  var month_day: String
  /**
  	 * sets the minimum height of cells in the Month view
  	*/
  var month_day_min_height: Double
  /**
  	 * enables rendering of multi-day events
  	*/
  var multi_day: Boolean
  /**
  	 * sets the height of the area that displays multi-day events
  	*/
  var multi_day_height_limit: Double | Boolean
  /**
  	 * enables the possibility to render the same events in several sections of the Timeline or Units view
  	*/
  var multisection: Boolean
  /**
  	 * specifies whether while dragging events that assigned to several sections of the Timeline or Units view, all  instances should be dragged at once ('true') or just the selected one ('false')
  	*/
  var multisection_shift_all: Boolean
  /**
  	 * sets the date for the current-time marker in the Limit extension (enabled by the configuration - mark_now)
  	*/
  var now_date: Date
  /**
  	 * allows working with recurring events independently of time zones
  	*/
  var occurrence_timestamp_in_utc: Boolean
  /**
  	 * defines the 'saving' behaviour for the case, when  the user edits the event's text directly in the event's box
  	*/
  var positive_closing: Boolean
  /**
  	 * preserves the visible length of an event while dragging along a non-linear time scale
  	*/
  var preserve_length: Boolean
  /**
  	 * cancels preserving of the current scroll position while navigating between dates of the same view
  	*/
  var preserve_scroll: Boolean
  /**
  	 * enables/disables caching of GET requests in the browser
  	*/
  var prevent_cache: Boolean
  /**
  	 * defines whether the event form will appear from the left/right side of the screen or near the selected event
  	*/
  var quick_info_detached: Boolean
  /**
  	 * activates the read-only mode for the scheduler
  	*/
  var readonly: Boolean
  /**
  	 * activates the read-only mode for the lightbox
  	*/
  var readonly_form: Boolean
  /**
  	 * specifies working days that will affect the recurring event when the user selects the ""Every workday" option in the lightbox
  	*/
  var recurring_workdays: js.Array[_]
  /**
  	 * sets the date format of the 'End by' field in the 'recurring' lightbox
  	*/
  var repeat_date: String
  /**
  	 * prevents including past days to events with the 'weekly' recurrence
  	*/
  var repeat_precise: Boolean
  /**
  	 * enables the possibility to resize multi-day events in the Month view by drag-and-drop
  	*/
  var resize_month_events: Boolean
  /**
  	 * enables the possibility to resize single-day events in the Month view by drag-n-drop
  	*/
  var resize_month_timed: Boolean
  /**
  	 * sets the initial position of the vertical scroll in the scheduler (an hour in the 24-hour clock format)
  	*/
  var scroll_hour: Double
  /**
  	 * specifies the delimeter that will be used to separate several sections/units in the related data property of the event
  	*/
  var section_delemiter: String
  /**
  	 * shows/hides the select bar in the event's box
  	*/
  var select: Boolean
  /**
  	 * allows preventing short events from overlapping
  	*/
  var separate_short_events: Boolean
  /**
  	 * enables converting server-side dates from UTC to a local time zone (and backward) while sending data to the server
  	*/
  var server_utc: Boolean
  /**
  	 * enables showing a progress/spinner while data is loading (useful for dynamic loading)
  	*/
  var show_loading: Boolean
  /**
  	 * activates/disables the 'quick_info' extension (pop-up task's details form)
  	*/
  var show_quick_info: Boolean
  /**
  	 * sets the start day of weeks
  	*/
  var start_on_monday: Boolean
  /**
  	 * sets the minimum step (in minutes) for event's time values
  	*/
  var time_step: Double
  /**
  	 * enables/disables the touch support in the scheduler
  	*/
  var touch: Boolean | String
  /**
  	 * defines the time period in milliseconds that is used to differ the long touch gesture from the scroll gesture
  	*/
  var touch_drag: Double | Boolean
  /**
  	 * enables/disables prompting messages in the right top corner of the screen
  	*/
  var touch_tip: Boolean
  /**
  	 * disables dhtmxlScheduler's tooltips on the touch devices
  	*/
  var touch_tooltip: Boolean
  /**
  	 * updates the mode when the scheduler fully repaints itself on any action
  	*/
  var update_render: Boolean
  /**
  	 * 'says' events to occupy the whole width of the cell
  	*/
  var use_select_menu_space: Boolean
  /**
  	 * sets the format of the date in the sub-header of the Month view
  	*/
  var week_date: String
  /**
  	 * enables/disables displaying the standard (wide) lightbox instead of the short one
  	*/
  var wide_form: Boolean
  /**
  	 * sets the date format that is used to parse data from the data set
  	*/
  var xml_date: String
  /**
  	 * sets the number of rows in the Year view
  	*/
  var year_x: Double
  /**
  	 * sets the number of columns in the Year view
  	*/
  var year_y: Double
}

object SchedulerConfigOptions {
  @scala.inline
  def apply(
    active_link_view: String,
    agenda_end: Date,
    agenda_start: Date,
    ajax_error: String | Boolean,
    all_timed: Boolean | String,
    api_date: String,
    auto_end_date: Boolean,
    buttons_left: js.Array[_],
    buttons_right: js.Array[_],
    cascade_event_count: Double,
    cascade_event_display: Boolean,
    cascade_event_margin: Double,
    check_limits: Boolean,
    collision_limit: Double,
    container_autoresize: Boolean,
    day_date: String,
    dblclick_create: Boolean,
    default_date: String,
    delay_render: Double,
    details_on_create: Boolean,
    details_on_dblclick: Boolean,
    display_marked_timespans: Boolean,
    displayed_event_color: String,
    displayed_event_text_color: String,
    drag_create: Boolean,
    drag_highlight: Boolean,
    drag_in: Boolean,
    drag_lightbox: Boolean,
    drag_move: Boolean,
    drag_out: Boolean,
    drag_resize: Boolean,
    edit_on_create: Boolean,
    event_duration: Double,
    first_hour: Double,
    fix_tab_position: Boolean,
    full_day: Boolean,
    highlight_displayed_event: Boolean,
    hour_date: String,
    hour_size_px: Double,
    icons_edit: js.Array[_],
    icons_select: js.Array[_],
    include_end_by: Boolean,
    key_nav: Boolean,
    last_hour: Double,
    left_border: Boolean,
    lightbox: js.Any,
    lightbox_recurring: String,
    limit_drag_out: Boolean,
    limit_end: Date,
    limit_start: Date,
    limit_time_select: Boolean,
    limit_view: Boolean,
    load_date: String,
    map_end: Date,
    map_error_position: js.Any,
    map_infowindow_max_width: Double,
    map_initial_position: js.Any,
    map_initial_zoom: Double,
    map_resolve_event_location: Boolean,
    map_resolve_user_location: Boolean,
    map_start: Date,
    map_type: js.Any,
    map_zoom_after_resolve: Double,
    mark_now: Boolean,
    max_month_events: Double,
    minicalendar: js.Any,
    month_date: String,
    month_day: String,
    month_day_min_height: Double,
    multi_day: Boolean,
    multi_day_height_limit: Double | Boolean,
    multisection: Boolean,
    multisection_shift_all: Boolean,
    now_date: Date,
    occurrence_timestamp_in_utc: Boolean,
    positive_closing: Boolean,
    preserve_length: Boolean,
    preserve_scroll: Boolean,
    prevent_cache: Boolean,
    quick_info_detached: Boolean,
    readonly: Boolean,
    readonly_form: Boolean,
    recurring_workdays: js.Array[_],
    repeat_date: String,
    repeat_precise: Boolean,
    resize_month_events: Boolean,
    resize_month_timed: Boolean,
    scroll_hour: Double,
    section_delemiter: String,
    select: Boolean,
    separate_short_events: Boolean,
    server_utc: Boolean,
    show_loading: Boolean,
    show_quick_info: Boolean,
    start_on_monday: Boolean,
    time_step: Double,
    touch: Boolean | String,
    touch_drag: Double | Boolean,
    touch_tip: Boolean,
    touch_tooltip: Boolean,
    update_render: Boolean,
    use_select_menu_space: Boolean,
    week_date: String,
    wide_form: Boolean,
    xml_date: String,
    year_x: Double,
    year_y: Double
  ): SchedulerConfigOptions = {
    val __obj = js.Dynamic.literal(active_link_view = active_link_view, agenda_end = agenda_end, agenda_start = agenda_start, ajax_error = ajax_error.asInstanceOf[js.Any], all_timed = all_timed.asInstanceOf[js.Any], api_date = api_date, auto_end_date = auto_end_date, buttons_left = buttons_left, buttons_right = buttons_right, cascade_event_count = cascade_event_count, cascade_event_display = cascade_event_display, cascade_event_margin = cascade_event_margin, check_limits = check_limits, collision_limit = collision_limit, container_autoresize = container_autoresize, day_date = day_date, dblclick_create = dblclick_create, default_date = default_date, delay_render = delay_render, details_on_create = details_on_create, details_on_dblclick = details_on_dblclick, display_marked_timespans = display_marked_timespans, displayed_event_color = displayed_event_color, displayed_event_text_color = displayed_event_text_color, drag_create = drag_create, drag_highlight = drag_highlight, drag_in = drag_in, drag_lightbox = drag_lightbox, drag_move = drag_move, drag_out = drag_out, drag_resize = drag_resize, edit_on_create = edit_on_create, event_duration = event_duration, first_hour = first_hour, fix_tab_position = fix_tab_position, full_day = full_day, highlight_displayed_event = highlight_displayed_event, hour_date = hour_date, hour_size_px = hour_size_px, icons_edit = icons_edit, icons_select = icons_select, include_end_by = include_end_by, key_nav = key_nav, last_hour = last_hour, left_border = left_border, lightbox = lightbox, lightbox_recurring = lightbox_recurring, limit_drag_out = limit_drag_out, limit_end = limit_end, limit_start = limit_start, limit_time_select = limit_time_select, limit_view = limit_view, load_date = load_date, map_end = map_end, map_error_position = map_error_position, map_infowindow_max_width = map_infowindow_max_width, map_initial_position = map_initial_position, map_initial_zoom = map_initial_zoom, map_resolve_event_location = map_resolve_event_location, map_resolve_user_location = map_resolve_user_location, map_start = map_start, map_type = map_type, map_zoom_after_resolve = map_zoom_after_resolve, mark_now = mark_now, max_month_events = max_month_events, minicalendar = minicalendar, month_date = month_date, month_day = month_day, month_day_min_height = month_day_min_height, multi_day = multi_day, multi_day_height_limit = multi_day_height_limit.asInstanceOf[js.Any], multisection = multisection, multisection_shift_all = multisection_shift_all, now_date = now_date, occurrence_timestamp_in_utc = occurrence_timestamp_in_utc, positive_closing = positive_closing, preserve_length = preserve_length, preserve_scroll = preserve_scroll, prevent_cache = prevent_cache, quick_info_detached = quick_info_detached, readonly = readonly, readonly_form = readonly_form, recurring_workdays = recurring_workdays, repeat_date = repeat_date, repeat_precise = repeat_precise, resize_month_events = resize_month_events, resize_month_timed = resize_month_timed, scroll_hour = scroll_hour, section_delemiter = section_delemiter, select = select, separate_short_events = separate_short_events, server_utc = server_utc, show_loading = show_loading, show_quick_info = show_quick_info, start_on_monday = start_on_monday, time_step = time_step, touch = touch.asInstanceOf[js.Any], touch_drag = touch_drag.asInstanceOf[js.Any], touch_tip = touch_tip, touch_tooltip = touch_tooltip, update_render = update_render, use_select_menu_space = use_select_menu_space, week_date = week_date, wide_form = wide_form, xml_date = xml_date, year_x = year_x, year_y = year_y)
  
    __obj.asInstanceOf[SchedulerConfigOptions]
  }
}

