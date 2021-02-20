package typings.ejWebAll.anon

import typings.ejWebAll.ej.ToggleButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofToggleButton extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: ToggleButton = js.native
}
object TypeofToggleButton {
  
  @scala.inline
  def apply(Locale: js.Any, fn: ToggleButton): TypeofToggleButton = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofToggleButton]
  }
  
  @scala.inline
  implicit class TypeofToggleButtonMutableBuilder[Self <: TypeofToggleButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: ToggleButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
