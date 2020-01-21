package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestTiming extends js.Object {
  /**
    * How long it took to run the test process.
    *
    * - In response: present if previously set. - In create/update request: optional
    */
  var testProcessDuration: js.UndefOr[Duration] = js.undefined
}

object TestTiming {
  @scala.inline
  def apply(testProcessDuration: Duration = null): TestTiming = {
    val __obj = js.Dynamic.literal()
    if (testProcessDuration != null) __obj.updateDynamic("testProcessDuration")(testProcessDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestTiming]
  }
}

