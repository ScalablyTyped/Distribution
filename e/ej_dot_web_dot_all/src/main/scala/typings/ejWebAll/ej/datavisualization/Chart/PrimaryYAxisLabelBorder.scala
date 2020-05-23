package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxisLabelBorder extends js.Object {
  /** Specifies the color of the label border.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the width of the label border.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PrimaryYAxisLabelBorder {
  @scala.inline
  def apply(color: String = null, width: js.UndefOr[Double] = js.undefined): PrimaryYAxisLabelBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryYAxisLabelBorder]
  }
}

