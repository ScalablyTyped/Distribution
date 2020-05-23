package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellTask extends js.Object {
  /** The shell command to run. */
  var command: js.UndefOr[String] = js.undefined
  /** Exit code for the task. */
  var exitCode: js.UndefOr[Double] = js.undefined
}

object ShellTask {
  @scala.inline
  def apply(command: String = null, exitCode: js.UndefOr[Double] = js.undefined): ShellTask = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (!js.isUndefined(exitCode)) __obj.updateDynamic("exitCode")(exitCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellTask]
  }
}

