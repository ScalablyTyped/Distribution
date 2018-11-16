package typings
package firefoxDashWebextDashBrowserLib.browserNs.commandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* commands types */

trait Command extends js.Object {
  /** The Extension Command description */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the Extension Command */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The shortcut active for this command, or blank if not active. */
  var shortcut: js.UndefOr[java.lang.String] = js.undefined
}

