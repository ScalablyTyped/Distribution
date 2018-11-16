package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommonSeriesOptionsBubbleOptions extends js.Object {
  /** Used for setting the maximum radius of the bubble
               * @Default {3}
               */
  var maxRadius: js.UndefOr[scala.Double] = js.undefined
  /** Used for the setting the minimum radius of the bubble
               * @Default {1}
               */
  var minRadius: js.UndefOr[scala.Double] = js.undefined
  /** Used for the calculation of the bubble radius based on the mode selected
               * @Default {minMax}
               */
  var radiusMode: js.UndefOr[RadiusMode | java.lang.String] = js.undefined
}

