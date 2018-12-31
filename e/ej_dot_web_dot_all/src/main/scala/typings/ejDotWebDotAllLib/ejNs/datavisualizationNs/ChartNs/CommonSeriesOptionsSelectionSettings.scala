package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsSelectionSettings extends js.Object {
  /** Options for customizing the border of the series on selection.
    */
  var border: js.UndefOr[CommonSeriesOptionsSelectionSettingsBorder] = js.undefined
  /** Color of the series/point on selection.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Custom pattern for the series on selection.
    */
  var customPattern: js.UndefOr[java.lang.String] = js.undefined
  /** Enables/disables the ability to select a series/data point interactively.
    * @Default {false}
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether the series or data point has to be selected.
    * @Default {series. See Mode}
    */
  var mode: js.UndefOr[Mode | java.lang.String] = js.undefined
  /** Opacity of the series/point on selection.
    * @Default {0.6}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the pattern for the series/point on selection.
    * @Default {none. See Pattern}
    */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the drawn rectangle type.
    * @Default {xy}
    */
  var rangeType: js.UndefOr[RangeType | java.lang.String] = js.undefined
  /** Specifies the type of selection.
    * @Default {single}
    */
  var `type`: js.UndefOr[SelectionType | java.lang.String] = js.undefined
}

