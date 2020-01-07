package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a ToolExecution output file.
  */
@js.native
trait Schema$ToolOutputReference extends js.Object {
  /**
    * The creation time of the file.  - In response: present if set by
    * create/update request - In create/update request: optional
    */
  var creationTime: js.UndefOr[Schema$Timestamp] = js.native
  /**
    * A FileReference to an output file.  - In response: always set - In
    * create/update request: always set
    */
  var output: js.UndefOr[Schema$FileReference] = js.native
  /**
    * The test case to which this output file belongs.  - In response: present
    * if set by create/update request - In create/update request: optional
    */
  var testCase: js.UndefOr[Schema$TestCaseReference] = js.native
}

object Schema$ToolOutputReference {
  @scala.inline
  def apply(
    creationTime: Schema$Timestamp = null,
    output: Schema$FileReference = null,
    testCase: Schema$TestCaseReference = null
  ): Schema$ToolOutputReference = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (testCase != null) __obj.updateDynamic("testCase")(testCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ToolOutputReference]
  }
}

