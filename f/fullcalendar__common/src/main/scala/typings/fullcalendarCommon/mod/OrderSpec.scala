package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderSpec[Subject] extends StObject {
  
  var field: js.UndefOr[String] = js.undefined
  
  var func: js.UndefOr[FieldSpecInputFunc[Subject]] = js.undefined
  
  var order: js.UndefOr[Double] = js.undefined
}
object OrderSpec {
  
  inline def apply[Subject](): OrderSpec[Subject] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderSpec[Subject]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderSpec[?], Subject] (val x: Self & OrderSpec[Subject]) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFunc(value: (Subject, Subject) => Double): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
    
    inline def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
