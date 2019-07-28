package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCreateTestOrderRequest extends js.Object {
  /**
    * The test order template to use. Specify as an alternative to testOrder as a shortcut for retrieving a template and then creating an order using that
    * template.
    */
  var templateName: js.UndefOr[String] = js.undefined
  /** The test order to create. */
  var testOrder: js.UndefOr[TestOrder] = js.undefined
}

object OrdersCreateTestOrderRequest {
  @scala.inline
  def apply(templateName: String = null, testOrder: TestOrder = null): OrdersCreateTestOrderRequest = {
    val __obj = js.Dynamic.literal()
    if (templateName != null) __obj.updateDynamic("templateName")(templateName)
    if (testOrder != null) __obj.updateDynamic("testOrder")(testOrder)
    __obj.asInstanceOf[OrdersCreateTestOrderRequest]
  }
}

