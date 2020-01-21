package typings.emberData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdapterOptionsBackgroundReload extends js.Object {
  var adapterOptions: js.UndefOr[js.Any] = js.undefined
  var backgroundReload: js.UndefOr[Boolean] = js.undefined
  var include: js.UndefOr[String] = js.undefined
  var reload: js.UndefOr[Boolean] = js.undefined
}

object AnonAdapterOptionsBackgroundReload {
  @scala.inline
  def apply(
    adapterOptions: js.Any = null,
    backgroundReload: js.UndefOr[Boolean] = js.undefined,
    include: String = null,
    reload: js.UndefOr[Boolean] = js.undefined
  ): AnonAdapterOptionsBackgroundReload = {
    val __obj = js.Dynamic.literal()
    if (adapterOptions != null) __obj.updateDynamic("adapterOptions")(adapterOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundReload)) __obj.updateDynamic("backgroundReload")(backgroundReload.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdapterOptionsBackgroundReload]
  }
}

