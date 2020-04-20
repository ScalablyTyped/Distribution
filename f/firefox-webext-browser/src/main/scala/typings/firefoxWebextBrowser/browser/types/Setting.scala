package typings.firefoxWebextBrowser.browser.types

import typings.firefoxWebextBrowser.AnonIncognitoBoolean
import typings.firefoxWebextBrowser.AnonIncognitoSpecific
import typings.firefoxWebextBrowser.AnonScope
import typings.firefoxWebextBrowser.AnonScopeSettingScope
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setting extends js.Object {
  /**
    * Fired after the setting changes.
    * @deprecated Unsupported on Firefox at this time.
    */
  var onChange: WebExtEvent[js.Function1[/* details */ AnonIncognitoSpecific, Unit]]
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    */
  def clear(details: AnonScopeSettingScope): js.Promise[Unit]
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: AnonIncognitoBoolean): js.Promise[AnonIncognitoSpecific]
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    */
  def set(details: AnonScope): js.Promise[Unit]
}

object Setting {
  @scala.inline
  def apply(
    clear: AnonScopeSettingScope => js.Promise[Unit],
    get: AnonIncognitoBoolean => js.Promise[AnonIncognitoSpecific],
    onChange: WebExtEvent[js.Function1[/* details */ AnonIncognitoSpecific, Unit]],
    set: AnonScope => js.Promise[Unit]
  ): Setting = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), onChange = onChange.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Setting]
  }
}

