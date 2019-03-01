package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellTask extends js.Object {
  /** The shell command to run. */
  var command: js.UndefOr[java.lang.String] = js.undefined
  /** Exit code for the task. */
  var exitCode: js.UndefOr[scala.Double] = js.undefined
}

object ShellTask {
  @scala.inline
  def apply(command: java.lang.String = null, exitCode: scala.Int | scala.Double = null): ShellTask = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command)
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellTask]
  }
}

