package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCreateTestReturnResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var returnId: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersCreateTestReturnResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, returnId: java.lang.String = null): OrdersCreateTestReturnResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (returnId != null) __obj.updateDynamic("returnId")(returnId)
    __obj.asInstanceOf[OrdersCreateTestReturnResponse]
  }
}

