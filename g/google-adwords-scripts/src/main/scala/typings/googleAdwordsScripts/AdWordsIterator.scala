package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsIterator[E] extends StObject {
  
  def hasNext(): Boolean
  
  def next(): E
  
  def totalNumEntities(): Double
}
object AdWordsIterator {
  
  inline def apply[E](hasNext: () => Boolean, next: () => E, totalNumEntities: () => Double): AdWordsIterator[E] = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next), totalNumEntities = js.Any.fromFunction0(totalNumEntities))
    __obj.asInstanceOf[AdWordsIterator[E]]
  }
  
  extension [Self <: AdWordsIterator[?], E](x: Self & AdWordsIterator[E]) {
    
    inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
    
    inline def setNext(value: () => E): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    inline def setTotalNumEntities(value: () => Double): Self = StObject.set(x, "totalNumEntities", js.Any.fromFunction0(value))
  }
}
