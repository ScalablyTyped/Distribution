package typings.ejWebAll.anon

import typings.ejWebAll.ej.Gantt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofGantt extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Gantt
}
object TypeofGantt {
  
  inline def apply(Locale: Any, fn: Gantt): TypeofGantt = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofGantt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofGantt] (val x: Self) extends AnyVal {
    
    inline def setFn(value: Gantt): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
