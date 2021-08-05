package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartStemAndStyle extends StObject {
  
  var stem: js.UndefOr[ChartStem] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
}
object ChartStemAndStyle {
  
  inline def apply(): ChartStemAndStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartStemAndStyle]
  }
  
  extension [Self <: ChartStemAndStyle](x: Self) {
    
    inline def setStem(value: ChartStem): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    inline def setStemUndefined: Self = StObject.set(x, "stem", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
