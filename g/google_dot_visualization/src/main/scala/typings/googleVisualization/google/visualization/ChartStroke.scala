package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartStroke extends StObject {
  
  var stroke: js.UndefOr[String] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
}
object ChartStroke {
  
  @scala.inline
  def apply(): ChartStroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartStroke]
  }
  
  @scala.inline
  implicit class ChartStrokeMutableBuilder[Self <: ChartStroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
