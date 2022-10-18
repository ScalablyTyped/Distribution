package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.truncate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisTruncateTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var length: js.UndefOr[integer] = js.undefined
  
  var `type`: truncate
}
object AnalysisTruncateTokenFilter {
  
  inline def apply(): AnalysisTruncateTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("truncate")
    __obj.asInstanceOf[AnalysisTruncateTokenFilter]
  }
  
  extension [Self <: AnalysisTruncateTokenFilter](x: Self) {
    
    inline def setLength(value: integer): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setType(value: truncate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
