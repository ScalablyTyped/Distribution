package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPointsMarkerDataLabelConnectorLine extends js.Object {
  /** Specifies when the connector has to be drawn as Bezier curve or straight line. This is applicable only for Pie and Doughnut chart types.
    * @Default {line. See ConnectorLineType}
    */
  var `type`: js.UndefOr[ConnectorLineType | java.lang.String] = js.undefined
  /** Width of the connector.
    * @Default {0.5}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SeriesPointsMarkerDataLabelConnectorLine {
  @scala.inline
  def apply(`type`: ConnectorLineType | java.lang.String = null, width: scala.Int | scala.Double = null): SeriesPointsMarkerDataLabelConnectorLine = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPointsMarkerDataLabelConnectorLine]
  }
}

