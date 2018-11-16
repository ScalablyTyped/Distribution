package typings
package dhtmlxganttLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GanttConfigOptions extends js.Object {
  /**
  	 * sets the date format for addTask() method to
  	*/
  var api_date: java.lang.String
  /**
  	 * enables auto scheduling
  	*/
  var auto_scheduling: scala.Boolean
  /**
  	 * allows or forbids creation of links from parent tasks (projects) to their children
  	*/
  var auto_scheduling_descendant_links: scala.Boolean
  /**
  	 * defines whether gantt will do autoscheduling on data loading
  	*/
  var auto_scheduling_initial: scala.Boolean
  /**
  	 * enables the auto scheduling mode, in which tasks will always be rescheduled to the earliest possible date
  	*/
  var auto_scheduling_strict: scala.Boolean
  /**
  	 * enables automatic adjusting of the grid's columns to the grid's width
  	*/
  var autofit: scala.Boolean
  /**
  	 * forces the Gantt chart to automatically change its size to show all tasks without scrolling
  	*/
  var autosize: scala.Boolean | java.lang.String
  /**
  	 * sets the minimum width (in pixels) that the Gantt chart can take in the horizontal 'autosize' mode
  	*/
  var autosize_min_width: scala.Double
  /**
  	 * enables the dynamic loading in the Gantt chart
  	*/
  var branch_loading: scala.Boolean
  /**
  	 * stores a collection of buttons resided in the left bottom corner of the lightbox
  	*/
  var buttons_left: js.Array[_]
  /**
  	 * stores a collection of buttons resided in the right bottom corner of the lightbox
  	*/
  var buttons_right: js.Array[_]
  /**
  	 * configures the columns of the table
  	*/
  var columns: js.Array[_]
  /**
  	 * enables adjusting the task's start and end dates to the work time (while dragging)
  	*/
  var correct_work_time: scala.Boolean
  /**
  	 * sets the format of dates in the "Start time" column of the table
  	*/
  var date_grid: java.lang.String
  /**
  	 * sets the format of the time scale (X-Axis)
  	*/
  var date_scale: java.lang.String
  /**
  	 * 'says' to open the lightbox while creating new events by clicking on the '+' button
  	*/
  var details_on_create: scala.Boolean
  /**
  	 * 'says' to open the lightbox after double clicking on a task
  	*/
  var details_on_dblclick: scala.Boolean
  /**
  	 * enables the possibility to drag the lightbox by the header
  	*/
  var drag_lightbox: scala.Boolean
  /**
  	 * enables creating dependency links by drag-and-drop
  	*/
  var drag_links: scala.Boolean
  /**
  	 * stores the types of available drag-and-drop modes
  	*/
  var drag_mode: js.Any
  /**
  	 * enables the possibility to move tasks by drag-and-drop
  	*/
  var drag_move: scala.Boolean
  /**
  	 * enables the possibility to change the task progress by dragging the progress knob
  	*/
  var drag_progress: scala.Boolean
  /**
  	 * enables the possibility to resize tasks by drag-and-drop
  	*/
  var drag_resize: scala.Boolean
  /**
  	 * sets the number of 'gantt.config.duration_unit' units that will correspond to one  unit of the 'duration' data property.
  	*/
  var duration_step: scala.Double
  /**
  	 * sets the duration unit
  	*/
  var duration_unit: java.lang.String
  /**
  	 * changes the name of a property that affects the editing ability  of tasks/links in the read-only Gantt chart
  	*/
  var editable_property: java.lang.String
  /**
  	 * sets the  end value of the time scale
  	*/
  var end_date: stdLib.Date
  /**
  	 * 'says' the Gantt chart to re-render the scale each time a task doesn't fit into the existing scale interval
  	*/
  var fit_tasks: scala.Boolean
  /**
  	 * makes the grid resizable by dragging the right grid's border
  	*/
  var grid_resize: scala.Boolean
  /**
  	 * sets the name of the attribute  of the grid resizer's  DOM element
  	*/
  var grid_resizer_attribute: java.lang.String
  /**
  	 * sets the name of the attribute  of the column resizer's  DOM element. The attribute presents the column's index
  	*/
  var grid_resizer_column_attribute: java.lang.String
  /**
  	 * sets the maximum width of the grid
  	*/
  var grid_width: scala.Double
  /**
  	 * shows the critical path in the chart
  	*/
  var highlight_critical_path: scala.Boolean
  /**
  	 * specifies whether sub-scales shall use the scale_cell_class template by default
  	*/
  var inherit_scale_class: scala.Boolean
  /**
  	 * sets whether the timeline area will be initially scrolled to display the earliest task
  	*/
  var initial_scroll: scala.Boolean
  /**
  	 * 'says' to preserve the initial grid's width during resizing the columns within
  	*/
  var keep_grid_width: scala.Boolean
  /**
  	 * sets the name of the attribute of the task layer's DOM element
  	*/
  var layer_attribute: java.lang.String
  /**
  	 * specifies the lightbox object
  	*/
  var lightbox: js.Any
  /**
  	 * increases the height of the lightbox
  	*/
  var lightbox_additional_height: scala.Double
  /**
  	 * sets the size of the link arrow
  	*/
  var link_arrow_size: scala.Double
  /**
  	 * sets the name of the attribute that will specify the id of the link's HTML element
  	*/
  var link_attribute: java.lang.String
  /**
  	 * sets the width of dependency links in the timeline area
  	*/
  var link_line_width: scala.Double
  /**
  	 * sets the width of the area (over the link) sensitive to clicks
  	*/
  var link_wrapper_width: scala.Double
  /**
  	 * stores the types of links dependencies
  	*/
  var links: js.Any
  /**
  	 * sets the minimum width for a column in the timeline area
  	*/
  var min_column_width: scala.Double
  /**
  	 * sets the minimum step (in milliseconds) for task's time values
  	*/
  var min_duration: scala.Double
  /**
  	 * sets the minumum width for the grid (in pixels) while being resized
  	*/
  var min_grid_column_width: scala.Double
  /**
  	 * enables/disables multi-task selection in the Gantt chart
  	*/
  var multiselect: scala.Boolean
  /**
  	 * specifies whether multi-task selection will be available within one or any level
  	*/
  var multiselect_one_level: scala.Boolean
  /**
  	 * openes all branches initially
  	*/
  var open_tree_initially: scala.Boolean
  /**
  	 * activates the 'branch' mode that allows dragging tasks only within the parent branch
  	*/
  var order_branch: scala.Boolean
  /**
  	 * activates the 'branch' mode that allows dragging tasks within the whole gantt
  	*/
  var order_branch_free: scala.Boolean
  /**
  	 * preserves the current position of the vertical and horizontal scrolls while re-drawing the gantt chart
  	*/
  var preserve_scroll: scala.Boolean
  /**
  	 * specifies whether the gantt container should block the mousewheel event, or should it be propagated up to the window element
  	*/
  var prevent_default_scroll: scala.Boolean
  /**
  	 * defines whether the task form will appear from the left/right side of the screen or near the selected task
  	*/
  var quick_info_detached: scala.Boolean
  /**
  	 * stores a collection of buttons resided in the pop-up task's details form
  	*/
  var quickinfo_buttons: js.Array[_]
  /**
  	 * activates the read-only mode for the Gantt chart
  	*/
  var readonly: scala.Boolean
  /**
  	 * changes the name of a property that affects the read-only behaviour of tasks/links
  	*/
  var readonly_property: java.lang.String
  /**
  	 * enables the Redo functionality for the gantt
  	*/
  var redo: scala.Boolean
  /**
  	 * sets the id of the virtual root element
  	*/
  var root_id: java.lang.String | scala.Double
  /**
  	 * enables rounding the task's start and end dates to the nearest scale marks
  	*/
  var round_dnd_dates: scala.Boolean
  /**
  	 * sets the default height for rows of the table
  	*/
  var row_height: scala.Double
  /**
  	 * sets the height of the time scale and the header of the grid
  	*/
  var scale_height: scala.Double
  /**
  	 * sets the minimal scale unit (in case multiple scales are used) as the interval of leading/closing empty space
  	*/
  var scale_offset_minimal: scala.Boolean
  /**
  	 * sets the unit of the time scale (X-Axis)
  	*/
  var scale_unit: java.lang.String
  /**
  	 * specifies whether the timeline area shall be scrolled while selecting to display the selected task
  	*/
  var scroll_on_click: scala.Boolean
  /**
  	 * enables selection of tasks in the Gantt chart
  	*/
  var select_task: scala.Boolean
  /**
  	 * enables converting server-side dates from UTC to a local time zone (and backward) while sending data to the server
  	*/
  var server_utc: scala.Boolean
  /**
  	 * shows the chart (timeline) area of the Gantt chart
  	*/
  var show_chart: scala.Boolean
  /**
  	 * enables showing error alerts in case of unexpected behavior
  	*/
  var show_errors: scala.Boolean
  /**
  	 * shows the grid area of the Gantt chart
  	*/
  var show_grid: scala.Boolean
  /**
  	 * enables/disables displaying links in the Gantt chart
  	*/
  var show_links: scala.Boolean
  /**
  	 * shows/hides markers on the page
  	*/
  var show_markers: scala.Boolean
  /**
  	 * enables displaying of the progress inside the task bars
  	*/
  var show_progress: scala.Boolean
  /**
  	 * activates/disables the 'quick_info' extension (pop-up task's details form)
  	*/
  var show_quick_info: scala.Boolean
  /**
  	 * enables/disables displaying column borders in the chart area
  	*/
  var show_task_cells: scala.Boolean
  /**
  	 * enables showing unscheduled tasks
  	*/
  var show_unscheduled: scala.Boolean
  /**
  	 * hides non-working time from the time scale
  	*/
  var skip_off_time: scala.Boolean
  /**
  	 * enables the smart rendering mode for gantt's tasks and links rendering
  	*/
  var smart_rendering: scala.Boolean
  /**
  	 * enables sorting in the table
  	*/
  var sort: scala.Boolean
  /**
  	 * sets the start value of the time scale
  	*/
  var start_date: stdLib.Date
  /**
  	 * sets the start day of weeks
  	*/
  var start_on_monday: scala.Boolean
  /**
  	 * generates a background image for the timeline area instead of rendering actual columns' and rows' lines
  	*/
  var static_background: scala.Boolean
  /**
  	 * sets the step of the time scale (X-Axis)
  	*/
  var step: scala.Double
  /**
  	 * specifies the second time scale(s)
  	*/
  var subscales: js.Array[_]
  /**
  	 * sets the name of the attribute that will specify the id of the task's HTML element
  	*/
  var task_attribute: java.lang.String
  /**
  	 * sets the format of the date label in the 'Time period' section of the lightbox
  	*/
  var task_date: java.lang.String
  /**
  	 * sets the height of task bars in the timeline area
  	*/
  var task_height: scala.Double
  /**
  	 * sets the offset (in pixels) of the nearest task from the left border in the timeline
  	*/
  var task_scroll_offset: scala.Double
  /**
  	 * sets the format of the time drop-down selector in the lightbox
  	*/
  var time_picker: java.lang.String
  /**
  	 * sets the minimum step (in minutes) for the task's time values
  	*/
  var time_step: scala.Double
  /**
  	 * sets the length of time, in milliseconds, before the tooltip hides
  	*/
  var tooltip_hide_timeout: scala.Double
  /**
  	 * sets the  the right (if positive) offset of the tooltip's position
  	*/
  var tooltip_offset_x: scala.Double
  /**
  	 * sets the  the top (if positive) offset of the tooltip's position
  	*/
  var tooltip_offset_y: scala.Double
  /**
  	 * sets the timeout in milliseconds before the tooltip is displayed for a task
  	*/
  var tooltip_timeout: scala.Double
  /**
  	 * enables/disables the touch support for the Gantt chart
  	*/
  var touch: scala.Boolean | java.lang.String
  /**
  	 * defines the time period in milliseconds that is used to differ the long touch gesture from the scroll gesture
  	*/
  var touch_drag: scala.Double | scala.Boolean
  /**
  	 * enables/disables vibration while moving tasks on touch devices
  	*/
  var touch_feedback: scala.Boolean
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
  var undo: scala.Boolean
  /**
  	 * sets the actions that the Undo operation will revert
  	*/
  var undo_actions: js.Any
  /**
  	 * sets the number of steps that should be reverted by the undo method
  	*/
  var undo_steps: scala.Double
  /**
  	 * sets the types of entities for which the Undo operation will be applied
  	*/
  var undo_types: js.Any
  /**
  	 * enables calculating the duration of tasks in working time instead of calendar time
  	*/
  var work_time: scala.Boolean
  /**
  	 * sets the date format that is used to parse data from the data set
  	*/
  var xml_date: java.lang.String
}

