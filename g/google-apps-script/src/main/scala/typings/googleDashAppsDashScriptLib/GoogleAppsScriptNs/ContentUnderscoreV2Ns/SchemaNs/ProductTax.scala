package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductTax extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var locationId: js.UndefOr[java.lang.String] = js.undefined
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  var rate: js.UndefOr[stdLib.Number] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var taxShip: js.UndefOr[scala.Boolean] = js.undefined
}

object ProductTax {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    locationId: java.lang.String = null,
    postalCode: java.lang.String = null,
    rate: stdLib.Number = null,
    region: java.lang.String = null,
    taxShip: js.UndefOr[scala.Boolean] = js.undefined
  ): ProductTax = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (locationId != null) __obj.updateDynamic("locationId")(locationId)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (rate != null) __obj.updateDynamic("rate")(rate)
    if (region != null) __obj.updateDynamic("region")(region)
    if (!js.isUndefined(taxShip)) __obj.updateDynamic("taxShip")(taxShip)
    __obj.asInstanceOf[ProductTax]
  }
}

