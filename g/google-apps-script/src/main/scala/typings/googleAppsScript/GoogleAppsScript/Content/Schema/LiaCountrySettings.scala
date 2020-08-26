package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiaCountrySettings extends js.Object {
  var about: js.UndefOr[LiaAboutPageSettings] = js.native
  var country: js.UndefOr[String] = js.native
  var hostedLocalStorefrontActive: js.UndefOr[Boolean] = js.native
  var inventory: js.UndefOr[LiaInventorySettings] = js.native
  var onDisplayToOrder: js.UndefOr[LiaOnDisplayToOrderSettings] = js.native
  var posDataProvider: js.UndefOr[LiaPosDataProvider] = js.native
  var storePickupActive: js.UndefOr[Boolean] = js.native
}

object LiaCountrySettings {
  @scala.inline
  def apply(): LiaCountrySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiaCountrySettings]
  }
  @scala.inline
  implicit class LiaCountrySettingsOps[Self <: LiaCountrySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbout(value: LiaAboutPageSettings): Self = this.set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setHostedLocalStorefrontActive(value: Boolean): Self = this.set("hostedLocalStorefrontActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedLocalStorefrontActive: Self = this.set("hostedLocalStorefrontActive", js.undefined)
    @scala.inline
    def setInventory(value: LiaInventorySettings): Self = this.set("inventory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventory: Self = this.set("inventory", js.undefined)
    @scala.inline
    def setOnDisplayToOrder(value: LiaOnDisplayToOrderSettings): Self = this.set("onDisplayToOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDisplayToOrder: Self = this.set("onDisplayToOrder", js.undefined)
    @scala.inline
    def setPosDataProvider(value: LiaPosDataProvider): Self = this.set("posDataProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosDataProvider: Self = this.set("posDataProvider", js.undefined)
    @scala.inline
    def setStorePickupActive(value: Boolean): Self = this.set("storePickupActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorePickupActive: Self = this.set("storePickupActive", js.undefined)
  }
  
}

