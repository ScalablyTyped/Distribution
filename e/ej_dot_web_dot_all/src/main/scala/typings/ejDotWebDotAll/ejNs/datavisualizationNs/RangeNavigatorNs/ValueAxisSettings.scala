package typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs

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
  var rangePadding: js.UndefOr[String] = js.undefined
  /** Toggles the visibility of axis in range navigator.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ValueAxisSettings {
  @scala.inline
  def apply(
    axisLine: ValueAxisSettingsAxisLine = null,
    font: ValueAxisSettingsFont = null,
    majorGridLines: ValueAxisSettingsMajorGridLines = null,
    majorTickLines: ValueAxisSettingsMajorTickLines = null,
    range: ValueAxisSettingsRange = null,
    rangePadding: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ValueAxisSettings = {
    val __obj = js.Dynamic.literal()
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine)
    if (font != null) __obj.updateDynamic("font")(font)
    if (majorGridLines != null) __obj.updateDynamic("majorGridLines")(majorGridLines)
    if (majorTickLines != null) __obj.updateDynamic("majorTickLines")(majorTickLines)
    if (range != null) __obj.updateDynamic("range")(range)
    if (rangePadding != null) __obj.updateDynamic("rangePadding")(rangePadding)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ValueAxisSettings]
  }
}

