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

trait AnonFontOffset extends js.Object {
  var font: js.UndefOr[Font] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
}

object AnonFontOffset {
  @scala.inline
  def apply(
    font: Font = null,
    offset: Int | Double = null,
    text: String = null,
    textOverflow: ellipsis | hide | none = null,
    wordWrap: normal | breakWord | none = null
  ): AnonFontOffset = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFontOffset]
  }
}

