package typings
package filterDashConsoleLib.filterDashConsoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("filter-console", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def apply(
    excludePatterns: js.Array[
      java.lang.String | stdLib.RegExp | (js.Function1[/* output */ java.lang.String, scala.Boolean])
    ]
  ): js.Function0[scala.Unit] = js.native
  def apply(
    excludePatterns: js.Array[
      java.lang.String | stdLib.RegExp | (js.Function1[/* output */ java.lang.String, scala.Boolean])
    ],
    options: Options
  ): js.Function0[scala.Unit] = js.native
}

