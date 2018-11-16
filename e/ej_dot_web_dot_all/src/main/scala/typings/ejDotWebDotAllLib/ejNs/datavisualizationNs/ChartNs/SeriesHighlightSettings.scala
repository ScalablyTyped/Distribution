package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SeriesHighlightSettings extends js.Object {
  /** Options for customizing the border of series on highlight.
               */
  var border: js.UndefOr[SeriesHighlightSettingsBorder] = js.undefined
  /** Color of the series/point on highlight.
               */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Custom pattern for the series on highlight.
               */
  var customPattern: js.UndefOr[java.lang.String] = js.undefined
  /** Enables/disables the ability to highlight series or data point interactively.
               * @Default {false}
               */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether series or data point has to be highlighted.
               * @Default {series. See Mode}
               */
  var mode: js.UndefOr[Mode | java.lang.String] = js.undefined
  /** Opacity of the series/point on highlight.
               * @Default {0.6}
               */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the pattern for the series/point on highlight.
               * @Default {none. See Pattern}
               */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
}

