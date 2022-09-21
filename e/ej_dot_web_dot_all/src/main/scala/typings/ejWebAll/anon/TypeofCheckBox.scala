package typings.ejWebAll.anon

import typings.ejWebAll.ej.CheckBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCheckBox extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: CheckBox
}
object TypeofCheckBox {
  
  inline def apply(Locale: Any, fn: CheckBox): TypeofCheckBox = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCheckBox]
  }
  
  extension [Self <: TypeofCheckBox](x: Self) {
    
    inline def setFn(value: CheckBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
