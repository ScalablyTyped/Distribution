package typings.execa.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecaSyncError[StdoutErrorType]
  extends Error
     with ExecaReturnBase[StdoutErrorType] {
  
  /**
  		Original error message. This is the same as the `message` property except it includes neither the child process stdout/stderr nor some additional information added by Execa.
  		This is `undefined` unless the child process exited due to an `error` event or a timeout.
  		*/
  var originalMessage: js.UndefOr[String] = js.native
  
  /**
  		This is the same as the `message` property except it does not include the child process stdout/stderr.
  		*/
  var shortMessage: String = js.native
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
    timedOut: Boolean
  ): ExecaSyncError[StdoutErrorType] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortMessage = shortMessage.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecaSyncError[StdoutErrorType]]
  }
  
  @scala.inline
  implicit class ExecaSyncErrorOps[Self <: ExecaSyncError[_], StdoutErrorType] (val x: Self with ExecaSyncError[StdoutErrorType]) extends AnyVal {
    
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
    def setShortMessage(value: String): Self = this.set("shortMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalMessage(value: String): Self = this.set("originalMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalMessage: Self = this.set("originalMessage", js.undefined)
  }
}
