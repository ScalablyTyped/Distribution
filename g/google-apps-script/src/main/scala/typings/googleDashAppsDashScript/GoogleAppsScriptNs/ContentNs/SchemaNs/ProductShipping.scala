package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductShipping extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var locationGroupName: js.UndefOr[String] = js.undefined
  var locationId: js.UndefOr[String] = js.undefined
  var postalCode: js.UndefOr[String] = js.undefined
  var price: js.UndefOr[Price] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var service: js.UndefOr[String] = js.undefined
}

object ProductShipping {
  @scala.inline
  def apply(
    country: String = null,
    locationGroupName: String = null,
    locationId: String = null,
    postalCode: String = null,
    price: Price = null,
    region: String = null,
    service: String = null
  ): ProductShipping = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (locationGroupName != null) __obj.updateDynamic("locationGroupName")(locationGroupName)
    if (locationId != null) __obj.updateDynamic("locationId")(locationId)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (price != null) __obj.updateDynamic("price")(price)
    if (region != null) __obj.updateDynamic("region")(region)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[ProductShipping]
  }
}

