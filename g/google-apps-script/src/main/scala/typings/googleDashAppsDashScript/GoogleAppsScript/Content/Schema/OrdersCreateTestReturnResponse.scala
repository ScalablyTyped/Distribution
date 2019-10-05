package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCreateTestReturnResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var returnId: js.UndefOr[String] = js.undefined
}

object OrdersCreateTestReturnResponse {
  @scala.inline
  def apply(kind: String = null, returnId: String = null): OrdersCreateTestReturnResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (returnId != null) __obj.updateDynamic("returnId")(returnId)
    __obj.asInstanceOf[OrdersCreateTestReturnResponse]
  }
}

