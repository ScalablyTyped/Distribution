package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisStopAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var stopwords: js.UndefOr[AnalysisStopWords] = js.undefined
  
  var stopwords_path: js.UndefOr[String] = js.undefined
  
  var `type`: stop
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object AnalysisStopAnalyzer {
  
  inline def apply(): AnalysisStopAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stop")
    __obj.asInstanceOf[AnalysisStopAnalyzer]
  }
  
  extension [Self <: AnalysisStopAnalyzer](x: Self) {
    
    inline def setStopwords(value: AnalysisStopWords): Self = StObject.set(x, "stopwords", value.asInstanceOf[js.Any])
    
    inline def setStopwordsUndefined: Self = StObject.set(x, "stopwords", js.undefined)
    
    inline def setStopwordsVarargs(value: String*): Self = StObject.set(x, "stopwords", js.Array(value*))
    
    inline def setStopwords_path(value: String): Self = StObject.set(x, "stopwords_path", value.asInstanceOf[js.Any])
    
    inline def setStopwords_pathUndefined: Self = StObject.set(x, "stopwords_path", js.undefined)
    
    inline def setType(value: stop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
