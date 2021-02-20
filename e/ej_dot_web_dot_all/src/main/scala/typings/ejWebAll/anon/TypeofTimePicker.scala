package typings.ejWebAll.anon

import typings.ejWebAll.ej.TimePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTimePicker extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: TimePicker = js.native
}
object TypeofTimePicker {
  
  @scala.inline
  def apply(Locale: js.Any, fn: TimePicker): TypeofTimePicker = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTimePicker]
  }
  
  @scala.inline
  implicit class TypeofTimePickerMutableBuilder[Self <: TypeofTimePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: TimePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
