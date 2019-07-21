package typings
package execaLib.execaMod

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
  var isCanceled: scala.Boolean
}

object ExecaError {
  @scala.inline
  def apply[StdoutErrorType](
    all: StdoutErrorType,
    command: java.lang.String,
    exitCode: scala.Double,
    exitCodeName: java.lang.String,
    failed: scala.Boolean,
    isCanceled: scala.Boolean,
    killed: scala.Boolean,
    message: java.lang.String,
    name: java.lang.String,
    stderr: StdoutErrorType,
    stdout: StdoutErrorType,
    timedOut: scala.Boolean,
    signal: java.lang.String = null,
    stack: java.lang.String = null
  ): ExecaError[StdoutErrorType] = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], command = command, exitCode = exitCode, exitCodeName = exitCodeName, failed = failed, isCanceled = isCanceled, killed = killed, message = message, name = name, stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ExecaError[StdoutErrorType]]
  }
}

