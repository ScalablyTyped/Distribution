package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.keyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisKeywordAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var `type`: keyword
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object AnalysisKeywordAnalyzer {
  
  inline def apply(): AnalysisKeywordAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyword")
    __obj.asInstanceOf[AnalysisKeywordAnalyzer]
  }
  
  extension [Self <: AnalysisKeywordAnalyzer](x: Self) {
    
    inline def setType(value: keyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
