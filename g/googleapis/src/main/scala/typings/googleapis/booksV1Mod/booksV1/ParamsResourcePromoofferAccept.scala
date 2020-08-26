package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePromoofferAccept extends StandardParameters {
  /**
    * device android_id
    */
  var androidId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * device device
    */
  var device: js.UndefOr[String] = js.native
  /**
    * device manufacturer
    */
  var manufacturer: js.UndefOr[String] = js.native
  /**
    * device model
    */
  var model: js.UndefOr[String] = js.native
  /**
    *
    */
  var offerId: js.UndefOr[String] = js.native
  /**
    * device product
    */
  var product: js.UndefOr[String] = js.native
  /**
    * device serial
    */
  var serial: js.UndefOr[String] = js.native
  /**
    * Volume id to exercise the offer
    */
  var volumeId: js.UndefOr[String] = js.native
}

object ParamsResourcePromoofferAccept {
  @scala.inline
  def apply(): ParamsResourcePromoofferAccept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePromoofferAccept]
  }
  @scala.inline
  implicit class ParamsResourcePromoofferAcceptOps[Self <: ParamsResourcePromoofferAccept] (val x: Self) extends AnyVal {
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
    def setAndroidId(value: String): Self = this.set("androidId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidId: Self = this.set("androidId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setOfferId(value: String): Self = this.set("offerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferId: Self = this.set("offerId", js.undefined)
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    @scala.inline
    def setSerial(value: String): Self = this.set("serial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerial: Self = this.set("serial", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
  
}

