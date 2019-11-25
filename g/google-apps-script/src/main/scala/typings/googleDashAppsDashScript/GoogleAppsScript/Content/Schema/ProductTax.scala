package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductTax extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var locationId: js.UndefOr[String] = js.undefined
  var postalCode: js.UndefOr[String] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var taxShip: js.UndefOr[Boolean] = js.undefined
}

object ProductTax {
  @scala.inline
  def apply(
    country: String = null,
    locationId: String = null,
    postalCode: String = null,
    rate: Int | Double = null,
    region: String = null,
    taxShip: js.UndefOr[Boolean] = js.undefined
  ): ProductTax = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (locationId != null) __obj.updateDynamic("locationId")(locationId.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(taxShip)) __obj.updateDynamic("taxShip")(taxShip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductTax]
  }
}

