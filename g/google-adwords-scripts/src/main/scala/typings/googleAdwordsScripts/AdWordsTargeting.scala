package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsTargeting[A, E] extends StObject {
  
  def audiences(): AdWordsSelector[A]
  
  def exculdedAudiences(): AdWordsSelector[E]
}
object AdWordsTargeting {
  
  inline def apply[A, E](audiences: () => AdWordsSelector[A], exculdedAudiences: () => AdWordsSelector[E]): AdWordsTargeting[A, E] = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), exculdedAudiences = js.Any.fromFunction0(exculdedAudiences))
    __obj.asInstanceOf[AdWordsTargeting[A, E]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdWordsTargeting[?, ?], A, E] (val x: Self & (AdWordsTargeting[A, E])) extends AnyVal {
    
    inline def setAudiences(value: () => AdWordsSelector[A]): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
    
    inline def setExculdedAudiences(value: () => AdWordsSelector[E]): Self = StObject.set(x, "exculdedAudiences", js.Any.fromFunction0(value))
  }
}
