package typings.execa.execaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecaReturnBase[StdoutStderrType] extends js.Object {
  /**
  		The file and arguments that were run.
  		*/
  var command: String
  /**
  		The numeric exit code of the process that was run.
  		*/
  var exitCode: Double
  /**
  		The textual exit code of the process that was run.
  		*/
  var exitCodeName: String
  /**
  		Whether the process failed to run.
  		*/
  var failed: Boolean
  /**
  		Whether the process was killed.
  		*/
  var killed: Boolean
  /**
  		The signal that was used to terminate the process.
  		*/
  var signal: js.UndefOr[String] = js.undefined
  /**
  		The output of the process on stderr.
  		*/
  var stderr: StdoutStderrType
  /**
  		The output of the process on stdout.
  		*/
  var stdout: StdoutStderrType
  /**
  		Whether the process timed out.
  		*/
  var timedOut: Boolean
}

object ExecaReturnBase {
  @scala.inline
  def apply[StdoutStderrType](
    command: String,
    exitCode: Double,
    exitCodeName: String,
    failed: Boolean,
    killed: Boolean,
    stderr: StdoutStderrType,
    stdout: StdoutStderrType,
    timedOut: Boolean,
    signal: String = null
  ): ExecaReturnBase[StdoutStderrType] = {
    val __obj = js.Dynamic.literal(command = command, exitCode = exitCode, exitCodeName = exitCodeName, failed = failed, killed = killed, stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[ExecaReturnBase[StdoutStderrType]]
  }
}

