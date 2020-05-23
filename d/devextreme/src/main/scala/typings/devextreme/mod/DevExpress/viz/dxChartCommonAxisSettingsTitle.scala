package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonAxisSettingsTitle extends js.Object {
  /** @name dxChart.Options.commonAxisSettings.title.alignment */
  var alignment: js.UndefOr[center | left | right] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.title.font */
  var font: js.UndefOr[Font] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.title.margin */
  var margin: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.title.textOverflow */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.title.wordWrap */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
}

object dxChartCommonAxisSettingsTitle {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    font: Font = null,
    margin: js.UndefOr[Double] = js.undefined,
    textOverflow: ellipsis | hide | none = null,
    wordWrap: normal | breakWord | none = null
  ): dxChartCommonAxisSettingsTitle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonAxisSettingsTitle]
  }
}

