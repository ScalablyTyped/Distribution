package typings.ejWebAll.anon

import typings.ejWebAll.ej.Ribbon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRibbon extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: Ribbon
}
object TypeofRibbon {
  
  inline def apply(Locale: js.Any, fn: Ribbon): TypeofRibbon = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRibbon]
  }
  
  extension [Self <: TypeofRibbon](x: Self) {
    
    inline def setFn(value: Ribbon): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
