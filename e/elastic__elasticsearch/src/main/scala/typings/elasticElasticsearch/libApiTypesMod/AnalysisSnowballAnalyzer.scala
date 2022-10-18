package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.snowball
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisSnowballAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var language: AnalysisSnowballLanguage
  
  var stopwords: js.UndefOr[AnalysisStopWords] = js.undefined
  
  var `type`: snowball
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object AnalysisSnowballAnalyzer {
  
  inline def apply(language: AnalysisSnowballLanguage): AnalysisSnowballAnalyzer = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("snowball")
    __obj.asInstanceOf[AnalysisSnowballAnalyzer]
  }
  
  extension [Self <: AnalysisSnowballAnalyzer](x: Self) {
    
    inline def setLanguage(value: AnalysisSnowballLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setStopwords(value: AnalysisStopWords): Self = StObject.set(x, "stopwords", value.asInstanceOf[js.Any])
    
    inline def setStopwordsUndefined: Self = StObject.set(x, "stopwords", js.undefined)
    
    inline def setStopwordsVarargs(value: String*): Self = StObject.set(x, "stopwords", js.Array(value*))
    
    inline def setType(value: snowball): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
