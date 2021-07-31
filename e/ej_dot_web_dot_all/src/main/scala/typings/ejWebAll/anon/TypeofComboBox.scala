package typings.ejWebAll.anon

import typings.ejWebAll.ej.ComboBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofComboBox extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: ComboBox
}
object TypeofComboBox {
  
  @scala.inline
  def apply(Locale: js.Any, fn: ComboBox): TypeofComboBox = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofComboBox]
  }
  
  @scala.inline
  implicit class TypeofComboBoxMutableBuilder[Self <: TypeofComboBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: ComboBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
