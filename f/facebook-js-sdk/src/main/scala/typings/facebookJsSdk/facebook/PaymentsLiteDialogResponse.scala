package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentsLiteDialogResponse extends DialogResponse {
  var app_id: Double = js.native
  var developer_payload: js.UndefOr[String] = js.native
  var payment_id: Double = js.native
  var product_id: String = js.native
  var purchase_time: Double = js.native
  var purchase_token: String = js.native
  var signed_request: String = js.native
}

object PaymentsLiteDialogResponse {
  @scala.inline
  def apply(
    app_id: Double,
    payment_id: Double,
    product_id: String,
    purchase_time: Double,
    purchase_token: String,
    signed_request: String
  ): PaymentsLiteDialogResponse = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], payment_id = payment_id.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], purchase_time = purchase_time.asInstanceOf[js.Any], purchase_token = purchase_token.asInstanceOf[js.Any], signed_request = signed_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentsLiteDialogResponse]
  }
  @scala.inline
  implicit class PaymentsLiteDialogResponseOps[Self <: PaymentsLiteDialogResponse] (val x: Self) extends AnyVal {
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
    def setApp_id(value: Double): Self = this.set("app_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayment_id(value: Double): Self = this.set("payment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduct_id(value: String): Self = this.set("product_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPurchase_time(value: Double): Self = this.set("purchase_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setPurchase_token(value: String): Self = this.set("purchase_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigned_request(value: String): Self = this.set("signed_request", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeveloper_payload(value: String): Self = this.set("developer_payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloper_payload: Self = this.set("developer_payload", js.undefined)
  }
  
}

