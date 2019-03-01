package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdSlot extends js.Object {
  /** Comment for this ad slot. */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Ad slot compatibility. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop, mobile devices or in mobile apps for regular or
    * interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering in in-stream video ads
    * developed with the VAST standard.
    */
  var compatibility: js.UndefOr[java.lang.String] = js.undefined
  /** Height of this ad slot. */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the placement from an external platform that is linked to this ad slot. */
  var linkedPlacementId: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this ad slot. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Payment source type of this ad slot. */
  var paymentSourceType: js.UndefOr[java.lang.String] = js.undefined
  /** Primary ad slot of a roadblock inventory item. */
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  /** Width of this ad slot. */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object AdSlot {
  @scala.inline
  def apply(
    comment: java.lang.String = null,
    compatibility: java.lang.String = null,
    height: java.lang.String = null,
    linkedPlacementId: java.lang.String = null,
    name: java.lang.String = null,
    paymentSourceType: java.lang.String = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String = null
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

