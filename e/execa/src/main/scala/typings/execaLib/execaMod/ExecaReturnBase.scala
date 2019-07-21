package typings
package execaLib.execaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecaReturnBase[StdoutStderrType] extends js.Object {
  /**
  		The file and arguments that were run.
  		*/
  var command: java.lang.String
  /**
  		The numeric exit code of the process that was run.
  		*/
  var exitCode: scala.Double
  /**
  		The textual exit code of the process that was run.
  		*/
  var exitCodeName: java.lang.String
  /**
  		Whether the process failed to run.
  		*/
  var failed: scala.Boolean
  /**
  		Whether the process was killed.
  		*/
  var killed: scala.Boolean
  /**
  		The signal that was used to terminate the process.
  		*/
  var signal: js.UndefOr[java.lang.String] = js.undefined
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
  var timedOut: scala.Boolean
}

object ExecaReturnBase {
  @scala.inline
  def apply[StdoutStderrType](
    command: java.lang.String,
    exitCode: scala.Double,
    exitCodeName: java.lang.String,
    failed: scala.Boolean,
    killed: scala.Boolean,
    stderr: StdoutStderrType,
    stdout: StdoutStderrType,
    timedOut: scala.Boolean,
    signal: java.lang.String = null
  ): ExecaReturnBase[StdoutStderrType] = {
    val __obj = js.Dynamic.literal(command = command, exitCode = exitCode, exitCodeName = exitCodeName, failed = failed, killed = killed, stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[ExecaReturnBase[StdoutStderrType]]
  }
}

