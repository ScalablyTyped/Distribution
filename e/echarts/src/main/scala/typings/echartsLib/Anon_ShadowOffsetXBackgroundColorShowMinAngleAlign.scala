package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ShadowOffsetXBackgroundColorShowMinAngleAlign extends js.Object {
  /**
    * Align of text, which can be `'left'`, `'center'`, or
    * `'right'`.
    * Note that `'left'` stands for inner side, and `'right'`
    * stands for outer side.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst.data.label)
    *
    *
    * @default
    * "center"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.align
    */
  var align: js.UndefOr[java.lang.String] = js.native
  /**
    * Background color of the text fregment.
    *
    * Can be color string, like `'#123234'`, `'red'`, `rgba(0,23,11,0.3)'`.
    *
    * Or image can be used, for example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst.data.label)
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.backgroundColor
    */
  var backgroundColor: js.UndefOr[js.Object | java.lang.String] = js.native
  /**
    * Border color of the text fregment.
    *
    * If set as `'auto'`, the color will assigned as visual
    * color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.borderColor
    */
  var borderColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Border radius of the text fregment.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.borderRadius
    */
  var borderRadius: js.UndefOr[scala.Double] = js.native
  /**
    * Border width of the text fregment.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.borderWidth
    */
  var borderWidth: js.UndefOr[scala.Double] = js.native
  /**
    * text color.
    *
    * If set as `'auto'`, the color will assigned as visual
    * color, such as series color.
    *
    *
    * @default
    * ""#fff""
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.color
    */
  var color: js.UndefOr[java.lang.String] = js.native
  /**
    * Distance to the host graphic element.
    * Works when position is string value (like `'top'`、`'insideRight'`).
    *
    * See:
    * [label position](https://ecomfe.github.io/echarts-examples/public/editor.html?c=doc-example/label-position)
    * .
    *
    *
    * @default
    * 5
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.distance
    */
  var distance: js.UndefOr[scala.Double] = js.native
  /**
    * font family
    *
    * Can also be 'serif' , 'monospace', ...
    *
    *
    * @default
    * "sans-serif"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.fontFamily
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.native
  /**
    * font size
    *
    *
    * @default
    * 12
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.fontSize
    */
  var fontSize: js.UndefOr[scala.Double] = js.native
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.fontStyle
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.native
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.fontWeight
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.native
  /**
    * Data label formatter, which supports string template
    * and callback function.
    * In either form, `\n` is supported to represent a new
    * line.
    *
    * **String template**
    *
    * Model variation includes:
    *
    * + `{a}`: series name.
    * + `{b}`: the name of a data item.
    * + `{c}`: the value of a data item.
    * + `{@xxx}: the value of a dimension named`'xxx'`, for
    * example,`{@product}`refers the value of`'product'\` dimension。
    * + `{@[n]}: the value of a dimension at the index of`n`,
    * for example,`{@\[3\]}\` refers the value at dimensions\[3\].
    *
    * **example:**
    *
    * ```
    * formatter: '{b}: {@score}'
    *
    * ```
    *
    * **Callback function**
    *
    * Callback function is in form of:
    *
    * ```
    * (params: Object|Array) => string
    *
    * ```
    *
    * where `params` is the single dataset needed by formatter,
    * which is formed as:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst.data.label)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.formatter
    */
  var formatter: js.UndefOr[js.Function | java.lang.String] = js.native
  /**
    * Height of the text block.
    * It is the width of the text by default.
    * You may want to use it in some cases like using background
    * image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width and
    * height of the content, without `padding`.
    *
    * Notice, `width` and `height` only work when `rich` specified.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.height
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.native
  /**
    * Line height of the text fregment.
    *
    * If `lineHeight` is not set in `rich`, `lineHeight` in
    * parent level will be used. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst.data.label)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.lineHeight
    */
  var lineHeight: js.UndefOr[scala.Double] = js.native
  /**
    * If angle of data piece is smaller than this value (in
    * degrees), then text is not displayed.
    * This is used for hiding text for small piece of data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.minAngle
    */
  var minAngle: js.UndefOr[scala.Double] = js.native
  /**
    * Whether to move text slightly.
    * For example: `[30, 40]` means move `30` horizontally
    * and move `40` vertically.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.offset
    */
  var offset: js.UndefOr[js.Array[_]] = js.native
  /**
    * Padding of the text fregment, for example:
    *
    * + `padding: [3, 4, 5, 6]`: represents padding of `[top,
    * right, bottom, left]`.
    * + `padding: 4`: represents `padding: [4, 4, 4, 4]`.
    * + `padding: [3, 4]`: represents `padding: [3, 4, 3, 4]`.
    *
    * Notice, `width` and `height` specifies the width and
    * height of the content, without `padding`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.padding
    */
  var padding: js.UndefOr[js.Array[_] | scala.Double] = js.native
  /**
    * Label position.
    *
    * **Followings are the options:**
    *
    * + \[x, y\]
    *
    * Use relative percentage, or absolute pixel values to
    * represent position of label relative to top-left corner
    * of bounding box. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst.data.label)
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
    * [label position](https://ecomfe.github.io/echarts-examples/public/view.html?c=doc-example/label-position)
    * .
    *
    *
    * @default
    * "inside"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.position
    */
  var position: js.UndefOr[js.Array[_] | java.lang.String] = js.native
  /**
    * "Rich text styles" can be defined in this `rich` property.
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst.data.label)
    *
    * For more details, see
    * [Rich Text](https://ecomfe.github.io/echarts-doc/public/en/option.htmltutorial.html#Rich%20Text)
    * please.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.rich
    */
  var rich: /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.rich.%3Cuser%20defined%20style%20name%3E
    */
  js.UndefOr[
    /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.rich.%3Cuser%20defined%20style%20name%3E
    */
  org.scalablytyped.runtime.StringDictionary[Anon_ShadowOffsetX]
  ] = js.native
  /**
    * If it is `number` type, then is stands for rotation,
    * from -90 degrees to 90 degrees, and positive values stand
    * for counterclockwise.
    *
    * Besides, it can be string `'radial'`, standing for radial
    * rotation; or `'tangential'`, standing for tangential
    * rotation.
    *
    * By default, it is `'radial'`.
    * If no rotation is wanted, it can be set to `0`.
    *
    * The following example shows different `rotate` settings:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst.data.label)
    *
    *
    * @default
    * "radial"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.rotate
    */
  var rotate: js.UndefOr[scala.Double | java.lang.String] = js.native
  /**
    * Show blur of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow color of the text block.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Shadow X offset of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow Y offset of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.native
  /**
    * Whether to show label.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.show
    */
  var show: js.UndefOr[scala.Boolean] = js.native
  /**
    * Storke color of the text.
    *
    * If set as `'auto'`, the color will assigned as visual
    * color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.textBorderColor
    */
  var textBorderColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Storke line width of the text.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.textBorderWidth
    */
  var textBorderWidth: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow blue of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.textShadowBlur
    */
  var textShadowBlur: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow color of the text itself.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.textShadowColor
    */
  var textShadowColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Shadow X offset of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.textShadowOffsetX
    */
  var textShadowOffsetX: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow Y offset of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.textShadowOffsetY
    */
  var textShadowOffsetY: js.UndefOr[scala.Double] = js.native
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst.data.label)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.verticalAlign
    */
  var verticalAlign: js.UndefOr[java.lang.String] = js.native
  /**
    * Width of the text block.
    * It is the width of the text by default.
    * In most cases, there is no need to specify it.
    * You may want to use it in some cases like make simple
    * table or using background image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width and
    * height of the content, without `padding`.
    *
    * `width` can also be percent string, like `'100%'`, which
    * represents the percent of `contentWidth` (that is, the
    * width without `padding`) of its container box.
    * It is based on `contentWidth` because that each text
    * fregment is layout based on the `content box`, where
    * it makes no sense that calculating width based on `outerWith`
    * in prectice.
    *
    * Notice, `width` and `height` only work when `rich` specified.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label.width
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.native
}

