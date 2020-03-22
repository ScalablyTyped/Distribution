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
  /** Specifies whether users can drag and drop the annotation. */
  var allowDragging: js.UndefOr[Boolean] = js.undefined
  /** Positions the annotation relative to a specific argument. */
  var argument: js.UndefOr[Double | Date | String] = js.undefined
  /** Specifies the length of the annotation's arrow in pixels. */
  var arrowLength: js.UndefOr[Double] = js.undefined
  /** Specifies the width of the annotation's arrow at its junction with the annotation rectangle. */
  var arrowWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the name of the value axis on which the value is specified. Useful for a multi-axis chart. */
  var axis: js.UndefOr[String] = js.undefined
  /** Configures the appearance of the annotation's border. */
  var border: js.UndefOr[AnonCornerRadius] = js.undefined
  /** Specifies the color that fills the annotation. */
  var color: js.UndefOr[String] = js.undefined
  /** Customizes the text and appearance of the annotation's tooltip. */
  var customizeTooltip: js.UndefOr[js.Function1[/* annotation */ dxChartAnnotationConfig | js.Any, _]] = js.undefined
  /** A container for custom data. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Specifies the annotation's description displayed in the tooltip. */
  var description: js.UndefOr[String] = js.undefined
  /** Specifies the annotation's font options. Applies only to text annotations. */
  var font: js.UndefOr[Font] = js.undefined
  /** Specifies the annotation's height in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  /** Configures the image to be displayed in the annotation. Applies only if the type is "image". */
  var image: js.UndefOr[String | AnonUrl] = js.undefined
  /** Moves the annotation horizontally. */
  var offsetX: js.UndefOr[Double] = js.undefined
  /** Moves the annotation vertically. */
  var offsetY: js.UndefOr[Double] = js.undefined
  /** Specifies the annotation's opacity. */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Along with paddingTopBottom, generates an empty space around the annotation's text or image; specified in pixels. */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  /** Along with paddingLeftRight, generates an empty space around the annotation's text or image; specified in pixels. */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  /** Anchors the annotation to a series point. Accepts the name of the point's series. */
  var series: js.UndefOr[String] = js.undefined
  /** Configures the annotation's shadows. */
  var shadow: js.UndefOr[AnonBlur] = js.undefined
  /** Specifies a custom template for the annotation. */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* annotation */ dxChartAnnotationConfig | js.Any, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.undefined
  /** Specifies the annotation's text. Applies only if the type is "text". */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies what to do with the annotation's text when it overflows the allocated space after applying wordWrap: hide, truncate it and display an ellipsis, or do nothing. */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  /** Specifies whether the annotation tooltip is enabled. */
  var tooltipEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies a custom template for an annotation's tooltip. */
  var tooltipTemplate: js.UndefOr[
    template | (js.Function2[
      /* annotation */ dxChartAnnotationConfig | js.Any, 
      /* element */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies whether the annotation displays a text or an image. This is a required setting. */
  var `type`: js.UndefOr[text | image | custom] = js.undefined
  /** Positions the annotation relative to a value on the specified value axis. */
  var value: js.UndefOr[Double | Date | String] = js.undefined
  /** Specifies the annotation's width in pixels. */
  var width: js.UndefOr[Double] = js.undefined
  /** Specifies how to wrap the annotation's text if it does not fit into a single line. */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
  /** Along with y, positions the annotation's center at a specific pixel coordinate. (0, 0) is the upper left corner of the chart. */
  var x: js.UndefOr[Double] = js.undefined
  /** Along with x, positions the annotation's center at a specific pixel coordinate. (0, 0) is the upper left corner of the chart. */
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

