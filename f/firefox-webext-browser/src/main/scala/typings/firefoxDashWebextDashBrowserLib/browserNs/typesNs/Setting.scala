package typings
package firefoxDashWebextDashBrowserLib.browserNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setting extends js.Object {
  /**
    * Fired after the setting changes.
    * @deprecated Unsupported on Firefox at this time.
    */
  var onChange: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[/* details */ firefoxDashWebextDashBrowserLib.Anon_IncognitoSpecific, scala.Unit]
  ]
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    */
  def clear(details: firefoxDashWebextDashBrowserLib.Anon_ScopeSettingScope): js.Promise[scala.Unit]
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: firefoxDashWebextDashBrowserLib.Anon_Incognito): js.Promise[firefoxDashWebextDashBrowserLib.Anon_IncognitoSpecific]
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    */
  def set(details: firefoxDashWebextDashBrowserLib.Anon_Scope): js.Promise[scala.Unit]
}

object Setting {
  @scala.inline
  def apply(
    clear: firefoxDashWebextDashBrowserLib.Anon_ScopeSettingScope => js.Promise[scala.Unit],
    get: firefoxDashWebextDashBrowserLib.Anon_Incognito => js.Promise[firefoxDashWebextDashBrowserLib.Anon_IncognitoSpecific],
    onChange: firefoxDashWebextDashBrowserLib.WebExtEvent[
      js.Function1[/* details */ firefoxDashWebextDashBrowserLib.Anon_IncognitoSpecific, scala.Unit]
    ],
    set: firefoxDashWebextDashBrowserLib.Anon_Scope => js.Promise[scala.Unit]
  ): Setting = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), onChange = onChange, set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Setting]
  }
}

