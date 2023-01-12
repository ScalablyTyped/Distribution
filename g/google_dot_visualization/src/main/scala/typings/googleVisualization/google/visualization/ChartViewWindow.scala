package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartViewWindow extends StObject {
  
  var max: js.UndefOr[Double | js.Date | js.Array[Double]] = js.undefined
  
  var min: js.UndefOr[Double | js.Date | js.Array[Double]] = js.undefined
}
object ChartViewWindow {
  
  inline def apply(): ChartViewWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartViewWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartViewWindow] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double | js.Date | js.Array[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxVarargs(value: Double*): Self = StObject.set(x, "max", js.Array(value*))
    
    inline def setMin(value: Double | js.Date | js.Array[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinVarargs(value: Double*): Self = StObject.set(x, "min", js.Array(value*))
  }
}
