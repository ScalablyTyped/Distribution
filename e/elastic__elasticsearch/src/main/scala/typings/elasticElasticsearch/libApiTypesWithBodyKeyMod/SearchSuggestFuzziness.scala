package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSuggestFuzziness extends StObject {
  
  var fuzziness: js.UndefOr[Fuzziness] = js.undefined
  
  var min_length: js.UndefOr[integer] = js.undefined
  
  var prefix_length: js.UndefOr[integer] = js.undefined
  
  var transpositions: js.UndefOr[Boolean] = js.undefined
  
  var unicode_aware: js.UndefOr[Boolean] = js.undefined
}
object SearchSuggestFuzziness {
  
  inline def apply(): SearchSuggestFuzziness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSuggestFuzziness]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchSuggestFuzziness] (val x: Self) extends AnyVal {
    
    inline def setFuzziness(value: Fuzziness): Self = StObject.set(x, "fuzziness", value.asInstanceOf[js.Any])
    
    inline def setFuzzinessUndefined: Self = StObject.set(x, "fuzziness", js.undefined)
    
    inline def setMin_length(value: integer): Self = StObject.set(x, "min_length", value.asInstanceOf[js.Any])
    
    inline def setMin_lengthUndefined: Self = StObject.set(x, "min_length", js.undefined)
    
    inline def setPrefix_length(value: integer): Self = StObject.set(x, "prefix_length", value.asInstanceOf[js.Any])
    
    inline def setPrefix_lengthUndefined: Self = StObject.set(x, "prefix_length", js.undefined)
    
    inline def setTranspositions(value: Boolean): Self = StObject.set(x, "transpositions", value.asInstanceOf[js.Any])
    
    inline def setTranspositionsUndefined: Self = StObject.set(x, "transpositions", js.undefined)
    
    inline def setUnicode_aware(value: Boolean): Self = StObject.set(x, "unicode_aware", value.asInstanceOf[js.Any])
    
    inline def setUnicode_awareUndefined: Self = StObject.set(x, "unicode_aware", js.undefined)
  }
}
