package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeSettingScope extends js.Object {
  /** Where to clear the setting (default: regular). */
  var scope: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.typesNs.SettingScope] = js.undefined
}

object Anon_ScopeSettingScope {
  @scala.inline
  def apply(scope: firefoxDashWebextDashBrowserLib.browserNs.typesNs.SettingScope = null): Anon_ScopeSettingScope = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Anon_ScopeSettingScope]
  }
}

