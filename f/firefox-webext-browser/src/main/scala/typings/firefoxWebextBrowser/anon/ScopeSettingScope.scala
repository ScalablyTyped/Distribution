package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.types.SettingScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeSettingScope extends js.Object {
  /** Where to clear the setting (default: regular). */
  var scope: js.UndefOr[SettingScope] = js.undefined
}

object ScopeSettingScope {
  @scala.inline
  def apply(scope: SettingScope = null): ScopeSettingScope = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeSettingScope]
  }
}

