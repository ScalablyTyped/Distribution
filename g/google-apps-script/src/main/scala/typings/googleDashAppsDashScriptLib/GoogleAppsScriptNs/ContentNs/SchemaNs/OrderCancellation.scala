package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderCancellation extends js.Object {
  var actor: js.UndefOr[java.lang.String] = js.undefined
  var creationDate: js.UndefOr[java.lang.String] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var reasonText: js.UndefOr[java.lang.String] = js.undefined
}

object OrderCancellation {
  @scala.inline
  def apply(
    actor: java.lang.String = null,
    creationDate: java.lang.String = null,
    quantity: scala.Int | scala.Double = null,
    reason: java.lang.String = null,
    reasonText: java.lang.String = null
  ): OrderCancellation = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText)
    __obj.asInstanceOf[OrderCancellation]
  }
}

