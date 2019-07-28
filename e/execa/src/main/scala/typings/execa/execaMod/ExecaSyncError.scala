package typings.execa.execaMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecaSyncError[StdoutErrorType]
  extends Error
     with ExecaReturnBase[StdoutErrorType]

object ExecaSyncError {
  @scala.inline
  def apply[StdoutErrorType](
    command: String,
    exitCode: Double,
    exitCodeName: String,
    failed: Boolean,
    killed: Boolean,
    message: String,
    name: String,
    stderr: StdoutErrorType,
    stdout: StdoutErrorType,
    timedOut: Boolean,
    signal: String = null,
    stack: String = null
  ): ExecaSyncError[StdoutErrorType] = {
    val __obj = js.Dynamic.literal(command = command, exitCode = exitCode, exitCodeName = exitCodeName, failed = failed, killed = killed, message = message, name = name, stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ExecaSyncError[StdoutErrorType]]
  }
}

