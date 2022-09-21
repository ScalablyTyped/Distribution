package typings.ejWebAll.anon

import typings.ejWebAll.ej.RadialMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRadialMenu extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: RadialMenu
}
object TypeofRadialMenu {
  
  inline def apply(Locale: Any, fn: RadialMenu): TypeofRadialMenu = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRadialMenu]
  }
  
  extension [Self <: TypeofRadialMenu](x: Self) {
    
    inline def setFn(value: RadialMenu): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
