package typings.ethers.anon

import typings.ethers.typesWordlistsGenerationEncodeLatinMod.AccentSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accents extends StObject {
  
  var accents: js.Array[AccentSet]
  
  var words: js.Array[String]
}
object Accents {
  
  inline def apply(accents: js.Array[AccentSet], words: js.Array[String]): Accents = {
    val __obj = js.Dynamic.literal(accents = accents.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accents] (val x: Self) extends AnyVal {
    
    inline def setAccents(value: js.Array[AccentSet]): Self = StObject.set(x, "accents", value.asInstanceOf[js.Any])
    
    inline def setAccentsVarargs(value: AccentSet*): Self = StObject.set(x, "accents", js.Array(value*))
    
    inline def setWords(value: js.Array[String]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsVarargs(value: String*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
