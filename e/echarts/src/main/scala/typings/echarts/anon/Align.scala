package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Align extends js.Object {
  
  /**
    * Horizontal alignment of text, automatic by
    * default.
    *
    * Options are:
    *
    * + `'left'`
    * + `'center'`
    * + `'right'`
    *
    * If `align` is not set in `rich`, `align`
    * in parent level will be used.
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.align
    */
  var align: js.UndefOr[String] = js.native
  
  /**
    * Background color of the text fregment.
    *
    * Can be color string, like `'#123234'`, `'red'`,
    * `rgba(0,23,11,0.3)'`.
    *
    * Or image can be used, for example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E)
    *
    * `width` or `height` can be specified when
    * using background image, or auto adapted by
    * default.
    *
    * If set as `'auto'`, the color will assigned
    * as visual color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.backgroundColor
    */
  var backgroundColor: js.UndefOr[js.Object | String] = js.native
  
  /**
    * Border color of the text fregment.
    *
    * If set as `'auto'`, the color will assigned
    * as visual color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.borderColor
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /**
    * Border radius of the text fregment.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.borderRadius
    */
  var borderRadius: js.UndefOr[Double] = js.native
  
  /**
    * Border width of the text fregment.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * text color.
    *
    * If set as `'auto'`, the color will assigned
    * as visual color, such as series color.
    *
    *
    * @default
    * ""#fff""
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.color
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * font family
    *
    * Can also be 'serif' , 'monospace', ...
    *
    *
    * @default
    * "sans-serif"
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.fontFamily
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /**
    * font size
    *
    *
    * @default
    * 12
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.fontSize
    */
  var fontSize: js.UndefOr[Double] = js.native
  
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.fontStyle
    */
  var fontStyle: js.UndefOr[String] = js.native
  
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.fontWeight
    */
  var fontWeight: js.UndefOr[String | Double] = js.native
  
  /**
    * Height of the text block.
    * It is the width of the text by default.
    * You may want to use it in some cases like
    * using background image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the
    * width and height of the content, without
    * `padding`.
    *
    * Notice, `width` and `height` only work when
    * `rich` specified.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.height
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * Line height of the text fregment.
    *
    * If `lineHeight` is not set in `rich`, `lineHeight`
    * in parent level will be used.
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.lineHeight
    */
  var lineHeight: js.UndefOr[Double] = js.native
  
  /**
    * Padding of the text fregment, for example:
    *
    * + `padding: [3, 4, 5, 6]`: represents padding
    * of `[top, right, bottom, left]`.
    * + `padding: 4`: represents `padding: [4,
    * 4, 4, 4]`.
    * + `padding: [3, 4]`: represents `padding:
    * [3, 4, 3, 4]`.
    *
    * Notice, `width` and `height` specifies the
    * width and height of the content, without
    * `padding`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.padding
    */
  var padding: js.UndefOr[js.Array[_] | Double] = js.native
  
  /**
    * Show blur of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  
  /**
    * Shadow color of the text block.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.native
  
  /**
    * Shadow X offset of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  /**
    * Shadow Y offset of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  
  /**
    * Storke color of the text.
    *
    * If set as `'auto'`, the color will assigned
    * as visual color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.textBorderColor
    */
  var textBorderColor: js.UndefOr[String] = js.native
  
  /**
    * Storke line width of the text.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.textBorderWidth
    */
  var textBorderWidth: js.UndefOr[Double] = js.native
  
  /**
    * Shadow blue of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.textShadowBlur
    */
  var textShadowBlur: js.UndefOr[Double] = js.native
  
  /**
    * Shadow color of the text itself.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.textShadowColor
    */
  var textShadowColor: js.UndefOr[String] = js.native
  
  /**
    * Shadow X offset of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.textShadowOffsetX
    */
  var textShadowOffsetX: js.UndefOr[Double] = js.native
  
  /**
    * Shadow Y offset of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.textShadowOffsetY
    */
  var textShadowOffsetY: js.UndefOr[Double] = js.native
  
  /**
    * Vertical alignment of text, automatic by
    * default.
    *
    * Options are:
    *
    * + `'top'`
    * + `'middle'`
    * + `'bottom'`
    *
    * If `verticalAlign` is not set in `rich`,
    * `verticalAlign` in parent level will be used.
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.verticalAlign
    */
  var verticalAlign: js.UndefOr[String] = js.native
  
  /**
    * Width of the text block.
    * It is the width of the text by default.
    * In most cases, there is no need to specify
    * it.
    * You may want to use it in some cases like
    * make simple table or using background image
    * (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the
    * width and height of the content, without
    * `padding`.
    *
    * `width` can also be percent string, like
    * `'100%'`, which represents the percent of
    * `contentWidth` (that is, the width without
    * `padding`) of its container box.
    * It is based on `contentWidth` because that
    * each text fregment is layout based on the
    * `content box`, where it makes no sense that
    * calculating width based on `outerWith` in
    * prectice.
    *
    * Notice, `width` and `height` only work when
    * `rich` specified.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E.width
    */
  var width: js.UndefOr[Double | String] = js.native
}
object Align {
  
  @scala.inline
  def apply(): Align = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit class AlignOps[Self <: Align] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: js.Object | String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String | Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: js.Any*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: js.Array[_] | Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
    
    @scala.inline
    def setTextBorderColor(value: String): Self = this.set("textBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBorderColor: Self = this.set("textBorderColor", js.undefined)
    
    @scala.inline
    def setTextBorderWidth(value: Double): Self = this.set("textBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBorderWidth: Self = this.set("textBorderWidth", js.undefined)
    
    @scala.inline
    def setTextShadowBlur(value: Double): Self = this.set("textShadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowBlur: Self = this.set("textShadowBlur", js.undefined)
    
    @scala.inline
    def setTextShadowColor(value: String): Self = this.set("textShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowColor: Self = this.set("textShadowColor", js.undefined)
    
    @scala.inline
    def setTextShadowOffsetX(value: Double): Self = this.set("textShadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowOffsetX: Self = this.set("textShadowOffsetX", js.undefined)
    
    @scala.inline
    def setTextShadowOffsetY(value: Double): Self = this.set("textShadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowOffsetY: Self = this.set("textShadowOffsetY", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: String): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
