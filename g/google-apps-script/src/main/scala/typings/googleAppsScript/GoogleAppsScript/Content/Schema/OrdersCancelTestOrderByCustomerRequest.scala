package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCancelTestOrderByCustomerRequest extends js.Object {
  var reason: js.UndefOr[String] = js.undefined
}

object OrdersCancelTestOrderByCustomerRequest {
  @scala.inline
  def apply(reason: String = null): OrdersCancelTestOrderByCustomerRequest = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersCancelTestOrderByCustomerRequest]
  }
}

