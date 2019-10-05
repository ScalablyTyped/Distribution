package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCancelTestOrderByCustomerResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
}

object OrdersCancelTestOrderByCustomerResponse {
  @scala.inline
  def apply(kind: String = null): OrdersCancelTestOrderByCustomerResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[OrdersCancelTestOrderByCustomerResponse]
  }
}

