package typings.firefoxWebextBrowser.browser.types

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.anon.IncognitoBoolean
import typings.firefoxWebextBrowser.anon.IncognitoSpecific
import typings.firefoxWebextBrowser.anon.Scope
import typings.firefoxWebextBrowser.anon.ScopeSettingScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setting extends js.Object {
  /**
    * Fired after the setting changes.
    * @deprecated Unsupported on Firefox at this time.
    */
  var onChange: WebExtEvent[js.Function1[/* details */ IncognitoSpecific, Unit]]
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    */
  def clear(details: ScopeSettingScope): js.Promise[Unit]
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: IncognitoBoolean): js.Promise[IncognitoSpecific]
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    */
  def set(details: Scope): js.Promise[Unit]
}

object Setting {
  @scala.inline
  def apply(
    clear: ScopeSettingScope => js.Promise[Unit],
    get: IncognitoBoolean => js.Promise[IncognitoSpecific],
    onChange: WebExtEvent[js.Function1[/* details */ IncognitoSpecific, Unit]],
    set: Scope => js.Promise[Unit]
  ): Setting = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), onChange = onChange.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Setting]
  }
}

