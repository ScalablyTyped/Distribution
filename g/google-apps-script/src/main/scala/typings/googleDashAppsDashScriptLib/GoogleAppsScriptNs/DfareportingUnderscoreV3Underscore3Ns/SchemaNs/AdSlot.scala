package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdSlot extends js.Object {
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var compatibility: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var linkedPlacementId: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var paymentSourceType: js.UndefOr[java.lang.String] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
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

