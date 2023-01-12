package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Ad Param
trait AdParam
  extends StObject
     with AdWordsEntity {
  
  def getAdGroup(): AdGroup
  
  def getInde(): Double
  
  def getInsertionText(): String
  
  def getKeyword(): Keyword
  
  def remove(): Unit
  
  def setInsertionText(insertionText: String): Unit
}
object AdParam {
  
  inline def apply(
    getAdGroup: () => AdGroup,
    getInde: () => Double,
    getInsertionText: () => String,
    getKeyword: () => Keyword,
    remove: () => Unit,
    setInsertionText: String => Unit
  ): AdParam = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getInde = js.Any.fromFunction0(getInde), getInsertionText = js.Any.fromFunction0(getInsertionText), getKeyword = js.Any.fromFunction0(getKeyword), remove = js.Any.fromFunction0(remove), setInsertionText = js.Any.fromFunction1(setInsertionText))
    __obj.asInstanceOf[AdParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdParam] (val x: Self) extends AnyVal {
    
    inline def setGetAdGroup(value: () => AdGroup): Self = StObject.set(x, "getAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetInde(value: () => Double): Self = StObject.set(x, "getInde", js.Any.fromFunction0(value))
    
    inline def setGetInsertionText(value: () => String): Self = StObject.set(x, "getInsertionText", js.Any.fromFunction0(value))
    
    inline def setGetKeyword(value: () => Keyword): Self = StObject.set(x, "getKeyword", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSetInsertionText(value: String => Unit): Self = StObject.set(x, "setInsertionText", js.Any.fromFunction1(value))
  }
}
