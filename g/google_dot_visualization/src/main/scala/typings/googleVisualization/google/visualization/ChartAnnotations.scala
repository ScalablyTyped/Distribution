package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartAnnotations extends StObject {
  
  var boxStyle: js.UndefOr[ChartBoxStyle] = js.undefined
  
  var datum: js.UndefOr[ChartStemAndStyle] = js.undefined
  
  var domain: js.UndefOr[ChartStemAndStyle] = js.undefined
  
  var highContrast: js.UndefOr[Boolean] = js.undefined
  
  var stem: js.UndefOr[ChartStem] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
}
object ChartAnnotations {
  
  inline def apply(): ChartAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnnotations]
  }
  
  extension [Self <: ChartAnnotations](x: Self) {
    
    inline def setBoxStyle(value: ChartBoxStyle): Self = StObject.set(x, "boxStyle", value.asInstanceOf[js.Any])
    
    inline def setBoxStyleUndefined: Self = StObject.set(x, "boxStyle", js.undefined)
    
    inline def setDatum(value: ChartStemAndStyle): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    inline def setDomain(value: ChartStemAndStyle): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setHighContrast(value: Boolean): Self = StObject.set(x, "highContrast", value.asInstanceOf[js.Any])
    
    inline def setHighContrastUndefined: Self = StObject.set(x, "highContrast", js.undefined)
    
    inline def setStem(value: ChartStem): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    inline def setStemUndefined: Self = StObject.set(x, "stem", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTextStyle(value: ChartTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
