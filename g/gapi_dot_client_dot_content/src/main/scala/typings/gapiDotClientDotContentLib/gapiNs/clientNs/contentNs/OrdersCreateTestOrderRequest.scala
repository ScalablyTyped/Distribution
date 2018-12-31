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

