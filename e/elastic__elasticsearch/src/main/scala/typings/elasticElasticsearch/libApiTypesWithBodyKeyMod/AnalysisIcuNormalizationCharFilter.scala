package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.icu_normalizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisIcuNormalizationCharFilter
  extends StObject
     with AnalysisCharFilterBase
     with AnalysisCharFilterDefinition {
  
  var mode: js.UndefOr[AnalysisIcuNormalizationMode] = js.undefined
  
  var name: js.UndefOr[AnalysisIcuNormalizationType] = js.undefined
  
  var `type`: icu_normalizer
}
object AnalysisIcuNormalizationCharFilter {
  
  inline def apply(): AnalysisIcuNormalizationCharFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("icu_normalizer")
    __obj.asInstanceOf[AnalysisIcuNormalizationCharFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisIcuNormalizationCharFilter] (val x: Self) extends AnyVal {
    
    inline def setMode(value: AnalysisIcuNormalizationMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: AnalysisIcuNormalizationType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: icu_normalizer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
