package typings.ejWebAll.anon

import typings.ejWebAll.ej.ToggleButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofToggleButton extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: ToggleButton
}
object TypeofToggleButton {
  
  inline def apply(Locale: Any, fn: ToggleButton): TypeofToggleButton = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofToggleButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofToggleButton] (val x: Self) extends AnyVal {
    
    inline def setFn(value: ToggleButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
