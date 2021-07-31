package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartBubble extends StObject {
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
}
object ChartBubble {
  
  @scala.inline
  def apply(): ChartBubble = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBubble]
  }
  
  @scala.inline
  implicit class ChartBubbleMutableBuilder[Self <: ChartBubble] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setTextStyle(value: ChartTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
