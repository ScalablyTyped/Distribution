package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdClient extends js.Object {
  var arcOptIn: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var productCode: js.UndefOr[String] = js.undefined
  var supportsReporting: js.UndefOr[Boolean] = js.undefined
}

object AdClient {
  @scala.inline
  def apply(
    arcOptIn: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    productCode: String = null,
    supportsReporting: js.UndefOr[Boolean] = js.undefined
  ): AdClient = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arcOptIn)) __obj.updateDynamic("arcOptIn")(arcOptIn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (productCode != null) __obj.updateDynamic("productCode")(productCode.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsReporting)) __obj.updateDynamic("supportsReporting")(supportsReporting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdClient]
  }
}

