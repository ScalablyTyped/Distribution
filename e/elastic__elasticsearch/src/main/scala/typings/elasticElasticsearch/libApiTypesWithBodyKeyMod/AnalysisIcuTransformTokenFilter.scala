package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.icu_transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisIcuTransformTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var dir: js.UndefOr[AnalysisIcuTransformDirection] = js.undefined
  
  var id: String
  
  var `type`: icu_transform
}
object AnalysisIcuTransformTokenFilter {
  
  inline def apply(id: String): AnalysisIcuTransformTokenFilter = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_transform")
    __obj.asInstanceOf[AnalysisIcuTransformTokenFilter]
  }
  
  extension [Self <: AnalysisIcuTransformTokenFilter](x: Self) {
    
    inline def setDir(value: AnalysisIcuTransformDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: icu_transform): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
