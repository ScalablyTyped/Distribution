package typings.flatpickr.distPluginsMinMaxTimePluginMod

import typings.flatpickr.distTypesGlobalsMod._Global_.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var getTimeLimits: js.UndefOr[js.Function1[/* date */ Date, MinMaxTime]] = js.undefined
  var table: js.UndefOr[Record[String, MinMaxTime]] = js.undefined
  var tableDateFormat: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    getTimeLimits: /* date */ Date => MinMaxTime = null,
    table: Record[String, MinMaxTime] = null,
    tableDateFormat: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (getTimeLimits != null) __obj.updateDynamic("getTimeLimits")(js.Any.fromFunction1(getTimeLimits))
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (tableDateFormat != null) __obj.updateDynamic("tableDateFormat")(tableDateFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

