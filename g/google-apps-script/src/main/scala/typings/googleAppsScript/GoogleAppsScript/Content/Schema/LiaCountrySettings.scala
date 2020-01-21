package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiaCountrySettings extends js.Object {
  var about: js.UndefOr[LiaAboutPageSettings] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var hostedLocalStorefrontActive: js.UndefOr[Boolean] = js.undefined
  var inventory: js.UndefOr[LiaInventorySettings] = js.undefined
  var onDisplayToOrder: js.UndefOr[LiaOnDisplayToOrderSettings] = js.undefined
  var posDataProvider: js.UndefOr[LiaPosDataProvider] = js.undefined
  var storePickupActive: js.UndefOr[Boolean] = js.undefined
}

object LiaCountrySettings {
  @scala.inline
  def apply(
    about: LiaAboutPageSettings = null,
    country: String = null,
    hostedLocalStorefrontActive: js.UndefOr[Boolean] = js.undefined,
    inventory: LiaInventorySettings = null,
    onDisplayToOrder: LiaOnDisplayToOrderSettings = null,
    posDataProvider: LiaPosDataProvider = null,
    storePickupActive: js.UndefOr[Boolean] = js.undefined
  ): LiaCountrySettings = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(hostedLocalStorefrontActive)) __obj.updateDynamic("hostedLocalStorefrontActive")(hostedLocalStorefrontActive.asInstanceOf[js.Any])
    if (inventory != null) __obj.updateDynamic("inventory")(inventory.asInstanceOf[js.Any])
    if (onDisplayToOrder != null) __obj.updateDynamic("onDisplayToOrder")(onDisplayToOrder.asInstanceOf[js.Any])
    if (posDataProvider != null) __obj.updateDynamic("posDataProvider")(posDataProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(storePickupActive)) __obj.updateDynamic("storePickupActive")(storePickupActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiaCountrySettings]
  }
}

