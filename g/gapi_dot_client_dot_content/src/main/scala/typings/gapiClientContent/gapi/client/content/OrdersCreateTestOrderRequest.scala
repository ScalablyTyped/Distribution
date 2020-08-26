package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCreateTestOrderRequest extends js.Object {
  /**
    * The test order template to use. Specify as an alternative to testOrder as a shortcut for retrieving a template and then creating an order using that
    * template.
    */
  var templateName: js.UndefOr[String] = js.native
  /** The test order to create. */
  var testOrder: js.UndefOr[TestOrder] = js.native
}

object OrdersCreateTestOrderRequest {
  @scala.inline
  def apply(): OrdersCreateTestOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCreateTestOrderRequest]
  }
  @scala.inline
  implicit class OrdersCreateTestOrderRequestOps[Self <: OrdersCreateTestOrderRequest] (val x: Self) extends AnyVal {
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
    def setTemplateName(value: String): Self = this.set("templateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateName: Self = this.set("templateName", js.undefined)
    @scala.inline
    def setTestOrder(value: TestOrder): Self = this.set("testOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestOrder: Self = this.set("testOrder", js.undefined)
  }
  
}

