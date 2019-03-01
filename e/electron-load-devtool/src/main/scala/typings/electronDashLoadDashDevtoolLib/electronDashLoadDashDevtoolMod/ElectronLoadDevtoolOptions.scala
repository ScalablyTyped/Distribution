package typings
package electronDashLoadDashDevtoolLib.electronDashLoadDashDevtoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectronLoadDevtoolOptions extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var profile: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ElectronLoadDevtoolOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    profile: java.lang.String = null,
    version: java.lang.String = null
  ): ElectronLoadDevtoolOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ElectronLoadDevtoolOptions]
  }
}

