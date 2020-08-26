package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveStreamContentDetails extends js.Object {
  var closedCaptionsIngestionUrl: js.UndefOr[String] = js.native
  var isReusable: js.UndefOr[Boolean] = js.native
}

object LiveStreamContentDetails {
  @scala.inline
  def apply(): LiveStreamContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveStreamContentDetails]
  }
  @scala.inline
  implicit class LiveStreamContentDetailsOps[Self <: LiveStreamContentDetails] (val x: Self) extends AnyVal {
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
    def setClosedCaptionsIngestionUrl(value: String): Self = this.set("closedCaptionsIngestionUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosedCaptionsIngestionUrl: Self = this.set("closedCaptionsIngestionUrl", js.undefined)
    @scala.inline
    def setIsReusable(value: Boolean): Self = this.set("isReusable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsReusable: Self = this.set("isReusable", js.undefined)
  }
  
}

