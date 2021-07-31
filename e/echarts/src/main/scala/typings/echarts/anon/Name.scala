package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  /**
    * The format is \[start coordinate, end coordinate\],
    * where the coordinate system can be `x`, `y` on
    * [cartesian](https://echarts.apache.org/en/option.html#grid)
    * , or `radius`, `angle` on
    * [polar](https://echarts.apache.org/en/option.html#polar)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.coord
    */
  var coord: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Style of the item.
    * `itemStyle` of start point and end point will be
    * merged together.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle
    */
  var itemStyle: js.UndefOr[Emphasis] = js.undefined
  
  /**
    * Label style of the item.
    * Label style of start point and end point will be
    * merged together.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.label
    */
  var label: js.UndefOr[FontFamily] = js.undefined
  
  /**
    * Name of the marker, which will display as a label.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.name
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specify this item is on min or max or average value.
    *
    * **Options:**
    *
    * + `'min'` max value。
    * + `'max'` min value。
    * + `'average'` average value。
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * value of the item, not necessary.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.value
    */
  var value: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify the dimension on which min, max, average
    * are calculated, available when
    * [type](https://echarts.apache.org/en/option.html#series-.markArea.data.type)
    * used.
    * The value can be the name of the dimension (for example,
    * the value can be `x`, `angle` in line chart, and
    * `open`, `close` in candlestick).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.valueDim
    */
  var valueDim: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the dimension on which min, max, average
    * are calculated, available when
    * [type](https://echarts.apache.org/en/option.html#series-.markArea.data.type)
    * used.
    * The value can be `0` (means xAxis, radiusAxis) or
    * `1` (means yAxis, angleAxis), using the dimension
    * of the first axis by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.valueIndex
    */
  var valueIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * x value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.x
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * y value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.y
    */
  var y: js.UndefOr[Double] = js.undefined
}
object Name {
  
  @scala.inline
  def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
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
