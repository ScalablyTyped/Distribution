package typings
package electronDashConfigLib.electronDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectronConfigOptions extends js.Object {
  /**
    * Default config.
    */
  var defaults: js.UndefOr[js.Object] = js.undefined
  /**
    * Name of the config file (without extension).
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ElectronConfigOptions {
  @scala.inline
  def apply(defaults: js.Object = null, name: java.lang.String = null): ElectronConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ElectronConfigOptions]
  }
}

