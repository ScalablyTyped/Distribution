package typings.ejWebAll.anon

import typings.ejWebAll.ej.DateTimePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDateTimePicker extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: DateTimePicker = js.native
}
object TypeofDateTimePicker {
  
  @scala.inline
  def apply(Locale: js.Any, fn: DateTimePicker): TypeofDateTimePicker = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDateTimePicker]
  }
  
  @scala.inline
  implicit class TypeofDateTimePickerMutableBuilder[Self <: TypeofDateTimePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: DateTimePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
