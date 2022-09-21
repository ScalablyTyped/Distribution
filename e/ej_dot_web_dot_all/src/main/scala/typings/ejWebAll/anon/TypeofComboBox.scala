package typings.ejWebAll.anon

import typings.ejWebAll.ej.ComboBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofComboBox extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: ComboBox
}
object TypeofComboBox {
  
  inline def apply(Locale: Any, fn: ComboBox): TypeofComboBox = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofComboBox]
  }
  
  extension [Self <: TypeofComboBox](x: Self) {
    
    inline def setFn(value: ComboBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
