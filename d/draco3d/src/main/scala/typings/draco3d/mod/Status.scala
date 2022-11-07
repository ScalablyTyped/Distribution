package typings.draco3d.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  def error_msg(): String
  
  def ok(): Boolean
}
object Status {
  
  inline def apply(error_msg: () => String, ok: () => Boolean): Status = {
    val __obj = js.Dynamic.literal(error_msg = js.Any.fromFunction0(error_msg), ok = js.Any.fromFunction0(ok))
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setError_msg(value: () => String): Self = StObject.set(x, "error_msg", js.Any.fromFunction0(value))
    
    inline def setOk(value: () => Boolean): Self = StObject.set(x, "ok", js.Any.fromFunction0(value))
  }
}
