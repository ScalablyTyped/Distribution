package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  /** Border color of the chart.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Opacity of the chart border.
    * @Default {0.3}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Width of the Chart border.
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Border {
  @scala.inline
  def apply(color: String = null, opacity: Int | Double = null, width: Int | Double = null): Border = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

