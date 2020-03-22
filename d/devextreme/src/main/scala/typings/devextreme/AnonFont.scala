package typings.devextreme

import typings.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFont extends js.Object {
  var font: js.UndefOr[Font] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonFont {
  @scala.inline
  def apply(font: Font = null, offset: Int | Double = null, text: String = null): AnonFont = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFont]
  }
}

