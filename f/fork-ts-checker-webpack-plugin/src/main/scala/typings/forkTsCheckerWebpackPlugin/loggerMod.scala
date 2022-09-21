package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  trait Logger extends StObject {
    
    def error(message: String): Unit
    
    def log(message: String): Unit
  }
  object Logger {
    
    inline def apply(error: String => Unit, log: String => Unit): Logger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    }
  }
}
