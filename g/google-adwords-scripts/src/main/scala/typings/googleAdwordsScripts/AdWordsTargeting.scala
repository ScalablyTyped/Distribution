package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdWordsTargeting[A, E] extends StObject {
  
  def audiences(): AdWordsSelector[A] = js.native
  
  def exculdedAudiences(): AdWordsSelector[E] = js.native
}
object AdWordsTargeting {
  
  @scala.inline
  def apply[A, E](audiences: () => AdWordsSelector[A], exculdedAudiences: () => AdWordsSelector[E]): AdWordsTargeting[A, E] = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), exculdedAudiences = js.Any.fromFunction0(exculdedAudiences))
    __obj.asInstanceOf[AdWordsTargeting[A, E]]
  }
  
  @scala.inline
  implicit class AdWordsTargetingMutableBuilder[Self <: AdWordsTargeting[_, _], A, E] (val x: Self with (AdWordsTargeting[A, E])) extends AnyVal {
    
    @scala.inline
    def setAudiences(value: () => AdWordsSelector[A]): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExculdedAudiences(value: () => AdWordsSelector[E]): Self = StObject.set(x, "exculdedAudiences", js.Any.fromFunction0(value))
  }
}
