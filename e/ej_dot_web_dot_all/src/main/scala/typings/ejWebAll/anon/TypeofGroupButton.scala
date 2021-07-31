package typings.ejWebAll.anon

import typings.ejWebAll.ej.GroupButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofGroupButton extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: GroupButton
}
object TypeofGroupButton {
  
  @scala.inline
  def apply(Locale: js.Any, fn: GroupButton): TypeofGroupButton = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofGroupButton]
  }
  
  @scala.inline
  implicit class TypeofGroupButtonMutableBuilder[Self <: TypeofGroupButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: GroupButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
