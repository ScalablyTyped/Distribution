package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchHighlightField
  extends StObject
     with SearchHighlightBase {
  
  var fragment_offset: js.UndefOr[integer] = js.undefined
  
  var matched_fields: js.UndefOr[Fields] = js.undefined
}
object SearchHighlightField {
  
  inline def apply(): SearchHighlightField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchHighlightField]
  }
  
  extension [Self <: SearchHighlightField](x: Self) {
    
    inline def setFragment_offset(value: integer): Self = StObject.set(x, "fragment_offset", value.asInstanceOf[js.Any])
    
    inline def setFragment_offsetUndefined: Self = StObject.set(x, "fragment_offset", js.undefined)
    
    inline def setMatched_fields(value: Fields): Self = StObject.set(x, "matched_fields", value.asInstanceOf[js.Any])
    
    inline def setMatched_fieldsUndefined: Self = StObject.set(x, "matched_fields", js.undefined)
    
    inline def setMatched_fieldsVarargs(value: Field*): Self = StObject.set(x, "matched_fields", js.Array(value*))
  }
}
