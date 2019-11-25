package typings.firefoxDashWebextDashBrowser.browser.types

import typings.firefoxDashWebextDashBrowser.Anon_Incognito
import typings.firefoxDashWebextDashBrowser.Anon_IncognitoSpecific
import typings.firefoxDashWebextDashBrowser.Anon_Scope
import typings.firefoxDashWebextDashBrowser.Anon_ScopeSettingScope
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setting extends js.Object {
  /**
    * Fired after the setting changes.
    * @deprecated Unsupported on Firefox at this time.
    */
  var onChange: WebExtEvent[js.Function1[/* details */ Anon_IncognitoSpecific, Unit]]
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    */
  def clear(details: Anon_ScopeSettingScope): js.Promise[Unit]
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: Anon_Incognito): js.Promise[Anon_IncognitoSpecific]
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    */
  def set(details: Anon_Scope): js.Promise[Unit]
}

object Setting {
  @scala.inline
  def apply(
    clear: Anon_ScopeSettingScope => js.Promise[Unit],
    get: Anon_Incognito => js.Promise[Anon_IncognitoSpecific],
    onChange: WebExtEvent[js.Function1[/* details */ Anon_IncognitoSpecific, Unit]],
    set: Anon_Scope => js.Promise[Unit]
  ): Setting = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), onChange = onChange.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Setting]
  }
}

