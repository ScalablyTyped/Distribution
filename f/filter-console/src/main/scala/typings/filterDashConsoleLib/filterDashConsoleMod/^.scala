package typings
package filterDashConsoleLib.filterDashConsoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("filter-console", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Filter out unwanted `console.log()` output.
    * Can be useful when you don't control the output, for example, filtering out PropType warnings from a
    * third-party React component.
    *
    * @param excludePatterns Console output that matches any of the given patterns are filtered from being logged.
    * The patterns are matched against what would be logged and not the `console` method input arguments directly.
    * Meaning an exclude pattern of `'foo bar'` will match `console.log('foo %s', 'bar')`.
    * @returns A function, which when called, disables the filter.
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

