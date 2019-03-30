package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersAcknowledgeRequest extends js.Object {
  var operationId: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersAcknowledgeRequest {
  @scala.inline
  def apply(operationId: java.lang.String = null): OrdersAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    __obj.asInstanceOf[OrdersAcknowledgeRequest]
  }
}

