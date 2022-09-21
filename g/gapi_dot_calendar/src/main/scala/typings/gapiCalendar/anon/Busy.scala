package typings.gapiCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Busy extends StObject {
  
  var busy: js.Array[End]
  
  var errors: js.UndefOr[js.Array[Domain]] = js.undefined
}
object Busy {
  
  inline def apply(busy: js.Array[End]): Busy = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Busy]
  }
  
  extension [Self <: Busy](x: Self) {
    
    inline def setBusy(value: js.Array[End]): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    inline def setBusyVarargs(value: End*): Self = StObject.set(x, "busy", js.Array(value*))
    
    inline def setErrors(value: js.Array[Domain]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: Domain*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
