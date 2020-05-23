package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxisMinorGridLines extends js.Object {
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

object PrimaryYAxisMinorGridLines {
  @scala.inline
  def apply(
    dashArray: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PrimaryYAxisMinorGridLines = {
    val __obj = js.Dynamic.literal()
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryYAxisMinorGridLines]
  }
}

