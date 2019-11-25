package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesMinorGridLines extends js.Object {
  /** Patterns of dashes and gaps used to stroke the minor grid lines.
    * @Default {null}
    */
  var dashArray: js.UndefOr[String] = js.undefined
  /** Show/hides the minor grid lines.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Width of the minorGridLines.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AxesMinorGridLines {
  @scala.inline
  def apply(dashArray: String = null, visible: js.UndefOr[Boolean] = js.undefined, width: Int | Double = null): AxesMinorGridLines = {
    val __obj = js.Dynamic.literal()
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesMinorGridLines]
  }
}

