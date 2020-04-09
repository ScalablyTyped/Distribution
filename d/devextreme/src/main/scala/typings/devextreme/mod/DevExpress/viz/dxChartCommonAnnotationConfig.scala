package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonBlur
import typings.devextreme.AnonCornerRadius
import typings.devextreme.AnonUrl
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
import typings.devextreme.mod._Global_.JQuery
import typings.std.Date
import typings.std.Element
import typings.std.SVGElement
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonAnnotationConfig extends js.Object {
  /** @name dxChartCommonAnnotationConfig.allowDragging */
  var allowDragging: js.UndefOr[Boolean] = js.undefined
  /** @name dxChartCommonAnnotationConfig.argument */
  var argument: js.UndefOr[Double | Date | String] = js.undefined
  /** @name dxChartCommonAnnotationConfig.arrowLength */
  var arrowLength: js.UndefOr[Double] = js.undefined
  /** @name dxChartCommonAnnotationConfig.arrowWidth */
  var arrowWidth: js.UndefOr[Double] = js.undefined
  /** @name dxChartCommonAnnotationConfig.axis */
  var axis: js.UndefOr[String] = js.undefined
  /** @name dxChartCommonAnnotationConfig.border */
  var border: js.UndefOr[AnonCornerRadius] = js.undefined
  /** @name dxChartCommonAnnotationConfig.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxChartCommonAnnotationConfig.customizeTooltip */
  var customizeTooltip: js.UndefOr[js.Function1[/* annotation */ dxChartAnnotationConfig | js.Any, _]] = js.undefined
  /** @name dxChartCommonAnnotationConfig.data */
  var data: js.UndefOr[js.Any] = js.undefined
  /** @name dxChartCommonAnnotationConfig.description */
  var description: js.UndefOr[String] = js.undefined
  /** @name dxChartCommonAnnotationConfig.font */
  var font: js.UndefOr[Font] = js.undefined
  /** @name dxChartCommonAnnotationConfig.height */
  var height: js.UndefOr[Double] = js.undefined
  /** @name dxChartCommonAnnotationConfig.image */
  var image: js.UndefOr[String | AnonUrl] = js.undefined
  /** @name dxChartCommonAnnotationConfig.offsetX */
  var offsetX: js.UndefOr[Double] = js.undefined
  /** @name dxChartCommonAnnotationConfig.offsetY */
  var offsetY: js.UndefOr[Double] = js.undefined
  /** @name dxChartCommonAnnotationConfig.opacity */
  var opacity: js.UndefOr[Double] = js.undefined
  /** @name dxChartCommonAnnotationConfig.paddingLeftRight */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  /** @name dxChartCommonAnnotationConfig.paddingTopBottom */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  /** @name dxChartCommonAnnotationConfig.series */
  var series: js.UndefOr[String] = js.undefined
  /** @name dxChartCommonAnnotationConfig.shadow */
  var shadow: js.UndefOr[AnonBlur] = js.undefined
  /** @name dxChartCommonAnnotationConfig.template */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* annotation */ dxChartAnnotationConfig | js.Any, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.undefined
  /** @name dxChartCommonAnnotationConfig.text */
  var text: js.UndefOr[String] = js.undefined
  /** @name dxChartCommonAnnotationConfig.textOverflow */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  /** @name dxChartCommonAnnotationConfig.tooltipEnabled */
  var tooltipEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxChartCommonAnnotationConfig.tooltipTemplate */
  var tooltipTemplate: js.UndefOr[
    template | (js.Function2[
      /* annotation */ dxChartAnnotationConfig | js.Any, 
      /* element */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxChartCommonAnnotationConfig.type */
  var `type`: js.UndefOr[text | image | custom] = js.undefined
  /** @name dxChartCommonAnnotationConfig.value */
  var value: js.UndefOr[Double | Date | String] = js.undefined
  /** @name dxChartCommonAnnotationConfig.width */
  var width: js.UndefOr[Double] = js.undefined
  /** @name dxChartCommonAnnotationConfig.wordWrap */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
  /** @name dxChartCommonAnnotationConfig.x */
  var x: js.UndefOr[Double] = js.undefined
  /** @name dxChartCommonAnnotationConfig.y */
  var y: js.UndefOr[Double] = js.undefined
}

object dxChartCommonAnnotationConfig {
  @scala.inline
  def apply(
    allowDragging: js.UndefOr[Boolean] = js.undefined,
    argument: Double | Date | String = null,
    arrowLength: Int | Double = null,
    arrowWidth: Int | Double = null,
    axis: String = null,
    border: AnonCornerRadius = null,
    color: String = null,
    customizeTooltip: /* annotation */ dxChartAnnotationConfig | js.Any => _ = null,
    data: js.Any = null,
    description: String = null,
    font: Font = null,
    height: Int | Double = null,
    image: String | AnonUrl = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    opacity: Int | Double = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null,
    series: String = null,
    shadow: AnonBlur = null,
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
    width: Int | Double = null,
    wordWrap: normal | breakWord | none = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): dxChartCommonAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDragging)) __obj.updateDynamic("allowDragging")(allowDragging.asInstanceOf[js.Any])
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    if (arrowLength != null) __obj.updateDynamic("arrowLength")(arrowLength.asInstanceOf[js.Any])
    if (arrowWidth != null) __obj.updateDynamic("arrowWidth")(arrowWidth.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (customizeTooltip != null) __obj.updateDynamic("customizeTooltip")(js.Any.fromFunction1(customizeTooltip))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipEnabled)) __obj.updateDynamic("tooltipEnabled")(tooltipEnabled.asInstanceOf[js.Any])
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonAnnotationConfig]
  }
}

