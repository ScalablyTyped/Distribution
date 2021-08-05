package typings.googleVisualization.google.visualization

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartViewWindow extends StObject {
  
  var max: js.UndefOr[Double | Date | js.Array[Double]] = js.undefined
  
  var min: js.UndefOr[Double | Date | js.Array[Double]] = js.undefined
}
object ChartViewWindow {
  
  inline def apply(): ChartViewWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartViewWindow]
  }
  
  extension [Self <: ChartViewWindow](x: Self) {
    
    inline def setMax(value: Double | Date | js.Array[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxVarargs(value: Double*): Self = StObject.set(x, "max", js.Array(value :_*))
    
    inline def setMin(value: Double | Date | js.Array[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinVarargs(value: Double*): Self = StObject.set(x, "min", js.Array(value :_*))
  }
}
