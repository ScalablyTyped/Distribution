package typings.dhtmlxgantt

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttConfigOptions extends StObject {
  
  /**
    * enables auto scheduling
    */
  var auto_scheduling: Boolean
  
  /**
    * allows or forbids creating links from parent tasks (projects) to their children
    */
  var auto_scheduling_descendant_links: Boolean
  
  /**
    * defines whether gantt will do autoscheduling on data loading
    */
  var auto_scheduling_initial: Boolean
  
  /**
    * defines whether the whole project will be moved (see the details below)
    */
  var auto_scheduling_move_projects: Boolean
  
  /**
    * enables the auto scheduling mode, in which tasks will always be rescheduled to the earliest possible date
    */
  var auto_scheduling_strict: Boolean
  
  /**
    * automatically converts tasks with subtasks to projects and projects without subtasks back to tasks
    */
  var auto_types: Boolean
  
  /**
    * enables automatic adjusting of the grid's columns to the grid's width
    */
  var autofit: Boolean
  
  /**
    * enables autoscrolling while dragging a task or link out of the current browser screen
    */
  var autoscroll: Boolean
  
  /**
    * defines the speed of autoscrolling (in ms) while dragging a task or link out of the current browser screen
    */
  var autoscroll_speed: Double
  
  /**
    * forces the Gantt chart to automatically change its size to show all tasks without scrolling
    */
  var autosize: Boolean | String
  
  /**
    * sets the minimum width (in pixels) that the Gantt chart can take in the horizontal 'autosize' mode
    */
  var autosize_min_width: Double
  
  /**
    * enables dynamic loading in the Gantt chart
    */
  var branch_loading: Boolean
  
  /**
    * specifies that the task has children that are not yet loaded from the backend
    */
  var branch_loading_property: String
  
  /**
    * stores a collection of buttons resided in the left bottom corner of the lightbox
    */
  var buttons_left: js.Array[js.Any]
  
  /**
    * stores a collection of buttons resided in the right bottom corner of the lightbox
    */
  var buttons_right: js.Array[js.Any]
  
  /**
    * changes the name of the property that affects binding of a calendar to a task/group of tasks
    */
  var calendar_property: String
  
  /**
    * enables cascade deleting of nested tasks and links
    */
  var cascade_delete: Boolean
  
  /**
    * configures the columns of the table
    */
  var columns: js.Array[js.Any]
  
  /**
    * enables adjusting the task's start and end dates to the work time (while dragging)
    */
  var correct_work_time: Boolean
  
  /**
    * sets the format of dates in the "Start time" column of the table
    */
  var date_grid: String
  
  /**
    * sets the format of the time scale (X-Axis)
    */
  var date_scale: String
  
  /**
    * 'says' to open the lightbox while creating new events by clicking on the '+' button
    */
  var details_on_create: Boolean
  
  /**
    * 'says' to open the lightbox after double clicking on a task
    */
  var details_on_dblclick: Boolean
  
  /**
    * enables the possibility to drag the lightbox by the header
    */
  var drag_lightbox: Boolean
  
  /**
    * enables creating dependency links by drag-and-drop
    */
  var drag_links: Boolean
  
  /**
    * stores the types of available drag-and-drop modes
    */
  var drag_mode: js.Any
  
  /**
    * enables the possibility to move tasks by drag-and-drop
    */
  var drag_move: Boolean
  
  /**
    * enables the possibility to change the task progress by dragging the progress knob
    */
  var drag_progress: Boolean
  
  /**
    * enables drag and drop of items of the project type
    */
  var drag_project: Boolean
  
  /**
    * enables the possibility to resize tasks by drag-and-drop
    */
  var drag_resize: Boolean
  
  /**
    * sets the number of 'gantt.config.duration_unit' units that will correspond to one  unit of the 'duration' data property.
    */
  var duration_step: Double
  
  /**
    * sets the duration unit
    */
  var duration_unit: String
  
  /**
    * changes the name of a property that affects the editing ability  of tasks/links in the read-only Gantt chart
    */
  var editable_property: String
  
  /**
    * an object that contains definitions of inline editors
    */
  var editor_types: js.Any
  
  /**
    * sets the  end value of the time scale
    */
  var end_date: Date
  
  /**
    * 'says' the Gantt chart to re-render the scale each time a task doesn't fit into the existing scale interval
    */
  var fit_tasks: Boolean
  
  /**
    * makes the grid resizable by dragging the right grid's border
    */
  var grid_resize: Boolean
  
  /**
    * sets the name of the attribute  of the grid resizer's  DOM element
    */
  var grid_resizer_attribute: String
  
  /**
    * sets the name of the attribute  of the column resizer's  DOM element. The attribute presents the column's index
    */
  var grid_resizer_column_attribute: String
  
  /**
    * sets the width of the grid
    */
  var grid_width: Double
  
  /**
    * shows the critical path in the chart
    */
  var highlight_critical_path: Boolean
  
  /**
    * specifies whether sub-scales shall use the scale_cell_class template by default
    */
  var inherit_scale_class: Boolean
  
  /**
    * sets whether the timeline area will be initially scrolled to display the earliest task
    */
  var initial_scroll: Boolean
  
  /**
    * 'says' to preserve the initial grid's width while resizing columns within
    */
  var keep_grid_width: Boolean
  
  /**
    * enables keyboard navigation in gantt
    */
  var keyboard_navigation: Boolean
  
  /**
    * enables keyboard navigation by cells
    */
  var keyboard_navigation_cells: Boolean
  
  /**
    * sets the name of the attribute of the task layer's DOM element
    */
  var layer_attribute: String
  
  /**
    * specifies the layout object
    */
  var layout: js.Any
  
  /**
    * specifies the lightbox object
    */
  var lightbox: js.Any
  
  /**
    * increases the height of the lightbox
    */
  var lightbox_additional_height: Double
  
  /**
    * sets the size of the link arrow
    */
  var link_arrow_size: Double
  
  /**
    * sets the name of the attribute that will specify the id of the link's HTML element
    */
  var link_attribute: String
  
  /**
    * sets the width of dependency links in the timeline area
    */
  var link_line_width: Double
  
  /**
    * sets the width of the area (over the link) sensitive to clicks
    */
  var link_wrapper_width: Double
  
  /**
    * stores the types of links dependencies
    */
  var links: js.Any
  
  /**
    * sets the minimum width for a column in the timeline area
    */
  var min_column_width: Double
  
  /**
    * Sets the minimum duration (in milliseconds) that can be set for a task during resizing.
    */
  var min_duration: Double
  
  /**
    * sets the minumum width for the grid (in pixels) while being resized
    */
  var min_grid_column_width: Double
  
  /**
    * enables/disables multi-task selection in the Gantt chart
    */
  var multiselect: Boolean
  
  /**
    * specifies whether multi-task selection will be available within one or any level
    */
  var multiselect_one_level: Boolean
  
  /**
    * openes all branches initially
    */
  var open_tree_initially: Boolean
  
  /**
    * activates the 'branch' mode that allows reordering tasks within the same nesting level
    */
  var order_branch: String | Boolean
  
  /**
    * activates the 'branch' mode that allows reordering tasks within the whole gantt
    */
  var order_branch_free: Boolean
  
  /**
    * adds an empty row into the end of the list of tasks to simplify tasks editing via keyboard
    */
  var placeholder_task: Boolean
  
  /**
    * preserves the current position of the vertical and horizontal scrolls while re-drawing the gantt chart
    */
  var preserve_scroll: Boolean
  
  /**
    * specifies whether the gantt container should block the mousewheel event, or should it be propagated up to the window element
    */
  var prevent_default_scroll: Boolean
  
  /**
    * defines whether the task form will appear from the left/right side of the screen or near the selected task
    */
  var quick_info_detached: Boolean
  
  /**
    * stores a collection of buttons resided in the pop-up task's details form
    */
  var quickinfo_buttons: js.Array[js.Any]
  
  /**
    * activates the read-only mode for the Gantt chart
    */
  var readonly: Boolean
  
  /**
    * changes the name of a property that affects the read-only behaviour of tasks/links
    */
  var readonly_property: String
  
  /**
    * enables the Redo functionality for the gantt
    */
  var redo: Boolean
  
  /**
    * defines a set of working calendars that can be assigned to a specific resource, e.g. a user
    */
  var resource_calendars: js.Any
  
  /**
    * defines the property of a task object that stores a resource id associated with resourceGrid/Timeline/Histogram
    */
  var resource_property: String
  
  /**
    * tells the resource timeline to render elements and call templates for non-allocated cells
    */
  var resource_render_empty_cells: Boolean
  
  /**
    * specifies the name of the dataStore connected to the resourceGrid/resourceTimeline/resourceHistogram views
    */
  var resource_store: String
  
  /**
    * sets the id of the virtual root element
    */
  var root_id: String | Double
  
  /**
    * enables rounding the task's start and end dates to the nearest scale marks
    */
  var round_dnd_dates: Boolean
  
  /**
    * sets the default height for rows of the table
    */
  var row_height: Double
  
  /**
    * switches gantt to the right-to-left mode
    */
  var rtl: Boolean
  
  /**
    * sets the height of the time scale and the header of the grid
    */
  var scale_height: Double
  
  /**
    * sets the minimal scale unit (in case multiple scales are used) as the interval of leading/closing empty space
    */
  var scale_offset_minimal: Boolean
  
  /**
    * sets the unit of the time scale (X-Axis)
    */
  var scale_unit: String
  
  /**
    * specifies whether the timeline area shall be scrolled while selecting to display the selected task
    */
  var scroll_on_click: Boolean
  
  /**
    * set the sizes of the vertical (width) and horizontal (height) scrolls
    */
  var scroll_size: Double
  
  /**
    * enables selection of tasks in the Gantt chart
    */
  var select_task: Boolean
  
  /**
    * enables converting server-side dates from UTC to a local time zone (and backward) while sending data to the server
    */
  var server_utc: Boolean
  
  /**
    * shows the chart (timeline) area of the Gantt chart
    */
  var show_chart: Boolean
  
  /**
    * enables showing error alerts in case of unexpected behavior
    */
  var show_errors: Boolean
  
  /**
    * shows the grid area of the Gantt chart
    */
  var show_grid: Boolean
  
  /**
    * enables/disables displaying links in the Gantt chart
    */
  var show_links: Boolean
  
  /**
    * shows/hides markers on the page
    */
  var show_markers: Boolean
  
  /**
    * enables displaying of the progress inside the task bars
    */
  var show_progress: Boolean
  
  /**
    * activates/disables the 'quick_info' extension (pop-up task's details form)
    */
  var show_quick_info: Boolean
  
  /**
    * enables/disables displaying column borders in the chart area
    */
  var show_task_cells: Boolean
  
  /**
    * enables showing unscheduled tasks
    */
  var show_unscheduled: Boolean
  
  /**
    * hides non-working time from the time scale
    */
  var skip_off_time: Boolean
  
  /**
    * enables the smart rendering mode for gantt's tasks and links rendering
    */
  var smart_rendering: Boolean
  
  /**
    * specifies that only visible part of the time scale is rendered on the screen
    */
  var smart_scales: Boolean
  
  /**
    * enables sorting in the table
    */
  var sort: Boolean
  
  /**
    * sets the start value of the time scale
    */
  var start_date: Date
  
  /**
    * sets the starting day of the week
    */
  var start_on_monday: Boolean
  
  /**
    * generates a background image for the timeline area instead of rendering actual columns' and rows' lines
    */
  var static_background: Boolean
  
  /**
    * sets the step of the time scale (X-Axis)
    */
  var step: Double
  
  /**
    * specifies the second time scale(s)
    */
  var subscales: js.Array[js.Any]
  
  /**
    * sets the name of the attribute that will specify the id of the task's HTML element
    */
  var task_attribute: String
  
  /**
    * sets the format of the date label in the 'Time period' section of the lightbox
    */
  var task_date: String
  
  /**
    * sets the height of task bars in the timeline area
    */
  var task_height: Double
  
  /**
    * sets the offset (in pixels) of the nearest task from the left border in the timeline
    */
  var task_scroll_offset: Double
  
  /**
    * sets the format of the time drop-down selector in the lightbox
    */
  var time_picker: String
  
  /**
    * sets the minimum step (in minutes) for the task's time values
    */
  var time_step: Double
  
  /**
    * sets the length of time, in milliseconds, before the tooltip hides
    */
  var tooltip_hide_timeout: Double
  
  /**
    * sets the right (if positive) offset of the tooltip's position
    */
  var tooltip_offset_x: Double
  
  /**
    * sets the top (if positive) offset of the tooltip's position
    */
  var tooltip_offset_y: Double
  
  /**
    * sets the timeout in milliseconds before the tooltip is displayed for a task
    */
  var tooltip_timeout: Double
  
  /**
    * enables/disables the touch support for the Gantt chart
    */
  var touch: Boolean | String
  
  /**
    * defines the time period in milliseconds that is used to differ the long touch gesture from the scroll gesture
    */
  var touch_drag: Double | Boolean
  
  /**
    * returns vibration feedback before/after drag and drop on touch devices
    */
  var touch_feedback: Boolean
  
  /**
    * defines the duration of vibration feedback before/after drag and drop on touch devices (in milliseconds)
    */
  var touch_feedback_duration: Double
  
  /**
    * redefines functions responsible for displaying different types of tasks
    */
  var type_renderers: js.Any
  
  /**
    * stores the names of lightbox's structures (used for different types of tasks)
    */
  var types: js.Any
  
  /**
    * enables the Undo functionality for the gantt
    */
  var undo: Boolean
  
  /**
    * sets the actions that the Undo operation will revert
    */
  var undo_actions: js.Any
  
  /**
    * sets the number of steps that should be reverted by the undo method
    */
  var undo_steps: Double
  
  /**
    * sets the types of entities for which the Undo operation will be applied
    */
  var undo_types: js.Any
  
  /**
    * enables WAI-ARIA support to make the component recognizable for screen readers
    */
  var wai_aria_attributes: Boolean
  
  /**
    * enables calculating the duration of tasks in working time instead of calendar time
    */
  var work_time: Boolean
  
  /**
    * defines date formats that are used to parse data from a data set and to send data to a server
    */
  var xml_date: String
}
object GanttConfigOptions {
  
  @scala.inline
  def apply(
    auto_scheduling: Boolean,
    auto_scheduling_descendant_links: Boolean,
    auto_scheduling_initial: Boolean,
    auto_scheduling_move_projects: Boolean,
    auto_scheduling_strict: Boolean,
    auto_types: Boolean,
    autofit: Boolean,
    autoscroll: Boolean,
    autoscroll_speed: Double,
    autosize: Boolean | String,
    autosize_min_width: Double,
    branch_loading: Boolean,
    branch_loading_property: String,
    buttons_left: js.Array[js.Any],
    buttons_right: js.Array[js.Any],
    calendar_property: String,
    cascade_delete: Boolean,
    columns: js.Array[js.Any],
    correct_work_time: Boolean,
    date_grid: String,
    date_scale: String,
    details_on_create: Boolean,
    details_on_dblclick: Boolean,
    drag_lightbox: Boolean,
    drag_links: Boolean,
    drag_mode: js.Any,
    drag_move: Boolean,
    drag_progress: Boolean,
    drag_project: Boolean,
    drag_resize: Boolean,
    duration_step: Double,
    duration_unit: String,
    editable_property: String,
    editor_types: js.Any,
    end_date: Date,
    fit_tasks: Boolean,
    grid_resize: Boolean,
    grid_resizer_attribute: String,
    grid_resizer_column_attribute: String,
    grid_width: Double,
    highlight_critical_path: Boolean,
    inherit_scale_class: Boolean,
    initial_scroll: Boolean,
    keep_grid_width: Boolean,
    keyboard_navigation: Boolean,
    keyboard_navigation_cells: Boolean,
    layer_attribute: String,
    layout: js.Any,
    lightbox: js.Any,
    lightbox_additional_height: Double,
    link_arrow_size: Double,
    link_attribute: String,
    link_line_width: Double,
    link_wrapper_width: Double,
    links: js.Any,
    min_column_width: Double,
    min_duration: Double,
    min_grid_column_width: Double,
    multiselect: Boolean,
    multiselect_one_level: Boolean,
    open_tree_initially: Boolean,
    order_branch: String | Boolean,
    order_branch_free: Boolean,
    placeholder_task: Boolean,
    preserve_scroll: Boolean,
    prevent_default_scroll: Boolean,
    quick_info_detached: Boolean,
    quickinfo_buttons: js.Array[js.Any],
    readonly: Boolean,
    readonly_property: String,
    redo: Boolean,
    resource_calendars: js.Any,
    resource_property: String,
    resource_render_empty_cells: Boolean,
    resource_store: String,
    root_id: String | Double,
    round_dnd_dates: Boolean,
    row_height: Double,
    rtl: Boolean,
    scale_height: Double,
    scale_offset_minimal: Boolean,
    scale_unit: String,
    scroll_on_click: Boolean,
    scroll_size: Double,
    select_task: Boolean,
    server_utc: Boolean,
    show_chart: Boolean,
    show_errors: Boolean,
    show_grid: Boolean,
    show_links: Boolean,
    show_markers: Boolean,
    show_progress: Boolean,
    show_quick_info: Boolean,
    show_task_cells: Boolean,
    show_unscheduled: Boolean,
    skip_off_time: Boolean,
    smart_rendering: Boolean,
    smart_scales: Boolean,
    sort: Boolean,
    start_date: Date,
    start_on_monday: Boolean,
    static_background: Boolean,
    step: Double,
    subscales: js.Array[js.Any],
    task_attribute: String,
    task_date: String,
    task_height: Double,
    task_scroll_offset: Double,
    time_picker: String,
    time_step: Double,
    tooltip_hide_timeout: Double,
    tooltip_offset_x: Double,
    tooltip_offset_y: Double,
    tooltip_timeout: Double,
    touch: Boolean | String,
    touch_drag: Double | Boolean,
    touch_feedback: Boolean,
    touch_feedback_duration: Double,
    type_renderers: js.Any,
    types: js.Any,
    undo: Boolean,
    undo_actions: js.Any,
    undo_steps: Double,
    undo_types: js.Any,
    wai_aria_attributes: Boolean,
    work_time: Boolean,
    xml_date: String
  ): GanttConfigOptions = {
    val __obj = js.Dynamic.literal(auto_scheduling = auto_scheduling.asInstanceOf[js.Any], auto_scheduling_descendant_links = auto_scheduling_descendant_links.asInstanceOf[js.Any], auto_scheduling_initial = auto_scheduling_initial.asInstanceOf[js.Any], auto_scheduling_move_projects = auto_scheduling_move_projects.asInstanceOf[js.Any], auto_scheduling_strict = auto_scheduling_strict.asInstanceOf[js.Any], auto_types = auto_types.asInstanceOf[js.Any], autofit = autofit.asInstanceOf[js.Any], autoscroll = autoscroll.asInstanceOf[js.Any], autoscroll_speed = autoscroll_speed.asInstanceOf[js.Any], autosize = autosize.asInstanceOf[js.Any], autosize_min_width = autosize_min_width.asInstanceOf[js.Any], branch_loading = branch_loading.asInstanceOf[js.Any], branch_loading_property = branch_loading_property.asInstanceOf[js.Any], buttons_left = buttons_left.asInstanceOf[js.Any], buttons_right = buttons_right.asInstanceOf[js.Any], calendar_property = calendar_property.asInstanceOf[js.Any], cascade_delete = cascade_delete.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], correct_work_time = correct_work_time.asInstanceOf[js.Any], date_grid = date_grid.asInstanceOf[js.Any], date_scale = date_scale.asInstanceOf[js.Any], details_on_create = details_on_create.asInstanceOf[js.Any], details_on_dblclick = details_on_dblclick.asInstanceOf[js.Any], drag_lightbox = drag_lightbox.asInstanceOf[js.Any], drag_links = drag_links.asInstanceOf[js.Any], drag_mode = drag_mode.asInstanceOf[js.Any], drag_move = drag_move.asInstanceOf[js.Any], drag_progress = drag_progress.asInstanceOf[js.Any], drag_project = drag_project.asInstanceOf[js.Any], drag_resize = drag_resize.asInstanceOf[js.Any], duration_step = duration_step.asInstanceOf[js.Any], duration_unit = duration_unit.asInstanceOf[js.Any], editable_property = editable_property.asInstanceOf[js.Any], editor_types = editor_types.asInstanceOf[js.Any], end_date = end_date.asInstanceOf[js.Any], fit_tasks = fit_tasks.asInstanceOf[js.Any], grid_resize = grid_resize.asInstanceOf[js.Any], grid_resizer_attribute = grid_resizer_attribute.asInstanceOf[js.Any], grid_resizer_column_attribute = grid_resizer_column_attribute.asInstanceOf[js.Any], grid_width = grid_width.asInstanceOf[js.Any], highlight_critical_path = highlight_critical_path.asInstanceOf[js.Any], inherit_scale_class = inherit_scale_class.asInstanceOf[js.Any], initial_scroll = initial_scroll.asInstanceOf[js.Any], keep_grid_width = keep_grid_width.asInstanceOf[js.Any], keyboard_navigation = keyboard_navigation.asInstanceOf[js.Any], keyboard_navigation_cells = keyboard_navigation_cells.asInstanceOf[js.Any], layer_attribute = layer_attribute.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], lightbox = lightbox.asInstanceOf[js.Any], lightbox_additional_height = lightbox_additional_height.asInstanceOf[js.Any], link_arrow_size = link_arrow_size.asInstanceOf[js.Any], link_attribute = link_attribute.asInstanceOf[js.Any], link_line_width = link_line_width.asInstanceOf[js.Any], link_wrapper_width = link_wrapper_width.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], min_column_width = min_column_width.asInstanceOf[js.Any], min_duration = min_duration.asInstanceOf[js.Any], min_grid_column_width = min_grid_column_width.asInstanceOf[js.Any], multiselect = multiselect.asInstanceOf[js.Any], multiselect_one_level = multiselect_one_level.asInstanceOf[js.Any], open_tree_initially = open_tree_initially.asInstanceOf[js.Any], order_branch = order_branch.asInstanceOf[js.Any], order_branch_free = order_branch_free.asInstanceOf[js.Any], placeholder_task = placeholder_task.asInstanceOf[js.Any], preserve_scroll = preserve_scroll.asInstanceOf[js.Any], prevent_default_scroll = prevent_default_scroll.asInstanceOf[js.Any], quick_info_detached = quick_info_detached.asInstanceOf[js.Any], quickinfo_buttons = quickinfo_buttons.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], readonly_property = readonly_property.asInstanceOf[js.Any], redo = redo.asInstanceOf[js.Any], resource_calendars = resource_calendars.asInstanceOf[js.Any], resource_property = resource_property.asInstanceOf[js.Any], resource_render_empty_cells = resource_render_empty_cells.asInstanceOf[js.Any], resource_store = resource_store.asInstanceOf[js.Any], root_id = root_id.asInstanceOf[js.Any], round_dnd_dates = round_dnd_dates.asInstanceOf[js.Any], row_height = row_height.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], scale_height = scale_height.asInstanceOf[js.Any], scale_offset_minimal = scale_offset_minimal.asInstanceOf[js.Any], scale_unit = scale_unit.asInstanceOf[js.Any], scroll_on_click = scroll_on_click.asInstanceOf[js.Any], scroll_size = scroll_size.asInstanceOf[js.Any], select_task = select_task.asInstanceOf[js.Any], server_utc = server_utc.asInstanceOf[js.Any], show_chart = show_chart.asInstanceOf[js.Any], show_errors = show_errors.asInstanceOf[js.Any], show_grid = show_grid.asInstanceOf[js.Any], show_links = show_links.asInstanceOf[js.Any], show_markers = show_markers.asInstanceOf[js.Any], show_progress = show_progress.asInstanceOf[js.Any], show_quick_info = show_quick_info.asInstanceOf[js.Any], show_task_cells = show_task_cells.asInstanceOf[js.Any], show_unscheduled = show_unscheduled.asInstanceOf[js.Any], skip_off_time = skip_off_time.asInstanceOf[js.Any], smart_rendering = smart_rendering.asInstanceOf[js.Any], smart_scales = smart_scales.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], start_date = start_date.asInstanceOf[js.Any], start_on_monday = start_on_monday.asInstanceOf[js.Any], static_background = static_background.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], subscales = subscales.asInstanceOf[js.Any], task_attribute = task_attribute.asInstanceOf[js.Any], task_date = task_date.asInstanceOf[js.Any], task_height = task_height.asInstanceOf[js.Any], task_scroll_offset = task_scroll_offset.asInstanceOf[js.Any], time_picker = time_picker.asInstanceOf[js.Any], time_step = time_step.asInstanceOf[js.Any], tooltip_hide_timeout = tooltip_hide_timeout.asInstanceOf[js.Any], tooltip_offset_x = tooltip_offset_x.asInstanceOf[js.Any], tooltip_offset_y = tooltip_offset_y.asInstanceOf[js.Any], tooltip_timeout = tooltip_timeout.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], touch_drag = touch_drag.asInstanceOf[js.Any], touch_feedback = touch_feedback.asInstanceOf[js.Any], touch_feedback_duration = touch_feedback_duration.asInstanceOf[js.Any], type_renderers = type_renderers.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any], undo_actions = undo_actions.asInstanceOf[js.Any], undo_steps = undo_steps.asInstanceOf[js.Any], undo_types = undo_types.asInstanceOf[js.Any], wai_aria_attributes = wai_aria_attributes.asInstanceOf[js.Any], work_time = work_time.asInstanceOf[js.Any], xml_date = xml_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttConfigOptions]
  }
  
  @scala.inline
  implicit class GanttConfigOptionsMutableBuilder[Self <: GanttConfigOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto_scheduling(value: Boolean): Self = StObject.set(x, "auto_scheduling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_scheduling_descendant_links(value: Boolean): Self = StObject.set(x, "auto_scheduling_descendant_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_scheduling_initial(value: Boolean): Self = StObject.set(x, "auto_scheduling_initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_scheduling_move_projects(value: Boolean): Self = StObject.set(x, "auto_scheduling_move_projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_scheduling_strict(value: Boolean): Self = StObject.set(x, "auto_scheduling_strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_types(value: Boolean): Self = StObject.set(x, "auto_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofit(value: Boolean): Self = StObject.set(x, "autofit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscroll(value: Boolean): Self = StObject.set(x, "autoscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscroll_speed(value: Double): Self = StObject.set(x, "autoscroll_speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosize(value: Boolean | String): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosize_min_width(value: Double): Self = StObject.set(x, "autosize_min_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranch_loading(value: Boolean): Self = StObject.set(x, "branch_loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranch_loading_property(value: String): Self = StObject.set(x, "branch_loading_property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons_left(value: js.Array[js.Any]): Self = StObject.set(x, "buttons_left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons_leftVarargs(value: js.Any*): Self = StObject.set(x, "buttons_left", js.Array(value :_*))
    
    @scala.inline
    def setButtons_right(value: js.Array[js.Any]): Self = StObject.set(x, "buttons_right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons_rightVarargs(value: js.Any*): Self = StObject.set(x, "buttons_right", js.Array(value :_*))
    
    @scala.inline
    def setCalendar_property(value: String): Self = StObject.set(x, "calendar_property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascade_delete(value: Boolean): Self = StObject.set(x, "cascade_delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns(value: js.Array[js.Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: js.Any*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCorrect_work_time(value: Boolean): Self = StObject.set(x, "correct_work_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate_grid(value: String): Self = StObject.set(x, "date_grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate_scale(value: String): Self = StObject.set(x, "date_scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails_on_create(value: Boolean): Self = StObject.set(x, "details_on_create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails_on_dblclick(value: Boolean): Self = StObject.set(x, "details_on_dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrag_lightbox(value: Boolean): Self = StObject.set(x, "drag_lightbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrag_links(value: Boolean): Self = StObject.set(x, "drag_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrag_mode(value: js.Any): Self = StObject.set(x, "drag_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrag_move(value: Boolean): Self = StObject.set(x, "drag_move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrag_progress(value: Boolean): Self = StObject.set(x, "drag_progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrag_project(value: Boolean): Self = StObject.set(x, "drag_project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrag_resize(value: Boolean): Self = StObject.set(x, "drag_resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration_step(value: Double): Self = StObject.set(x, "duration_step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration_unit(value: String): Self = StObject.set(x, "duration_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditable_property(value: String): Self = StObject.set(x, "editable_property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor_types(value: js.Any): Self = StObject.set(x, "editor_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_date(value: Date): Self = StObject.set(x, "end_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFit_tasks(value: Boolean): Self = StObject.set(x, "fit_tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrid_resize(value: Boolean): Self = StObject.set(x, "grid_resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrid_resizer_attribute(value: String): Self = StObject.set(x, "grid_resizer_attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrid_resizer_column_attribute(value: String): Self = StObject.set(x, "grid_resizer_column_attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrid_width(value: Double): Self = StObject.set(x, "grid_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight_critical_path(value: Boolean): Self = StObject.set(x, "highlight_critical_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherit_scale_class(value: Boolean): Self = StObject.set(x, "inherit_scale_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitial_scroll(value: Boolean): Self = StObject.set(x, "initial_scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeep_grid_width(value: Boolean): Self = StObject.set(x, "keep_grid_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboard_navigation(value: Boolean): Self = StObject.set(x, "keyboard_navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboard_navigation_cells(value: Boolean): Self = StObject.set(x, "keyboard_navigation_cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer_attribute(value: String): Self = StObject.set(x, "layer_attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: js.Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightbox(value: js.Any): Self = StObject.set(x, "lightbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightbox_additional_height(value: Double): Self = StObject.set(x, "lightbox_additional_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_arrow_size(value: Double): Self = StObject.set(x, "link_arrow_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_attribute(value: String): Self = StObject.set(x, "link_attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_line_width(value: Double): Self = StObject.set(x, "link_line_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_wrapper_width(value: Double): Self = StObject.set(x, "link_wrapper_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: js.Any): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_column_width(value: Double): Self = StObject.set(x, "min_column_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_duration(value: Double): Self = StObject.set(x, "min_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_grid_column_width(value: Double): Self = StObject.set(x, "min_grid_column_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiselect_one_level(value: Boolean): Self = StObject.set(x, "multiselect_one_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen_tree_initially(value: Boolean): Self = StObject.set(x, "open_tree_initially", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder_branch(value: String | Boolean): Self = StObject.set(x, "order_branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder_branch_free(value: Boolean): Self = StObject.set(x, "order_branch_free", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder_task(value: Boolean): Self = StObject.set(x, "placeholder_task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserve_scroll(value: Boolean): Self = StObject.set(x, "preserve_scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevent_default_scroll(value: Boolean): Self = StObject.set(x, "prevent_default_scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuick_info_detached(value: Boolean): Self = StObject.set(x, "quick_info_detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickinfo_buttons(value: js.Array[js.Any]): Self = StObject.set(x, "quickinfo_buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickinfo_buttonsVarargs(value: js.Any*): Self = StObject.set(x, "quickinfo_buttons", js.Array(value :_*))
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly_property(value: String): Self = StObject.set(x, "readonly_property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedo(value: Boolean): Self = StObject.set(x, "redo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource_calendars(value: js.Any): Self = StObject.set(x, "resource_calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource_property(value: String): Self = StObject.set(x, "resource_property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource_render_empty_cells(value: Boolean): Self = StObject.set(x, "resource_render_empty_cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource_store(value: String): Self = StObject.set(x, "resource_store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot_id(value: String | Double): Self = StObject.set(x, "root_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRound_dnd_dates(value: Boolean): Self = StObject.set(x, "round_dnd_dates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow_height(value: Double): Self = StObject.set(x, "row_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale_height(value: Double): Self = StObject.set(x, "scale_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale_offset_minimal(value: Boolean): Self = StObject.set(x, "scale_offset_minimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale_unit(value: String): Self = StObject.set(x, "scale_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll_on_click(value: Boolean): Self = StObject.set(x, "scroll_on_click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll_size(value: Double): Self = StObject.set(x, "scroll_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect_task(value: Boolean): Self = StObject.set(x, "select_task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer_utc(value: Boolean): Self = StObject.set(x, "server_utc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_chart(value: Boolean): Self = StObject.set(x, "show_chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_errors(value: Boolean): Self = StObject.set(x, "show_errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_grid(value: Boolean): Self = StObject.set(x, "show_grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_links(value: Boolean): Self = StObject.set(x, "show_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_markers(value: Boolean): Self = StObject.set(x, "show_markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_progress(value: Boolean): Self = StObject.set(x, "show_progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_quick_info(value: Boolean): Self = StObject.set(x, "show_quick_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_task_cells(value: Boolean): Self = StObject.set(x, "show_task_cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_unscheduled(value: Boolean): Self = StObject.set(x, "show_unscheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip_off_time(value: Boolean): Self = StObject.set(x, "skip_off_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmart_rendering(value: Boolean): Self = StObject.set(x, "smart_rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmart_scales(value: Boolean): Self = StObject.set(x, "smart_scales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_date(value: Date): Self = StObject.set(x, "start_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_on_monday(value: Boolean): Self = StObject.set(x, "start_on_monday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic_background(value: Boolean): Self = StObject.set(x, "static_background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscales(value: js.Array[js.Any]): Self = StObject.set(x, "subscales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscalesVarargs(value: js.Any*): Self = StObject.set(x, "subscales", js.Array(value :_*))
    
    @scala.inline
    def setTask_attribute(value: String): Self = StObject.set(x, "task_attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask_date(value: String): Self = StObject.set(x, "task_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask_height(value: Double): Self = StObject.set(x, "task_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask_scroll_offset(value: Double): Self = StObject.set(x, "task_scroll_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_picker(value: String): Self = StObject.set(x, "time_picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_step(value: Double): Self = StObject.set(x, "time_step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip_hide_timeout(value: Double): Self = StObject.set(x, "tooltip_hide_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip_offset_x(value: Double): Self = StObject.set(x, "tooltip_offset_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip_offset_y(value: Double): Self = StObject.set(x, "tooltip_offset_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip_timeout(value: Double): Self = StObject.set(x, "tooltip_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch(value: Boolean | String): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch_drag(value: Double | Boolean): Self = StObject.set(x, "touch_drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch_feedback(value: Boolean): Self = StObject.set(x, "touch_feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch_feedback_duration(value: Double): Self = StObject.set(x, "touch_feedback_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType_renderers(value: js.Any): Self = StObject.set(x, "type_renderers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Any): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndo(value: Boolean): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndo_actions(value: js.Any): Self = StObject.set(x, "undo_actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndo_steps(value: Double): Self = StObject.set(x, "undo_steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndo_types(value: js.Any): Self = StObject.set(x, "undo_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWai_aria_attributes(value: Boolean): Self = StObject.set(x, "wai_aria_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWork_time(value: Boolean): Self = StObject.set(x, "work_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXml_date(value: String): Self = StObject.set(x, "xml_date", value.asInstanceOf[js.Any])
  }
}
