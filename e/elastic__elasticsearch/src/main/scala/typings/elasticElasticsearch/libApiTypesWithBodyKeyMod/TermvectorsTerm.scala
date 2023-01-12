package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermvectorsTerm extends StObject {
  
  var doc_freq: js.UndefOr[integer] = js.undefined
  
  var score: js.UndefOr[double] = js.undefined
  
  var term_freq: integer
  
  var tokens: js.UndefOr[js.Array[TermvectorsToken]] = js.undefined
  
  var ttf: js.UndefOr[integer] = js.undefined
}
object TermvectorsTerm {
  
  inline def apply(term_freq: integer): TermvectorsTerm = {
    val __obj = js.Dynamic.literal(term_freq = term_freq.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermvectorsTerm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TermvectorsTerm] (val x: Self) extends AnyVal {
    
    inline def setDoc_freq(value: integer): Self = StObject.set(x, "doc_freq", value.asInstanceOf[js.Any])
    
    inline def setDoc_freqUndefined: Self = StObject.set(x, "doc_freq", js.undefined)
    
    inline def setScore(value: double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setTerm_freq(value: integer): Self = StObject.set(x, "term_freq", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[TermvectorsToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    inline def setTokensVarargs(value: TermvectorsToken*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setTtf(value: integer): Self = StObject.set(x, "ttf", value.asInstanceOf[js.Any])
    
    inline def setTtfUndefined: Self = StObject.set(x, "ttf", js.undefined)
  }
}
