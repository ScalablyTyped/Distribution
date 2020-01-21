package typings.googleAppsScript.GoogleAppsScript.Content.Schema

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
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (locationGroupName != null) __obj.updateDynamic("locationGroupName")(locationGroupName.asInstanceOf[js.Any])
    if (locationId != null) __obj.updateDynamic("locationId")(locationId.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductShipping]
  }
}

