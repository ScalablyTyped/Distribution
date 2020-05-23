package typings.electronLoadDevtool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectronLoadDevtoolOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object ElectronLoadDevtoolOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    profile: String = null,
    version: String = null
  ): ElectronLoadDevtoolOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElectronLoadDevtoolOptions]
  }
}

