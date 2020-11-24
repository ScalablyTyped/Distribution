package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarFormatOptions extends js.Object {
  
  /**
    * A number that is the base value to compare the cell value against. If the cell value is higher, it will be drawn to the right of the base; if lower, it will be drawn to the left. Default value is 0.
    */
  var base: js.UndefOr[Double] = js.native
  
  /**
    * A string indicating the negative value section of bars. Possible values are 'red', 'green' and 'blue'; default value is 'red'.
    */
  var colorNegative: js.UndefOr[String] = js.native
  
  /**
    * A string indicating the color of the positive value section of bars. Possible values are 'red', 'green' and 'blue'. Default is 'blue'.
    */
  var colorPositive: js.UndefOr[String] = js.native
  
  /**
    * A boolean indicating if to draw a 1 pixel dark base line when negative values are present. The dark line is there to enhance visual scanning of the bars. Default value is 'false'.
    */
  var drawZeroLine: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number value for the bar range. Default value is the highest value in the table.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The minimum number value for the bar range. Default value is the lowest value in the table.
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * If true, shows values and bars; if false, shows only bars. Default value is true.
    */
  var showValue: js.UndefOr[Boolean] = js.native
  
  /**
    * Thickness of each bar, in pixels. Default value is 100.
    */
  var width: js.UndefOr[Double] = js.native
}
object BarFormatOptions {
  
  @scala.inline
  def apply(): BarFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarFormatOptions]
  }
  
  @scala.inline
  implicit class BarFormatOptionsOps[Self <: BarFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setBase(value: Double): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setColorNegative(value: String): Self = this.set("colorNegative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorNegative: Self = this.set("colorNegative", js.undefined)
    
    @scala.inline
    def setColorPositive(value: String): Self = this.set("colorPositive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorPositive: Self = this.set("colorPositive", js.undefined)
    
    @scala.inline
    def setDrawZeroLine(value: Boolean): Self = this.set("drawZeroLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawZeroLine: Self = this.set("drawZeroLine", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setShowValue(value: Boolean): Self = this.set("showValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowValue: Self = this.set("showValue", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
