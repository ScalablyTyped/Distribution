package typings.evernote.anon

import typings.evernote.mod.UserStore.BootstrapSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var settings: js.UndefOr[BootstrapSettings] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String = null, settings: BootstrapSettings = null): Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

