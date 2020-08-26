package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RichMediaExitOverride extends js.Object {
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var exitId: js.UndefOr[String] = js.native
}

object RichMediaExitOverride {
  @scala.inline
  def apply(): RichMediaExitOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichMediaExitOverride]
  }
  @scala.inline
  implicit class RichMediaExitOverrideOps[Self <: RichMediaExitOverride] (val x: Self) extends AnyVal {
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
    def setClickThroughUrl(value: ClickThroughUrl): Self = this.set("clickThroughUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickThroughUrl: Self = this.set("clickThroughUrl", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setExitId(value: String): Self = this.set("exitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitId: Self = this.set("exitId", js.undefined)
  }
  
}

