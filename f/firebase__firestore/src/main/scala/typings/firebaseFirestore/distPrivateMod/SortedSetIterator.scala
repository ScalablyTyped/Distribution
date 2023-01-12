package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortedSetIterator[T] extends StObject {
  
  def getNext(): T
  
  def hasNext(): Boolean
  
  /* private */ var iter: Any
}
object SortedSetIterator {
  
  inline def apply[T](getNext: () => T, hasNext: () => Boolean, iter: Any): SortedSetIterator[T] = {
    val __obj = js.Dynamic.literal(getNext = js.Any.fromFunction0(getNext), hasNext = js.Any.fromFunction0(hasNext), iter = iter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortedSetIterator[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortedSetIterator[?], T] (val x: Self & SortedSetIterator[T]) extends AnyVal {
    
    inline def setGetNext(value: () => T): Self = StObject.set(x, "getNext", js.Any.fromFunction0(value))
    
    inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
    
    inline def setIter(value: Any): Self = StObject.set(x, "iter", value.asInstanceOf[js.Any])
  }
}
