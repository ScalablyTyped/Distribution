package typings.execa.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecaSyncError[StdoutErrorType]
  extends Error
     with ExecaReturnBase[StdoutErrorType] {
  /**
  		Original error message. This is the same as the `message` property except it includes neither the child process stdout/stderr nor some additional information added by Execa.
  		This is `undefined` unless the child process exited due to an `error` event or a timeout.
  		*/
  var originalMessage: js.UndefOr[String] = js.undefined
  /**
  		This is the same as the `message` property except it does not include the child process stdout/stderr.
  		*/
  var shortMessage: String
}

object ExecaSyncError {
  @scala.inline
  def apply[StdoutErrorType](
    command: String,
    exitCode: Double,
    failed: Boolean,
    killed: Boolean,
    message: String,
    name: String,
    shortMessage: String,
    stderr: StdoutErrorType,
    stdout: StdoutErrorType,
    timedOut: Boolean,
    originalMessage: String = null,
    signal: String = null,
    signalDescription: String = null,
    stack: String = null
  ): ExecaSyncError[StdoutErrorType] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortMessage = shortMessage.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    if (originalMessage != null) __obj.updateDynamic("originalMessage")(originalMessage.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (signalDescription != null) __obj.updateDynamic("signalDescription")(signalDescription.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecaSyncError[StdoutErrorType]]
  }
}

