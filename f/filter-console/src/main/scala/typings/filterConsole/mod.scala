package typings.filterConsole

import typings.filterConsole.filterConsoleStrings.debug
import typings.filterConsole.filterConsoleStrings.error
import typings.filterConsole.filterConsoleStrings.info
import typings.filterConsole.filterConsoleStrings.log
import typings.filterConsole.filterConsoleStrings.warn
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("filter-console", JSImport.Namespace)
  @js.native
  def apply(excludePatterns: js.Array[String | RegExp | (js.Function1[/* output */ String, Boolean])]): js.Function0[Unit] = js.native
  @JSImport("filter-console", JSImport.Namespace)
  @js.native
  def apply(
    excludePatterns: js.Array[String | RegExp | (js.Function1[/* output */ String, Boolean])],
    options: Options
  ): js.Function0[Unit] = js.native
  
  /* Inlined std.Record<'log' | 'debug' | 'info' | 'warn' | 'error', (message : unknown | undefined, optionalParams : ...unknown): void> */
  @js.native
  trait Console extends StObject {
    
    def debug(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
    @JSName("debug")
    var debug_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit] = js.native
    
    def error(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
    @JSName("error")
    var error_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit] = js.native
    
    def info(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
    @JSName("info")
    var info_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit] = js.native
    
    def log(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
    @JSName("log")
    var log_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit] = js.native
    
    def warn(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
    @JSName("warn")
    var warn_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit] = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Use a custom `console` object. Can be useful for testing or mocking.
    		@default console
    		*/
    val console: js.UndefOr[Console] = js.native
    
    /**
    		Console methods to filter.
    		@default ['log', 'debug', 'info', 'warn', 'error']
    		*/
    val methods: js.UndefOr[js.Array[log | debug | info | warn | error]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      @scala.inline
      def setMethods(value: js.Array[log | debug | info | warn | error]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: (log | debug | info | warn | error)*): Self = StObject.set(x, "methods", js.Array(value :_*))
    }
  }
}
