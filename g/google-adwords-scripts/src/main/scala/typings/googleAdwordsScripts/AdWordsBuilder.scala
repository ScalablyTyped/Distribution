package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdWordsBuilder[E] extends StObject {
  
  def build(): AdWordsOperation[E] = js.native
}
object AdWordsBuilder {
  
  @scala.inline
  def apply[E](build: () => AdWordsOperation[E]): AdWordsBuilder[E] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
    __obj.asInstanceOf[AdWordsBuilder[E]]
  }
  
  @scala.inline
  implicit class AdWordsBuilderMutableBuilder[Self <: AdWordsBuilder[_], E] (val x: Self with AdWordsBuilder[E]) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => AdWordsOperation[E]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
  }
}
