package typings.ejDotWebDotAll.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripLine extends js.Object {
  /** Specifies date to render striplines in Gantt
    */
  var day: js.UndefOr[String] = js.undefined
  /** Specifies label to be displayed for striplines in Gantt
    */
  var label: js.UndefOr[String] = js.undefined
  /** Specifies the line color for rendered striplines in Gantt
    */
  var lineColor: js.UndefOr[String] = js.undefined
  /** Specifies line style for rendered striplines in Gantt
    */
  var lineStyle: js.UndefOr[String] = js.undefined
  /** Specifies the width of the stripline in Gantt
    */
  var lineWidth: js.UndefOr[String] = js.undefined
}

object StripLine {
  @scala.inline
  def apply(
    day: String = null,
    label: String = null,
    lineColor: String = null,
    lineStyle: String = null,
    lineWidth: String = null
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

