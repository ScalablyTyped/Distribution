package typings.filterConsole

import typings.filterConsole.filterConsoleStrings.debug
import typings.filterConsole.filterConsoleStrings.error
import typings.filterConsole.filterConsoleStrings.info
import typings.filterConsole.filterConsoleStrings.log
import typings.filterConsole.filterConsoleStrings.warn
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Filter out unwanted `console.log()` output.
  Can be useful when you don't control the output, for example, filtering out PropType warnings from a third-party React component.
  @param excludePatterns - Console output that matches any of the given patterns are filtered from being logged.
  Filter types:
  - `string`: Checks if the string pattern is included in the console output.
  - `RegExp`: Checks if the RegExp pattern matches the console output.
  - `Function`: Receives the console output as a string and is expected to return a truthy/falsy value of whether to exclude it.
  @returns A function, which when called, disables the filter.
  @example
  ```
  import filterConsole = require('filter-console');
  const disableFilter = filterConsole(['🐼']);
  const log = () => {
  	console.log('');
  	console.log('🦄');
  	console.log('🐼');
  	console.log('🐶');
  };
  log();
  disableFilter();
  log();
  // $ node example.js
  //
  // 🦄
  // 🐶
  //
  // 🦄
  // 🐼
  // 🐶
  ```
  */
  inline def apply(excludePatterns: js.Array[String | RegExp | (js.Function1[/* output */ String, Boolean])]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].apply(excludePatterns.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def apply(
    excludePatterns: js.Array[String | RegExp | (js.Function1[/* output */ String, Boolean])],
    options: Options
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].apply(excludePatterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("filter-console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Record<'log' | 'debug' | 'info' | 'warn' | 'error', (message : unknown | undefined, optionalParams : ...unknown): void> */
  trait Console extends StObject {
    
    def debug(message: js.Any, optionalParams: js.Any*): Unit
    def debug(message: Unit, optionalParams: js.Any*): Unit
    @JSName("debug")
    var debug_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
    
    def error(message: js.Any, optionalParams: js.Any*): Unit
    def error(message: Unit, optionalParams: js.Any*): Unit
    @JSName("error")
    var error_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
    
    def info(message: js.Any, optionalParams: js.Any*): Unit
    def info(message: Unit, optionalParams: js.Any*): Unit
    @JSName("info")
    var info_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
    
    def log(message: js.Any, optionalParams: js.Any*): Unit
    def log(message: Unit, optionalParams: js.Any*): Unit
    @JSName("log")
    var log_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
    
    def warn(message: js.Any, optionalParams: js.Any*): Unit
    def warn(message: Unit, optionalParams: js.Any*): Unit
    @JSName("warn")
    var warn_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  }
  object Console {
    
    inline def apply(
      debug: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit,
      error: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit,
      info: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit,
      log: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit,
      warn: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit
    ): Console = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), log = js.Any.fromFunction2(log), warn = js.Any.fromFunction2(warn))
      __obj.asInstanceOf[Console]
    }
    
    extension [Self <: Console](x: Self) {
      
      inline def setDebug(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      inline def setError(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setInfo(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
      
      inline def setLog(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setWarn(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
    }
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
    val methods: js.UndefOr[js.Array[log | debug | info | warn | error]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setMethods(value: js.Array[log | debug | info | warn | error]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: (log | debug | info | warn | error)*): Self = StObject.set(x, "methods", js.Array(value :_*))
    }
  }
}
