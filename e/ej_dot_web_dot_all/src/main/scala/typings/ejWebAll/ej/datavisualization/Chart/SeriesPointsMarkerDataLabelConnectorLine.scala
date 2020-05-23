package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPointsMarkerDataLabelConnectorLine extends js.Object {
  /** Specifies when the connector has to be drawn as Bezier curve or straight line. This is applicable only for Pie and Doughnut chart types.
    * @Default {line. See ConnectorLineType}
    */
  var `type`: js.UndefOr[ConnectorLineType | String] = js.undefined
  /** Width of the connector.
    * @Default {0.5}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SeriesPointsMarkerDataLabelConnectorLine {
  @scala.inline
  def apply(`type`: ConnectorLineType | String = null, width: js.UndefOr[Double] = js.undefined): SeriesPointsMarkerDataLabelConnectorLine = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPointsMarkerDataLabelConnectorLine]
  }
}

