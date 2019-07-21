package typings
package execaLib.execaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecaSyncError[StdoutErrorType]
  extends stdLib.Error
     with ExecaReturnBase[StdoutErrorType]

object ExecaSyncError {
  @scala.inline
  def apply[StdoutErrorType](
    command: java.lang.String,
    exitCode: scala.Double,
    exitCodeName: java.lang.String,
    failed: scala.Boolean,
    killed: scala.Boolean,
    message: java.lang.String,
    name: java.lang.String,
    stderr: StdoutErrorType,
    stdout: StdoutErrorType,
    timedOut: scala.Boolean,
    signal: java.lang.String = null,
    stack: java.lang.String = null
  ): ExecaSyncError[StdoutErrorType] = {
    val __obj = js.Dynamic.literal(command = command, exitCode = exitCode, exitCodeName = exitCodeName, failed = failed, killed = killed, message = message, name = name, stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ExecaSyncError[StdoutErrorType]]
  }
}

