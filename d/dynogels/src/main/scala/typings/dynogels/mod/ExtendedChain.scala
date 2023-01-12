package typings.dynogels.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedChain[T]
  extends StObject
     with BaseChain[T] {
  
  def contains(value: Any): T
  
  def in(values: js.Array[Any]): T
  
  def notContains(value: Any): T
}
object ExtendedChain {
  
  inline def apply[T](
    beginsWith: Any => T,
    between: (Any, Any) => T,
    contains: Any => T,
    exists: () => T,
    gt: Any => T,
    gte: Any => T,
    in: js.Array[Any] => T,
    lt: Any => T,
    lte: Any => T,
    notContains: Any => T,
    `null`: () => T
  ): ExtendedChain[T] = {
    val __obj = js.Dynamic.literal(beginsWith = js.Any.fromFunction1(beginsWith), between = js.Any.fromFunction2(between), contains = js.Any.fromFunction1(contains), exists = js.Any.fromFunction0(exists), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), notContains = js.Any.fromFunction1(notContains))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.asInstanceOf[ExtendedChain[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedChain[?], T] (val x: Self & ExtendedChain[T]) extends AnyVal {
    
    inline def setContains(value: Any => T): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setIn(value: js.Array[Any] => T): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setNotContains(value: Any => T): Self = StObject.set(x, "notContains", js.Any.fromFunction1(value))
  }
}
