package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveyCost extends js.Object {
  var costPerResponseNanos: js.UndefOr[String] = js.native
  var currencyCode: js.UndefOr[String] = js.native
  var maxCostPerResponseNanos: js.UndefOr[String] = js.native
  var nanos: js.UndefOr[String] = js.native
}

object SurveyCost {
  @scala.inline
  def apply(): SurveyCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveyCost]
  }
  @scala.inline
  implicit class SurveyCostOps[Self <: SurveyCost] (val x: Self) extends AnyVal {
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
    def setCostPerResponseNanos(value: String): Self = this.set("costPerResponseNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCostPerResponseNanos: Self = this.set("costPerResponseNanos", js.undefined)
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    @scala.inline
    def setMaxCostPerResponseNanos(value: String): Self = this.set("maxCostPerResponseNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCostPerResponseNanos: Self = this.set("maxCostPerResponseNanos", js.undefined)
    @scala.inline
    def setNanos(value: String): Self = this.set("nanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNanos: Self = this.set("nanos", js.undefined)
  }
  
}

