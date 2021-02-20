package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.Color1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartBoxStyle extends StObject {
  
  var gradient: js.UndefOr[Color1] = js.native
  
  var rx: js.UndefOr[Double] = js.native
  
  var ry: js.UndefOr[Double] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
}
object ChartBoxStyle {
  
  @scala.inline
  def apply(): ChartBoxStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBoxStyle]
  }
  
  @scala.inline
  implicit class ChartBoxStyleMutableBuilder[Self <: ChartBoxStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGradient(value: Color1): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    @scala.inline
    def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    @scala.inline
    def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    
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
