package typings.echarts

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth extends js.Object {
  /**
    * Horizontal alignment of text, automatic by default.
    *
    * Options are:
    *
    * + `'left'`
    * + `'center'`
    * + `'right'`
    *
    * If `align` is not set in `rich`, `align` in parent
    * level will be used. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree.data.emphasis.label)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.align
    */
  var align: js.UndefOr[String] = js.undefined
  /**
    * Background color of the text fregment.
    *
    * Can be color string, like `'#123234'`, `'red'`, `rgba(0,23,11,0.3)'`.
    *
    * Or image can be used, for example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree.data.emphasis.label)
    *
    * `width` or `height` can be specified when using background
    * image, or auto adapted by default.
    *
    * If set as `'auto'`, the color will assigned as visual
    * color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.backgroundColor
    */
  var backgroundColor: js.UndefOr[js.Object | String] = js.undefined
  /**
    * Border color of the text fregment.
    *
    * If set as `'auto'`, the color will assigned as visual
    * color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.borderColor
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * Border radius of the text fregment.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.borderRadius
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  /**
    * Border width of the text fregment.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * text color.
    *
    * If set as `'auto'`, the color will assigned as visual
    * color, such as series color.
    *
    *
    * @default
    * ""#fff""
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.color
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Distance to the host graphic element.
    * Works when position is string value (like `'top'`、`'insideRight'`).
    *
    * See:
    * [label position](https://echarts.apache.org/examples/en/editor.html?c=doc-example/label-position)
    * .
    *
    *
    * @default
    * 5
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.distance
    */
  var distance: js.UndefOr[Double] = js.undefined
  /**
    * font family
    *
    * Can also be 'serif' , 'monospace', ...
    *
    *
    * @default
    * "sans-serif"
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.fontFamily
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * font size
    *
    *
    * @default
    * 12
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.fontSize
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * font style
    *
    * Options are:
    *
    * + `'normal'`
    * + `'italic'`
    * + `'oblique'`
    *
    *
    * @default
    * "normal"
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.fontStyle
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  /**
    * font thick weight
    *
    * Options are:
    *
    * + `'normal'`
    * + `'bold'`
    * + `'bolder'`
    * + `'lighter'`
    * + 100 | 200 | 300 | 400...
    *
    *
    * @default
    * "normal"
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.fontWeight
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  /**
    * Height of the text block.
    * It is the width of the text by default.
    * You may want to use it in some cases like using background
    * image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    * Notice, `width` and `height` only work when `rich`
    * specified.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.height
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * Line height of the text fregment.
    *
    * If `lineHeight` is not set in `rich`, `lineHeight`
    * in parent level will be used. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree.data.emphasis.label)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.lineHeight
    */
  var lineHeight: js.UndefOr[Double] = js.undefined
  /**
    * Whether to move text slightly.
    * For example: `[30, 40]` means move `30` horizontally
    * and move `40` vertically.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.offset
    */
  var offset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Padding of the text fregment, for example:
    *
    * + `padding: [3, 4, 5, 6]`: represents padding of
    * `[top, right, bottom, left]`.
    * + `padding: 4`: represents `padding: [4, 4, 4, 4]`.
    * + `padding: [3, 4]`: represents `padding: [3, 4,
    * 3, 4]`.
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.padding
    */
  var padding: js.UndefOr[js.Array[_] | Double] = js.undefined
  /**
    * Label position.
    *
    * **Followings are the options:**
    *
    * + \[x, y\]
    *
    * Use relative percentage, or absolute pixel values
    * to represent position of label relative to top-left
    * corner of bounding box. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree.data.emphasis.label)
    *
    * + 'top'
    *
    * + 'left'
    * + 'right'
    * + 'bottom'
    * + 'inside'
    * + 'insideLeft'
    * + 'insideRight'
    * + 'insideTop'
    * + 'insideBottom'
    * + 'insideTopLeft'
    * + 'insideBottomLeft'
    * + 'insideTopRight'
    * + 'insideBottomRight'
    *
    * See:
    * [label position](https://echarts.apache.org/examples/en/view.html?c=doc-example/label-position)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.position
    */
  var position: js.UndefOr[js.Array[_] | String] = js.undefined
  /**
    * "Rich text styles" can be defined in this `rich`
    * property. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree.data.emphasis.label)
    *
    * For more details, see
    * [Rich Text](https://echarts.apache.org/en/option.htmltutorial.html#Rich%20Text)
    * please.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.rich
    */
  var rich: js.UndefOr[
    /**
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.rich.%3Cuser%20defined%20style%20name%3E
    */
  StringDictionary[Anon_Align]
  ] = js.undefined
  /**
    * Rotate label, from -90 degree to 90, positive value
    * represents rotate anti-clockwise.
    *
    * See:
    * [label rotation](https://echarts.apache.org/examples/en/editor.html?c=bar-label-rotation)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.rotate
    */
  var rotate: js.UndefOr[Double] = js.undefined
  /**
    * Show blur of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color of the text block.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Shadow X offset of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Shadow Y offset of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  /**
    * Whether to show label.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * Storke color of the text.
    *
    * If set as `'auto'`, the color will assigned as visual
    * color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.textBorderColor
    */
  var textBorderColor: js.UndefOr[String] = js.undefined
  /**
    * Storke line width of the text.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.textBorderWidth
    */
  var textBorderWidth: js.UndefOr[Double] = js.undefined
  /**
    * Shadow blue of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.textShadowBlur
    */
  var textShadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color of the text itself.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.textShadowColor
    */
  var textShadowColor: js.UndefOr[String] = js.undefined
  /**
    * Shadow X offset of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.textShadowOffsetX
    */
  var textShadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Shadow Y offset of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.textShadowOffsetY
    */
  var textShadowOffsetY: js.UndefOr[Double] = js.undefined
  /**
    * Vertical alignment of text, automatic by default.
    *
    * Options are:
    *
    * + `'top'`
    * + `'middle'`
    * + `'bottom'`
    *
    * If `verticalAlign` is not set in `rich`, `verticalAlign`
    * in parent level will be used. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree.data.emphasis.label)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.verticalAlign
    */
  var verticalAlign: js.UndefOr[String] = js.undefined
  /**
    * Width of the text block.
    * It is the width of the text by default.
    * In most cases, there is no need to specify it.
    * You may want to use it in some cases like make simple
    * table or using background image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    * `width` can also be percent string, like `'100%'`,
    * which represents the percent of `contentWidth` (that
    * is, the width without `padding`) of its container
    * box.
    * It is based on `contentWidth` because that each text
    * fregment is layout based on the `content box`, where
    * it makes no sense that calculating width based on
    * `outerWith` in prectice.
    *
    * Notice, `width` and `height` only work when `rich`
    * specified.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.width
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth {
  @scala.inline
  def apply(
    align: String = null,
    backgroundColor: js.Object | String = null,
    borderColor: String = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    color: String = null,
    distance: Int | Double = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: String = null,
    fontWeight: String = null,
    height: Double | String = null,
    lineHeight: Int | Double = null,
    offset: js.Array[_] = null,
    padding: js.Array[_] | Double = null,
    position: js.Array[_] | String = null,
    rich: /**
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label.rich.%3Cuser%20defined%20style%20name%3E
    */
  StringDictionary[Anon_Align] = null,
    rotate: Int | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined,
    textBorderColor: String = null,
    textBorderWidth: Int | Double = null,
    textShadowBlur: Int | Double = null,
    textShadowColor: String = null,
    textShadowOffsetX: Int | Double = null,
    textShadowOffsetY: Int | Double = null,
    verticalAlign: String = null,
    width: Double | String = null
  ): Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rich != null) __obj.updateDynamic("rich")(rich.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (textBorderColor != null) __obj.updateDynamic("textBorderColor")(textBorderColor.asInstanceOf[js.Any])
    if (textBorderWidth != null) __obj.updateDynamic("textBorderWidth")(textBorderWidth.asInstanceOf[js.Any])
    if (textShadowBlur != null) __obj.updateDynamic("textShadowBlur")(textShadowBlur.asInstanceOf[js.Any])
    if (textShadowColor != null) __obj.updateDynamic("textShadowColor")(textShadowColor.asInstanceOf[js.Any])
    if (textShadowOffsetX != null) __obj.updateDynamic("textShadowOffsetX")(textShadowOffsetX.asInstanceOf[js.Any])
    if (textShadowOffsetY != null) __obj.updateDynamic("textShadowOffsetY")(textShadowOffsetY.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth]
  }
}

