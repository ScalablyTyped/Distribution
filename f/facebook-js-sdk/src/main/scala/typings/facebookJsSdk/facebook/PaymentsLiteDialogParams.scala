package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.pay
import typings.facebookJsSdk.facebookJsSdkStrings.purchaseiap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentsLiteDialogParams extends DialogParams {
  var action: purchaseiap = js.native
  var developer_payload: js.UndefOr[String] = js.native
  var method: pay = js.native
  var product_id: String = js.native
  var quantity: js.UndefOr[Double] = js.native
}

object PaymentsLiteDialogParams {
  @scala.inline
  def apply(action: purchaseiap, method: pay, product_id: String): PaymentsLiteDialogParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentsLiteDialogParams]
  }
  @scala.inline
  implicit class PaymentsLiteDialogParamsOps[Self <: PaymentsLiteDialogParams] (val x: Self) extends AnyVal {
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
    def setAction(value: purchaseiap): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: pay): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduct_id(value: String): Self = this.set("product_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeveloper_payload(value: String): Self = this.set("developer_payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloper_payload: Self = this.set("developer_payload", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
  
}

