package typings
package dhtmlxschedulerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerSizes extends js.Object {
  /**
  	* the height of day cells in the month view
  	*/
  var bar_height: scala.Double
  /**
  	* the width of the event text input	140	day
  	*/
  var editor_width: scala.Double
  /**
  	* increases the length of the lightbox
  	*/
  var lightbox_additional_height: scala.Double
  /**
  	* the width of the date column in the Map view
  	*/
  var map_date_width: scala.Double
  /**
  	* the width of the description column in the Map view
  	*/
  var map_description_width: scala.Double
  /**
  	* the left margin of the main scheduler area
  	*/
  var margin_left: scala.Double
  /**
  	* the bottom margin of the main scheduler area
  	*/
  var margin_top: scala.Double
  /**
  	* the width of the selection menu
  	*/
  var menu_width: scala.Double
  /**
  	* the minimal height of the event box
  	*/
  var min_event_height: scala.Double
  /**
  	* the top offset of an event in a cell in the month view
  	*/
  var month_scale_height: scala.Double
  /**
  	* the height of the navigation bar
  	*/
  var nav_height: scala.Double
  /**
  	* the height of the X-Axis
  	*/
  var scale_height: scala.Double
  /**
  	* the width of the Y-Axis
  	*/
  var scale_width: scala.Double
  /**
  	* the width of the scrollbar area
  	*/
  var scroll_width: scala.Double
}

object SchedulerSizes {
  @scala.inline
  def apply(
    bar_height: scala.Double,
    editor_width: scala.Double,
    lightbox_additional_height: scala.Double,
    map_date_width: scala.Double,
    map_description_width: scala.Double,
    margin_left: scala.Double,
    margin_top: scala.Double,
    menu_width: scala.Double,
    min_event_height: scala.Double,
    month_scale_height: scala.Double,
    nav_height: scala.Double,
    scale_height: scala.Double,
    scale_width: scala.Double,
    scroll_width: scala.Double
  ): SchedulerSizes = {
    val __obj = js.Dynamic.literal(bar_height = bar_height, editor_width = editor_width, lightbox_additional_height = lightbox_additional_height, map_date_width = map_date_width, map_description_width = map_description_width, margin_left = margin_left, margin_top = margin_top, menu_width = menu_width, min_event_height = min_event_height, month_scale_height = month_scale_height, nav_height = nav_height, scale_height = scale_height, scale_width = scale_width, scroll_width = scroll_width)
  
    __obj.asInstanceOf[SchedulerSizes]
  }
}

