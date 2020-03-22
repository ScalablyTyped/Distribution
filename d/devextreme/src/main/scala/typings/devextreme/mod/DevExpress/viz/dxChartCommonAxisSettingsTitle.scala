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
  /** Aligns the axis title to the left, center, or right of the axis. */
  var alignment: js.UndefOr[center | left | right] = js.undefined
  /** Specifies font options for the axis title. */
  var font: js.UndefOr[Font] = js.undefined
  /** Adds a pixel-measured empty space between the axis title and axis labels. */
  var margin: js.UndefOr[Double] = js.undefined
  /** Specifies what to do with the axis title when it overflows the allocated space after applying wordWrap: hide, truncate them and display an ellipsis, or do nothing. */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  /** Specifies how to wrap the axis title if it does not fit into a single line. */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
}

object dxChartCommonAxisSettingsTitle {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    font: Font = null,
    margin: Int | Double = null,
    textOverflow: ellipsis | hide | none = null,
    wordWrap: normal | breakWord | none = null
  ): dxChartCommonAxisSettingsTitle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonAxisSettingsTitle]
  }
}

