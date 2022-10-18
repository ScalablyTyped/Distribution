package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolOffset extends StObject {
  
  /**
    * Label of this data item, which will be merged with
    * `label` of starting point and ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.label
    */
  var label: js.UndefOr[Position] = js.undefined
  
  /**
    * Line style of this data item, which will be merged
    * with `lineStyle` of starting point and ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowOffsetX] = js.undefined
  
  /**
    * Name of the marker, which will display as a label.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markLine.data.1.name
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Symbol of ending point.
    *
    * Icon types provided by ECharts includes `'circle'`,
    * `'rect'`, `'roundRect'`, `'triangle'`, `'diamond'`,
    * `'pin'`, `'arrow'`, `'none'`
    *
    * It can be set to an image with `'image://url'` ,
    * in which URL is the link to an image, or `dataURI`
    * of an image.
    *
    * An image URL example:
    *
    * ```
    * 'image://http://xxx.xxx.xxx/a/b.png'
    *
    * ```
    *
    * A `dataURI` example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.markLine.data.1)
    *
    * Icons can be set to arbitrary vector path via `'path://'`
    * in ECharts.
    * As compared with raster image, vector paths prevent
    * from jagging and blurring when scaled, and have a
    * better control over changing colors.
    * Size of vectoer icon will be adapted automatically.
    * Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe
    * Illustrator.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.markLine.data.1)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.symbol
    */
  var symbol: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to keep aspect for symbols in the form of
    * `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Offset of ending point symbol relative to original
    * position.
    * By default, symbol will be put in the center position
    * of data.
    * But if symbol is from user-defined vector path or
    * image, you may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset
    * to default position.
    * It can be in absolute pixel value, or in relative
    * percentage value.
    *
    * For example, `[0, '50%']` means to move upside side
    * position of symbol height.
    * It can be used to make the arrow in the bottom to
    * be at data position when symbol is pin.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Rotate degree of ending point symbol.
    * Note that when `symbol` is set to be `'arrow'` in
    * `markLine`, `symbolRotate` value will be ignored,
    * and compulsively use tangent angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.undefined
  
  /**
    * ending point symbol size.
    * It can be set to single numbers like `10`, or use
    * an array to represent width and height.
    * For example, `[20, 10]` means symbol width is `20`,
    * and height is`10`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[Any] | Double] = js.undefined
  
  /**
    * Label value, which can be ignored.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.value
    */
  var value: js.UndefOr[Double] = js.undefined
  
  /**
    * X position according to container, in pixel.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.x
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * Y position according to container, in pixel.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.y
    */
  var y: js.UndefOr[Double] = js.undefined
}
object SymbolOffset {
  
  inline def apply(): SymbolOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolOffset]
  }
  
  extension [Self <: SymbolOffset](x: Self) {
    
    inline def setLabel(value: Position): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLineStyle(value: ShadowOffsetX): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolKeepAspect(value: Boolean): Self = StObject.set(x, "symbolKeepAspect", value.asInstanceOf[js.Any])
    
    inline def setSymbolKeepAspectUndefined: Self = StObject.set(x, "symbolKeepAspect", js.undefined)
    
    inline def setSymbolOffset(value: js.Array[Any]): Self = StObject.set(x, "symbolOffset", value.asInstanceOf[js.Any])
    
    inline def setSymbolOffsetUndefined: Self = StObject.set(x, "symbolOffset", js.undefined)
    
    inline def setSymbolOffsetVarargs(value: Any*): Self = StObject.set(x, "symbolOffset", js.Array(value*))
    
    inline def setSymbolRotate(value: Double): Self = StObject.set(x, "symbolRotate", value.asInstanceOf[js.Any])
    
    inline def setSymbolRotateUndefined: Self = StObject.set(x, "symbolRotate", js.undefined)
    
    inline def setSymbolSize(value: js.Array[Any] | Double): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
    
    inline def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
    
    inline def setSymbolSizeVarargs(value: Any*): Self = StObject.set(x, "symbolSize", js.Array(value*))
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
