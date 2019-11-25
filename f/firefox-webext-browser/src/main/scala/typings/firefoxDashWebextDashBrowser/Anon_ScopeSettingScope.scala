package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.types.SettingScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeSettingScope extends js.Object {
  /** Where to clear the setting (default: regular). */
  var scope: js.UndefOr[SettingScope] = js.undefined
}

object Anon_ScopeSettingScope {
  @scala.inline
  def apply(scope: SettingScope = null): Anon_ScopeSettingScope = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ScopeSettingScope]
  }
}

