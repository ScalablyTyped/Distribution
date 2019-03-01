package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Holiday extends js.Object {
  /** Specifies the background color for holiday date in Gantt Schedule
    */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies holiday date to be displayed in Gantt
    */
  var day: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the label to be displayed for rendered holiday in Gantt
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object Holiday {
  @scala.inline
  def apply(background: java.lang.String = null, day: java.lang.String = null, label: java.lang.String = null): Holiday = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (day != null) __obj.updateDynamic("day")(day)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Holiday]
  }
}

