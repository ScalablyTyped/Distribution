package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdWordsOperation[E] extends StObject {
  
  def getErrors(): js.Array[String] = js.native
  
  def getResult(): E = js.native
  
  def isSuccessful(): Boolean = js.native
}
object AdWordsOperation {
  
  @scala.inline
  def apply[E](getErrors: () => js.Array[String], getResult: () => E, isSuccessful: () => Boolean): AdWordsOperation[E] = {
    val __obj = js.Dynamic.literal(getErrors = js.Any.fromFunction0(getErrors), getResult = js.Any.fromFunction0(getResult), isSuccessful = js.Any.fromFunction0(isSuccessful))
    __obj.asInstanceOf[AdWordsOperation[E]]
  }
  
  @scala.inline
  implicit class AdWordsOperationMutableBuilder[Self <: AdWordsOperation[_], E] (val x: Self with AdWordsOperation[E]) extends AnyVal {
    
    @scala.inline
    def setGetErrors(value: () => js.Array[String]): Self = StObject.set(x, "getErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResult(value: () => E): Self = StObject.set(x, "getResult", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSuccessful(value: () => Boolean): Self = StObject.set(x, "isSuccessful", js.Any.fromFunction0(value))
  }
}
