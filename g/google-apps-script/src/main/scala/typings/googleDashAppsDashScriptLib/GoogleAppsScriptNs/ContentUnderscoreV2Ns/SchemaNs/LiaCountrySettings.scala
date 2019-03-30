package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiaCountrySettings extends js.Object {
  var about: js.UndefOr[LiaAboutPageSettings] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var hostedLocalStorefrontActive: js.UndefOr[scala.Boolean] = js.undefined
  var inventory: js.UndefOr[LiaInventorySettings] = js.undefined
  var onDisplayToOrder: js.UndefOr[LiaOnDisplayToOrderSettings] = js.undefined
  var posDataProvider: js.UndefOr[LiaPosDataProvider] = js.undefined
  var storePickupActive: js.UndefOr[scala.Boolean] = js.undefined
}

object LiaCountrySettings {
  @scala.inline
  def apply(
    about: LiaAboutPageSettings = null,
    country: java.lang.String = null,
    hostedLocalStorefrontActive: js.UndefOr[scala.Boolean] = js.undefined,
    inventory: LiaInventorySettings = null,
    onDisplayToOrder: LiaOnDisplayToOrderSettings = null,
    posDataProvider: LiaPosDataProvider = null,
    storePickupActive: js.UndefOr[scala.Boolean] = js.undefined
  ): LiaCountrySettings = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about)
    if (country != null) __obj.updateDynamic("country")(country)
    if (!js.isUndefined(hostedLocalStorefrontActive)) __obj.updateDynamic("hostedLocalStorefrontActive")(hostedLocalStorefrontActive)
    if (inventory != null) __obj.updateDynamic("inventory")(inventory)
    if (onDisplayToOrder != null) __obj.updateDynamic("onDisplayToOrder")(onDisplayToOrder)
    if (posDataProvider != null) __obj.updateDynamic("posDataProvider")(posDataProvider)
    if (!js.isUndefined(storePickupActive)) __obj.updateDynamic("storePickupActive")(storePickupActive)
    __obj.asInstanceOf[LiaCountrySettings]
  }
}

