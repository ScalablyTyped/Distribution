package typings.ejWebAll.anon

import typings.ejWebAll.ej.Droppable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDroppable extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Droppable
}
object TypeofDroppable {
  
  inline def apply(Locale: Any, fn: Droppable): TypeofDroppable = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDroppable]
  }
  
  extension [Self <: TypeofDroppable](x: Self) {
    
    inline def setFn(value: Droppable): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
