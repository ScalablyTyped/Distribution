package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ValueAxisSettings extends js.Object {
  /** Options for customizing the axis line.
               */
  var axisLine: js.UndefOr[ValueAxisSettingsAxisLine] = js.undefined
  /** Options for customizing the font of the axis.
               */
  var font: js.UndefOr[ValueAxisSettingsFont] = js.undefined
  /** Options for customizing the major grid lines.
               */
  var majorGridLines: js.UndefOr[ValueAxisSettingsMajorGridLines] = js.undefined
  /** Options for customizing the major tick lines in axis.
               */
  var majorTickLines: js.UndefOr[ValueAxisSettingsMajorTickLines] = js.undefined
  /** You can customize the range of the axis by setting minimum , maximum and interval.
               */
  var range: js.UndefOr[ValueAxisSettingsRange] = js.undefined
  /** If the range is not given explicitly, range will be calculated automatically. You can customize the automatic range calculation using rangePadding.
               * @Default {none}
               */
  var rangePadding: js.UndefOr[java.lang.String] = js.undefined
  /** Toggles the visibility of axis in range navigator.
               * @Default {false}
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

