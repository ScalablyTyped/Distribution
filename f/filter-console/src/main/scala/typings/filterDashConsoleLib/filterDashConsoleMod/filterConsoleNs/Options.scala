package typings
package filterDashConsoleLib.filterDashConsoleMod.filterConsoleNs

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

