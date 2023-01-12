package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlModelPlotConfig extends StObject {
  
  var annotations_enabled: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var terms: js.UndefOr[Field] = js.undefined
}
object MlModelPlotConfig {
  
  inline def apply(): MlModelPlotConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlModelPlotConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlModelPlotConfig] (val x: Self) extends AnyVal {
    
    inline def setAnnotations_enabled(value: Boolean): Self = StObject.set(x, "annotations_enabled", value.asInstanceOf[js.Any])
    
    inline def setAnnotations_enabledUndefined: Self = StObject.set(x, "annotations_enabled", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setTerms(value: Field): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
  }
}
