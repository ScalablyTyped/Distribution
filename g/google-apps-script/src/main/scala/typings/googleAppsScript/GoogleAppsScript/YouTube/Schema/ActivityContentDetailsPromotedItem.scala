package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityContentDetailsPromotedItem extends js.Object {
  var adTag: js.UndefOr[String] = js.native
  var clickTrackingUrl: js.UndefOr[String] = js.native
  var creativeViewUrl: js.UndefOr[String] = js.native
  var ctaType: js.UndefOr[String] = js.native
  var customCtaButtonText: js.UndefOr[String] = js.native
  var descriptionText: js.UndefOr[String] = js.native
  var destinationUrl: js.UndefOr[String] = js.native
  var forecastingUrl: js.UndefOr[js.Array[String]] = js.native
  var impressionUrl: js.UndefOr[js.Array[String]] = js.native
  var videoId: js.UndefOr[String] = js.native
}

object ActivityContentDetailsPromotedItem {
  @scala.inline
  def apply(): ActivityContentDetailsPromotedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsPromotedItem]
  }
  @scala.inline
  implicit class ActivityContentDetailsPromotedItemOps[Self <: ActivityContentDetailsPromotedItem] (val x: Self) extends AnyVal {
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
    def setAdTag(value: String): Self = this.set("adTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdTag: Self = this.set("adTag", js.undefined)
    @scala.inline
    def setClickTrackingUrl(value: String): Self = this.set("clickTrackingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickTrackingUrl: Self = this.set("clickTrackingUrl", js.undefined)
    @scala.inline
    def setCreativeViewUrl(value: String): Self = this.set("creativeViewUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeViewUrl: Self = this.set("creativeViewUrl", js.undefined)
    @scala.inline
    def setCtaType(value: String): Self = this.set("ctaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtaType: Self = this.set("ctaType", js.undefined)
    @scala.inline
    def setCustomCtaButtonText(value: String): Self = this.set("customCtaButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomCtaButtonText: Self = this.set("customCtaButtonText", js.undefined)
    @scala.inline
    def setDescriptionText(value: String): Self = this.set("descriptionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionText: Self = this.set("descriptionText", js.undefined)
    @scala.inline
    def setDestinationUrl(value: String): Self = this.set("destinationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationUrl: Self = this.set("destinationUrl", js.undefined)
    @scala.inline
    def setForecastingUrlVarargs(value: String*): Self = this.set("forecastingUrl", js.Array(value :_*))
    @scala.inline
    def setForecastingUrl(value: js.Array[String]): Self = this.set("forecastingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForecastingUrl: Self = this.set("forecastingUrl", js.undefined)
    @scala.inline
    def setImpressionUrlVarargs(value: String*): Self = this.set("impressionUrl", js.Array(value :_*))
    @scala.inline
    def setImpressionUrl(value: js.Array[String]): Self = this.set("impressionUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpressionUrl: Self = this.set("impressionUrl", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
  
}

