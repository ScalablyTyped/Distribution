package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  trait Logger extends StObject {
    
    def error(message: String): Unit
    
    def info(message: String): Unit
    
    def log(message: String): Unit
  }
  object Logger {
    
    @scala.inline
    def apply(error: String => Unit, info: String => Unit, log: String => Unit): Logger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfo(value: String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    }
  }
}
