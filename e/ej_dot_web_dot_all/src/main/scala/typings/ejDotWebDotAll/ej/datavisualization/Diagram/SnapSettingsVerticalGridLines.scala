package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapSettingsVerticalGridLines extends js.Object {
  /** Defines the line color of horizontal grid lines
    * @Default {lightgray}
    */
  var lineColor: js.UndefOr[String] = js.undefined
  /** Specifies the pattern of dashes and gaps used to stroke horizontal grid lines
    */
  var lineDashArray: js.UndefOr[String] = js.undefined
  /** A pattern of lines and gaps that defines a set of horizontal gridlines
    * @Default {[1.25, 18.75, 0.25, 19.75, 0.25, 19.75, 0.25, 19.75, 0.25, 19.75]}
    */
  var linesInterval: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies a set of intervals to snap the objects
    * @Default {[20]}
    */
  var snapInterval: js.UndefOr[js.Array[_]] = js.undefined
}

object SnapSettingsVerticalGridLines {
  @scala.inline
  def apply(
    lineColor: String = null,
    lineDashArray: String = null,
    linesInterval: js.Array[_] = null,
    snapInterval: js.Array[_] = null
  ): SnapSettingsVerticalGridLines = {
    val __obj = js.Dynamic.literal()
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineDashArray != null) __obj.updateDynamic("lineDashArray")(lineDashArray.asInstanceOf[js.Any])
    if (linesInterval != null) __obj.updateDynamic("linesInterval")(linesInterval.asInstanceOf[js.Any])
    if (snapInterval != null) __obj.updateDynamic("snapInterval")(snapInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapSettingsVerticalGridLines]
  }
}

