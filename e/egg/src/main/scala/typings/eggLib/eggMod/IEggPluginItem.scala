package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEggPluginItem extends js.Object {
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[js.Array[EggEnvType]] = js.undefined
  var `package`: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object IEggPluginItem {
  @scala.inline
  def apply(
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    env: js.Array[EggEnvType] = null,
    `package`: java.lang.String = null,
    path: java.lang.String = null
  ): IEggPluginItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (env != null) __obj.updateDynamic("env")(env)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[IEggPluginItem]
  }
}

