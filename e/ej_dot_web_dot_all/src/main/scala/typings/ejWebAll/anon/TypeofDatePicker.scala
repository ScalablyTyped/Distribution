package typings.ejWebAll.anon

import typings.ejWebAll.ej.DatePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDatePicker extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: DatePicker = js.native
}
object TypeofDatePicker {
  
  @scala.inline
  def apply(Locale: js.Any, fn: DatePicker): TypeofDatePicker = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDatePicker]
  }
  
  @scala.inline
  implicit class TypeofDatePickerMutableBuilder[Self <: TypeofDatePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: DatePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
