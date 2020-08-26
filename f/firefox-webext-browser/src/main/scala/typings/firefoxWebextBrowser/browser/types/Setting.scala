package typings.firefoxWebextBrowser.browser.types

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.anon.IncognitoSpecific
import typings.firefoxWebextBrowser.anon.Scope
import typings.firefoxWebextBrowser.anon.`4`
import typings.firefoxWebextBrowser.anon.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Setting extends js.Object {
  /** Fired after the setting changes. */
  var onChange: WebExtEvent[js.Function1[/* details */ IncognitoSpecific, Unit]] = js.native
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    */
  def clear(details: `5`): js.Promise[Unit] = js.native
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: `4`): js.Promise[IncognitoSpecific] = js.native
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    */
  def set(details: Scope): js.Promise[Unit] = js.native
}

object Setting {
  @scala.inline
  def apply(
    clear: `5` => js.Promise[Unit],
    get: `4` => js.Promise[IncognitoSpecific],
    onChange: WebExtEvent[js.Function1[/* details */ IncognitoSpecific, Unit]],
    set: Scope => js.Promise[Unit]
  ): Setting = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), onChange = onChange.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Setting]
  }
  @scala.inline
  implicit class SettingOps[Self <: Setting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: `5` => js.Promise[Unit]): Self = this.set("clear", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: `4` => js.Promise[IncognitoSpecific]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setOnChange(value: WebExtEvent[js.Function1[/* details */ IncognitoSpecific, Unit]]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: Scope => js.Promise[Unit]): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

