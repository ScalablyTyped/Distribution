package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCreateTestOrderResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var orderId: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersCreateTestOrderResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, orderId: java.lang.String = null): OrdersCreateTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    __obj.asInstanceOf[OrdersCreateTestOrderResponse]
  }
}

