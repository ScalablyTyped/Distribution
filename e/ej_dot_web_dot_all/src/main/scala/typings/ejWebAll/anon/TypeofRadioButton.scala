package typings.ejWebAll.anon

import typings.ejWebAll.ej.RadioButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRadioButton extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: RadioButton = js.native
}
object TypeofRadioButton {
  
  @scala.inline
  def apply(Locale: js.Any, fn: RadioButton): TypeofRadioButton = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRadioButton]
  }
  
  @scala.inline
  implicit class TypeofRadioButtonMutableBuilder[Self <: TypeofRadioButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: RadioButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
