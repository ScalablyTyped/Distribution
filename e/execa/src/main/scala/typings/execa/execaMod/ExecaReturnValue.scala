package typings.execa.execaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecaReturnValue[StdoutErrorType] extends ExecaReturnBase[StdoutErrorType] {
  /**
  		The output of the process with `stdout` and `stderr` interleaved.
  		*/
  var all: StdoutErrorType
  /**
  		Whether the process was canceled.
  		*/
  var isCanceled: Boolean
}

object ExecaReturnValue {
  @scala.inline
  def apply[StdoutErrorType](
    all: StdoutErrorType,
    command: String,
    exitCode: Double,
    exitCodeName: String,
    failed: Boolean,
    isCanceled: Boolean,
    killed: Boolean,
    stderr: StdoutErrorType,
    stdout: StdoutErrorType,
    timedOut: Boolean,
    signal: String = null
  ): ExecaReturnValue[StdoutErrorType] = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], command = command, exitCode = exitCode, exitCodeName = exitCodeName, failed = failed, isCanceled = isCanceled, killed = killed, stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[ExecaReturnValue[StdoutErrorType]]
  }
}

