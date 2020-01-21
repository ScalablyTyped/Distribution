package typings.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEggPluginItem extends js.Object {
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[js.Array[EggEnvType]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object IEggPluginItem {
  @scala.inline
  def apply(
    _package: String = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    env: js.Array[EggEnvType] = null,
    path: String = null
  ): IEggPluginItem = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEggPluginItem]
  }
}

