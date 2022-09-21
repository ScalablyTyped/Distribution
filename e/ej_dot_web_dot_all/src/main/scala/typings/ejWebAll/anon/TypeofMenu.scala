package typings.ejWebAll.anon

import typings.ejWebAll.ej.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMenu extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Menu
}
object TypeofMenu {
  
  inline def apply(Locale: Any, fn: Menu): TypeofMenu = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMenu]
  }
  
  extension [Self <: TypeofMenu](x: Self) {
    
    inline def setFn(value: Menu): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
