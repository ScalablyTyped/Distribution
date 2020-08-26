package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitorStreamInfo extends js.Object {
  var broadcastStreamDelayMs: js.UndefOr[Double] = js.native
  var embedHtml: js.UndefOr[String] = js.native
  var enableMonitorStream: js.UndefOr[Boolean] = js.native
}

object MonitorStreamInfo {
  @scala.inline
  def apply(): MonitorStreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitorStreamInfo]
  }
  @scala.inline
  implicit class MonitorStreamInfoOps[Self <: MonitorStreamInfo] (val x: Self) extends AnyVal {
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
    def setBroadcastStreamDelayMs(value: Double): Self = this.set("broadcastStreamDelayMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBroadcastStreamDelayMs: Self = this.set("broadcastStreamDelayMs", js.undefined)
    @scala.inline
    def setEmbedHtml(value: String): Self = this.set("embedHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbedHtml: Self = this.set("embedHtml", js.undefined)
    @scala.inline
    def setEnableMonitorStream(value: Boolean): Self = this.set("enableMonitorStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMonitorStream: Self = this.set("enableMonitorStream", js.undefined)
  }
  
}

