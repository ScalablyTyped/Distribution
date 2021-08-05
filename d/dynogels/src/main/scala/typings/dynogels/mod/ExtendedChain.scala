package typings.dynogels.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedChain[T]
  extends StObject
     with BaseChain[T] {
  
  def contains(value: js.Any): T
  
  def in(values: js.Array[js.Any]): T
  
  def ne(value: js.Any): T
  
  def notContains(value: js.Any): T
}
object ExtendedChain {
  
  inline def apply[T](
    beginsWith: js.Any => T,
    between: (js.Any, js.Any) => T,
    contains: js.Any => T,
    eq_ : js.Any => T,
    equals_ : js.Any => T,
    exists: () => T,
    gt: js.Any => T,
    gte: js.Any => T,
    in: js.Array[js.Any] => T,
    lt: js.Any => T,
    lte: js.Any => T,
    ne_ : js.Any => T,
    notContains: js.Any => T,
    `null`: () => T
  ): ExtendedChain[T] = {
    val __obj = js.Dynamic.literal(beginsWith = js.Any.fromFunction1(beginsWith), between = js.Any.fromFunction2(between), contains = js.Any.fromFunction1(contains), exists = js.Any.fromFunction0(exists), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), notContains = js.Any.fromFunction1(notContains))
    __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("ne")(js.Any.fromFunction1(ne_))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.asInstanceOf[ExtendedChain[T]]
  }
  
  extension [Self <: ExtendedChain[?], T](x: Self & ExtendedChain[T]) {
    
    inline def setContains(value: js.Any => T): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setIn(value: js.Array[js.Any] => T): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setNe_(value: js.Any => T): Self = StObject.set(x, "ne", js.Any.fromFunction1(value))
    
    inline def setNotContains(value: js.Any => T): Self = StObject.set(x, "notContains", js.Any.fromFunction1(value))
  }
}
