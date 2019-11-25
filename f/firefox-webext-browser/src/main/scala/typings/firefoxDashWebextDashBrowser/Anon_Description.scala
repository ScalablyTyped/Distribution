package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser._manifest.KeyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  /** The new description for the command. */
  var description: js.UndefOr[String] = js.undefined
  /** The name of the command. */
  var name: String
  var shortcut: js.UndefOr[KeyName] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(name: String, description: String = null, shortcut: KeyName = null): Anon_Description = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Description]
  }
}

