package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolExecution extends js.Object {
  /**
    * The full tokenized command line including the program name (equivalent to argv in a C program).
    *
    * - In response: present if set by create request - In create request: optional - In update request: never set
    */
  var commandLineArguments: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Tool execution exit code. This field will be set once the tool has exited.
    *
    * - In response: present if set by create/update request - In create request: optional - In update request: optional, a FAILED_PRECONDITION error will be
    * returned if an exit_code is already set.
    */
  var exitCode: js.UndefOr[ToolExitCode] = js.undefined
  /**
    * References to any plain text logs output the tool execution.
    *
    * This field can be set before the tool has exited in order to be able to have access to a live view of the logs while the tool is running.
    *
    * The maximum allowed number of tool logs per step is 1000.
    *
    * - In response: present if set by create/update request - In create request: optional - In update request: optional, any value provided will be appended
    * to the existing list
    */
  var toolLogs: js.UndefOr[js.Array[FileReference]] = js.undefined
  /**
    * References to opaque files of any format output by the tool execution.
    *
    * The maximum allowed number of tool outputs per step is 1000.
    *
    * - In response: present if set by create/update request - In create request: optional - In update request: optional, any value provided will be appended
    * to the existing list
    */
  var toolOutputs: js.UndefOr[js.Array[ToolOutputReference]] = js.undefined
}

object ToolExecution {
  @scala.inline
  def apply(
    commandLineArguments: js.Array[String] = null,
    exitCode: ToolExitCode = null,
    toolLogs: js.Array[FileReference] = null,
    toolOutputs: js.Array[ToolOutputReference] = null
  ): ToolExecution = {
    val __obj = js.Dynamic.literal()
    if (commandLineArguments != null) __obj.updateDynamic("commandLineArguments")(commandLineArguments.asInstanceOf[js.Any])
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    if (toolLogs != null) __obj.updateDynamic("toolLogs")(toolLogs.asInstanceOf[js.Any])
    if (toolOutputs != null) __obj.updateDynamic("toolOutputs")(toolOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolExecution]
  }
}

