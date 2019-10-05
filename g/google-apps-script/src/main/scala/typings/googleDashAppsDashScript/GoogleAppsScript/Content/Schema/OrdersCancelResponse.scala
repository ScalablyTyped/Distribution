package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCancelResponse extends js.Object {
  var executionStatus: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object OrdersCancelResponse {
  @scala.inline
  def apply(executionStatus: String = null, kind: String = null): OrdersCancelResponse = {
    val __obj = js.Dynamic.literal()
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[OrdersCancelResponse]
  }
}

