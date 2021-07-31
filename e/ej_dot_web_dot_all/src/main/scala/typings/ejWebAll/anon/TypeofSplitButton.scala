package typings.ejWebAll.anon

import typings.ejWebAll.ej.SplitButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSplitButton extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: SplitButton
}
object TypeofSplitButton {
  
  @scala.inline
  def apply(Locale: js.Any, fn: SplitButton): TypeofSplitButton = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSplitButton]
  }
  
  @scala.inline
  implicit class TypeofSplitButtonMutableBuilder[Self <: TypeofSplitButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: SplitButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
