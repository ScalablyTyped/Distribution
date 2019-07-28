package typings.filterDashConsole

import typings.filterDashConsole.filterDashConsoleStrings.debug
import typings.filterDashConsole.filterDashConsoleStrings.error
import typings.filterDashConsole.filterDashConsoleStrings.info
import typings.filterDashConsole.filterDashConsoleStrings.log
import typings.filterDashConsole.filterDashConsoleStrings.warn
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object filterDashConsoleMod {
  type Console = Record[
    log | debug | info | warn | error, 
    js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  ]
}
