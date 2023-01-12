package typings.googleVisualization.anon

import typings.googleVisualization.google.visualization.ChartTextStyle
import typings.googleVisualization.googleVisualizationStrings.unique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interactivity extends StObject {
  
  var colorMode: js.UndefOr[unique] = js.undefined
  
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  
  var interactivity: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[ChartTextStyle] = js.undefined
  
  var labelPadding: js.UndefOr[Double] = js.undefined
  
  var nodePadding: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Interactivity {
  
  inline def apply(): Interactivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interactivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interactivity] (val x: Self) extends AnyVal {
    
    inline def setColorMode(value: unique): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    inline def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setInteractivity(value: Boolean): Self = StObject.set(x, "interactivity", value.asInstanceOf[js.Any])
    
    inline def setInteractivityUndefined: Self = StObject.set(x, "interactivity", js.undefined)
    
    inline def setLabel(value: ChartTextStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelPadding(value: Double): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
    
    inline def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setNodePadding(value: Double): Self = StObject.set(x, "nodePadding", value.asInstanceOf[js.Any])
    
    inline def setNodePaddingUndefined: Self = StObject.set(x, "nodePadding", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
