package typings.dhtmlxscheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerSizes extends js.Object {
  /**
    * the height of day cells in the month view
    */
  var bar_height: Double = js.native
  /**
    * the width of the event text input    140    day
    */
  var editor_width: Double = js.native
  /**
    * increases the length of the lightbox
    */
  var lightbox_additional_height: Double = js.native
  /**
    * the width of the date column in the Map view
    */
  var map_date_width: Double = js.native
  /**
    * the width of the description column in the Map view
    */
  var map_description_width: Double = js.native
  /**
    * the left margin of the main scheduler area
    */
  var margin_left: Double = js.native
  /**
    * the bottom margin of the main scheduler area
    */
  var margin_top: Double = js.native
  /**
    * the width of the selection menu
    */
  var menu_width: Double = js.native
  /**
    * the minimal height of the event box
    */
  var min_event_height: Double = js.native
  /**
    * the top offset of an event in a cell in the month view
    */
  var month_scale_height: Double = js.native
  /**
    * the height of the navigation bar
    */
  var nav_height: Double = js.native
  /**
    * the height of the X-Axis
    */
  var scale_height: Double = js.native
  /**
    * the width of the Y-Axis
    */
  var scale_width: Double = js.native
  /**
    * the width of the scrollbar area
    */
  var scroll_width: Double = js.native
}

object SchedulerSizes {
  @scala.inline
  def apply(
    bar_height: Double,
    editor_width: Double,
    lightbox_additional_height: Double,
    map_date_width: Double,
    map_description_width: Double,
    margin_left: Double,
    margin_top: Double,
    menu_width: Double,
    min_event_height: Double,
    month_scale_height: Double,
    nav_height: Double,
    scale_height: Double,
    scale_width: Double,
    scroll_width: Double
  ): SchedulerSizes = {
    val __obj = js.Dynamic.literal(bar_height = bar_height.asInstanceOf[js.Any], editor_width = editor_width.asInstanceOf[js.Any], lightbox_additional_height = lightbox_additional_height.asInstanceOf[js.Any], map_date_width = map_date_width.asInstanceOf[js.Any], map_description_width = map_description_width.asInstanceOf[js.Any], margin_left = margin_left.asInstanceOf[js.Any], margin_top = margin_top.asInstanceOf[js.Any], menu_width = menu_width.asInstanceOf[js.Any], min_event_height = min_event_height.asInstanceOf[js.Any], month_scale_height = month_scale_height.asInstanceOf[js.Any], nav_height = nav_height.asInstanceOf[js.Any], scale_height = scale_height.asInstanceOf[js.Any], scale_width = scale_width.asInstanceOf[js.Any], scroll_width = scroll_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerSizes]
  }
  @scala.inline
  implicit class SchedulerSizesOps[Self <: SchedulerSizes] (val x: Self) extends AnyVal {
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
    def setBar_height(value: Double): Self = this.set("bar_height", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditor_width(value: Double): Self = this.set("editor_width", value.asInstanceOf[js.Any])
    @scala.inline
    def setLightbox_additional_height(value: Double): Self = this.set("lightbox_additional_height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap_date_width(value: Double): Self = this.set("map_date_width", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap_description_width(value: Double): Self = this.set("map_description_width", value.asInstanceOf[js.Any])
    @scala.inline
    def setMargin_left(value: Double): Self = this.set("margin_left", value.asInstanceOf[js.Any])
    @scala.inline
    def setMargin_top(value: Double): Self = this.set("margin_top", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenu_width(value: Double): Self = this.set("menu_width", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin_event_height(value: Double): Self = this.set("min_event_height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth_scale_height(value: Double): Self = this.set("month_scale_height", value.asInstanceOf[js.Any])
    @scala.inline
    def setNav_height(value: Double): Self = this.set("nav_height", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale_height(value: Double): Self = this.set("scale_height", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale_width(value: Double): Self = this.set("scale_width", value.asInstanceOf[js.Any])
    @scala.inline
    def setScroll_width(value: Double): Self = this.set("scroll_width", value.asInstanceOf[js.Any])
  }
  
}

