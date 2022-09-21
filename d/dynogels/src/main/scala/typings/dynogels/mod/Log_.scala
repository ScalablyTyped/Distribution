package typings.dynogels.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log_ extends StObject {
  
  def info(args: Any*): Unit
  
  def warn(args: Any*): Unit
}
object Log_ {
  
  inline def apply(info: /* repeated */ Any => Unit, warn: /* repeated */ Any => Unit): Log_ = {
    val __obj = js.Dynamic.literal(info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Log_]
  }
  
  extension [Self <: Log_](x: Self) {
    
    inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
