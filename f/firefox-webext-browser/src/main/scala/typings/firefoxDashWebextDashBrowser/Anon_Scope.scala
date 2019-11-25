package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.types.SettingScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scope extends js.Object {
  /** Where to set the setting (default: regular). */
  var scope: js.UndefOr[SettingScope] = js.undefined
  /**
    * The value of the setting.
    * Note that every setting has a specific value type, which is described together with the setting. An
    * extension should _not_ set a value of a different type.
    */
  var value: js.Any
}

object Anon_Scope {
  @scala.inline
  def apply(value: js.Any, scope: SettingScope = null): Anon_Scope = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Scope]
  }
}

