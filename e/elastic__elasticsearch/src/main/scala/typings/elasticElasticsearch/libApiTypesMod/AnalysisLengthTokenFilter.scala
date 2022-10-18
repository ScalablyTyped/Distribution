package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisLengthTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var max: js.UndefOr[integer] = js.undefined
  
  var min: js.UndefOr[integer] = js.undefined
  
  var `type`: length
}
object AnalysisLengthTokenFilter {
  
  inline def apply(): AnalysisLengthTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("length")
    __obj.asInstanceOf[AnalysisLengthTokenFilter]
  }
  
  extension [Self <: AnalysisLengthTokenFilter](x: Self) {
    
    inline def setMax(value: integer): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: integer): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setType(value: length): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
