package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsOperation[E] extends StObject {
  
  def getErrors(): js.Array[String]
  
  def getResult(): E
  
  def isSuccessful(): Boolean
}
object AdWordsOperation {
  
  inline def apply[E](getErrors: () => js.Array[String], getResult: () => E, isSuccessful: () => Boolean): AdWordsOperation[E] = {
    val __obj = js.Dynamic.literal(getErrors = js.Any.fromFunction0(getErrors), getResult = js.Any.fromFunction0(getResult), isSuccessful = js.Any.fromFunction0(isSuccessful))
    __obj.asInstanceOf[AdWordsOperation[E]]
  }
  
  extension [Self <: AdWordsOperation[?], E](x: Self & AdWordsOperation[E]) {
    
    inline def setGetErrors(value: () => js.Array[String]): Self = StObject.set(x, "getErrors", js.Any.fromFunction0(value))
    
    inline def setGetResult(value: () => E): Self = StObject.set(x, "getResult", js.Any.fromFunction0(value))
    
    inline def setIsSuccessful(value: () => Boolean): Self = StObject.set(x, "isSuccessful", js.Any.fromFunction0(value))
  }
}
