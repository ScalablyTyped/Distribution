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

trait dxChartValueAxisTitle extends dxChartCommonAxisSettingsTitle {
  /** Specifies the text of the axis title. */
  var text: js.UndefOr[String] = js.undefined
}

object dxChartValueAxisTitle {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    font: Font = null,
    margin: Int | Double = null,
    text: String = null,
    textOverflow: ellipsis | hide | none = null,
    wordWrap: normal | breakWord | none = null
  ): dxChartValueAxisTitle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartValueAxisTitle]
  }
}

