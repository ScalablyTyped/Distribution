package typings.execa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecaError[StdoutErrorType] extends ExecaSyncError[StdoutErrorType] {
  /**
  		The output of the process with `stdout` and `stderr` interleaved.
  		This is `undefined` if either:
  		- the `all` option is `false` (default value)
  		- `execa.sync()` was used
  		*/
  var all: js.UndefOr[StdoutErrorType] = js.undefined
  /**
  		Whether the process was canceled.
  		*/
  var isCanceled: Boolean
}

object ExecaError {
  @scala.inline
  def apply[StdoutErrorType](
    command: String,
    exitCode: Double,
    failed: Boolean,
    isCanceled: Boolean,
    killed: Boolean,
    message: String,
    name: String,
    shortMessage: String,
    stderr: StdoutErrorType,
    stdout: StdoutErrorType,
    timedOut: Boolean,
    all: StdoutErrorType = null,
    originalMessage: String = null,
    signal: String = null,
    signalDescription: String = null,
    stack: String = null
  ): ExecaError[StdoutErrorType] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortMessage = shortMessage.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (originalMessage != null) __obj.updateDynamic("originalMessage")(originalMessage.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (signalDescription != null) __obj.updateDynamic("signalDescription")(signalDescription.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecaError[StdoutErrorType]]
  }
}

