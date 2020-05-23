package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    font: typings.devextreme.mod.DevExpress.viz.Font = null,
    offset: js.UndefOr[Double] = js.undefined,
    text: String = null
  ): Font = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

