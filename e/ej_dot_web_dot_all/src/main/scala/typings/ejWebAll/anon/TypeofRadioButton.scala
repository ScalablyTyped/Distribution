package typings.ejWebAll.anon

import typings.ejWebAll.ej.RadioButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRadioButton extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: RadioButton
}
object TypeofRadioButton {
  
  inline def apply(Locale: Any, fn: RadioButton): TypeofRadioButton = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRadioButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRadioButton] (val x: Self) extends AnyVal {
    
    inline def setFn(value: RadioButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
