package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSizeAxis extends StObject {
  
  var maxSize: js.UndefOr[Double] = js.undefined
  
  var maxValue: js.UndefOr[Double] = js.undefined
  
  var minSize: js.UndefOr[Double] = js.undefined
  
  var minValue: js.UndefOr[Double] = js.undefined
}
object ChartSizeAxis {
  
  @scala.inline
  def apply(): ChartSizeAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSizeAxis]
  }
  
  @scala.inline
  implicit class ChartSizeAxisMutableBuilder[Self <: ChartSizeAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
