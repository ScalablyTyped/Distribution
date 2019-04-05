package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCancelTestOrderByCustomerRequest extends js.Object {
  var reason: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersCancelTestOrderByCustomerRequest {
  @scala.inline
  def apply(reason: java.lang.String = null): OrdersCancelTestOrderByCustomerRequest = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[OrdersCancelTestOrderByCustomerRequest]
  }
}

