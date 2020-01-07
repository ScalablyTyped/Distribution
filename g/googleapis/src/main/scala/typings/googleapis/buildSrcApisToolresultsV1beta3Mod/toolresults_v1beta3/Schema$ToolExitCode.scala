package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exit code from a tool execution.
  */
@js.native
trait Schema$ToolExitCode extends js.Object {
  /**
    * Tool execution exit code. A value of 0 means that the execution was
    * successful.  - In response: always set - In create/update request: always
    * set
    */
  var number: js.UndefOr[Double] = js.native
}

object Schema$ToolExitCode {
  @scala.inline
  def apply(number: Int | Double = null): Schema$ToolExitCode = {
    val __obj = js.Dynamic.literal()
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ToolExitCode]
  }
}

