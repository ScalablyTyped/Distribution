package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonValueValueText
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartArgumentAxisLabel extends dxPolarChartCommonAxisSettingsLabel {
  /** Specifies the text for a hint that appears when a user hovers the mouse pointer over a label on the argument axis. */
  var customizeHint: js.UndefOr[js.Function1[/* argument */ AnonValueValueText, String]] = js.undefined
  /** Specifies a callback function that returns the text to be displayed by argument axis labels. */
  var customizeText: js.UndefOr[js.Function1[/* argument */ AnonValueValueText, String]] = js.undefined
  /** Formats a value before it is displayed in an axis label. */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
}

object dxPolarChartArgumentAxisLabel {
  @scala.inline
  def apply(
    customizeHint: /* argument */ AnonValueValueText => String = null,
    customizeText: /* argument */ AnonValueValueText => String = null,
    font: Font = null,
    format: format = null,
    indentFromAxis: Int | Double = null,
    overlappingBehavior: none | hide = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxPolarChartArgumentAxisLabel = {
    val __obj = js.Dynamic.literal()
    if (customizeHint != null) __obj.updateDynamic("customizeHint")(js.Any.fromFunction1(customizeHint))
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (indentFromAxis != null) __obj.updateDynamic("indentFromAxis")(indentFromAxis.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartArgumentAxisLabel]
  }
}

