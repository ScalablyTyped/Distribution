package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiaCountrySettings extends js.Object {
  /**
    * The settings for the About page.
    */
  var about: js.UndefOr[Schema$LiaAboutPageSettings] = js.native
  /**
    * CLDR country code (e.g. &quot;US&quot;).
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The status of the &quot;Merchant hosted local storefront&quot; feature.
    */
  var hostedLocalStorefrontActive: js.UndefOr[Boolean] = js.native
  /**
    * LIA inventory verification settings.
    */
  var inventory: js.UndefOr[Schema$LiaInventorySettings] = js.native
  /**
    * LIA &quot;On Display To Order&quot; settings.
    */
  var onDisplayToOrder: js.UndefOr[Schema$LiaOnDisplayToOrderSettings] = js.native
  /**
    * The POS data provider linked with this country.
    */
  var posDataProvider: js.UndefOr[Schema$LiaPosDataProvider] = js.native
  /**
    * The status of the &quot;Store pickup&quot; feature.
    */
  var storePickupActive: js.UndefOr[Boolean] = js.native
}

object Schema$LiaCountrySettings {
  @scala.inline
  def apply(
    about: Schema$LiaAboutPageSettings = null,
    country: String = null,
    hostedLocalStorefrontActive: js.UndefOr[Boolean] = js.undefined,
    inventory: Schema$LiaInventorySettings = null,
    onDisplayToOrder: Schema$LiaOnDisplayToOrderSettings = null,
    posDataProvider: Schema$LiaPosDataProvider = null,
    storePickupActive: js.UndefOr[Boolean] = js.undefined
  ): Schema$LiaCountrySettings = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(hostedLocalStorefrontActive)) __obj.updateDynamic("hostedLocalStorefrontActive")(hostedLocalStorefrontActive.asInstanceOf[js.Any])
    if (inventory != null) __obj.updateDynamic("inventory")(inventory.asInstanceOf[js.Any])
    if (onDisplayToOrder != null) __obj.updateDynamic("onDisplayToOrder")(onDisplayToOrder.asInstanceOf[js.Any])
    if (posDataProvider != null) __obj.updateDynamic("posDataProvider")(posDataProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(storePickupActive)) __obj.updateDynamic("storePickupActive")(storePickupActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiaCountrySettings]
  }
}

