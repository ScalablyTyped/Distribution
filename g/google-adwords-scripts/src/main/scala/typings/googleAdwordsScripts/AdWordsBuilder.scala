package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsBuilder[E] extends StObject {
  
  def build(): AdWordsOperation[E]
}
object AdWordsBuilder {
  
  inline def apply[E](build: () => AdWordsOperation[E]): AdWordsBuilder[E] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
    __obj.asInstanceOf[AdWordsBuilder[E]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdWordsBuilder[?], E] (val x: Self & AdWordsBuilder[E]) extends AnyVal {
    
    inline def setBuild(value: () => AdWordsOperation[E]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
  }
}
