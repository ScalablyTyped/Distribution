package typings.ejWebAll.anon

import typings.ejWebAll.ej.GroupButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofGroupButton extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: GroupButton
}
object TypeofGroupButton {
  
  inline def apply(Locale: Any, fn: GroupButton): TypeofGroupButton = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofGroupButton]
  }
  
  extension [Self <: TypeofGroupButton](x: Self) {
    
    inline def setFn(value: GroupButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
