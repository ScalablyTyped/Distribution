package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsConnectorLine extends js.Object {
  /** Color of the connector line.
    * @Default {#565656}
    */
  var color: js.UndefOr[String] = js.undefined
  /** DashArray of the connector line.
    * @Default {null}
    */
  var dashArray: js.UndefOr[String] = js.undefined
  /** DashArray of the connector line.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Width of the connector line.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CommonSeriesOptionsConnectorLine {
  @scala.inline
  def apply(
    color: String = null,
    dashArray: String = null,
    opacity: Int | Double = null,
    width: Int | Double = null
  ): CommonSeriesOptionsConnectorLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsConnectorLine]
  }
}

