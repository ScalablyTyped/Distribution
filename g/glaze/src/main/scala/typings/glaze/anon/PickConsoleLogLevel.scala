package typings.glaze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Console, glaze.glaze/dist-types/logger.LogLevel> */
trait PickConsoleLogLevel extends StObject {
  
  var error: js.Function1[/* repeated */ js.Any, Unit]
  
  var warn: js.Function1[/* repeated */ js.Any, Unit]
}
object PickConsoleLogLevel {
  
  inline def apply(error: /* repeated */ js.Any => Unit, warn: /* repeated */ js.Any => Unit): PickConsoleLogLevel = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[PickConsoleLogLevel]
  }
  
  extension [Self <: PickConsoleLogLevel](x: Self) {
    
    inline def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
