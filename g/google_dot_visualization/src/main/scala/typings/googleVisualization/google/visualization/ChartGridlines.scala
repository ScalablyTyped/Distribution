package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartGridlines extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var count: js.UndefOr[Double] = js.native
}
object ChartGridlines {
  
  @scala.inline
  def apply(): ChartGridlines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartGridlines]
  }
  
  @scala.inline
  implicit class ChartGridlinesMutableBuilder[Self <: ChartGridlines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
