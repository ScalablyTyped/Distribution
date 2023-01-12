package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.icu_normalizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisIcuNormalizationTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var name: AnalysisIcuNormalizationType
  
  var `type`: icu_normalizer
}
object AnalysisIcuNormalizationTokenFilter {
  
  inline def apply(name: AnalysisIcuNormalizationType): AnalysisIcuNormalizationTokenFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_normalizer")
    __obj.asInstanceOf[AnalysisIcuNormalizationTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisIcuNormalizationTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: AnalysisIcuNormalizationType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: icu_normalizer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
