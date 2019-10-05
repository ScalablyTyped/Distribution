package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdSlot extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var compatibility: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var linkedPlacementId: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var paymentSourceType: js.UndefOr[String] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
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

