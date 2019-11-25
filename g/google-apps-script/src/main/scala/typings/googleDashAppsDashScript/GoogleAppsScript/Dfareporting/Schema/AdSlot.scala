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
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (linkedPlacementId != null) __obj.updateDynamic("linkedPlacementId")(linkedPlacementId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (paymentSourceType != null) __obj.updateDynamic("paymentSourceType")(paymentSourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdSlot]
  }
}

