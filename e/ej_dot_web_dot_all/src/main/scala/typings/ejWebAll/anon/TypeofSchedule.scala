package typings.ejWebAll.anon

import typings.ejWebAll.ej.Schedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSchedule extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Schedule
}
object TypeofSchedule {
  
  inline def apply(Locale: Any, fn: Schedule): TypeofSchedule = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSchedule]
  }
  
  extension [Self <: TypeofSchedule](x: Self) {
    
    inline def setFn(value: Schedule): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
