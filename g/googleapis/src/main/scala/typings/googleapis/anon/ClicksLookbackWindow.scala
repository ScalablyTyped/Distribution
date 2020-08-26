package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClicksLookbackWindow extends js.Object {
  var clicksLookbackWindow: js.UndefOr[Double] = js.native
  var impressionsLookbackWindow: js.UndefOr[Double] = js.native
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.native
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.native
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.native
  var maximumClickInteractions: js.UndefOr[Double] = js.native
  var maximumImpressionInteractions: js.UndefOr[Double] = js.native
  var maximumInteractionGap: js.UndefOr[Double] = js.native
  var pivotOnInteractionPath: js.UndefOr[Boolean] = js.native
}

object ClicksLookbackWindow {
  @scala.inline
  def apply(): ClicksLookbackWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClicksLookbackWindow]
  }
  @scala.inline
  implicit class ClicksLookbackWindowOps[Self <: ClicksLookbackWindow] (val x: Self) extends AnyVal {
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
    def setClicksLookbackWindow(value: Double): Self = this.set("clicksLookbackWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClicksLookbackWindow: Self = this.set("clicksLookbackWindow", js.undefined)
    @scala.inline
    def setImpressionsLookbackWindow(value: Double): Self = this.set("impressionsLookbackWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpressionsLookbackWindow: Self = this.set("impressionsLookbackWindow", js.undefined)
    @scala.inline
    def setIncludeAttributedIPConversions(value: Boolean): Self = this.set("includeAttributedIPConversions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAttributedIPConversions: Self = this.set("includeAttributedIPConversions", js.undefined)
    @scala.inline
    def setIncludeUnattributedCookieConversions(value: Boolean): Self = this.set("includeUnattributedCookieConversions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeUnattributedCookieConversions: Self = this.set("includeUnattributedCookieConversions", js.undefined)
    @scala.inline
    def setIncludeUnattributedIPConversions(value: Boolean): Self = this.set("includeUnattributedIPConversions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeUnattributedIPConversions: Self = this.set("includeUnattributedIPConversions", js.undefined)
    @scala.inline
    def setMaximumClickInteractions(value: Double): Self = this.set("maximumClickInteractions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumClickInteractions: Self = this.set("maximumClickInteractions", js.undefined)
    @scala.inline
    def setMaximumImpressionInteractions(value: Double): Self = this.set("maximumImpressionInteractions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumImpressionInteractions: Self = this.set("maximumImpressionInteractions", js.undefined)
    @scala.inline
    def setMaximumInteractionGap(value: Double): Self = this.set("maximumInteractionGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumInteractionGap: Self = this.set("maximumInteractionGap", js.undefined)
    @scala.inline
    def setPivotOnInteractionPath(value: Boolean): Self = this.set("pivotOnInteractionPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotOnInteractionPath: Self = this.set("pivotOnInteractionPath", js.undefined)
  }
  
}

