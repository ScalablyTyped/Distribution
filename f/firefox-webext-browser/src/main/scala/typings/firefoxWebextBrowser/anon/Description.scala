package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  /** The new description for the command. */
  var description: js.UndefOr[String] = js.undefined
  /** The name of the command. */
  var name: String
  var shortcut: js.UndefOr[String] = js.undefined
}

object Description {
  @scala.inline
  def apply(name: String, description: String = null, shortcut: String = null): Description = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

