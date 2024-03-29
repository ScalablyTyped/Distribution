package typings.ejWebAll.anon

import typings.ejWebAll.ej.DateTimePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDateTimePicker extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: DateTimePicker
}
object TypeofDateTimePicker {
  
  inline def apply(Locale: Any, fn: DateTimePicker): TypeofDateTimePicker = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDateTimePicker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDateTimePicker] (val x: Self) extends AnyVal {
    
    inline def setFn(value: DateTimePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
