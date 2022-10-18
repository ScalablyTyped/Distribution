package typings.echarts.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextBorderColor extends StObject {
  
  /**
    * Background color of the text fregment.
    *
    * Can be color string, like `'#123234'`, `'red'`, `rgba(0,23,11,0.3)'`.
    *
    * Or image can be used, for example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-themeRiver.themeRiver.emphasis.label)
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
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.backgroundColor
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
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.borderColor
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Border radius of the text fregment.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.borderRadius
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Border width of the text fregment.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.borderWidth
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
    * '#000'
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.color
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
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.distance
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
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.fontFamily
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * font size
    *
    *
    * @default
    * 11
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.fontSize
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
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.fontStyle
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
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.fontWeight
    */
  var fontWeight: js.UndefOr[String | Double] = js.undefined
  
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
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.height
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Line height of the text fregment.
    *
    * If `lineHeight` is not set in `rich`, `lineHeight` in
    * parent level will be used. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-themeRiver.themeRiver.emphasis.label)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.lineHeight
    */
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to move text slightly.
    * For example: `[30, 40]` means move `30` horizontally
    * and move `40` vertically.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.offset
    */
  var offset: js.UndefOr[js.Array[Any]] = js.undefined
  
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
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.padding
    */
  var padding: js.UndefOr[js.Array[Any] | Double] = js.undefined
  
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
    * [see doc](https://echarts.apache.org/en/option.html#series-themeRiver.themeRiver.emphasis.label)
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
    * @default
    * "left"
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.position
    */
  var position: js.UndefOr[js.Array[Any] | String] = js.undefined
  
  /**
    * "Rich text styles" can be defined in this `rich` property.
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-themeRiver.themeRiver.emphasis.label)
    *
    * For more details, see
    * [Rich Text](https://echarts.apache.org/en/option.htmltutorial.html#Rich%20Text)
    * please.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.rich
    */
  var rich: js.UndefOr[
    /**
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.rich.%3Cuser%20defined%20style%20name%3E
    */
  StringDictionary[Align]
  ] = js.undefined
  
  /**
    * Rotate label, from -90 degree to 90, positive value represents
    * rotate anti-clockwise.
    *
    * See:
    * [label rotation](https://echarts.apache.org/examples/en/editor.html?c=bar-label-rotation)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.rotate
    */
  var rotate: js.UndefOr[Double] = js.undefined
  
  /**
    * Show blur of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow color of the text block.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  
  /**
    * Shadow X offset of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow Y offset of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to show label.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.show
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
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.textBorderColor
    */
  var textBorderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Storke line width of the text.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.textBorderWidth
    */
  var textBorderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow blue of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.textShadowBlur
    */
  var textShadowBlur: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow color of the text itself.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.textShadowColor
    */
  var textShadowColor: js.UndefOr[String] = js.undefined
  
  /**
    * Shadow X offset of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.textShadowOffsetX
    */
  var textShadowOffsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow Y offset of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.textShadowOffsetY
    */
  var textShadowOffsetY: js.UndefOr[Double] = js.undefined
  
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
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.width
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object TextBorderColor {
  
  inline def apply(): TextBorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextBorderColor]
  }
  
  extension [Self <: TextBorderColor](x: Self) {
    
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
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
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
    
    inline def setOffset(value: js.Array[Any]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: Any*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setPadding(value: js.Array[Any] | Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Any*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setPosition(value: js.Array[Any] | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPositionVarargs(value: Any*): Self = StObject.set(x, "position", js.Array(value*))
    
    inline def setRich(
      value: /**
      * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label.rich.%3Cuser%20defined%20style%20name%3E
      */
    StringDictionary[Align]
    ): Self = StObject.set(x, "rich", value.asInstanceOf[js.Any])
    
    inline def setRichUndefined: Self = StObject.set(x, "rich", js.undefined)
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
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
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
