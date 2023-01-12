package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.nori
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisNoriAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var decompound_mode: js.UndefOr[AnalysisNoriDecompoundMode] = js.undefined
  
  var stoptags: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: nori
  
  var user_dictionary: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object AnalysisNoriAnalyzer {
  
  inline def apply(): AnalysisNoriAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nori")
    __obj.asInstanceOf[AnalysisNoriAnalyzer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisNoriAnalyzer] (val x: Self) extends AnyVal {
    
    inline def setDecompound_mode(value: AnalysisNoriDecompoundMode): Self = StObject.set(x, "decompound_mode", value.asInstanceOf[js.Any])
    
    inline def setDecompound_modeUndefined: Self = StObject.set(x, "decompound_mode", js.undefined)
    
    inline def setStoptags(value: js.Array[String]): Self = StObject.set(x, "stoptags", value.asInstanceOf[js.Any])
    
    inline def setStoptagsUndefined: Self = StObject.set(x, "stoptags", js.undefined)
    
    inline def setStoptagsVarargs(value: String*): Self = StObject.set(x, "stoptags", js.Array(value*))
    
    inline def setType(value: nori): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser_dictionary(value: String): Self = StObject.set(x, "user_dictionary", value.asInstanceOf[js.Any])
    
    inline def setUser_dictionaryUndefined: Self = StObject.set(x, "user_dictionary", js.undefined)
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
