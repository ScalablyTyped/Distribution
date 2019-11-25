package typings.ejDotWebDotAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Holiday extends js.Object {
  /** Specifies the background color for holiday date in Gantt Schedule
    */
  var background: js.UndefOr[String] = js.undefined
  /** Specifies holiday date to be displayed in Gantt
    */
  var day: js.UndefOr[String] = js.undefined
  /** Specifies the label to be displayed for rendered holiday in Gantt
    */
  var label: js.UndefOr[String] = js.undefined
}

object Holiday {
  @scala.inline
  def apply(background: String = null, day: String = null, label: String = null): Holiday = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Holiday]
  }
}

