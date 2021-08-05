package typings.ejWebAll.anon

import typings.ejWebAll.ej.Toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofToolbar extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: Toolbar
}
object TypeofToolbar {
  
  inline def apply(Locale: js.Any, fn: Toolbar): TypeofToolbar = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofToolbar]
  }
  
  extension [Self <: TypeofToolbar](x: Self) {
    
    inline def setFn(value: Toolbar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
