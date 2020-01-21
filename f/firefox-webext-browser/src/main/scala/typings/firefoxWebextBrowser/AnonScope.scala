package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.types.SettingScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScope extends js.Object {
  /** Where to set the setting (default: regular). */
  var scope: js.UndefOr[SettingScope] = js.undefined
  /**
    * The value of the setting.
    * Note that every setting has a specific value type, which is described together with the setting. An
    * extension should _not_ set a value of a different type.
    */
  var value: js.Any
}

object AnonScope {
  @scala.inline
  def apply(value: js.Any, scope: SettingScope = null): AnonScope = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScope]
  }
}

