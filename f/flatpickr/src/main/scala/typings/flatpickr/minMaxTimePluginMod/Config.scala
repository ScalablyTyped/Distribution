package typings.flatpickr.minMaxTimePluginMod

import typings.flatpickr.globalsMod.global.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var getTimeLimits: js.UndefOr[js.Function1[/* date */ Date, MinMaxTime]] = js.native
  var table: js.UndefOr[Record[String, MinMaxTime]] = js.native
  var tableDateFormat: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetTimeLimits(value: /* date */ Date => MinMaxTime): Self = this.set("getTimeLimits", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetTimeLimits: Self = this.set("getTimeLimits", js.undefined)
    @scala.inline
    def setTable(value: Record[String, MinMaxTime]): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setTableDateFormat(value: String): Self = this.set("tableDateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableDateFormat: Self = this.set("tableDateFormat", js.undefined)
  }
  
}

