package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartStrokeOpacity
  extends StObject
     with ChartStroke {
  
  var strokeOpacity: js.UndefOr[Double] = js.undefined
}
object ChartStrokeOpacity {
  
  inline def apply(): ChartStrokeOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartStrokeOpacity]
  }
  
  extension [Self <: ChartStrokeOpacity](x: Self) {
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
  }
}
