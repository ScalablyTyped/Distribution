package typings
package gapiDotClientDotSearchconsoleLib.gapiNs.clientNs.searchconsoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestStatus extends js.Object {
  /** Error details if applicable. */
  var details: js.UndefOr[java.lang.String] = js.undefined
  /** Status of the test. */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object TestStatus {
  @scala.inline
  def apply(details: java.lang.String = null, status: java.lang.String = null): TestStatus = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[TestStatus]
  }
}

