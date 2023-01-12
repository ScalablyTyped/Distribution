package typings.googleVisualization.anon

import typings.googleVisualization.google.visualization.ChartTooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iterations extends StObject {
  
  var iterations: js.UndefOr[Double] = js.undefined
  
  var link: js.UndefOr[ColorMode] = js.undefined
  
  var node: js.UndefOr[Interactivity] = js.undefined
  
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
}
object Iterations {
  
  inline def apply(): Iterations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Iterations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Iterations] (val x: Self) extends AnyVal {
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    inline def setLink(value: ColorMode): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setNode(value: Interactivity): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setTooltip(value: ChartTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
