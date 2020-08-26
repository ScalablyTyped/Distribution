package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeClickThroughUrl extends js.Object {
  var computedClickThroughUrl: js.UndefOr[String] = js.native
  var customClickThroughUrl: js.UndefOr[String] = js.native
  var landingPageId: js.UndefOr[String] = js.native
}

object CreativeClickThroughUrl {
  @scala.inline
  def apply(): CreativeClickThroughUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeClickThroughUrl]
  }
  @scala.inline
  implicit class CreativeClickThroughUrlOps[Self <: CreativeClickThroughUrl] (val x: Self) extends AnyVal {
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
    def setComputedClickThroughUrl(value: String): Self = this.set("computedClickThroughUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputedClickThroughUrl: Self = this.set("computedClickThroughUrl", js.undefined)
    @scala.inline
    def setCustomClickThroughUrl(value: String): Self = this.set("customClickThroughUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomClickThroughUrl: Self = this.set("customClickThroughUrl", js.undefined)
    @scala.inline
    def setLandingPageId(value: String): Self = this.set("landingPageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandingPageId: Self = this.set("landingPageId", js.undefined)
  }
  
}

