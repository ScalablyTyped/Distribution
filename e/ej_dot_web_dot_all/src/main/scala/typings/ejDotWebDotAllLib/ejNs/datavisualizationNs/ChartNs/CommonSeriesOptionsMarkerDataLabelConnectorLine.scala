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

