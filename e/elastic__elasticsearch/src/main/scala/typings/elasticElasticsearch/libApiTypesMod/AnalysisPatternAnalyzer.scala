package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisPatternAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var flags: js.UndefOr[String] = js.undefined
  
  var lowercase: js.UndefOr[Boolean] = js.undefined
  
  var pattern: String
  
  var stopwords: js.UndefOr[AnalysisStopWords] = js.undefined
  
  var `type`: pattern
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object AnalysisPatternAnalyzer {
  
  inline def apply(pattern: String): AnalysisPatternAnalyzer = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[AnalysisPatternAnalyzer]
  }
  
  extension [Self <: AnalysisPatternAnalyzer](x: Self) {
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setLowercase(value: Boolean): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
    
    inline def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setStopwords(value: AnalysisStopWords): Self = StObject.set(x, "stopwords", value.asInstanceOf[js.Any])
    
    inline def setStopwordsUndefined: Self = StObject.set(x, "stopwords", js.undefined)
    
    inline def setStopwordsVarargs(value: String*): Self = StObject.set(x, "stopwords", js.Array(value*))
    
    inline def setType(value: pattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
