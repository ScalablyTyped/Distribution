package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesMarkerDataLabelConnectorLine extends js.Object {
  /** Color of the connector.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Height of the connector.
    * @Default {null}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Specifies when the connector has to be drawn as Bezier curve or straight line. This is applicable only for Pie and Doughnut chart types.
    * @Default {line. See ConnectorLineType}
    */
  var `type`: js.UndefOr[Type | String] = js.undefined
  /** Width of the connector.
    * @Default {0.5}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SeriesMarkerDataLabelConnectorLine {
  @scala.inline
  def apply(
    color: String = null,
    height: js.UndefOr[Double] = js.undefined,
    `type`: Type | String = null,
    width: js.UndefOr[Double] = js.undefined
  ): SeriesMarkerDataLabelConnectorLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesMarkerDataLabelConnectorLine]
  }
}

