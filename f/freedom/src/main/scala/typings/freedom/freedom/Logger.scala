package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  def debug(args: Any*): Unit
  
  def error(args: Any*): Unit
  
  def info(args: Any*): Unit
  
  def log(args: Any*): Unit
  
  def warn(args: Any*): Unit
}
object Logger {
  
  inline def apply(
    debug: /* repeated */ Any => Unit,
    error: /* repeated */ Any => Unit,
    info: /* repeated */ Any => Unit,
    log: /* repeated */ Any => Unit,
    warn: /* repeated */ Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
