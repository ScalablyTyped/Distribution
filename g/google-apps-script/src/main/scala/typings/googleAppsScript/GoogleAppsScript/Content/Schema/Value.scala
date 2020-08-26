package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  var carrierRateName: js.UndefOr[String] = js.native
  var flatRate: js.UndefOr[Price] = js.native
  var noShipping: js.UndefOr[Boolean] = js.native
  var pricePercentage: js.UndefOr[String] = js.native
  var subtableName: js.UndefOr[String] = js.native
}

object Value {
  @scala.inline
  def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
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
    def setCarrierRateName(value: String): Self = this.set("carrierRateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrierRateName: Self = this.set("carrierRateName", js.undefined)
    @scala.inline
    def setFlatRate(value: Price): Self = this.set("flatRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatRate: Self = this.set("flatRate", js.undefined)
    @scala.inline
    def setNoShipping(value: Boolean): Self = this.set("noShipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoShipping: Self = this.set("noShipping", js.undefined)
    @scala.inline
    def setPricePercentage(value: String): Self = this.set("pricePercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricePercentage: Self = this.set("pricePercentage", js.undefined)
    @scala.inline
    def setSubtableName(value: String): Self = this.set("subtableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtableName: Self = this.set("subtableName", js.undefined)
  }
  
}

