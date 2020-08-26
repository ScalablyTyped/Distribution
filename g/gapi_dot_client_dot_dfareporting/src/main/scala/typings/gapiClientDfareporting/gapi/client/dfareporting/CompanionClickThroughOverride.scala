package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompanionClickThroughOverride extends js.Object {
  /** Click-through URL of this companion click-through override. */
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.native
  /** ID of the creative for this companion click-through override. */
  var creativeId: js.UndefOr[String] = js.native
}

object CompanionClickThroughOverride {
  @scala.inline
  def apply(): CompanionClickThroughOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompanionClickThroughOverride]
  }
  @scala.inline
  implicit class CompanionClickThroughOverrideOps[Self <: CompanionClickThroughOverride] (val x: Self) extends AnyVal {
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
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
  }
  
}

