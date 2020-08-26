package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderLineItemProductVariantAttribute extends js.Object {
  /** The dimension of the variant. */
  var dimension: js.UndefOr[String] = js.native
  /** The value for the dimension. */
  var value: js.UndefOr[String] = js.native
}

object OrderLineItemProductVariantAttribute {
  @scala.inline
  def apply(): OrderLineItemProductVariantAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemProductVariantAttribute]
  }
  @scala.inline
  implicit class OrderLineItemProductVariantAttributeOps[Self <: OrderLineItemProductVariantAttribute] (val x: Self) extends AnyVal {
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
    def setDimension(value: String): Self = this.set("dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

