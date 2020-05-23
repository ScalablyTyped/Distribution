package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColorCustomizeText extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var customizeText: js.UndefOr[js.Function1[/* info */ Point, String]] = js.undefined
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object BackgroundColorCustomizeText {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    customizeText: /* info */ Point => String = null,
    font: typings.devextreme.mod.DevExpress.viz.Font = null,
    format: format = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BackgroundColorCustomizeText = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorCustomizeText]
  }
}

