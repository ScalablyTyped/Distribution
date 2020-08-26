package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderLineItemShippingDetailsMethod extends js.Object {
  var carrier: js.UndefOr[String] = js.native
  var maxDaysInTransit: js.UndefOr[Double] = js.native
  var methodName: js.UndefOr[String] = js.native
  var minDaysInTransit: js.UndefOr[Double] = js.native
}

object OrderLineItemShippingDetailsMethod {
  @scala.inline
  def apply(): OrderLineItemShippingDetailsMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemShippingDetailsMethod]
  }
  @scala.inline
  implicit class OrderLineItemShippingDetailsMethodOps[Self <: OrderLineItemShippingDetailsMethod] (val x: Self) extends AnyVal {
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
    def setCarrier(value: String): Self = this.set("carrier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    @scala.inline
    def setMaxDaysInTransit(value: Double): Self = this.set("maxDaysInTransit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDaysInTransit: Self = this.set("maxDaysInTransit", js.undefined)
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethodName: Self = this.set("methodName", js.undefined)
    @scala.inline
    def setMinDaysInTransit(value: Double): Self = this.set("minDaysInTransit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDaysInTransit: Self = this.set("minDaysInTransit", js.undefined)
  }
  
}

