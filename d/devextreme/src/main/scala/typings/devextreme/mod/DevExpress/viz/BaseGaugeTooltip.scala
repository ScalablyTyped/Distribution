package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonBlur
import typings.devextreme.AnonDashStyleOpacity
import typings.devextreme.AnonValueText
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.format
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseGauge.Options.tooltip */
trait BaseGaugeTooltip extends BaseWidgetTooltip {
  /** @name BaseGauge.Options.tooltip.contentTemplate */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[/* scaleValue */ AnonValueText, /* element */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** @name BaseGauge.Options.tooltip.customizeTooltip */
  var customizeTooltip: js.UndefOr[js.Function1[/* scaleValue */ AnonValueText, _]] = js.undefined
}

object BaseGaugeTooltip {
  @scala.inline
  def apply(
    arrowLength: Int | Double = null,
    border: AnonDashStyleOpacity = null,
    color: String = null,
    container: String | Element | JQuery = null,
    contentTemplate: template | (js.Function2[/* scaleValue */ AnonValueText, /* element */ dxElement, String | Element | JQuery]) = null,
    cornerRadius: Int | Double = null,
    customizeTooltip: /* scaleValue */ AnonValueText => _ = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    font: Font = null,
    format: format = null,
    opacity: Int | Double = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null,
    shadow: AnonBlur = null,
    zIndex: Int | Double = null
  ): BaseGaugeTooltip = {
    val __obj = js.Dynamic.literal()
    if (arrowLength != null) __obj.updateDynamic("arrowLength")(arrowLength.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (customizeTooltip != null) __obj.updateDynamic("customizeTooltip")(js.Any.fromFunction1(customizeTooltip))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseGaugeTooltip]
  }
}

