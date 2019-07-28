package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var carrierRateName: js.UndefOr[String] = js.undefined
  var flatRate: js.UndefOr[Price] = js.undefined
  var noShipping: js.UndefOr[Boolean] = js.undefined
  var pricePercentage: js.UndefOr[String] = js.undefined
  var subtableName: js.UndefOr[String] = js.undefined
}

object Value {
  @scala.inline
  def apply(
    carrierRateName: String = null,
    flatRate: Price = null,
    noShipping: js.UndefOr[Boolean] = js.undefined,
    pricePercentage: String = null,
    subtableName: String = null
  ): Value = {
    val __obj = js.Dynamic.literal()
    if (carrierRateName != null) __obj.updateDynamic("carrierRateName")(carrierRateName)
    if (flatRate != null) __obj.updateDynamic("flatRate")(flatRate)
    if (!js.isUndefined(noShipping)) __obj.updateDynamic("noShipping")(noShipping)
    if (pricePercentage != null) __obj.updateDynamic("pricePercentage")(pricePercentage)
    if (subtableName != null) __obj.updateDynamic("subtableName")(subtableName)
    __obj.asInstanceOf[Value]
  }
}

