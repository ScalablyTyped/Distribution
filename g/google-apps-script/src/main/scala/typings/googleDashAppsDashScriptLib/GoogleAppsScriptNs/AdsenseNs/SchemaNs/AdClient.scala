package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdClient extends js.Object {
  var arcOptIn: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var productCode: js.UndefOr[java.lang.String] = js.undefined
  var supportsReporting: js.UndefOr[scala.Boolean] = js.undefined
}

object AdClient {
  @scala.inline
  def apply(
    arcOptIn: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    productCode: java.lang.String = null,
    supportsReporting: js.UndefOr[scala.Boolean] = js.undefined
  ): AdClient = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arcOptIn)) __obj.updateDynamic("arcOptIn")(arcOptIn)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (productCode != null) __obj.updateDynamic("productCode")(productCode)
    if (!js.isUndefined(supportsReporting)) __obj.updateDynamic("supportsReporting")(supportsReporting)
    __obj.asInstanceOf[AdClient]
  }
}

