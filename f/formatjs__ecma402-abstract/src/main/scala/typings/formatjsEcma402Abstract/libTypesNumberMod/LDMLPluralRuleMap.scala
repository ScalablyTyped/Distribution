package typings.formatjsEcma402Abstract.libTypesNumberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<std.Partial<std.Record<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/plural-rules.LDMLPluralRule, T>>, 'other'> & {  other :T} */
trait LDMLPluralRuleMap[T] extends StObject {
  
  var few: js.UndefOr[T] = js.undefined
  
  var many: js.UndefOr[T] = js.undefined
  
  var one: js.UndefOr[T] = js.undefined
  
  var other: T
  
  var two: js.UndefOr[T] = js.undefined
  
  var zero: js.UndefOr[T] = js.undefined
}
object LDMLPluralRuleMap {
  
  inline def apply[T](other: T): LDMLPluralRuleMap[T] = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDMLPluralRuleMap[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LDMLPluralRuleMap[?], T] (val x: Self & LDMLPluralRuleMap[T]) extends AnyVal {
    
    inline def setFew(value: T): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
    
    inline def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
    
    inline def setMany(value: T): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
    
    inline def setOne(value: T): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
    
    inline def setOther(value: T): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setTwo(value: T): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
    
    inline def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
    
    inline def setZero(value: T): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
