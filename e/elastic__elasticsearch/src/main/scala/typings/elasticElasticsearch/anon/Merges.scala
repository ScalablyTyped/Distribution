package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Merges extends StObject {
  
  var merges: js.UndefOr[js.Array[String]] = js.undefined
  
  var vocabulary: js.Array[String]
}
object Merges {
  
  inline def apply(vocabulary: js.Array[String]): Merges = {
    val __obj = js.Dynamic.literal(vocabulary = vocabulary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Merges]
  }
  
  extension [Self <: Merges](x: Self) {
    
    inline def setMerges(value: js.Array[String]): Self = StObject.set(x, "merges", value.asInstanceOf[js.Any])
    
    inline def setMergesUndefined: Self = StObject.set(x, "merges", js.undefined)
    
    inline def setMergesVarargs(value: String*): Self = StObject.set(x, "merges", js.Array(value*))
    
    inline def setVocabulary(value: js.Array[String]): Self = StObject.set(x, "vocabulary", value.asInstanceOf[js.Any])
    
    inline def setVocabularyVarargs(value: String*): Self = StObject.set(x, "vocabulary", js.Array(value*))
  }
}
