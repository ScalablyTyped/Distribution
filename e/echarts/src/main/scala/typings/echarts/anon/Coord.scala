package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coord extends StObject {
  
  /**
    * Coordinates of the starting point or ending point, whose
    * format depends on the coordinate of the series.
    * It can be `x`, and `y` for
    * [rectangular coordinates](https://echarts.apache.org/en/option.html#grid)
    * , or `radius`, and `angle` for
    * [polar coordinates](https://echarts.apache.org/en/option.html#polar)
    * .
    *
    * **Notice:** For axis with
    * [axis.type](https://echarts.apache.org/en/option.html#xAixs.type)
    * `'category'`:
    *
    * + If coord value is `number`, it represents index of
    * [axis.data](https://echarts.apache.org/en/option.html#xAxis.data)
    * .
    * + If coord value is `string`, it represents concrete
    * value in
    * [axis.data](https://echarts.apache.org/en/option.html#xAxis.data)
    *
    *
    * Please notice that in this case `xAxis.data`
    * must not be written as \[number, number,
    *
    *
    *
    * \], but can only be written \[string, string,
    *
    *
    *
    * \].
    * Otherwise it is not able to be located by markPoint /
    * markLine.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markPoint.data)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.coord
    */
  var coord: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Mark point style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.itemStyle
    */
  var itemStyle: js.UndefOr[Emphasis] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.label
    */
  var label: js.UndefOr[FontFamily] = js.undefined
  
  /**
    * Mark point name.
    *
    *
    * @default
    * ''
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Symbol of .
    *
    * Icon types provided by ECharts includes `'circle'`, `'rect'`,
    * `'roundRect'`, `'triangle'`, `'diamond'`, `'pin'`, `'arrow'`,
    * `'none'`
    *
    * It can be set to an image with `'image://url'` , in which
    * URL is the link to an image, or `dataURI` of an image.
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
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markPoint.data)
    *
    * Icons can be set to arbitrary vector path via `'path://'`
    * in ECharts.
    * As compared with raster image, vector paths prevent from
    * jagging and blurring when scaled, and have a better control
    * over changing colors.
    * Size of vectoer icon will be adapted automatically.
    * Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe Illustrator.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markPoint.data)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.symbol
    */
  var symbol: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Offset of symbol relative to original position.
    * By default, symbol will be put in the center position
    * of data.
    * But if symbol is from user-defined vector path or image,
    * you may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset
    * to default position.
    * It can be in absolute pixel value, or in relative percentage
    * value.
    *
    * For example, `[0, '50%']` means to move upside side position
    * of symbol height.
    * It can be used to make the arrow in the bottom to be
    * at data position when symbol is pin.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Rotate degree of symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively
    * use tangent angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.undefined
  
  /**
    * symbol size.
    * It can be set to single numbers like `10`, or use an
    * array to represent width and height.
    * For example, `[20, 10]` means symbol width is `20`, and
    * height is`10`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[js.Any] | Double] = js.undefined
  
  /**
    * Special label types, are used to label maximum value,
    * minimum value and so on.
    *
    * **Options are:**
    *
    * + `'min'` maximum value.
    * + `'max'` minimum value.
    * + `'average'` average value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Label value, which can be ignored.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.value
    */
  var value: js.UndefOr[Double] = js.undefined
  
  /**
    * Works only when
    * [type](https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.type)
    * is assigned.
    * It is used to state the dimension used to calculate maximum
    * value or minimum value.
    * It may be the direct name of a dimension, like `x`, or
    * `angle` for line charts, or `open`, or `close` for candlestick
    * charts.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.valueDim
    */
  var valueDim: js.UndefOr[String] = js.undefined
  
  /**
    * Available when using
    * [type](https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.type)
    * it is used to assign maximum value and minimum value
    * in dimensions, it could be `0` (xAxis, radiusAxis), `1`
    * (yAxis, angleAxis), and use the first value axis dimension
    * by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.valueIndex
    */
  var valueIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * X position according to container, in pixel.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.x
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * Y position according to container, in pixel.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.y
    */
  var y: js.UndefOr[Double] = js.undefined
}
object Coord {
  
  @scala.inline
  def apply(): Coord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coord]
  }
  
  @scala.inline
  implicit class CoordMutableBuilder[Self <: Coord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoord(value: js.Array[js.Any]): Self = StObject.set(x, "coord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordUndefined: Self = StObject.set(x, "coord", js.undefined)
    
    @scala.inline
    def setCoordVarargs(value: js.Any*): Self = StObject.set(x, "coord", js.Array(value :_*))
    
    @scala.inline
    def setItemStyle(value: Emphasis): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: FontFamily): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolKeepAspect(value: Boolean): Self = StObject.set(x, "symbolKeepAspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolKeepAspectUndefined: Self = StObject.set(x, "symbolKeepAspect", js.undefined)
    
    @scala.inline
    def setSymbolOffset(value: js.Array[js.Any]): Self = StObject.set(x, "symbolOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolOffsetUndefined: Self = StObject.set(x, "symbolOffset", js.undefined)
    
    @scala.inline
    def setSymbolOffsetVarargs(value: js.Any*): Self = StObject.set(x, "symbolOffset", js.Array(value :_*))
    
    @scala.inline
    def setSymbolRotate(value: Double): Self = StObject.set(x, "symbolRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolRotateUndefined: Self = StObject.set(x, "symbolRotate", js.undefined)
    
    @scala.inline
    def setSymbolSize(value: js.Array[js.Any] | Double): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
    
    @scala.inline
    def setSymbolSizeVarargs(value: js.Any*): Self = StObject.set(x, "symbolSize", js.Array(value :_*))
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDim(value: String): Self = StObject.set(x, "valueDim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDimUndefined: Self = StObject.set(x, "valueDim", js.undefined)
    
    @scala.inline
    def setValueIndex(value: Double): Self = StObject.set(x, "valueIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueIndexUndefined: Self = StObject.set(x, "valueIndex", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
