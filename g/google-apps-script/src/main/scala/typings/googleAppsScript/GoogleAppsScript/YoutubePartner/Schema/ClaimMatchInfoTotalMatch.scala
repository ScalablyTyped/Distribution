package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimMatchInfoTotalMatch extends js.Object {
  var referenceDurationSecs: js.UndefOr[String] = js.native
  var userVideoDurationSecs: js.UndefOr[String] = js.native
}

object ClaimMatchInfoTotalMatch {
  @scala.inline
  def apply(): ClaimMatchInfoTotalMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimMatchInfoTotalMatch]
  }
  @scala.inline
  implicit class ClaimMatchInfoTotalMatchOps[Self <: ClaimMatchInfoTotalMatch] (val x: Self) extends AnyVal {
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
    def setReferenceDurationSecs(value: String): Self = this.set("referenceDurationSecs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceDurationSecs: Self = this.set("referenceDurationSecs", js.undefined)
    @scala.inline
    def setUserVideoDurationSecs(value: String): Self = this.set("userVideoDurationSecs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserVideoDurationSecs: Self = this.set("userVideoDurationSecs", js.undefined)
  }
  
}

