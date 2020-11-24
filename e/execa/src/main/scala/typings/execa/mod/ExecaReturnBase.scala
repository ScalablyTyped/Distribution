package typings.execa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecaReturnBase[StdoutStderrType] extends js.Object {
  
  /**
  		The file and arguments that were run.
  		*/
  var command: String = js.native
  
  /**
  		The numeric exit code of the process that was run.
  		*/
  var exitCode: Double = js.native
  
  /**
  		Whether the process failed to run.
  		*/
  var failed: Boolean = js.native
  
  /**
  		Whether the process was killed.
  		*/
  var killed: Boolean = js.native
  
  /**
  		The name of the signal that was used to terminate the process. For example, `SIGFPE`.
  		If a signal terminated the process, this property is defined and included in the error message. Otherwise it is `undefined`.
  		*/
  var signal: js.UndefOr[String] = js.native
  
  /**
  		A human-friendly description of the signal that was used to terminate the process. For example, `Floating point arithmetic error`.
  		If a signal terminated the process, this property is defined and included in the error message. Otherwise it is `undefined`. It is also `undefined` when the signal is very uncommon which should seldomly happen.
  		*/
  var signalDescription: js.UndefOr[String] = js.native
  
  /**
  		The output of the process on stderr.
  		*/
  var stderr: StdoutStderrType = js.native
  
  /**
  		The output of the process on stdout.
  		*/
  var stdout: StdoutStderrType = js.native
  
  /**
  		Whether the process timed out.
  		*/
  var timedOut: Boolean = js.native
}
object ExecaReturnBase {
  
  @scala.inline
  def apply[StdoutStderrType](
    command: String,
    exitCode: Double,
    failed: Boolean,
    killed: Boolean,
    stderr: StdoutStderrType,
    stdout: StdoutStderrType,
    timedOut: Boolean
  ): ExecaReturnBase[StdoutStderrType] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecaReturnBase[StdoutStderrType]]
  }
  
  @scala.inline
  implicit class ExecaReturnBaseOps[Self <: ExecaReturnBase[_], StdoutStderrType] (val x: Self with ExecaReturnBase[StdoutStderrType]) extends AnyVal {
    
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: Boolean): Self = this.set("failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKilled(value: Boolean): Self = this.set("killed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderr(value: StdoutStderrType): Self = this.set("stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdout(value: StdoutStderrType): Self = this.set("stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedOut(value: Boolean): Self = this.set("timedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: String): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    
    @scala.inline
    def setSignalDescription(value: String): Self = this.set("signalDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignalDescription: Self = this.set("signalDescription", js.undefined)
  }
}
