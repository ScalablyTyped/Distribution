package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCreateTestOrderRequest extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var templateName: js.UndefOr[java.lang.String] = js.undefined
  var testOrder: js.UndefOr[TestOrder] = js.undefined
}

object OrdersCreateTestOrderRequest {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    templateName: java.lang.String = null,
    testOrder: TestOrder = null
  ): OrdersCreateTestOrderRequest = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (templateName != null) __obj.updateDynamic("templateName")(templateName)
    if (testOrder != null) __obj.updateDynamic("testOrder")(testOrder)
    __obj.asInstanceOf[OrdersCreateTestOrderRequest]
  }
}

