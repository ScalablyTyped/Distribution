package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdSlot extends js.Object {
  /** Comment for this ad slot. */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Ad slot compatibility. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop, mobile devices or in mobile apps for regular or
    * interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering in in-stream video ads
    * developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String] = js.undefined
  /** Height of this ad slot. */
  var height: js.UndefOr[String] = js.undefined
  /** ID of the placement from an external platform that is linked to this ad slot. */
  var linkedPlacementId: js.UndefOr[String] = js.undefined
  /** Name of this ad slot. */
  var name: js.UndefOr[String] = js.undefined
  /** Payment source type of this ad slot. */
  var paymentSourceType: js.UndefOr[String] = js.undefined
  /** Primary ad slot of a roadblock inventory item. */
  var primary: js.UndefOr[Boolean] = js.undefined
  /** Width of this ad slot. */
  var width: js.UndefOr[String] = js.undefined
}

object AdSlot {
  @scala.inline
  def apply(
    comment: String = null,
    compatibility: String = null,
    height: String = null,
    linkedPlacementId: String = null,
    name: String = null,
    paymentSourceType: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): AdSlot = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility)
    if (height != null) __obj.updateDynamic("height")(height)
    if (linkedPlacementId != null) __obj.updateDynamic("linkedPlacementId")(linkedPlacementId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (paymentSourceType != null) __obj.updateDynamic("paymentSourceType")(paymentSourceType)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[AdSlot]
  }
}

