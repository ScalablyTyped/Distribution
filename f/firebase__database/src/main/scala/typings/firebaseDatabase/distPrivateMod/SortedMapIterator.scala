package typings.firebaseDatabase.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An iterator over an LLRBNode.
  */
trait SortedMapIterator[K, V, T] extends StObject {
  
  def getNext(): T
  
  def hasNext(): Boolean
  
  /* private */ var isReverse_ : Any
  
  /* private */ var nodeStack_ : Any
  
  def peek(): T
  
  /* private */ var resultGenerator_ : Any
}
object SortedMapIterator {
  
  inline def apply[K, V, T](
    getNext: () => T,
    hasNext: () => Boolean,
    isReverse_ : Any,
    nodeStack_ : Any,
    peek: () => T,
    resultGenerator_ : Any
  ): SortedMapIterator[K, V, T] = {
    val __obj = js.Dynamic.literal(getNext = js.Any.fromFunction0(getNext), hasNext = js.Any.fromFunction0(hasNext), isReverse_ = isReverse_.asInstanceOf[js.Any], nodeStack_ = nodeStack_.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), resultGenerator_ = resultGenerator_.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortedMapIterator[K, V, T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortedMapIterator[?, ?, ?], K, V, T] (val x: Self & (SortedMapIterator[K, V, T])) extends AnyVal {
    
    inline def setGetNext(value: () => T): Self = StObject.set(x, "getNext", js.Any.fromFunction0(value))
    
    inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
    
    inline def setIsReverse_(value: Any): Self = StObject.set(x, "isReverse_", value.asInstanceOf[js.Any])
    
    inline def setNodeStack_(value: Any): Self = StObject.set(x, "nodeStack_", value.asInstanceOf[js.Any])
    
    inline def setPeek(value: () => T): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
    
    inline def setResultGenerator_(value: Any): Self = StObject.set(x, "resultGenerator_", value.asInstanceOf[js.Any])
  }
}
