package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.types.SettingScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopeSettingScope extends js.Object {
  /** Where to clear the setting (default: regular). */
  var scope: js.UndefOr[SettingScope] = js.undefined
}

object AnonScopeSettingScope {
  @scala.inline
  def apply(scope: SettingScope = null): AnonScopeSettingScope = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScopeSettingScope]
  }
}

