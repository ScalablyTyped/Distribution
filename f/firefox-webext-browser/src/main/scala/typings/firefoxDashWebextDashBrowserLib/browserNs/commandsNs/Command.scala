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

object Command {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    name: java.lang.String = null,
    shortcut: java.lang.String = null
  ): Command = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut)
    __obj.asInstanceOf[Command]
  }
}

