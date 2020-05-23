package typings.ejWebAll.ej.datavisualization.RangeNavigator

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
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (majorGridLines != null) __obj.updateDynamic("majorGridLines")(majorGridLines.asInstanceOf[js.Any])
    if (majorTickLines != null) __obj.updateDynamic("majorTickLines")(majorTickLines.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rangePadding != null) __obj.updateDynamic("rangePadding")(rangePadding.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAxisSettings]
  }
}

