package typings.ejWebAll.anon

import typings.ejWebAll.ej.Kanban
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofKanban extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Kanban
}
object TypeofKanban {
  
  inline def apply(Locale: Any, fn: Kanban): TypeofKanban = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofKanban]
  }
  
  extension [Self <: TypeofKanban](x: Self) {
    
    inline def setFn(value: Kanban): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
