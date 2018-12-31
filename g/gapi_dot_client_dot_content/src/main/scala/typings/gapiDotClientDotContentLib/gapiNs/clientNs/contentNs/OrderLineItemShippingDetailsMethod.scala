package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemShippingDetailsMethod extends js.Object {
  /** The carrier for the shipping. Optional. See shipments[].carrier for a list of acceptable values. */
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum transit time. */
  var maxDaysInTransit: js.UndefOr[scala.Double] = js.undefined
  /** The name of the shipping method. */
  var methodName: js.UndefOr[java.lang.String] = js.undefined
  /** Minimum transit time. */
  var minDaysInTransit: js.UndefOr[scala.Double] = js.undefined
}

