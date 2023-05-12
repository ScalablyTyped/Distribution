package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ae extends StObject {
  
  def getNext(): Any
  
  def hasNext(): Any
  
  var iter: Any
}
object Ae {
  
  inline def apply(getNext: () => Any, hasNext: () => Any, iter: Any): Ae = {
    val __obj = js.Dynamic.literal(getNext = js.Any.fromFunction0(getNext), hasNext = js.Any.fromFunction0(hasNext), iter = iter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ae]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ae] (val x: Self) extends AnyVal {
    
    inline def setGetNext(value: () => Any): Self = StObject.set(x, "getNext", js.Any.fromFunction0(value))
    
    inline def setHasNext(value: () => Any): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
    
    inline def setIter(value: Any): Self = StObject.set(x, "iter", value.asInstanceOf[js.Any])
  }
}
