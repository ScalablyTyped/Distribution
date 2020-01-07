package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An execution of an arbitrary tool. It could be a test runner or a tool
  * copying artifacts or deploying code.
  */
@js.native
trait Schema$ToolExecution extends js.Object {
  /**
    * The full tokenized command line including the program name (equivalent to
    * argv in a C program).  - In response: present if set by create request -
    * In create request: optional - In update request: never set
    */
  var commandLineArguments: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tool execution exit code. This field will be set once the tool has
    * exited.  - In response: present if set by create/update request - In
    * create request: optional - In update request: optional, a
    * FAILED_PRECONDITION error will be returned if an exit_code is already
    * set.
    */
  var exitCode: js.UndefOr[Schema$ToolExitCode] = js.native
  /**
    * References to any plain text logs output the tool execution.  This field
    * can be set before the tool has exited in order to be able to have access
    * to a live view of the logs while the tool is running.  The maximum
    * allowed number of tool logs per step is 1000.  - In response: present if
    * set by create/update request - In create request: optional - In update
    * request: optional, any value provided will be appended to the existing
    * list
    */
  var toolLogs: js.UndefOr[js.Array[Schema$FileReference]] = js.native
  /**
    * References to opaque files of any format output by the tool execution.
    * The maximum allowed number of tool outputs per step is 1000.  - In
    * response: present if set by create/update request - In create request:
    * optional - In update request: optional, any value provided will be
    * appended to the existing list
    */
  var toolOutputs: js.UndefOr[js.Array[Schema$ToolOutputReference]] = js.native
}

object Schema$ToolExecution {
  @scala.inline
  def apply(
    commandLineArguments: js.Array[String] = null,
    exitCode: Schema$ToolExitCode = null,
    toolLogs: js.Array[Schema$FileReference] = null,
    toolOutputs: js.Array[Schema$ToolOutputReference] = null
  ): Schema$ToolExecution = {
    val __obj = js.Dynamic.literal()
    if (commandLineArguments != null) __obj.updateDynamic("commandLineArguments")(commandLineArguments.asInstanceOf[js.Any])
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    if (toolLogs != null) __obj.updateDynamic("toolLogs")(toolLogs.asInstanceOf[js.Any])
    if (toolOutputs != null) __obj.updateDynamic("toolOutputs")(toolOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ToolExecution]
  }
}

