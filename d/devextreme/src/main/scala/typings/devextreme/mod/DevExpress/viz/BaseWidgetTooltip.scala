package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Blur
import typings.devextreme.anon.DashStyleOpacity
import typings.devextreme.mod.DevExpress.ui.format
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseWidget.Options.tooltip */
trait BaseWidgetTooltip extends js.Object {
  /** @name BaseWidget.Options.tooltip.arrowLength */
  var arrowLength: js.UndefOr[Double] = js.undefined
  /** @name BaseWidget.Options.tooltip.border */
  var border: js.UndefOr[DashStyleOpacity] = js.undefined
  /** @name BaseWidget.Options.tooltip.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name BaseWidget.Options.tooltip.container */
  var container: js.UndefOr[String | Element | JQuery] = js.undefined
  /** @name BaseWidget.Options.tooltip.cornerRadius */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  /** @name BaseWidget.Options.tooltip.enabled */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** @name BaseWidget.Options.tooltip.font */
  var font: js.UndefOr[Font] = js.undefined
  /** @name BaseWidget.Options.tooltip.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  /** @name BaseWidget.Options.tooltip.opacity */
  var opacity: js.UndefOr[Double] = js.undefined
  /** @name BaseWidget.Options.tooltip.paddingLeftRight */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  /** @name BaseWidget.Options.tooltip.paddingTopBottom */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  /** @name BaseWidget.Options.tooltip.shadow */
  var shadow: js.UndefOr[Blur] = js.undefined
  /** @name BaseWidget.Options.tooltip.zIndex */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object BaseWidgetTooltip {
  @scala.inline
  def apply(
    arrowLength: js.UndefOr[Double] = js.undefined,
    border: DashStyleOpacity = null,
    color: String = null,
    container: String | Element | JQuery = null,
    cornerRadius: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    font: Font = null,
    format: format = null,
    opacity: js.UndefOr[Double] = js.undefined,
    paddingLeftRight: js.UndefOr[Double] = js.undefined,
    paddingTopBottom: js.UndefOr[Double] = js.undefined,
    shadow: Blur = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): BaseWidgetTooltip = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowLength)) __obj.updateDynamic("arrowLength")(arrowLength.get.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(cornerRadius)) __obj.updateDynamic("cornerRadius")(cornerRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeftRight)) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTopBottom)) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.get.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWidgetTooltip]
  }
}

