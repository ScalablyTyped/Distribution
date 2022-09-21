package typings.ejWebAll.anon

import typings.ejWebAll.ej.RTE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRTE extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: RTE
}
object TypeofRTE {
  
  inline def apply(Locale: Any, fn: RTE): TypeofRTE = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRTE]
  }
  
  extension [Self <: TypeofRTE](x: Self) {
    
    inline def setFn(value: RTE): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
