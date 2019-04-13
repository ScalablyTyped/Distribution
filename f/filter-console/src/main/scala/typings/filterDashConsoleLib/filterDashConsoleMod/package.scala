package typings
package filterDashConsoleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object filterDashConsoleMod {
  type Console = stdLib.Record[
    filterDashConsoleLib.filterDashConsoleLibStrings.log | filterDashConsoleLib.filterDashConsoleLibStrings.debug | filterDashConsoleLib.filterDashConsoleLibStrings.info | filterDashConsoleLib.filterDashConsoleLibStrings.warn | filterDashConsoleLib.filterDashConsoleLibStrings.error, 
    js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  ]
}
