package typings.filterConsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("filter-console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(excludePatterns: js.Array[String | js.RegExp | (js.Function1[/* output */ String, Boolean])]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(excludePatterns.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def default(
    excludePatterns: js.Array[String | js.RegExp | (js.Function1[/* output */ String, Boolean])],
    options: Options
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(excludePatterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  /* Inlined std.Record<filter-console.filter-console.ConsoleMethods, (message : unknown | undefined, optionalParameters : ...unknown): void> */
  trait Console extends StObject {
    
    def debug(message: Any, optionalParameters: Any*): Unit
    def debug(message: Unit, optionalParameters: Any*): Unit
    @JSName("debug")
    var debug_Original: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
    
    def error(message: Any, optionalParameters: Any*): Unit
    def error(message: Unit, optionalParameters: Any*): Unit
    @JSName("error")
    var error_Original: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
    
    def info(message: Any, optionalParameters: Any*): Unit
    def info(message: Unit, optionalParameters: Any*): Unit
    @JSName("info")
    var info_Original: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
    
    def log(message: Any, optionalParameters: Any*): Unit
    def log(message: Unit, optionalParameters: Any*): Unit
    @JSName("log")
    var log_Original: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
    
    def warn(message: Any, optionalParameters: Any*): Unit
    def warn(message: Unit, optionalParameters: Any*): Unit
    @JSName("warn")
    var warn_Original: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
  }
  object Console {
    
    inline def apply(
      debug: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit,
      error: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit,
      info: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit,
      log: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit,
      warn: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit
    ): Console = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), log = js.Any.fromFunction2(log), warn = js.Any.fromFunction2(warn))
      __obj.asInstanceOf[Console]
    }
    
    extension [Self <: Console](x: Self) {
      
      inline def setDebug(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      inline def setError(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setInfo(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
      
      inline def setLog(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setWarn(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.filterConsole.filterConsoleStrings.log
    - typings.filterConsole.filterConsoleStrings.debug
    - typings.filterConsole.filterConsoleStrings.info
    - typings.filterConsole.filterConsoleStrings.warn
    - typings.filterConsole.filterConsoleStrings.error
  */
  trait ConsoleMethods extends StObject
  object ConsoleMethods {
    
    inline def debug: typings.filterConsole.filterConsoleStrings.debug = "debug".asInstanceOf[typings.filterConsole.filterConsoleStrings.debug]
    
    inline def error: typings.filterConsole.filterConsoleStrings.error = "error".asInstanceOf[typings.filterConsole.filterConsoleStrings.error]
    
    inline def info: typings.filterConsole.filterConsoleStrings.info = "info".asInstanceOf[typings.filterConsole.filterConsoleStrings.info]
    
    inline def log: typings.filterConsole.filterConsoleStrings.log = "log".asInstanceOf[typings.filterConsole.filterConsoleStrings.log]
    
    inline def warn: typings.filterConsole.filterConsoleStrings.warn = "warn".asInstanceOf[typings.filterConsole.filterConsoleStrings.warn]
  }
  
  trait Options extends StObject {
    
    /**
    	Use a custom `console` object. Can be useful for testing or mocking.
    	@default console
    	*/
    val console: js.UndefOr[Console] = js.undefined
    
    /**
    	Console methods to filter.
    	@default ['log', 'debug', 'info', 'warn', 'error']
    	*/
    val methods: js.UndefOr[js.Array[ConsoleMethods]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setMethods(value: js.Array[ConsoleMethods]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: ConsoleMethods*): Self = StObject.set(x, "methods", js.Array(value*))
    }
  }
}
