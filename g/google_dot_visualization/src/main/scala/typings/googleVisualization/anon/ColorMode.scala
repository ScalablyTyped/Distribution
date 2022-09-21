package typings.googleVisualization.anon

import typings.googleVisualization.google.visualization.ChartStrokeFill
import typings.googleVisualization.googleVisualizationStrings.gradient
import typings.googleVisualization.googleVisualizationStrings.none
import typings.googleVisualization.googleVisualizationStrings.source
import typings.googleVisualization.googleVisualizationStrings.target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorMode extends StObject {
  
  var color: js.UndefOr[String | ChartStrokeFill] = js.undefined
  
  var colorMode: js.UndefOr[none | source | target | gradient] = js.undefined
  
  var colors: js.UndefOr[js.Array[String]] = js.undefined
}
object ColorMode {
  
  inline def apply(): ColorMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorMode]
  }
  
  extension [Self <: ColorMode](x: Self) {
    
    inline def setColor(value: String | ChartStrokeFill): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorMode(value: none | source | target | gradient): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    inline def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
  }
}
