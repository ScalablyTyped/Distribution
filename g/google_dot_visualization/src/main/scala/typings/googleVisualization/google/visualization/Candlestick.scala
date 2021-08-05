package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Candlestick extends StObject {
  
  var fallingColor: js.UndefOr[ChartStrokeFill] = js.undefined
  
  var hollowIsRising: js.UndefOr[Boolean] = js.undefined
  
  var risingColor: js.UndefOr[ChartStrokeFill] = js.undefined
}
object Candlestick {
  
  inline def apply(): Candlestick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Candlestick]
  }
  
  extension [Self <: Candlestick](x: Self) {
    
    inline def setFallingColor(value: ChartStrokeFill): Self = StObject.set(x, "fallingColor", value.asInstanceOf[js.Any])
    
    inline def setFallingColorUndefined: Self = StObject.set(x, "fallingColor", js.undefined)
    
    inline def setHollowIsRising(value: Boolean): Self = StObject.set(x, "hollowIsRising", value.asInstanceOf[js.Any])
    
    inline def setHollowIsRisingUndefined: Self = StObject.set(x, "hollowIsRising", js.undefined)
    
    inline def setRisingColor(value: ChartStrokeFill): Self = StObject.set(x, "risingColor", value.asInstanceOf[js.Any])
    
    inline def setRisingColorUndefined: Self = StObject.set(x, "risingColor", js.undefined)
  }
}
