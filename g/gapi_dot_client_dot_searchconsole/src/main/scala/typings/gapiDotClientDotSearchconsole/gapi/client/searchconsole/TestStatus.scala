package typings.gapiDotClientDotSearchconsole.gapi.client.searchconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestStatus extends js.Object {
  /** Error details if applicable. */
  var details: js.UndefOr[String] = js.undefined
  /** Status of the test. */
  var status: js.UndefOr[String] = js.undefined
}

object TestStatus {
  @scala.inline
  def apply(details: String = null, status: String = null): TestStatus = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[TestStatus]
  }
}

