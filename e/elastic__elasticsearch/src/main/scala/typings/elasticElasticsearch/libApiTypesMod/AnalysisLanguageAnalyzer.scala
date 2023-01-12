package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisLanguageAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var language: AnalysisLanguage
  
  var stem_exclusion: js.Array[String]
  
  var stopwords: js.UndefOr[AnalysisStopWords] = js.undefined
  
  var stopwords_path: js.UndefOr[String] = js.undefined
  
  var `type`: language
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object AnalysisLanguageAnalyzer {
  
  inline def apply(language: AnalysisLanguage, stem_exclusion: js.Array[String]): AnalysisLanguageAnalyzer = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], stem_exclusion = stem_exclusion.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("language")
    __obj.asInstanceOf[AnalysisLanguageAnalyzer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisLanguageAnalyzer] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: AnalysisLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setStem_exclusion(value: js.Array[String]): Self = StObject.set(x, "stem_exclusion", value.asInstanceOf[js.Any])
    
    inline def setStem_exclusionVarargs(value: String*): Self = StObject.set(x, "stem_exclusion", js.Array(value*))
    
    inline def setStopwords(value: AnalysisStopWords): Self = StObject.set(x, "stopwords", value.asInstanceOf[js.Any])
    
    inline def setStopwordsUndefined: Self = StObject.set(x, "stopwords", js.undefined)
    
    inline def setStopwordsVarargs(value: String*): Self = StObject.set(x, "stopwords", js.Array(value*))
    
    inline def setStopwords_path(value: String): Self = StObject.set(x, "stopwords_path", value.asInstanceOf[js.Any])
    
    inline def setStopwords_pathUndefined: Self = StObject.set(x, "stopwords_path", js.undefined)
    
    inline def setType(value: language): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
