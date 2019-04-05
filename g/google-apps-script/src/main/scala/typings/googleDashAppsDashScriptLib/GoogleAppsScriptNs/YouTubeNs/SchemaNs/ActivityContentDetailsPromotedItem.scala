package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsPromotedItem extends js.Object {
  var adTag: js.UndefOr[java.lang.String] = js.undefined
  var clickTrackingUrl: js.UndefOr[java.lang.String] = js.undefined
  var creativeViewUrl: js.UndefOr[java.lang.String] = js.undefined
  var ctaType: js.UndefOr[java.lang.String] = js.undefined
  var customCtaButtonText: js.UndefOr[java.lang.String] = js.undefined
  var descriptionText: js.UndefOr[java.lang.String] = js.undefined
  var destinationUrl: js.UndefOr[java.lang.String] = js.undefined
  var forecastingUrl: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var impressionUrl: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object ActivityContentDetailsPromotedItem {
  @scala.inline
  def apply(
    adTag: java.lang.String = null,
    clickTrackingUrl: java.lang.String = null,
    creativeViewUrl: java.lang.String = null,
    ctaType: java.lang.String = null,
    customCtaButtonText: java.lang.String = null,
    descriptionText: java.lang.String = null,
    destinationUrl: java.lang.String = null,
    forecastingUrl: js.Array[java.lang.String] = null,
    impressionUrl: js.Array[java.lang.String] = null,
    videoId: java.lang.String = null
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

