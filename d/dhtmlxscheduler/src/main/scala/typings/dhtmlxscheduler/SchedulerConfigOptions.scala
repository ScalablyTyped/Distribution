package typings.dhtmlxscheduler

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerConfigOptions extends js.Object {
  /**
    * 'says' to present the numbers of days in the Month view as clickable links that open the related day in the specified view
    */
  var active_link_view: String = js.native
  /**
    * sets the date to display events until
    */
  var agenda_end: Date = js.native
  /**
    * sets the date to start displaying events from
    */
  var agenda_start: Date = js.native
  /**
    * specifies how to display the default error notification in case the XML data loading failed
    */
  var ajax_error: String | Boolean = js.native
  /**
    * 'says' to show multi-day events in  the regular way (as one-day events are displayed)
    */
  var all_timed: Boolean | String = js.native
  /**
    * sets the date format that will be used by the addEvent() method to parse the start_date, end_date properties in case they are specified as strings
    */
  var api_date: String = js.native
  /**
    * enables automatic changing of the end event date after changing the start date
    */
  var auto_end_date: Boolean = js.native
  /**
    * stores a collection of buttons resided in the left bottom corner of the lightbox
    */
  var buttons_left: js.Array[_] = js.native
  /**
    * stores a collection of buttons resided in the right bottom corner of the lightbox
    */
  var buttons_right: js.Array[_] = js.native
  /**
    * sets the maximum number of events in a cascade
    */
  var cascade_event_count: Double = js.native
  /**
    * sets the 'cascade' display mode
    */
  var cascade_event_display: Boolean = js.native
  /**
    * sets the left margin for a cascade of events
    */
  var cascade_event_margin: Double = js.native
  /**
    * activates/disables checking of limits
    */
  var check_limits: Boolean = js.native
  /**
    * sets the maximum allowable number of events per time slot
    */
  var collision_limit: Double = js.native
  /**
    * forces the scheduler container to automatically change its size to show the whole content without scrolling
    */
  var container_autoresize: Boolean = js.native
  /**
    * sets the date format for the X-Axis of the Week and Units views
    */
  var day_date: String = js.native
  /**
    * enables the possibility to create events by double click
    */
  var dblclick_create: Boolean = js.native
  /**
    * sets the date format used by the templates 'day_date', 'week_date', 'day_scale_date' for setting date in the views' headers
    */
  var default_date: String = js.native
  /**
    * sets a timeout (in milliseconds) that wraps the api/scheduler_updateview.md and api/scheduler_setcurrentview.md calls  ( that cause re-drawing of the scheduler )
    */
  var delay_render: Double = js.native
  /**
    * 'says' to use the extended form while creating new events by drag or double click
    */
  var details_on_create: Boolean = js.native
  /**
    * 'says' to open the lightbox after double clicking on an event
    */
  var details_on_dblclick: Boolean = js.native
  /**
    * defines whether the marked(blocked) time spans should be highlighted in the scheduler
    */
  var display_marked_timespans: Boolean = js.native
  /**
    * sets the default background color for the events retrieved by the showEvent() method
    */
  var displayed_event_color: String = js.native
  /**
    * sets the default font color for the events retrieved by the showEvent() method
    */
  var displayed_event_text_color: String = js.native
  /**
    * enables the possibility to create new events by drag-and-drop
    */
  var drag_create: Boolean = js.native
  /**
    * highlights the event's duration on the time scale when you drags an event over the scheduler
    */
  var drag_highlight: Boolean = js.native
  /**
    * restrict dragging events to the calling scheduler from any other scheduler(s)
    */
  var drag_in: Boolean = js.native
  /**
    * enables the possibility to drag the lightbox by the header
    */
  var drag_lightbox: Boolean = js.native
  /**
    * enables the possibility to move events by drag-and-drop
    */
  var drag_move: Boolean = js.native
  /**
    * restrict dragging events from the calling scheduler to any other scheduler(s)
    */
  var drag_out: Boolean = js.native
  /**
    * enables the possibility to resize events by drag-and-drop
    */
  var drag_resize: Boolean = js.native
  /**
    * 'says' to open the lightbox while creating new events
    */
  var edit_on_create: Boolean = js.native
  /**
    * sets the initial duration of events in minutes
    */
  var event_duration: Double = js.native
  /**
    * sets the minimum value for the hour scale (Y-Axis)
    */
  var first_hour: Double = js.native
  /**
    * moves views' tabs from the left to the right side
    */
  var fix_tab_position: Boolean = js.native
  /**
    * enables setting of the event's duration to the full day
    */
  var full_day: Boolean = js.native
  /**
    * specifies whether events retrieved by the showEvent method should be highlighted while displaying
    */
  var highlight_displayed_event: Boolean = js.native
  /**
    * sets the time format of Y-Axis. Also used in the default event and lighbox  templates for setting the time part.
    */
  var hour_date: String = js.native
  /**
    * sets the height of an hour unit in pixels
    */
  var hour_size_px: Double = js.native
  /**
    * stores a collection of icons visible in the side edit menu of the event's box
    */
  var icons_edit: js.Array[_] = js.native
  /**
    * stores a collection of icons visible in the side selection menu of the event's box
    */
  var icons_select: js.Array[_] = js.native
  /**
    * defines whether the date specified in the 'End by' field should be exclusive or inclusive
    */
  var include_end_by: Boolean = js.native
  /**
    * disables the keyboard navigation in the scheduler
    */
  var key_nav: Boolean = js.native
  /**
    * sets the maximum value of the hour scale (Y-Axis)
    */
  var last_hour: Double = js.native
  /**
    * adds the dotted left border to the scheduler
    */
  var left_border: Boolean = js.native
  /**
    * specifies the lightbox object
    */
  var lightbox: js.Any = js.native
  /**
    * defines the lightbox's behavior, when the user opens the lightbox to edit a recurring event
    */
  var lightbox_recurring: String = js.native
  /**
    * denies to drag events out of the visible area of the scheduler
    */
  var limit_drag_out: Boolean = js.native
  /**
    * sets the right border of the allowable date range
    */
  var limit_end: Date = js.native
  /**
    * sets the left border of the allowable date range
    */
  var limit_start: Date = js.native
  /**
    * sets the max and min values of the time selector in the lightbox to the values of the 'last_hour' and 'first_hour' options
    */
  var limit_time_select: Boolean = js.native
  /**
    * limits the date period during which the user can view the events
    */
  var limit_view: Boolean = js.native
  /**
    * sets the format of server request parameters 'from', 'to' in case of dynamic loading
    */
  var load_date: String = js.native
  /**
    * sets the date to display events until
    */
  var map_end: Date = js.native
  /**
    * sets the position that will be displayed on the map in case the event's location can't be identified
    */
  var map_error_position: js.Any = js.native
  /**
    * the maximum width of the Google Maps's popup marker in the Map view
    */
  var map_infowindow_max_width: Double = js.native
  /**
    * sets the initial position of the map
    */
  var map_initial_position: js.Any = js.native
  /**
    * sets the initial zoom of Google Maps in the Map view
    */
  var map_initial_zoom: Double = js.native
  /**
    * activates attempts to resolve the event's location, if the database doesn't have  the event's coordinates stored
    */
  var map_resolve_event_location: Boolean = js.native
  /**
    * enables/disables prompts asking the user to share their location for displaying on the map
    */
  var map_resolve_user_location: Boolean = js.native
  /**
    * sets the date to start displaying events from
    */
  var map_start: Date = js.native
  /**
    * sets the type of Google Maps
    */
  var map_type: js.Any = js.native
  /**
    * sets the zoom that will be used to show the user's location, if the user agrees to the browser's offer to show it
    */
  var map_zoom_after_resolve: Double = js.native
  /**
    * enables/disables the marker displaying the current time
    */
  var mark_now: Boolean = js.native
  /**
    * sets the maximum number of events displayable in a cell
    */
  var max_month_events: Double = js.native
  /**
    * specifies the mini calendar object
    */
  var minicalendar: js.Any = js.native
  /**
    * sets the format for the header of the Month view
    */
  var month_date: String = js.native
  /**
    * sets the format for the day in the cells of the Month and Year views
    */
  var month_day: String = js.native
  /**
    * sets the minimum height of cells in the Month view
    */
  var month_day_min_height: Double = js.native
  /**
    * enables rendering of multi-day events
    */
  var multi_day: Boolean = js.native
  /**
    * sets the height of the area that displays multi-day events
    */
  var multi_day_height_limit: Double | Boolean = js.native
  /**
    * enables the possibility to render the same events in several sections of the Timeline or Units view
    */
  var multisection: Boolean = js.native
  /**
    * specifies whether while dragging events that assigned to several sections of the Timeline or Units view, all  instances should be dragged at once ('true') or just the selected one ('false')
    */
  var multisection_shift_all: Boolean = js.native
  /**
    * sets the date for the current-time marker in the Limit extension (enabled by the configuration - mark_now)
    */
  var now_date: Date = js.native
  /**
    * allows working with recurring events independently of time zones
    */
  var occurrence_timestamp_in_utc: Boolean = js.native
  /**
    * defines the 'saving' behaviour for the case, when  the user edits the event's text directly in the event's box
    */
  var positive_closing: Boolean = js.native
  /**
    * preserves the visible length of an event while dragging along a non-linear time scale
    */
  var preserve_length: Boolean = js.native
  /**
    * cancels preserving of the current scroll position while navigating between dates of the same view
    */
  var preserve_scroll: Boolean = js.native
  /**
    * enables/disables caching of GET requests in the browser
    */
  var prevent_cache: Boolean = js.native
  /**
    * defines whether the event form will appear from the left/right side of the screen or near the selected event
    */
  var quick_info_detached: Boolean = js.native
  /**
    * activates the read-only mode for the scheduler
    */
  var readonly: Boolean = js.native
  /**
    * activates the read-only mode for the lightbox
    */
  var readonly_form: Boolean = js.native
  /**
    * specifies working days that will affect the recurring event when the user selects the ""Every workday" option in the lightbox
    */
  var recurring_workdays: js.Array[_] = js.native
  /**
    * sets the date format of the 'End by' field in the 'recurring' lightbox
    */
  var repeat_date: String = js.native
  /**
    * prevents including past days to events with the 'weekly' recurrence
    */
  var repeat_precise: Boolean = js.native
  /**
    * enables the possibility to resize multi-day events in the Month view by drag-and-drop
    */
  var resize_month_events: Boolean = js.native
  /**
    * enables the possibility to resize single-day events in the Month view by drag-n-drop
    */
  var resize_month_timed: Boolean = js.native
  /**
    * sets the initial position of the vertical scroll in the scheduler (an hour in the 24-hour clock format)
    */
  var scroll_hour: Double = js.native
  /**
    * specifies the delimeter that will be used to separate several sections/units in the related data property of the event
    */
  var section_delemiter: String = js.native
  /**
    * shows/hides the select bar in the event's box
    */
  var select: Boolean = js.native
  /**
    * allows preventing short events from overlapping
    */
  var separate_short_events: Boolean = js.native
  /**
    * enables converting server-side dates from UTC to a local time zone (and backward) while sending data to the server
    */
  var server_utc: Boolean = js.native
  /**
    * enables showing a progress/spinner while data is loading (useful for dynamic loading)
    */
  var show_loading: Boolean = js.native
  /**
    * activates/disables the 'quick_info' extension (pop-up task's details form)
    */
  var show_quick_info: Boolean = js.native
  /**
    * sets the start day of weeks
    */
  var start_on_monday: Boolean = js.native
  /**
    * sets the minimum step (in minutes) for event's time values
    */
  var time_step: Double = js.native
  /**
    * enables/disables the touch support in the scheduler
    */
  var touch: Boolean | String = js.native
  /**
    * defines the time period in milliseconds that is used to differ the long touch gesture from the scroll gesture
    */
  var touch_drag: Double | Boolean = js.native
  /**
    * enables/disables prompting messages in the right top corner of the screen
    */
  var touch_tip: Boolean = js.native
  /**
    * disables dhtmxlScheduler's tooltips on the touch devices
    */
  var touch_tooltip: Boolean = js.native
  /**
    * updates the mode when the scheduler fully repaints itself on any action
    */
  var update_render: Boolean = js.native
  /**
    * 'says' events to occupy the whole width of the cell
    */
  var use_select_menu_space: Boolean = js.native
  /**
    * sets the format of the date in the sub-header of the Month view
    */
  var week_date: String = js.native
  /**
    * enables/disables displaying the standard (wide) lightbox instead of the short one
    */
  var wide_form: Boolean = js.native
  /**
    * sets the date format that is used to parse data from the data set
    */
  var xml_date: String = js.native
  /**
    * sets the number of rows in the Year view
    */
  var year_x: Double = js.native
  /**
    * sets the number of columns in the Year view
    */
  var year_y: Double = js.native
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
    val __obj = js.Dynamic.literal(active_link_view = active_link_view.asInstanceOf[js.Any], agenda_end = agenda_end.asInstanceOf[js.Any], agenda_start = agenda_start.asInstanceOf[js.Any], ajax_error = ajax_error.asInstanceOf[js.Any], all_timed = all_timed.asInstanceOf[js.Any], api_date = api_date.asInstanceOf[js.Any], auto_end_date = auto_end_date.asInstanceOf[js.Any], buttons_left = buttons_left.asInstanceOf[js.Any], buttons_right = buttons_right.asInstanceOf[js.Any], cascade_event_count = cascade_event_count.asInstanceOf[js.Any], cascade_event_display = cascade_event_display.asInstanceOf[js.Any], cascade_event_margin = cascade_event_margin.asInstanceOf[js.Any], check_limits = check_limits.asInstanceOf[js.Any], collision_limit = collision_limit.asInstanceOf[js.Any], container_autoresize = container_autoresize.asInstanceOf[js.Any], day_date = day_date.asInstanceOf[js.Any], dblclick_create = dblclick_create.asInstanceOf[js.Any], default_date = default_date.asInstanceOf[js.Any], delay_render = delay_render.asInstanceOf[js.Any], details_on_create = details_on_create.asInstanceOf[js.Any], details_on_dblclick = details_on_dblclick.asInstanceOf[js.Any], display_marked_timespans = display_marked_timespans.asInstanceOf[js.Any], displayed_event_color = displayed_event_color.asInstanceOf[js.Any], displayed_event_text_color = displayed_event_text_color.asInstanceOf[js.Any], drag_create = drag_create.asInstanceOf[js.Any], drag_highlight = drag_highlight.asInstanceOf[js.Any], drag_in = drag_in.asInstanceOf[js.Any], drag_lightbox = drag_lightbox.asInstanceOf[js.Any], drag_move = drag_move.asInstanceOf[js.Any], drag_out = drag_out.asInstanceOf[js.Any], drag_resize = drag_resize.asInstanceOf[js.Any], edit_on_create = edit_on_create.asInstanceOf[js.Any], event_duration = event_duration.asInstanceOf[js.Any], first_hour = first_hour.asInstanceOf[js.Any], fix_tab_position = fix_tab_position.asInstanceOf[js.Any], full_day = full_day.asInstanceOf[js.Any], highlight_displayed_event = highlight_displayed_event.asInstanceOf[js.Any], hour_date = hour_date.asInstanceOf[js.Any], hour_size_px = hour_size_px.asInstanceOf[js.Any], icons_edit = icons_edit.asInstanceOf[js.Any], icons_select = icons_select.asInstanceOf[js.Any], include_end_by = include_end_by.asInstanceOf[js.Any], key_nav = key_nav.asInstanceOf[js.Any], last_hour = last_hour.asInstanceOf[js.Any], left_border = left_border.asInstanceOf[js.Any], lightbox = lightbox.asInstanceOf[js.Any], lightbox_recurring = lightbox_recurring.asInstanceOf[js.Any], limit_drag_out = limit_drag_out.asInstanceOf[js.Any], limit_end = limit_end.asInstanceOf[js.Any], limit_start = limit_start.asInstanceOf[js.Any], limit_time_select = limit_time_select.asInstanceOf[js.Any], limit_view = limit_view.asInstanceOf[js.Any], load_date = load_date.asInstanceOf[js.Any], map_end = map_end.asInstanceOf[js.Any], map_error_position = map_error_position.asInstanceOf[js.Any], map_infowindow_max_width = map_infowindow_max_width.asInstanceOf[js.Any], map_initial_position = map_initial_position.asInstanceOf[js.Any], map_initial_zoom = map_initial_zoom.asInstanceOf[js.Any], map_resolve_event_location = map_resolve_event_location.asInstanceOf[js.Any], map_resolve_user_location = map_resolve_user_location.asInstanceOf[js.Any], map_start = map_start.asInstanceOf[js.Any], map_type = map_type.asInstanceOf[js.Any], map_zoom_after_resolve = map_zoom_after_resolve.asInstanceOf[js.Any], mark_now = mark_now.asInstanceOf[js.Any], max_month_events = max_month_events.asInstanceOf[js.Any], minicalendar = minicalendar.asInstanceOf[js.Any], month_date = month_date.asInstanceOf[js.Any], month_day = month_day.asInstanceOf[js.Any], month_day_min_height = month_day_min_height.asInstanceOf[js.Any], multi_day = multi_day.asInstanceOf[js.Any], multi_day_height_limit = multi_day_height_limit.asInstanceOf[js.Any], multisection = multisection.asInstanceOf[js.Any], multisection_shift_all = multisection_shift_all.asInstanceOf[js.Any], now_date = now_date.asInstanceOf[js.Any], occurrence_timestamp_in_utc = occurrence_timestamp_in_utc.asInstanceOf[js.Any], positive_closing = positive_closing.asInstanceOf[js.Any], preserve_length = preserve_length.asInstanceOf[js.Any], preserve_scroll = preserve_scroll.asInstanceOf[js.Any], prevent_cache = prevent_cache.asInstanceOf[js.Any], quick_info_detached = quick_info_detached.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], readonly_form = readonly_form.asInstanceOf[js.Any], recurring_workdays = recurring_workdays.asInstanceOf[js.Any], repeat_date = repeat_date.asInstanceOf[js.Any], repeat_precise = repeat_precise.asInstanceOf[js.Any], resize_month_events = resize_month_events.asInstanceOf[js.Any], resize_month_timed = resize_month_timed.asInstanceOf[js.Any], scroll_hour = scroll_hour.asInstanceOf[js.Any], section_delemiter = section_delemiter.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], separate_short_events = separate_short_events.asInstanceOf[js.Any], server_utc = server_utc.asInstanceOf[js.Any], show_loading = show_loading.asInstanceOf[js.Any], show_quick_info = show_quick_info.asInstanceOf[js.Any], start_on_monday = start_on_monday.asInstanceOf[js.Any], time_step = time_step.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], touch_drag = touch_drag.asInstanceOf[js.Any], touch_tip = touch_tip.asInstanceOf[js.Any], touch_tooltip = touch_tooltip.asInstanceOf[js.Any], update_render = update_render.asInstanceOf[js.Any], use_select_menu_space = use_select_menu_space.asInstanceOf[js.Any], week_date = week_date.asInstanceOf[js.Any], wide_form = wide_form.asInstanceOf[js.Any], xml_date = xml_date.asInstanceOf[js.Any], year_x = year_x.asInstanceOf[js.Any], year_y = year_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerConfigOptions]
  }
  @scala.inline
  implicit class SchedulerConfigOptionsOps[Self <: SchedulerConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive_link_view(value: String): Self = this.set("active_link_view", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgenda_end(value: Date): Self = this.set("agenda_end", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgenda_start(value: Date): Self = this.set("agenda_start", value.asInstanceOf[js.Any])
    @scala.inline
    def setAjax_error(value: String | Boolean): Self = this.set("ajax_error", value.asInstanceOf[js.Any])
    @scala.inline
    def setAll_timed(value: Boolean | String): Self = this.set("all_timed", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_date(value: String): Self = this.set("api_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuto_end_date(value: Boolean): Self = this.set("auto_end_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtons_leftVarargs(value: js.Any*): Self = this.set("buttons_left", js.Array(value :_*))
    @scala.inline
    def setButtons_left(value: js.Array[_]): Self = this.set("buttons_left", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtons_rightVarargs(value: js.Any*): Self = this.set("buttons_right", js.Array(value :_*))
    @scala.inline
    def setButtons_right(value: js.Array[_]): Self = this.set("buttons_right", value.asInstanceOf[js.Any])
    @scala.inline
    def setCascade_event_count(value: Double): Self = this.set("cascade_event_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCascade_event_display(value: Boolean): Self = this.set("cascade_event_display", value.asInstanceOf[js.Any])
    @scala.inline
    def setCascade_event_margin(value: Double): Self = this.set("cascade_event_margin", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheck_limits(value: Boolean): Self = this.set("check_limits", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollision_limit(value: Double): Self = this.set("collision_limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer_autoresize(value: Boolean): Self = this.set("container_autoresize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDay_date(value: String): Self = this.set("day_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick_create(value: Boolean): Self = this.set("dblclick_create", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault_date(value: String): Self = this.set("default_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay_render(value: Double): Self = this.set("delay_render", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails_on_create(value: Boolean): Self = this.set("details_on_create", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails_on_dblclick(value: Boolean): Self = this.set("details_on_dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay_marked_timespans(value: Boolean): Self = this.set("display_marked_timespans", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayed_event_color(value: String): Self = this.set("displayed_event_color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayed_event_text_color(value: String): Self = this.set("displayed_event_text_color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrag_create(value: Boolean): Self = this.set("drag_create", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrag_highlight(value: Boolean): Self = this.set("drag_highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrag_in(value: Boolean): Self = this.set("drag_in", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrag_lightbox(value: Boolean): Self = this.set("drag_lightbox", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrag_move(value: Boolean): Self = this.set("drag_move", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrag_out(value: Boolean): Self = this.set("drag_out", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrag_resize(value: Boolean): Self = this.set("drag_resize", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdit_on_create(value: Boolean): Self = this.set("edit_on_create", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent_duration(value: Double): Self = this.set("event_duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst_hour(value: Double): Self = this.set("first_hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setFix_tab_position(value: Boolean): Self = this.set("fix_tab_position", value.asInstanceOf[js.Any])
    @scala.inline
    def setFull_day(value: Boolean): Self = this.set("full_day", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlight_displayed_event(value: Boolean): Self = this.set("highlight_displayed_event", value.asInstanceOf[js.Any])
    @scala.inline
    def setHour_date(value: String): Self = this.set("hour_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setHour_size_px(value: Double): Self = this.set("hour_size_px", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcons_editVarargs(value: js.Any*): Self = this.set("icons_edit", js.Array(value :_*))
    @scala.inline
    def setIcons_edit(value: js.Array[_]): Self = this.set("icons_edit", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcons_selectVarargs(value: js.Any*): Self = this.set("icons_select", js.Array(value :_*))
    @scala.inline
    def setIcons_select(value: js.Array[_]): Self = this.set("icons_select", value.asInstanceOf[js.Any])
    @scala.inline
    def setInclude_end_by(value: Boolean): Self = this.set("include_end_by", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey_nav(value: Boolean): Self = this.set("key_nav", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_hour(value: Double): Self = this.set("last_hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft_border(value: Boolean): Self = this.set("left_border", value.asInstanceOf[js.Any])
    @scala.inline
    def setLightbox(value: js.Any): Self = this.set("lightbox", value.asInstanceOf[js.Any])
    @scala.inline
    def setLightbox_recurring(value: String): Self = this.set("lightbox_recurring", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit_drag_out(value: Boolean): Self = this.set("limit_drag_out", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit_end(value: Date): Self = this.set("limit_end", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit_start(value: Date): Self = this.set("limit_start", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit_time_select(value: Boolean): Self = this.set("limit_time_select", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit_view(value: Boolean): Self = this.set("limit_view", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad_date(value: String): Self = this.set("load_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap_end(value: Date): Self = this.set("map_end", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap_error_position(value: js.Any): Self = this.set("map_error_position", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap_infowindow_max_width(value: Double): Self = this.set("map_infowindow_max_width", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap_initial_position(value: js.Any): Self = this.set("map_initial_position", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap_initial_zoom(value: Double): Self = this.set("map_initial_zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap_resolve_event_location(value: Boolean): Self = this.set("map_resolve_event_location", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap_resolve_user_location(value: Boolean): Self = this.set("map_resolve_user_location", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap_start(value: Date): Self = this.set("map_start", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap_type(value: js.Any): Self = this.set("map_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap_zoom_after_resolve(value: Double): Self = this.set("map_zoom_after_resolve", value.asInstanceOf[js.Any])
    @scala.inline
    def setMark_now(value: Boolean): Self = this.set("mark_now", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_month_events(value: Double): Self = this.set("max_month_events", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinicalendar(value: js.Any): Self = this.set("minicalendar", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth_date(value: String): Self = this.set("month_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth_day(value: String): Self = this.set("month_day", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth_day_min_height(value: Double): Self = this.set("month_day_min_height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMulti_day(value: Boolean): Self = this.set("multi_day", value.asInstanceOf[js.Any])
    @scala.inline
    def setMulti_day_height_limit(value: Double | Boolean): Self = this.set("multi_day_height_limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultisection(value: Boolean): Self = this.set("multisection", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultisection_shift_all(value: Boolean): Self = this.set("multisection_shift_all", value.asInstanceOf[js.Any])
    @scala.inline
    def setNow_date(value: Date): Self = this.set("now_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setOccurrence_timestamp_in_utc(value: Boolean): Self = this.set("occurrence_timestamp_in_utc", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositive_closing(value: Boolean): Self = this.set("positive_closing", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserve_length(value: Boolean): Self = this.set("preserve_length", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserve_scroll(value: Boolean): Self = this.set("preserve_scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevent_cache(value: Boolean): Self = this.set("prevent_cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuick_info_detached(value: Boolean): Self = this.set("quick_info_detached", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadonly_form(value: Boolean): Self = this.set("readonly_form", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecurring_workdaysVarargs(value: js.Any*): Self = this.set("recurring_workdays", js.Array(value :_*))
    @scala.inline
    def setRecurring_workdays(value: js.Array[_]): Self = this.set("recurring_workdays", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeat_date(value: String): Self = this.set("repeat_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeat_precise(value: Boolean): Self = this.set("repeat_precise", value.asInstanceOf[js.Any])
    @scala.inline
    def setResize_month_events(value: Boolean): Self = this.set("resize_month_events", value.asInstanceOf[js.Any])
    @scala.inline
    def setResize_month_timed(value: Boolean): Self = this.set("resize_month_timed", value.asInstanceOf[js.Any])
    @scala.inline
    def setScroll_hour(value: Double): Self = this.set("scroll_hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setSection_delemiter(value: String): Self = this.set("section_delemiter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: Boolean): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparate_short_events(value: Boolean): Self = this.set("separate_short_events", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer_utc(value: Boolean): Self = this.set("server_utc", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow_loading(value: Boolean): Self = this.set("show_loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow_quick_info(value: Boolean): Self = this.set("show_quick_info", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_on_monday(value: Boolean): Self = this.set("start_on_monday", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime_step(value: Double): Self = this.set("time_step", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouch(value: Boolean | String): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouch_drag(value: Double | Boolean): Self = this.set("touch_drag", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouch_tip(value: Boolean): Self = this.set("touch_tip", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouch_tooltip(value: Boolean): Self = this.set("touch_tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate_render(value: Boolean): Self = this.set("update_render", value.asInstanceOf[js.Any])
    @scala.inline
    def setUse_select_menu_space(value: Boolean): Self = this.set("use_select_menu_space", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeek_date(value: String): Self = this.set("week_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setWide_form(value: Boolean): Self = this.set("wide_form", value.asInstanceOf[js.Any])
    @scala.inline
    def setXml_date(value: String): Self = this.set("xml_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear_x(value: Double): Self = this.set("year_x", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear_y(value: Double): Self = this.set("year_y", value.asInstanceOf[js.Any])
  }
  
}

