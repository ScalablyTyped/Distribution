package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the loading indicator. */
trait BaseWidgetLoadingIndicator extends js.Object {
  /** Colors the background of the loading indicator. */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specifies whether the loading indicator should be displayed and hidden automatically. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies font options for the loading indicator. */
  var font: js.UndefOr[Font] = js.undefined
  /** Allows you to change the loading indicator's visibility. */
  var show: js.UndefOr[Boolean] = js.undefined
  /** Specifies the text to be displayed by the loading indicator. */
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

