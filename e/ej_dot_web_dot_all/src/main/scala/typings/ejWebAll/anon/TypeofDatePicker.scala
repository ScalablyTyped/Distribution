package typings.ejWebAll.anon

import typings.ejWebAll.ej.DatePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDatePicker extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: DatePicker
}
object TypeofDatePicker {
  
  inline def apply(Locale: Any, fn: DatePicker): TypeofDatePicker = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDatePicker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDatePicker] (val x: Self) extends AnyVal {
    
    inline def setFn(value: DatePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
