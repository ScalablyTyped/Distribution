package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripLine extends js.Object {
  /** Specifies date to render striplines in Gantt
    */
  var day: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies label to be displayed for striplines in Gantt
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the line color for rendered striplines in Gantt
    */
  var lineColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies line style for rendered striplines in Gantt
    */
  var lineStyle: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width of the stripline in Gantt
    */
  var lineWidth: js.UndefOr[java.lang.String] = js.undefined
}

object StripLine {
  @scala.inline
  def apply(
    day: java.lang.String = null,
    label: java.lang.String = null,
    lineColor: java.lang.String = null,
    lineStyle: java.lang.String = null,
    lineWidth: java.lang.String = null
  ): StripLine = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (label != null) __obj.updateDynamic("label")(label)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth)
    __obj.asInstanceOf[StripLine]
  }
}

