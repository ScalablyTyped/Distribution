package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchHighlightField
  extends StObject
     with SearchHighlightBase {
  
  var analyzer: js.UndefOr[AnalysisAnalyzer] = js.undefined
  
  var fragment_offset: js.UndefOr[integer] = js.undefined
  
  var matched_fields: js.UndefOr[Fields] = js.undefined
}
object SearchHighlightField {
  
  inline def apply(): SearchHighlightField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchHighlightField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchHighlightField] (val x: Self) extends AnyVal {
    
    inline def setAnalyzer(value: AnalysisAnalyzer): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setFragment_offset(value: integer): Self = StObject.set(x, "fragment_offset", value.asInstanceOf[js.Any])
    
    inline def setFragment_offsetUndefined: Self = StObject.set(x, "fragment_offset", js.undefined)
    
    inline def setMatched_fields(value: Fields): Self = StObject.set(x, "matched_fields", value.asInstanceOf[js.Any])
    
    inline def setMatched_fieldsUndefined: Self = StObject.set(x, "matched_fields", js.undefined)
    
    inline def setMatched_fieldsVarargs(value: Field*): Self = StObject.set(x, "matched_fields", js.Array(value*))
  }
}
