package typings.ejWebAll.anon

import typings.ejWebAll.ej.Draggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDraggable extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Draggable
}
object TypeofDraggable {
  
  inline def apply(Locale: Any, fn: Draggable): TypeofDraggable = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDraggable]
  }
  
  extension [Self <: TypeofDraggable](x: Self) {
    
    inline def setFn(value: Draggable): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
