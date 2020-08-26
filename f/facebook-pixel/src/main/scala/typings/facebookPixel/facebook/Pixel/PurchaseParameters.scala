package typings.facebookPixel.facebook.Pixel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseParameters extends js.Object {
  var content_ids: js.UndefOr[js.Array[String]] = js.native
  var content_name: js.UndefOr[String] = js.native
  var content_type: js.UndefOr[String] = js.native
  var currency: String = js.native
  var num_items: js.UndefOr[Double] = js.native
  var order_id: js.UndefOr[String] = js.native
  var value: Double = js.native
}

object PurchaseParameters {
  @scala.inline
  def apply(currency: String, value: Double): PurchaseParameters = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseParameters]
  }
  @scala.inline
  implicit class PurchaseParametersOps[Self <: PurchaseParameters] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent_idsVarargs(value: String*): Self = this.set("content_ids", js.Array(value :_*))
    @scala.inline
    def setContent_ids(value: js.Array[String]): Self = this.set("content_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_ids: Self = this.set("content_ids", js.undefined)
    @scala.inline
    def setContent_name(value: String): Self = this.set("content_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_name: Self = this.set("content_name", js.undefined)
    @scala.inline
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_type: Self = this.set("content_type", js.undefined)
    @scala.inline
    def setNum_items(value: Double): Self = this.set("num_items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNum_items: Self = this.set("num_items", js.undefined)
    @scala.inline
    def setOrder_id(value: String): Self = this.set("order_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder_id: Self = this.set("order_id", js.undefined)
  }
  
}

