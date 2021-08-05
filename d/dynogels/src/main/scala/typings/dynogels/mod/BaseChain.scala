package typings.dynogels.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseChain[T] extends StObject {
  
  def beginsWith(value: js.Any): T
  
  def between(value1: js.Any, value2: js.Any): T
  
  def eq(value: js.Any): T
  
  def equals(value: js.Any): T
  
  def exists(): T
  
  def gt(value: js.Any): T
  
  def gte(value: js.Any): T
  
  def lt(value: js.Any): T
  
  def lte(value: js.Any): T
  
  def `null`(): T
}
object BaseChain {
  
  inline def apply[T](
    beginsWith: js.Any => T,
    between: (js.Any, js.Any) => T,
    eq_ : js.Any => T,
    equals_ : js.Any => T,
    exists: () => T,
    gt: js.Any => T,
    gte: js.Any => T,
    lt: js.Any => T,
    lte: js.Any => T,
    `null`: () => T
  ): BaseChain[T] = {
    val __obj = js.Dynamic.literal(beginsWith = js.Any.fromFunction1(beginsWith), between = js.Any.fromFunction2(between), exists = js.Any.fromFunction0(exists), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte))
    __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.asInstanceOf[BaseChain[T]]
  }
  
  extension [Self <: BaseChain[?], T](x: Self & BaseChain[T]) {
    
    inline def setBeginsWith(value: js.Any => T): Self = StObject.set(x, "beginsWith", js.Any.fromFunction1(value))
    
    inline def setBetween(value: (js.Any, js.Any) => T): Self = StObject.set(x, "between", js.Any.fromFunction2(value))
    
    inline def setEq_(value: js.Any => T): Self = StObject.set(x, "eq", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: js.Any => T): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setExists(value: () => T): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGt(value: js.Any => T): Self = StObject.set(x, "gt", js.Any.fromFunction1(value))
    
    inline def setGte(value: js.Any => T): Self = StObject.set(x, "gte", js.Any.fromFunction1(value))
    
    inline def setLt(value: js.Any => T): Self = StObject.set(x, "lt", js.Any.fromFunction1(value))
    
    inline def setLte(value: js.Any => T): Self = StObject.set(x, "lte", js.Any.fromFunction1(value))
    
    inline def setNull(value: () => T): Self = StObject.set(x, "null", js.Any.fromFunction0(value))
  }
}
