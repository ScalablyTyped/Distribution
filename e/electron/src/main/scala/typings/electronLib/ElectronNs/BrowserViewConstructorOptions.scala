package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserViewConstructorOptions extends js.Object {
  /**
    * See .
    */
  var webPreferences: js.UndefOr[WebPreferences] = js.undefined
}

object BrowserViewConstructorOptions {
  @scala.inline
  def apply(webPreferences: WebPreferences = null): BrowserViewConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (webPreferences != null) __obj.updateDynamic("webPreferences")(webPreferences)
    __obj.asInstanceOf[BrowserViewConstructorOptions]
  }
}

