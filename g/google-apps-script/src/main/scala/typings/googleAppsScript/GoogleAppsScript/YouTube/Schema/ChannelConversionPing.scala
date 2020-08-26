package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelConversionPing extends js.Object {
  var context: js.UndefOr[String] = js.native
  var conversionUrl: js.UndefOr[String] = js.native
}

object ChannelConversionPing {
  @scala.inline
  def apply(): ChannelConversionPing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelConversionPing]
  }
  @scala.inline
  implicit class ChannelConversionPingOps[Self <: ChannelConversionPing] (val x: Self) extends AnyVal {
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
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setConversionUrl(value: String): Self = this.set("conversionUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversionUrl: Self = this.set("conversionUrl", js.undefined)
  }
  
}

