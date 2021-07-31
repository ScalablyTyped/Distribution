package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Console {
  
  trait Console extends StObject {
    
    def debug(source: String, message: String): js.Promise[Unit]
    
    def error(source: String, message: String): js.Promise[Unit]
    
    def info(source: String, message: String): js.Promise[Unit]
    
    def log(source: String, message: String): js.Promise[Unit]
    
    def warn(source: String, message: String): js.Promise[Unit]
  }
  object Console {
    
    @scala.inline
    def apply(
      debug: (String, String) => js.Promise[Unit],
      error: (String, String) => js.Promise[Unit],
      info: (String, String) => js.Promise[Unit],
      log: (String, String) => js.Promise[Unit],
      warn: (String, String) => js.Promise[Unit]
    ): typings.freedom.freedom.Console.Console = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), log = js.Any.fromFunction2(log), warn = js.Any.fromFunction2(warn))
      __obj.asInstanceOf[typings.freedom.freedom.Console.Console]
    }
    
    @scala.inline
    implicit class ConsoleMutableBuilder[Self <: typings.freedom.freedom.Console.Console] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      @scala.inline
      def setError(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInfo(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLog(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWarn(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
    }
  }
}
