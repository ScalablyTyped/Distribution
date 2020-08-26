package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimMatchInfoLongestMatch extends js.Object {
  var durationSecs: js.UndefOr[String] = js.native
  var referenceOffset: js.UndefOr[String] = js.native
  var userVideoOffset: js.UndefOr[String] = js.native
}

object ClaimMatchInfoLongestMatch {
  @scala.inline
  def apply(): ClaimMatchInfoLongestMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimMatchInfoLongestMatch]
  }
  @scala.inline
  implicit class ClaimMatchInfoLongestMatchOps[Self <: ClaimMatchInfoLongestMatch] (val x: Self) extends AnyVal {
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
    def setDurationSecs(value: String): Self = this.set("durationSecs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationSecs: Self = this.set("durationSecs", js.undefined)
    @scala.inline
    def setReferenceOffset(value: String): Self = this.set("referenceOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceOffset: Self = this.set("referenceOffset", js.undefined)
    @scala.inline
    def setUserVideoOffset(value: String): Self = this.set("userVideoOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserVideoOffset: Self = this.set("userVideoOffset", js.undefined)
  }
  
}

