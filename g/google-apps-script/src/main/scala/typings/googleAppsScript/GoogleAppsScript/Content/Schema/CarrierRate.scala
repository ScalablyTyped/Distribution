package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarrierRate extends js.Object {
  var carrierName: js.UndefOr[String] = js.native
  var carrierService: js.UndefOr[String] = js.native
  var flatAdjustment: js.UndefOr[Price] = js.native
  var name: js.UndefOr[String] = js.native
  var originPostalCode: js.UndefOr[String] = js.native
  var percentageAdjustment: js.UndefOr[String] = js.native
}

object CarrierRate {
  @scala.inline
  def apply(): CarrierRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarrierRate]
  }
  @scala.inline
  implicit class CarrierRateOps[Self <: CarrierRate] (val x: Self) extends AnyVal {
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
    def setCarrierName(value: String): Self = this.set("carrierName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrierName: Self = this.set("carrierName", js.undefined)
    @scala.inline
    def setCarrierService(value: String): Self = this.set("carrierService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrierService: Self = this.set("carrierService", js.undefined)
    @scala.inline
    def setFlatAdjustment(value: Price): Self = this.set("flatAdjustment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatAdjustment: Self = this.set("flatAdjustment", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOriginPostalCode(value: String): Self = this.set("originPostalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginPostalCode: Self = this.set("originPostalCode", js.undefined)
    @scala.inline
    def setPercentageAdjustment(value: String): Self = this.set("percentageAdjustment", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentageAdjustment: Self = this.set("percentageAdjustment", js.undefined)
  }
  
}

