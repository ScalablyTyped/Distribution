package typings
package filterDashConsoleLib.filterDashConsoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Use a custom `console` object. Can be useful for testing or mocking.
    */
  var console: js.UndefOr[Console] = js.undefined
  /**
    * Console methods to filter.
    * @default ['log', 'debug', 'info', 'warn', 'error']
    */
  var methods: js.UndefOr[
    js.Array[
      filterDashConsoleLib.filterDashConsoleLibStrings.log | filterDashConsoleLib.filterDashConsoleLibStrings.debug | filterDashConsoleLib.filterDashConsoleLibStrings.info | filterDashConsoleLib.filterDashConsoleLibStrings.warn | filterDashConsoleLib.filterDashConsoleLibStrings.error
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    console: Console = null,
    methods: js.Array[
      filterDashConsoleLib.filterDashConsoleLibStrings.log | filterDashConsoleLib.filterDashConsoleLibStrings.debug | filterDashConsoleLib.filterDashConsoleLibStrings.info | filterDashConsoleLib.filterDashConsoleLibStrings.warn | filterDashConsoleLib.filterDashConsoleLibStrings.error
    ] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (console != null) __obj.updateDynamic("console")(console)
    if (methods != null) __obj.updateDynamic("methods")(methods)
    __obj.asInstanceOf[Options]
  }
}

