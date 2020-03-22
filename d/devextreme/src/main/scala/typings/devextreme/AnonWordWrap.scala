package typings.devextreme

import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWordWrap extends js.Object {
  var font: js.UndefOr[Font] = js.undefined
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
}

object AnonWordWrap {
  @scala.inline
  def apply(
    font: Font = null,
    textOverflow: ellipsis | hide | none = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wordWrap: normal | breakWord | none = null
  ): AnonWordWrap = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWordWrap]
  }
}

