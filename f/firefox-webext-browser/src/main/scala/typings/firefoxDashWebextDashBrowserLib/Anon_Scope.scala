package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scope extends js.Object {
  /** Where to set the setting (default: regular). */
  var scope: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.typesNs.SettingScope] = js.undefined
  /**
    * The value of the setting.
    * Note that every setting has a specific value type, which is described together with the setting. An
    * extension should _not_ set a value of a different type.
    */
  var value: js.Any
}

object Anon_Scope {
  @scala.inline
  def apply(value: js.Any, scope: firefoxDashWebextDashBrowserLib.browserNs.typesNs.SettingScope = null): Anon_Scope = {
    val __obj = js.Dynamic.literal(value = value)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Anon_Scope]
  }
}

