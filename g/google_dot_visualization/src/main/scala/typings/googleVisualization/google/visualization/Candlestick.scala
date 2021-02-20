package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Candlestick extends StObject {
  
  var fallingColor: js.UndefOr[ChartStrokeFill] = js.native
  
  var hollowIsRising: js.UndefOr[Boolean] = js.native
  
  var risingColor: js.UndefOr[ChartStrokeFill] = js.native
}
object Candlestick {
  
  @scala.inline
  def apply(): Candlestick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Candlestick]
  }
  
  @scala.inline
  implicit class CandlestickMutableBuilder[Self <: Candlestick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallingColor(value: ChartStrokeFill): Self = StObject.set(x, "fallingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallingColorUndefined: Self = StObject.set(x, "fallingColor", js.undefined)
    
    @scala.inline
    def setHollowIsRising(value: Boolean): Self = StObject.set(x, "hollowIsRising", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHollowIsRisingUndefined: Self = StObject.set(x, "hollowIsRising", js.undefined)
    
    @scala.inline
    def setRisingColor(value: ChartStrokeFill): Self = StObject.set(x, "risingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRisingColorUndefined: Self = StObject.set(x, "risingColor", js.undefined)
  }
}
