package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueScope extends js.Object {
  /** Where to set the setting (default: regular). */
  var scope: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.typesNs.SettingScope] = js.undefined
  /**
    * The value of the setting.
    * Note that every setting has a specific value type, which is described together with the setting. An
    * extension should _not_ set a value of a different type.
    */
  var value: js.Any
}

