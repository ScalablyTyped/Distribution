package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Blur
import typings.devextreme.anon.CornerRadius
import typings.devextreme.anon.Url
import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.image
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.text
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import typings.std.Date
import typings.std.Element
import typings.std.SVGElement
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartAnnotationConfig extends dxChartCommonAnnotationConfig {
  /** @name dxChartAnnotationConfig.name */
  var name: js.UndefOr[String] = js.undefined
}

object dxChartAnnotationConfig {
  @scala.inline
  def apply(
    allowDragging: js.UndefOr[Boolean] = js.undefined,
    argument: Double | Date | String = null,
    arrowLength: js.UndefOr[Double] = js.undefined,
    arrowWidth: js.UndefOr[Double] = js.undefined,
    axis: String = null,
    border: CornerRadius = null,
    color: String = null,
    customizeTooltip: /* annotation */ dxChartAnnotationConfig | js.Any => _ = null,
    data: js.Any = null,
    description: String = null,
    font: Font = null,
    height: js.UndefOr[Double] = js.undefined,
    image: String | Url = null,
    name: String = null,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    paddingLeftRight: js.UndefOr[Double] = js.undefined,
    paddingTopBottom: js.UndefOr[Double] = js.undefined,
    series: String = null,
    shadow: Blur = null,
    template: template | (js.Function2[
      /* annotation */ dxChartAnnotationConfig | js.Any, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ]) = null,
    text: String = null,
    textOverflow: ellipsis | hide | none = null,
    tooltipEnabled: js.UndefOr[Boolean] = js.undefined,
    tooltipTemplate: template | (js.Function2[
      /* annotation */ dxChartAnnotationConfig | js.Any, 
      /* element */ dxElement, 
      String | Element | JQuery
    ]) = null,
    `type`: text | image | custom = null,
    value: Double | Date | String = null,
    width: js.UndefOr[Double] = js.undefined,
    wordWrap: normal | breakWord | none = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): dxChartAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDragging)) __obj.updateDynamic("allowDragging")(allowDragging.get.asInstanceOf[js.Any])
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowLength)) __obj.updateDynamic("arrowLength")(arrowLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowWidth)) __obj.updateDynamic("arrowWidth")(arrowWidth.get.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (customizeTooltip != null) __obj.updateDynamic("customizeTooltip")(js.Any.fromFunction1(customizeTooltip))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeftRight)) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTopBottom)) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.get.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipEnabled)) __obj.updateDynamic("tooltipEnabled")(tooltipEnabled.get.asInstanceOf[js.Any])
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartAnnotationConfig]
  }
}

