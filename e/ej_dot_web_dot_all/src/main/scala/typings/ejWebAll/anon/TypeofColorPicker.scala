package typings.ejWebAll.anon

import typings.ejWebAll.ej.ColorPicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofColorPicker extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: ColorPicker = js.native
}
object TypeofColorPicker {
  
  @scala.inline
  def apply(Locale: js.Any, fn: ColorPicker): TypeofColorPicker = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofColorPicker]
  }
  
  @scala.inline
  implicit class TypeofColorPickerMutableBuilder[Self <: TypeofColorPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: ColorPicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
