package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseWidget.Options.loadingIndicator */
trait BaseWidgetLoadingIndicator extends js.Object {
  /** @name BaseWidget.Options.loadingIndicator.backgroundColor */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** @name BaseWidget.Options.loadingIndicator.enabled */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** @name BaseWidget.Options.loadingIndicator.font */
  var font: js.UndefOr[Font] = js.undefined
  /** @name BaseWidget.Options.loadingIndicator.show */
  var show: js.UndefOr[Boolean] = js.undefined
  /** @name BaseWidget.Options.loadingIndicator.text */
  var text: js.UndefOr[String] = js.undefined
}

object BaseWidgetLoadingIndicator {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    font: Font = null,
    show: js.UndefOr[Boolean] = js.undefined,
    text: String = null
  ): BaseWidgetLoadingIndicator = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWidgetLoadingIndicator]
  }
}

