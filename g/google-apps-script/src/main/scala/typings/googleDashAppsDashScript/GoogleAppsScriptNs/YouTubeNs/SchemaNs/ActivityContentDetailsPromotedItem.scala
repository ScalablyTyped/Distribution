package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsPromotedItem extends js.Object {
  var adTag: js.UndefOr[String] = js.undefined
  var clickTrackingUrl: js.UndefOr[String] = js.undefined
  var creativeViewUrl: js.UndefOr[String] = js.undefined
  var ctaType: js.UndefOr[String] = js.undefined
  var customCtaButtonText: js.UndefOr[String] = js.undefined
  var descriptionText: js.UndefOr[String] = js.undefined
  var destinationUrl: js.UndefOr[String] = js.undefined
  var forecastingUrl: js.UndefOr[js.Array[String]] = js.undefined
  var impressionUrl: js.UndefOr[js.Array[String]] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
}

object ActivityContentDetailsPromotedItem {
  @scala.inline
  def apply(
    adTag: String = null,
    clickTrackingUrl: String = null,
    creativeViewUrl: String = null,
    ctaType: String = null,
    customCtaButtonText: String = null,
    descriptionText: String = null,
    destinationUrl: String = null,
    forecastingUrl: js.Array[String] = null,
    impressionUrl: js.Array[String] = null,
    videoId: String = null
  ): ActivityContentDetailsPromotedItem = {
    val __obj = js.Dynamic.literal()
    if (adTag != null) __obj.updateDynamic("adTag")(adTag)
    if (clickTrackingUrl != null) __obj.updateDynamic("clickTrackingUrl")(clickTrackingUrl)
    if (creativeViewUrl != null) __obj.updateDynamic("creativeViewUrl")(creativeViewUrl)
    if (ctaType != null) __obj.updateDynamic("ctaType")(ctaType)
    if (customCtaButtonText != null) __obj.updateDynamic("customCtaButtonText")(customCtaButtonText)
    if (descriptionText != null) __obj.updateDynamic("descriptionText")(descriptionText)
    if (destinationUrl != null) __obj.updateDynamic("destinationUrl")(destinationUrl)
    if (forecastingUrl != null) __obj.updateDynamic("forecastingUrl")(forecastingUrl)
    if (impressionUrl != null) __obj.updateDynamic("impressionUrl")(impressionUrl)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[ActivityContentDetailsPromotedItem]
  }
}

