package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.Iterations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SankeyChartOptions extends StObject {
  
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var sankey: js.UndefOr[Iterations] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object SankeyChartOptions {
  
  inline def apply(): SankeyChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SankeyChartOptions]
  }
  
  extension [Self <: SankeyChartOptions](x: Self) {
    
    inline def setForceIFrame(value: Boolean): Self = StObject.set(x, "forceIFrame", value.asInstanceOf[js.Any])
    
    inline def setForceIFrameUndefined: Self = StObject.set(x, "forceIFrame", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSankey(value: Iterations): Self = StObject.set(x, "sankey", value.asInstanceOf[js.Any])
    
    inline def setSankeyUndefined: Self = StObject.set(x, "sankey", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
