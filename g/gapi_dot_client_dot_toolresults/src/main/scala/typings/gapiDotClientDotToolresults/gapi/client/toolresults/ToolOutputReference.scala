package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolOutputReference extends js.Object {
  /**
    * The creation time of the file.
    *
    * - In response: present if set by create/update request - In create/update request: optional
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * A FileReference to an output file.
    *
    * - In response: always set - In create/update request: always set
    */
  var output: js.UndefOr[FileReference] = js.undefined
  /**
    * The test case to which this output file belongs.
    *
    * - In response: present if set by create/update request - In create/update request: optional
    */
  var testCase: js.UndefOr[TestCaseReference] = js.undefined
}

object ToolOutputReference {
  @scala.inline
  def apply(creationTime: Timestamp = null, output: FileReference = null, testCase: TestCaseReference = null): ToolOutputReference = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (output != null) __obj.updateDynamic("output")(output)
    if (testCase != null) __obj.updateDynamic("testCase")(testCase)
    __obj.asInstanceOf[ToolOutputReference]
  }
}

