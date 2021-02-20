package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarFormatOptions extends StObject {
  
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
  implicit class BarFormatOptionsMutableBuilder[Self <: BarFormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setColorNegative(value: String): Self = StObject.set(x, "colorNegative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorNegativeUndefined: Self = StObject.set(x, "colorNegative", js.undefined)
    
    @scala.inline
    def setColorPositive(value: String): Self = StObject.set(x, "colorPositive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorPositiveUndefined: Self = StObject.set(x, "colorPositive", js.undefined)
    
    @scala.inline
    def setDrawZeroLine(value: Boolean): Self = StObject.set(x, "drawZeroLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawZeroLineUndefined: Self = StObject.set(x, "drawZeroLine", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setShowValue(value: Boolean): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValueUndefined: Self = StObject.set(x, "showValue", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
