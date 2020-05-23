package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSelectionSettings extends js.Object {
  /** Options for customizing the border of series on selection.
    */
  var border: js.UndefOr[SeriesSelectionSettingsBorder] = js.undefined
  /** Color of the series/point on selection.
    */
  var color: js.UndefOr[String] = js.undefined
  /** Custom pattern for the series on selection.
    */
  var customPattern: js.UndefOr[String] = js.undefined
  /** Enables/disables the ability to select a series/data point interactively.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether series or data point has to be selected.
    * @Default {series. See Mode}
    */
  var mode: js.UndefOr[Mode | String] = js.undefined
  /** Opacity of the series/point on selection.
    * @Default {0.6}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the pattern for the series/point on selection.
    * @Default {none. See Pattern}
    */
  var pattern: js.UndefOr[String] = js.undefined
  /** Specifies the drawn rectangle type.
    * @Default {xy}
    */
  var rangeType: js.UndefOr[RangeType | String] = js.undefined
  /** Specifies the type of selection.
    * @Default {single}
    */
  var `type`: js.UndefOr[SelectionType | String] = js.undefined
}

object SeriesSelectionSettings {
  @scala.inline
  def apply(
    border: SeriesSelectionSettingsBorder = null,
    color: String = null,
    customPattern: String = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    mode: Mode | String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    pattern: String = null,
    rangeType: RangeType | String = null,
    `type`: SelectionType | String = null
  ): SeriesSelectionSettings = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (customPattern != null) __obj.updateDynamic("customPattern")(customPattern.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (rangeType != null) __obj.updateDynamic("rangeType")(rangeType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSelectionSettings]
  }
}

