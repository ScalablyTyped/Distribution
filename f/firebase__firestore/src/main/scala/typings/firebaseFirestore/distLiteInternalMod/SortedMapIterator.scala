package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortedMapIterator[K, V] extends StObject {
  
  def getNext(): Entry[K, V]
  
  def hasNext(): Boolean
  
  /* private */ var isReverse: Any
  
  /* private */ var nodeStack: Any
  
  def peek(): (Entry[K, V]) | Null
}
object SortedMapIterator {
  
  inline def apply[K, V](
    getNext: () => Entry[K, V],
    hasNext: () => Boolean,
    isReverse: Any,
    nodeStack: Any,
    peek: () => (Entry[K, V]) | Null
  ): SortedMapIterator[K, V] = {
    val __obj = js.Dynamic.literal(getNext = js.Any.fromFunction0(getNext), hasNext = js.Any.fromFunction0(hasNext), isReverse = isReverse.asInstanceOf[js.Any], nodeStack = nodeStack.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek))
    __obj.asInstanceOf[SortedMapIterator[K, V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortedMapIterator[?, ?], K, V] (val x: Self & (SortedMapIterator[K, V])) extends AnyVal {
    
    inline def setGetNext(value: () => Entry[K, V]): Self = StObject.set(x, "getNext", js.Any.fromFunction0(value))
    
    inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
    
    inline def setIsReverse(value: Any): Self = StObject.set(x, "isReverse", value.asInstanceOf[js.Any])
    
    inline def setNodeStack(value: Any): Self = StObject.set(x, "nodeStack", value.asInstanceOf[js.Any])
    
    inline def setPeek(value: () => (Entry[K, V]) | Null): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
  }
}
