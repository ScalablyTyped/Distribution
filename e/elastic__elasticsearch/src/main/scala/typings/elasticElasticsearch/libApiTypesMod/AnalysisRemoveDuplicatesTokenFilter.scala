package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.remove_duplicates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisRemoveDuplicatesTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var `type`: remove_duplicates
}
object AnalysisRemoveDuplicatesTokenFilter {
  
  inline def apply(): AnalysisRemoveDuplicatesTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("remove_duplicates")
    __obj.asInstanceOf[AnalysisRemoveDuplicatesTokenFilter]
  }
  
  extension [Self <: AnalysisRemoveDuplicatesTokenFilter](x: Self) {
    
    inline def setType(value: remove_duplicates): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
