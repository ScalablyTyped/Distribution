package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HighlightSettings extends js.Object {
  /** Color of the levels/point on highlight.
               * @Default {red}
               */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Enables/disables the ability to highlight the levels or point interactively.
               * @Default {false}
               */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether the levels or point has to be highlighted.
               * @Default {point. See Mode}
               */
  var mode: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightMode | java.lang.String
  ] = js.undefined
  /** Opacity of the levels/point on highlight.
               * @Default {0.5}
               */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies whether the levels or data point has to be highlighted.
               * @Default {opacity. See Mode}
               */
  var `type`: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightType | java.lang.String
  ] = js.undefined
}

