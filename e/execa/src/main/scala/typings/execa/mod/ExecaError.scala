package typings.execa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecaError[StdoutErrorType] extends ExecaSyncError[StdoutErrorType] {
  /**
  		The output of the process with `stdout` and `stderr` interleaved.
  		This is `undefined` if either:
  		- the `all` option is `false` (default value)
  		- `execa.sync()` was used
  		*/
  var all: js.UndefOr[StdoutErrorType] = js.native
  /**
  		Whether the process was canceled.
  		*/
  var isCanceled: Boolean = js.native
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
    timedOut: Boolean
  ): ExecaError[StdoutErrorType] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortMessage = shortMessage.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecaError[StdoutErrorType]]
  }
  @scala.inline
  implicit class ExecaErrorOps[Self <: ExecaError[_], StdoutErrorType] (val x: Self with ExecaError[StdoutErrorType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsCanceled(value: Boolean): Self = this.set("isCanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setAll(value: StdoutErrorType): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
  }
  
}

