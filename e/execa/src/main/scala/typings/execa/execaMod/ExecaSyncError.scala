package typings.execa.execaMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecaSyncError[StdoutErrorType]
  extends Error
     with ExecaReturnBase[StdoutErrorType] {
  /**
  		Original error message. This is `undefined` unless the child process exited due to an `error` event or a timeout.
  		The `message` property contains both the `originalMessage` and some additional information added by Execa.
  		*/
  var originalMessage: js.UndefOr[String] = js.undefined
}

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
    originalMessage: String = null,
    signal: String = null,
    stack: String = null
  ): ExecaSyncError[StdoutErrorType] = {
    val __obj = js.Dynamic.literal(command = command, exitCode = exitCode, exitCodeName = exitCodeName, failed = failed, killed = killed, message = message, name = name, stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut)
    if (originalMessage != null) __obj.updateDynamic("originalMessage")(originalMessage)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ExecaSyncError[StdoutErrorType]]
  }
}

