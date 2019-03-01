package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCreateTestOrderRequest extends js.Object {
  /**
    * The test order template to use. Specify as an alternative to testOrder as a shortcut for retrieving a template and then creating an order using that
    * template.
    */
  var templateName: js.UndefOr[java.lang.String] = js.undefined
  /** The test order to create. */
  var testOrder: js.UndefOr[TestOrder] = js.undefined
}

object OrdersCreateTestOrderRequest {
  @scala.inline
  def apply(templateName: java.lang.String = null, testOrder: TestOrder = null): OrdersCreateTestOrderRequest = {
    val __obj = js.Dynamic.literal()
    if (templateName != null) __obj.updateDynamic("templateName")(templateName)
    if (testOrder != null) __obj.updateDynamic("testOrder")(testOrder)
    __obj.asInstanceOf[OrdersCreateTestOrderRequest]
  }
}

