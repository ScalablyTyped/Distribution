package typings.gapiDotClientDotDataflow.gapi.client.dataflow

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
  def apply(command: String = null, exitCode: Int | Double = null): ShellTask = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command)
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellTask]
  }
}

