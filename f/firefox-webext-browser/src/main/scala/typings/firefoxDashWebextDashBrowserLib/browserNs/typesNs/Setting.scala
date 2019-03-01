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
    clear: js.Function1[firefoxDashWebextDashBrowserLib.Anon_ScopeSettingScope, js.Promise[scala.Unit]],
    get: js.Function1[
      firefoxDashWebextDashBrowserLib.Anon_Incognito, 
      js.Promise[firefoxDashWebextDashBrowserLib.Anon_IncognitoSpecific]
    ],
    onChange: firefoxDashWebextDashBrowserLib.WebExtEvent[
      js.Function1[/* details */ firefoxDashWebextDashBrowserLib.Anon_IncognitoSpecific, scala.Unit]
    ],
    set: js.Function1[firefoxDashWebextDashBrowserLib.Anon_Scope, js.Promise[scala.Unit]]
  ): Setting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("onChange")(onChange)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[Setting]
  }
}

