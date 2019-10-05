package typings.firefoxDashWebextDashBrowser.browser.commands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* commands types */
trait Command extends js.Object {
  /** The Extension Command description */
  var description: js.UndefOr[String] = js.undefined
  /** The name of the Extension Command */
  var name: js.UndefOr[String] = js.undefined
  /** The shortcut active for this command, or blank if not active. */
  var shortcut: js.UndefOr[String] = js.undefined
}

object Command {
  @scala.inline
  def apply(description: String = null, name: String = null, shortcut: String = null): Command = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut)
    __obj.asInstanceOf[Command]
  }
}

