package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAnnotations extends StObject {
  
  var boxStyle: js.UndefOr[ChartBoxStyle] = js.native
  
  var datum: js.UndefOr[ChartStemAndStyle] = js.native
  
  var domain: js.UndefOr[ChartStemAndStyle] = js.native
  
  var highContrast: js.UndefOr[Boolean] = js.native
  
  var stem: js.UndefOr[ChartStem] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var textStyle: js.UndefOr[ChartTextStyle] = js.native
}
object ChartAnnotations {
  
  @scala.inline
  def apply(): ChartAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnnotations]
  }
  
  @scala.inline
  implicit class ChartAnnotationsMutableBuilder[Self <: ChartAnnotations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxStyle(value: ChartBoxStyle): Self = StObject.set(x, "boxStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxStyleUndefined: Self = StObject.set(x, "boxStyle", js.undefined)
    
    @scala.inline
    def setDatum(value: ChartStemAndStyle): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    @scala.inline
    def setDomain(value: ChartStemAndStyle): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setHighContrast(value: Boolean): Self = StObject.set(x, "highContrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighContrastUndefined: Self = StObject.set(x, "highContrast", js.undefined)
    
    @scala.inline
    def setStem(value: ChartStem): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStemUndefined: Self = StObject.set(x, "stem", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTextStyle(value: ChartTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
