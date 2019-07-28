package typings.execa.execaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecaError[StdoutErrorType] extends ExecaSyncError[StdoutErrorType] {
  /**
  		The output of the process with `stdout` and `stderr` interleaved.
  		*/
  var all: StdoutErrorType
  /**
  		Whether the process was canceled.
  		*/
  var isCanceled: Boolean
}

object ExecaError {
  @scala.inline
  def apply[StdoutErrorType](
    all: StdoutErrorType,
    command: String,
    exitCode: Double,
    exitCodeName: String,
    failed: Boolean,
    isCanceled: Boolean,
    killed: Boolean,
    message: String,
    name: String,
    stderr: StdoutErrorType,
    stdout: StdoutErrorType,
    timedOut: Boolean,
    signal: String = null,
    stack: String = null
  ): ExecaError[StdoutErrorType] = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], command = command, exitCode = exitCode, exitCodeName = exitCodeName, failed = failed, isCanceled = isCanceled, killed = killed, message = message, name = name, stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ExecaError[StdoutErrorType]]
  }
}

