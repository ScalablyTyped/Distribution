package typings.ejWebAll.anon

import typings.ejWebAll.ej.ListBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofListBox extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: ListBox
}
object TypeofListBox {
  
  inline def apply(Locale: Any, fn: ListBox): TypeofListBox = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofListBox]
  }
  
  extension [Self <: TypeofListBox](x: Self) {
    
    inline def setFn(value: ListBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
