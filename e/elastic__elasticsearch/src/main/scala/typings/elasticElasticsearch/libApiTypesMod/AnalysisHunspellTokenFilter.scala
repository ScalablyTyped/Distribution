package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.hunspell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisHunspellTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var dedup: js.UndefOr[Boolean] = js.undefined
  
  var dictionary: js.UndefOr[String] = js.undefined
  
  var locale: String
  
  var longest_only: js.UndefOr[Boolean] = js.undefined
  
  var `type`: hunspell
}
object AnalysisHunspellTokenFilter {
  
  inline def apply(locale: String): AnalysisHunspellTokenFilter = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hunspell")
    __obj.asInstanceOf[AnalysisHunspellTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisHunspellTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setDedup(value: Boolean): Self = StObject.set(x, "dedup", value.asInstanceOf[js.Any])
    
    inline def setDedupUndefined: Self = StObject.set(x, "dedup", js.undefined)
    
    inline def setDictionary(value: String): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    inline def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLongest_only(value: Boolean): Self = StObject.set(x, "longest_only", value.asInstanceOf[js.Any])
    
    inline def setLongest_onlyUndefined: Self = StObject.set(x, "longest_only", js.undefined)
    
    inline def setType(value: hunspell): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
