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

