package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Testing timing break down to know phases.
  */
@js.native
trait Schema$TestTiming extends js.Object {
  /**
    * How long it took to run the test process.  - In response: present if
    * previously set. - In create/update request: optional
    */
  var testProcessDuration: js.UndefOr[Schema$Duration] = js.native
}

object Schema$TestTiming {
  @scala.inline
  def apply(testProcessDuration: Schema$Duration = null): Schema$TestTiming = {
    val __obj = js.Dynamic.literal()
    if (testProcessDuration != null) __obj.updateDynamic("testProcessDuration")(testProcessDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestTiming]
  }
}

