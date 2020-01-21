package typings.filterConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Console = typings.std.Record[
    typings.filterConsole.filterConsoleStrings.log | typings.filterConsole.filterConsoleStrings.debug | typings.filterConsole.filterConsoleStrings.info | typings.filterConsole.filterConsoleStrings.warn | typings.filterConsole.filterConsoleStrings.error, 
    js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  ]
}
