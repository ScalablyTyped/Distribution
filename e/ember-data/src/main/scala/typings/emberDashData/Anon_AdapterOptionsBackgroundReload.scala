package typings.emberDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdapterOptionsBackgroundReload extends js.Object {
  var adapterOptions: js.UndefOr[js.Any] = js.undefined
  var backgroundReload: js.UndefOr[Boolean] = js.undefined
  var include: js.UndefOr[String] = js.undefined
  var reload: js.UndefOr[Boolean] = js.undefined
}

object Anon_AdapterOptionsBackgroundReload {
  @scala.inline
  def apply(
    adapterOptions: js.Any = null,
    backgroundReload: js.UndefOr[Boolean] = js.undefined,
    include: String = null,
    reload: js.UndefOr[Boolean] = js.undefined
  ): Anon_AdapterOptionsBackgroundReload = {
    val __obj = js.Dynamic.literal()
    if (adapterOptions != null) __obj.updateDynamic("adapterOptions")(adapterOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundReload)) __obj.updateDynamic("backgroundReload")(backgroundReload.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdapterOptionsBackgroundReload]
  }
}

