package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends js.Object {
  
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
  var coord: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Style of the item.
    * `itemStyle` of start point and end point will be
    * merged together.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle
    */
  var itemStyle: js.UndefOr[Emphasis] = js.native
  
  /**
    * Label style of the item.
    * Label style of start point and end point will be
    * merged together.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.label
    */
  var label: js.UndefOr[FontFamily] = js.native
  
  /**
    * Name of the marker, which will display as a label.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.name
    */
  var name: js.UndefOr[String] = js.native
  
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
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * value of the item, not necessary.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.value
    */
  var value: js.UndefOr[Double] = js.native
  
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
  var valueDim: js.UndefOr[String] = js.native
  
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
  var valueIndex: js.UndefOr[Double] = js.native
  
  /**
    * x value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.x
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * y value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.y
    */
  var y: js.UndefOr[Double] = js.native
}
object Name {
  
  @scala.inline
  def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
    
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
    def setCoordVarargs(value: js.Any*): Self = this.set("coord", js.Array(value :_*))
    
    @scala.inline
    def setCoord(value: js.Array[_]): Self = this.set("coord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoord: Self = this.set("coord", js.undefined)
    
    @scala.inline
    def setItemStyle(value: Emphasis): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: FontFamily): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueDim(value: String): Self = this.set("valueDim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueDim: Self = this.set("valueDim", js.undefined)
    
    @scala.inline
    def setValueIndex(value: Double): Self = this.set("valueIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueIndex: Self = this.set("valueIndex", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
