package typings.dhtmlxgantt

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttTemplates extends js.Object {
  /**
    * specifies the content of start date or end date columns in grid
    * @param date the date which needs formatting
    * @param task the task object
    */
  def date_grid(date: Date, task: js.Any): String = js.native
  /**
    * specifies the date format of the time scale (X-Axis)
    * @param date the date which needs formatting
    */
  def date_scale(date: Date): String = js.native
  /**
    * specifies the text of tooltips that are displayed when the user creates a new dependency link
    * @param from the id of the source task
    * @param from_start <i>true</i>, if the link is being dragged from the start of the  source task, <i>false</i> - if <br> from the end of the task
    * @param to the id of the target task( 'null' or 'undefined', if the target task isn't specified yet)
    * @param to_start <i>true</i>, if the link is being dragged to the start of the target task, <i>false</i> - if <br> to the end of the task
    */
  def drag_link(from: String, from_start: Boolean, to: String, to_start: Boolean): String = js.native
  def drag_link(from: String, from_start: Boolean, to: Double, to_start: Boolean): String = js.native
  def drag_link(from: Double, from_start: Boolean, to: String, to_start: Boolean): String = js.native
  def drag_link(from: Double, from_start: Boolean, to: Double, to_start: Boolean): String = js.native
  /**
    * specifies the CSS class that will be applied to the pop-up that appears when a user drags a link
    * @param from the id of the source task
    * @param from_start <i>true</i>, if the link is being dragged from the start of the  source task, <i>false</i> - if <br> from the end of the task
    * @param to the id of the target task( 'null' or 'undefined', if the target task isn't specified yet)
    * @param to_start <i>true</i>, if the link is being dragged to the start of the target task, <i>false</i> - if <br> to the end of the task
    */
  def drag_link_class(from: String, from_start: Boolean, to: String, to_start: Boolean): String = js.native
  def drag_link_class(from: String, from_start: Boolean, to: Double, to_start: Boolean): String = js.native
  def drag_link_class(from: Double, from_start: Boolean, to: String, to_start: Boolean): String = js.native
  def drag_link_class(from: Double, from_start: Boolean, to: Double, to_start: Boolean): String = js.native
  /**
    * specifies the custom content inserted before the labels of child items in the tree column
    * @param task the task object
    */
  def grid_blank(task: js.Any): String = js.native
  /**
    * specifies the format of dates in the "Start time" column
    * @param date the date which needs formatting
    */
  def grid_date_format(date: Date): String = js.native
  /**
    * specifies the icon of child items in the tree column
    * @param task the task object
    */
  def grid_file(task: js.Any): String = js.native
  /**
    * specifies the icon of parent items in the tree column
    * @param task the task object
    */
  def grid_folder(task: js.Any): String = js.native
  /**
    * specifies the CSS class that will be applied to the headers of the table's columns
    * @param columnName the column's name (as specified in the "name" property of the column object)
    * @param column column object (as specified in the <i>gantt.config.columns</i> config)
    */
  def grid_header_class(columnName: String, column: js.Any): String = js.native
  /**
    * specifies the indent  of the child items in a branch (in the tree column)
    * @param task the task object
    */
  def grid_indent(task: js.Any): String = js.native
  /**
    * specifies the icon of the open/close sign in the tree column
    * @param task the task object
    */
  def grid_open(task: js.Any): String = js.native
  /**
    * specifies the CSS class that will be applied to a grid row
    * @param start the date when a task is scheduled to begin
    * @param end the date when a task is scheduled to be completed
    * @param task the task object
    */
  def grid_row_class(start: Date, end: Date, task: js.Any): String = js.native
  /**
    * defines the height of the filled area in the resourceHistogram
    * @param start_date start date of the scale cell
    * @param end_date end date of the scale cell
    * @param resource the resource object
    * @param tasks tasks that are assigned to the specified resource and overlap start/end dates of the cell
    */
  def histogram_cell_allocated(start_date: Date, end_date: Date, resource: js.Any, tasks: js.Array[_]): Unit = js.native
  /**
    * specifies the height of the line that defines the available capacity of the resource
    * @param start_date start date of the scale cell
    * @param end_date end date of the scale cell
    * @param resource the resource object
    * @param tasks tasks that are assigned to the specified resource and overlap start/end dates of the cell
    */
  def histogram_cell_capacity(start_date: Date, end_date: Date, resource: js.Any, tasks: js.Array[_]): Unit = js.native
  /**
    * defines the CSS class which is applied to a cell of the resource panel
    * @param start_date start date of the scale cell
    * @param end_date end date of the scale cell
    * @param resource the resource object
    * @param tasks tasks that are assigned to the specified resource and overlap start/end dates of the cell
    */
  def histogram_cell_class(start_date: Date, end_date: Date, resource: js.Any, tasks: js.Array[_]): Unit = js.native
  /**
    * defines the label inside a cell
    * @param start_date start date of the scale cell
    * @param end_date end date of the scale cell
    * @param resource the resource object
    * @param tasks tasks that are assigned to the specified resource and overlap start/end dates of the cell
    */
  def histogram_cell_label(start_date: Date, end_date: Date, resource: js.Any, tasks: js.Array[_]): Unit = js.native
  /**
    * specifies the text assigned to tasks bars on the left side
    * @param start the date when a task is scheduled to begin
    * @param end the date when a task is scheduled to be completed
    * @param task the task object
    */
  def leftside_text(start: Date, end: Date, task: js.Any): String = js.native
  /**
    * specifies the lightbox's header
    * @param start_date the date when a task is scheduled to begin
    * @param end_date the date when a task is scheduled to be completed
    * @param task the task's object
    */
  def lightbox_header(start_date: Date, end_date: Date, task: js.Any): String = js.native
  /**
    * specifies the CSS class that will be applied to a link
    * @param link the link object
    */
  def link_class(link: js.Any): String = js.native
  /**
    * specifies the text in the header of the link's "delete" confirm window
    * @param link the link object
    */
  def link_description(link: js.Any): String = js.native
  /**
    * specifies the text in the completed part of the task bar
    * @param start the date when a task is scheduled to begin
    * @param end the date when a task is scheduled to be completed
    * @param task the task object
    */
  def progress_text(start: Date, end: Date, task: js.Any): String = js.native
  /**
    * specifies the CSS class that will be applied to  the pop-up edit form
    * @param start the date when a task is scheduled to begin
    * @param end the date when a task is scheduled to be completed
    * @param task the task object
    */
  def quick_info_class(start: Date, end: Date, task: js.Any): Unit = js.native
  /**
    * specifies the content of the pop-up edit form
    * @param start the date when a task is scheduled to begin
    * @param end the date when a task is scheduled to be completed
    * @param task the task object
    */
  def quick_info_content(start: Date, end: Date, task: js.Any): String = js.native
  /**
    * specifies the date of the pop-up edit form
    * @param start the date when a task is scheduled to begin
    * @param end the date when  a task is scheduled to be completed
    * @param task the task object
    */
  def quick_info_date(start: Date, end: Date, task: js.Any): String = js.native
  /**
    * specifies the title of the pop-up edit form
    * @param start the date when a task is scheduled to begin
    * @param end the date when a task is scheduled to be completed
    * @param task the task object
    */
  def quick_info_title(start: Date, end: Date, task: js.Any): String = js.native
  /**
    * defines the CSS class names of cells in the resource timeline cells
    * @param start_date start date of the scale cell
    * @param end_date end date of the scale cell
    * @param resource the resource object
    * @param tasks tasks that are assigned to specified resource and overlap start/end dates of the cell
    */
  def resource_cell_class(start_date: Date, end_date: Date, resource: js.Any, tasks: js.Array[_]): String = js.native
  /**
    * defines the HTML content of resource timeline cells
    * @param start_date start date of the scale cell
    * @param end_date end date of the scale cell
    * @param resource the resource object
    * @param tasks tasks that are assigned to specified resource and overlap start/end dates of the cell
    */
  def resource_cell_value(start_date: Date, end_date: Date, resource: js.Any, tasks: js.Array[_]): String = js.native
  /**
    * specifies the text assigned to tasks bars on the right side
    * @param start the date when a task is scheduled to begin
    * @param end the date when a task is scheduled to be completed
    * @param task the task object
    */
  def rightside_text(start: Date, end: Date, task: js.Any): String = js.native
  /**
    * specifies the CSS class that will be applied to cells of the time scale of the timeline area
    * @param date the date of a cell
    */
  def scale_cell_class(date: Date): String = js.native
  /**
    * specifies the CSS class that will be applied to the time scale
    * @param scale the scale's configuration object
    */
  def scale_row_class(scale: js.Any): String = js.native
  /**
    * specifies the CSS class that will be applied to the cells of the timeline area
    * @param item the task object assigned to the row
    * @param date the date of a cell
    */
  def task_cell_class(item: js.Any, date: Date): String = js.native
  /**
    * specifies the CSS class that will be applied to task bars
    * @param start the date when a task is scheduled to begin
    * @param end the date when a task is scheduled to be completed
    * @param task the task object
    */
  def task_class(start: Date, end: Date, task: js.Any): String = js.native
  /**
    * specifies the date format of the label in the 'Time period' section of the lightbox
    * @param date the date which needs formatting
    */
  def task_date(date: Date): String = js.native
  /**
    * specifies the CSS class that will be applied to the row of the timeline area
    * @param start the date when a task is scheduled to begin
    * @param end the date when a task is scheduled to be completed
    * @param task the task object
    */
  def task_row_class(start: Date, end: Date, task: js.Any): String = js.native
  /**
    * specifies the text in the task bars and the header of the lightbox
    * @param start the date when a task is scheduled to begin
    * @param end the date when a task is scheduled to be completed
    * @param task the task object
    */
  def task_text(start: Date, end: Date, task: js.Any): String = js.native
  /**
    * specifies the date period in the header of the lightbox
    * @param start the date when a task is scheduled to begin
    * @param end the date when a task is scheduled to be completed
    * @param task the task object
    */
  def task_time(start: Date, end: Date, task: js.Any): String = js.native
  /**
    * specifies the dates of unscheduled tasks
    * @param task the task object
    */
  def task_unscheduled_time(task: js.Any): Unit = js.native
  /**
    * specifies the format of the drop-down time selector in the lightbox
    * @param date the date which needs formatting
    */
  def time_picker(date: Date): String = js.native
  /**
    * specifies the format of start and end dates displayed in the tooltip
    * @param date the date which needs formatting
    */
  def tooltip_date_format(date: Date): String = js.native
  /**
    * specifies the text of tooltips
    * @param start the date when a task is scheduled to begin
    * @param end the date when a task is scheduled to be completed
    * @param task the task object
    */
  def tooltip_text(start: Date, end: Date, task: js.Any): String = js.native
  /**
    * a string from an XML file is converted into a date object in conformity with this template
    * @param date the date which needs formatting
    */
  def xml_date(date: Date): String = js.native
  /**
    * a date object is converted into a string in conformity with this template. Used to send data back to the server
    * @param date the date which needs formatting
    */
  def xml_format(date: Date): String = js.native
}

