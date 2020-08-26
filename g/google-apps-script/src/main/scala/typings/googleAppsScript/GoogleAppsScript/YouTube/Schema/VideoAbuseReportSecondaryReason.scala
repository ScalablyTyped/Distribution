package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoAbuseReportSecondaryReason extends js.Object {
  var id: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
}

object VideoAbuseReportSecondaryReason {
  @scala.inline
  def apply(): VideoAbuseReportSecondaryReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoAbuseReportSecondaryReason]
  }
  @scala.inline
  implicit class VideoAbuseReportSecondaryReasonOps[Self <: VideoAbuseReportSecondaryReason] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

