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

