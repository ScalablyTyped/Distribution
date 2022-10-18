package typings.echarts.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextShadowBlur extends StObject {
  
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
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.breadcrumb.emphasis.itemStyle.textStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.align
    */
  var align: js.UndefOr[String] = js.undefined
  
  /**
    * Background color of the text fregment.
    *
    * Can be color string, like `'#123234'`, `'red'`,
    * `rgba(0,23,11,0.3)'`.
    *
    * Or image can be used, for example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.breadcrumb.emphasis.itemStyle.textStyle)
    *
    * `width` or `height` can be specified when using
    * background image, or auto adapted by default.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.backgroundColor
    */
  var backgroundColor: js.UndefOr[js.Object | String] = js.undefined
  
  /**
    * Border color of the text fregment.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.borderColor
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Border radius of the text fregment.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.borderRadius
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Border width of the text fregment.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * text color.
    *
    *
    * @default
    * "#fff"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.color
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * font family
    *
    * Can also be 'serif' , 'monospace', ...
    *
    *
    * @default
    * "sans-serif"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.fontFamily
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * font size
    *
    *
    * @default
    * 12
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.fontSize
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.fontStyle
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.fontWeight
    */
  var fontWeight: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Height of the text block.
    * It is the width of the text by default.
    * You may want to use it in some cases like using
    * background image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    * Notice, `width` and `height` only work when `rich`
    * specified.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.height
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Line height of the text fregment.
    *
    * If `lineHeight` is not set in `rich`, `lineHeight`
    * in parent level will be used. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.breadcrumb.emphasis.itemStyle.textStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.lineHeight
    */
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Padding of the text fregment, for example:
    *
    * + `padding: [3, 4, 5, 6]`: represents padding
    * of `[top, right, bottom, left]`.
    * + `padding: 4`: represents `padding: [4, 4, 4,
    * 4]`.
    * + `padding: [3, 4]`: represents `padding: [3,
    * 4, 3, 4]`.
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.padding
    */
  var padding: js.UndefOr[js.Array[Any] | Double] = js.undefined
  
  /**
    * "Rich text styles" can be defined in this `rich`
    * property. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.breadcrumb.emphasis.itemStyle.textStyle)
    *
    * For more details, see
    * [Rich Text](https://echarts.apache.org/en/option.htmltutorial.html#Rich%20Text)
    * please.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.rich
    */
  var rich: js.UndefOr[
    /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.rich.%3Cuser%20defined%20style%20name%3E
    */
  StringDictionary[Align]
  ] = js.undefined
  
  /**
    * Show blur of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow color of the text block.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  
  /**
    * Shadow X offset of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow Y offset of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * Storke color of the text.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.textBorderColor
    */
  var textBorderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Storke line width of the text.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.textBorderWidth
    */
  var textBorderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow blue of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.textShadowBlur
    */
  var textShadowBlur: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow color of the text itself.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.textShadowColor
    */
  var textShadowColor: js.UndefOr[String] = js.undefined
  
  /**
    * Shadow X offset of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.textShadowOffsetX
    */
  var textShadowOffsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow Y offset of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.textShadowOffsetY
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
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.breadcrumb.emphasis.itemStyle.textStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.verticalAlign
    */
  var verticalAlign: js.UndefOr[String] = js.undefined
  
  /**
    * Width of the text block.
    * It is the width of the text by default.
    * In most cases, there is no need to specify it.
    * You may want to use it in some cases like make
    * simple table or using background image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    * `width` can also be percent string, like `'100%'`,
    * which represents the percent of `contentWidth`
    * (that is, the width without `padding`) of its
    * container box.
    * It is based on `contentWidth` because that each
    * text fregment is layout based on the `content
    * box`, where it makes no sense that calculating
    * width based on `outerWith` in prectice.
    *
    * Notice, `width` and `height` only work when `rich`
    * specified.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.width
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object TextShadowBlur {
  
  inline def apply(): TextShadowBlur = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextShadowBlur]
  }
  
  extension [Self <: TextShadowBlur](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBackgroundColor(value: js.Object | String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: String | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setPadding(value: js.Array[Any] | Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Any*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setRich(
      value: /**
      * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle.rich.%3Cuser%20defined%20style%20name%3E
      */
    StringDictionary[Align]
    ): Self = StObject.set(x, "rich", value.asInstanceOf[js.Any])
    
    inline def setRichUndefined: Self = StObject.set(x, "rich", js.undefined)
    
    inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
    
    inline def setTextBorderColor(value: String): Self = StObject.set(x, "textBorderColor", value.asInstanceOf[js.Any])
    
    inline def setTextBorderColorUndefined: Self = StObject.set(x, "textBorderColor", js.undefined)
    
    inline def setTextBorderWidth(value: Double): Self = StObject.set(x, "textBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setTextBorderWidthUndefined: Self = StObject.set(x, "textBorderWidth", js.undefined)
    
    inline def setTextShadowBlur(value: Double): Self = StObject.set(x, "textShadowBlur", value.asInstanceOf[js.Any])
    
    inline def setTextShadowBlurUndefined: Self = StObject.set(x, "textShadowBlur", js.undefined)
    
    inline def setTextShadowColor(value: String): Self = StObject.set(x, "textShadowColor", value.asInstanceOf[js.Any])
    
    inline def setTextShadowColorUndefined: Self = StObject.set(x, "textShadowColor", js.undefined)
    
    inline def setTextShadowOffsetX(value: Double): Self = StObject.set(x, "textShadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def setTextShadowOffsetXUndefined: Self = StObject.set(x, "textShadowOffsetX", js.undefined)
    
    inline def setTextShadowOffsetY(value: Double): Self = StObject.set(x, "textShadowOffsetY", value.asInstanceOf[js.Any])
    
    inline def setTextShadowOffsetYUndefined: Self = StObject.set(x, "textShadowOffsetY", js.undefined)
    
    inline def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
