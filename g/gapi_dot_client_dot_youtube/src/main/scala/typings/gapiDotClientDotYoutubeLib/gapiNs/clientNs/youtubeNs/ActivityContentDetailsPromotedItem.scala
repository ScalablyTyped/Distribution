package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsPromotedItem extends js.Object {
  /** The URL the client should fetch to request a promoted item. */
  var adTag: js.UndefOr[java.lang.String] = js.undefined
  /** The URL the client should ping to indicate that the user clicked through on this promoted item. */
  var clickTrackingUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The URL the client should ping to indicate that the user was shown this promoted item. */
  var creativeViewUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The type of call-to-action, a message to the user indicating action that can be taken. */
  var ctaType: js.UndefOr[java.lang.String] = js.undefined
  /** The custom call-to-action button text. If specified, it will override the default button text for the cta_type. */
  var customCtaButtonText: js.UndefOr[java.lang.String] = js.undefined
  /** The text description to accompany the promoted item. */
  var descriptionText: js.UndefOr[java.lang.String] = js.undefined
  /** The URL the client should direct the user to, if the user chooses to visit the advertiser's website. */
  var destinationUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The list of forecasting URLs. The client should ping all of these URLs when a promoted item is not available, to indicate that a promoted item could
    * have been shown.
    */
  var forecastingUrl: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of impression URLs. The client should ping all of these URLs to indicate that the user was shown this promoted item. */
  var impressionUrl: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The ID that YouTube uses to uniquely identify the promoted video. */
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

