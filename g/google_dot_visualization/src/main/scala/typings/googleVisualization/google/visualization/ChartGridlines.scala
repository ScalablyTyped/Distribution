package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartGridlines extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
}
object ChartGridlines {
  
  inline def apply(): ChartGridlines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartGridlines]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartGridlines] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
