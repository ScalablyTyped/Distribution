package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsMarkerDataLabelConnectorLine extends js.Object {
  /** Color of the connector line.
    * @Default {#565656}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Height of the connector line.
    * @Default {null}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies when the connector has to be drawn as Bezier curve or straight line. This is applicable only for Pie and Doughnut chart types.
    * @Default {line. See ConnectorLineType}
    */
  var `type`: js.UndefOr[ConnectorLineType | java.lang.String] = js.undefined
  /** Width of the connector.
    * @Default {0.5}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CommonSeriesOptionsMarkerDataLabelConnectorLine {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    height: java.lang.String = null,
    `type`: ConnectorLineType | java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): CommonSeriesOptionsMarkerDataLabelConnectorLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (height != null) __obj.updateDynamic("height")(height)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelConnectorLine]
  }
}

