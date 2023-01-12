package typings.ejWebAll.anon

import typings.ejWebAll.ej.TimePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTimePicker extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: TimePicker
}
object TypeofTimePicker {
  
  inline def apply(Locale: Any, fn: TimePicker): TypeofTimePicker = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTimePicker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTimePicker] (val x: Self) extends AnyVal {
    
    inline def setFn(value: TimePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
