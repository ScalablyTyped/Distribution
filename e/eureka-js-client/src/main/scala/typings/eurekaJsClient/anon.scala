package typings.eurekaJsClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Debug extends StObject {
    
    def debug(args: js.Any*): Unit
    
    def error(args: js.Any*): Unit
    
    def info(args: js.Any*): Unit
    
    def warn(args: js.Any*): Unit
  }
  object Debug {
    
    inline def apply(
      debug: /* repeated */ js.Any => Unit,
      error: /* repeated */ js.Any => Unit,
      info: /* repeated */ js.Any => Unit,
      warn: /* repeated */ js.Any => Unit
    ): Debug = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Debug]
    }
    
    extension [Self <: Debug](x: Self) {
      
      inline def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
}
