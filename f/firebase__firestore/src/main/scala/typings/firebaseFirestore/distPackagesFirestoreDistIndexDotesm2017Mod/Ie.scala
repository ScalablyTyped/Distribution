package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.firebaseFirestore.anon.KeyAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ie extends StObject {
  
  def getNext(): KeyAny
  
  def hasNext(): Boolean
  
  var isReverse: Any
  
  var nodeStack: js.Array[Any]
  
  def peek(): KeyAny | Null
}
object Ie {
  
  inline def apply(
    getNext: () => KeyAny,
    hasNext: () => Boolean,
    isReverse: Any,
    nodeStack: js.Array[Any],
    peek: () => KeyAny | Null
  ): Ie = {
    val __obj = js.Dynamic.literal(getNext = js.Any.fromFunction0(getNext), hasNext = js.Any.fromFunction0(hasNext), isReverse = isReverse.asInstanceOf[js.Any], nodeStack = nodeStack.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek))
    __obj.asInstanceOf[Ie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ie] (val x: Self) extends AnyVal {
    
    inline def setGetNext(value: () => KeyAny): Self = StObject.set(x, "getNext", js.Any.fromFunction0(value))
    
    inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
    
    inline def setIsReverse(value: Any): Self = StObject.set(x, "isReverse", value.asInstanceOf[js.Any])
    
    inline def setNodeStack(value: js.Array[Any]): Self = StObject.set(x, "nodeStack", value.asInstanceOf[js.Any])
    
    inline def setNodeStackVarargs(value: Any*): Self = StObject.set(x, "nodeStack", js.Array(value*))
    
    inline def setPeek(value: () => KeyAny | Null): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
  }
}
