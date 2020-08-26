package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelConversionPings extends js.Object {
  var pings: js.UndefOr[js.Array[ChannelConversionPing]] = js.native
}

object ChannelConversionPings {
  @scala.inline
  def apply(): ChannelConversionPings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelConversionPings]
  }
  @scala.inline
  implicit class ChannelConversionPingsOps[Self <: ChannelConversionPings] (val x: Self) extends AnyVal {
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
    def setPingsVarargs(value: ChannelConversionPing*): Self = this.set("pings", js.Array(value :_*))
    @scala.inline
    def setPings(value: js.Array[ChannelConversionPing]): Self = this.set("pings", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePings: Self = this.set("pings", js.undefined)
  }
  
}

