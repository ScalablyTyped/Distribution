package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemShippingDetailsMethod extends js.Object {
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  var maxDaysInTransit: js.UndefOr[scala.Double] = js.undefined
  var methodName: js.UndefOr[java.lang.String] = js.undefined
  var minDaysInTransit: js.UndefOr[scala.Double] = js.undefined
}

object OrderLineItemShippingDetailsMethod {
  @scala.inline
  def apply(
    carrier: java.lang.String = null,
    maxDaysInTransit: scala.Int | scala.Double = null,
    methodName: java.lang.String = null,
    minDaysInTransit: scala.Int | scala.Double = null
  ): OrderLineItemShippingDetailsMethod = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (maxDaysInTransit != null) __obj.updateDynamic("maxDaysInTransit")(maxDaysInTransit.asInstanceOf[js.Any])
    if (methodName != null) __obj.updateDynamic("methodName")(methodName)
    if (minDaysInTransit != null) __obj.updateDynamic("minDaysInTransit")(minDaysInTransit.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderLineItemShippingDetailsMethod]
  }
}

