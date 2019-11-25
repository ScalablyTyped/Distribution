package typings.egg.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEggPluginItem extends js.Object {
  var enable: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[js.Array[EggEnvType]] = js.undefined
  var `package`: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object IEggPluginItem {
  @scala.inline
  def apply(
    enable: js.UndefOr[Boolean] = js.undefined,
    env: js.Array[EggEnvType] = null,
    `package`: String = null,
    path: String = null
  ): IEggPluginItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (`package` != null) __obj.updateDynamic("package")(`package`.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEggPluginItem]
  }
}

