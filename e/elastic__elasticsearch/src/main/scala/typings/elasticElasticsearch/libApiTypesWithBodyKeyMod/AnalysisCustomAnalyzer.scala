package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisCustomAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var char_filter: js.UndefOr[js.Array[String]] = js.undefined
  
  var filter: js.UndefOr[js.Array[String]] = js.undefined
  
  var position_increment_gap: js.UndefOr[integer] = js.undefined
  
  var position_offset_gap: js.UndefOr[integer] = js.undefined
  
  var tokenizer: String
  
  var `type`: custom
}
object AnalysisCustomAnalyzer {
  
  inline def apply(tokenizer: String): AnalysisCustomAnalyzer = {
    val __obj = js.Dynamic.literal(tokenizer = tokenizer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[AnalysisCustomAnalyzer]
  }
  
  extension [Self <: AnalysisCustomAnalyzer](x: Self) {
    
    inline def setChar_filter(value: js.Array[String]): Self = StObject.set(x, "char_filter", value.asInstanceOf[js.Any])
    
    inline def setChar_filterUndefined: Self = StObject.set(x, "char_filter", js.undefined)
    
    inline def setChar_filterVarargs(value: String*): Self = StObject.set(x, "char_filter", js.Array(value*))
    
    inline def setFilter(value: js.Array[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setPosition_increment_gap(value: integer): Self = StObject.set(x, "position_increment_gap", value.asInstanceOf[js.Any])
    
    inline def setPosition_increment_gapUndefined: Self = StObject.set(x, "position_increment_gap", js.undefined)
    
    inline def setPosition_offset_gap(value: integer): Self = StObject.set(x, "position_offset_gap", value.asInstanceOf[js.Any])
    
    inline def setPosition_offset_gapUndefined: Self = StObject.set(x, "position_offset_gap", js.undefined)
    
    inline def setTokenizer(value: String): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    inline def setType(value: custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
