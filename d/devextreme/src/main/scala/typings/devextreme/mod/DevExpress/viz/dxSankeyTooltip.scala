package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Blur
import typings.devextreme.anon.DashStyleOpacity
import typings.devextreme.anon.Source
import typings.devextreme.anon.Title
import typings.devextreme.anon.WeightIn
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.format
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyTooltip extends BaseWidgetTooltip {
  /** @name dxSankey.Options.tooltip.customizeLinkTooltip */
  var customizeLinkTooltip: js.UndefOr[js.Function1[/* info */ Source, _]] = js.undefined
  /** @name dxSankey.Options.tooltip.customizeNodeTooltip */
  var customizeNodeTooltip: js.UndefOr[js.Function1[/* info */ Title, _]] = js.undefined
  /** @name dxSankey.Options.tooltip.linkTooltipTemplate */
  var linkTooltipTemplate: js.UndefOr[
    template | (js.Function2[/* info */ Source, /* element */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** @name dxSankey.Options.tooltip.nodeTooltipTemplate */
  var nodeTooltipTemplate: js.UndefOr[
    template | (js.Function2[/* info */ WeightIn, /* element */ dxElement, String | Element | JQuery])
  ] = js.undefined
}

object dxSankeyTooltip {
  @scala.inline
  def apply(
    arrowLength: js.UndefOr[Double] = js.undefined,
    border: DashStyleOpacity = null,
    color: String = null,
    container: String | Element | JQuery = null,
    cornerRadius: js.UndefOr[Double] = js.undefined,
    customizeLinkTooltip: /* info */ Source => _ = null,
    customizeNodeTooltip: /* info */ Title => _ = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    font: Font = null,
    format: format = null,
    linkTooltipTemplate: template | (js.Function2[/* info */ Source, /* element */ dxElement, String | Element | JQuery]) = null,
    nodeTooltipTemplate: template | (js.Function2[/* info */ WeightIn, /* element */ dxElement, String | Element | JQuery]) = null,
    opacity: js.UndefOr[Double] = js.undefined,
    paddingLeftRight: js.UndefOr[Double] = js.undefined,
    paddingTopBottom: js.UndefOr[Double] = js.undefined,
    shadow: Blur = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): dxSankeyTooltip = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowLength)) __obj.updateDynamic("arrowLength")(arrowLength.get.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(cornerRadius)) __obj.updateDynamic("cornerRadius")(cornerRadius.get.asInstanceOf[js.Any])
    if (customizeLinkTooltip != null) __obj.updateDynamic("customizeLinkTooltip")(js.Any.fromFunction1(customizeLinkTooltip))
    if (customizeNodeTooltip != null) __obj.updateDynamic("customizeNodeTooltip")(js.Any.fromFunction1(customizeNodeTooltip))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (linkTooltipTemplate != null) __obj.updateDynamic("linkTooltipTemplate")(linkTooltipTemplate.asInstanceOf[js.Any])
    if (nodeTooltipTemplate != null) __obj.updateDynamic("nodeTooltipTemplate")(nodeTooltipTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeftRight)) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTopBottom)) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.get.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSankeyTooltip]
  }
}

