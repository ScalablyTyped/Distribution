package typings.ejWebAll.anon

import typings.ejWebAll.ej.CheckBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCheckBox extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: CheckBox
}
object TypeofCheckBox {
  
  @scala.inline
  def apply(Locale: js.Any, fn: CheckBox): TypeofCheckBox = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCheckBox]
  }
  
  @scala.inline
  implicit class TypeofCheckBoxMutableBuilder[Self <: TypeofCheckBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: CheckBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
