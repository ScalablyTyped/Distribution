package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesBorder extends js.Object {
  /** Border color of the series.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.undefined
  /** DashArray for border of the series.
    * @Default {null}
    */
  var dashArray: js.UndefOr[String] = js.undefined
  /** Border width of the series.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SeriesBorder {
  @scala.inline
  def apply(color: String = null, dashArray: String = null, width: js.UndefOr[Double] = js.undefined): SeriesBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesBorder]
  }
}

