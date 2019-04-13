package typings
package execaLib.execaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecaReturns extends js.Object {
  /**
    * The command that was run.
    */
  var cmd: java.lang.String
  /**
    * The exit code of the process that was run.
    */
  var code: scala.Double
  /**
    * Whether the process failed to run.
    */
  var failed: scala.Boolean
  /**
    * Whether the process was killed.
    */
  var killed: scala.Boolean
  /**
    * The signal that was used to terminate the process.
    */
  var signal: java.lang.String | scala.Null
  /**
    * The output of the process on stderr.
    */
  var stderr: java.lang.String
  /**
    * The output of the process on stdout.
    */
  var stdout: java.lang.String
  /**
    * Whether the process timed out.
    */
  var timedOut: scala.Boolean
}

object ExecaReturns {
  @scala.inline
  def apply(
    cmd: java.lang.String,
    code: scala.Double,
    failed: scala.Boolean,
    killed: scala.Boolean,
    stderr: java.lang.String,
    stdout: java.lang.String,
    timedOut: scala.Boolean,
    signal: java.lang.String = null
  ): ExecaReturns = {
    val __obj = js.Dynamic.literal(cmd = cmd, code = code, failed = failed, killed = killed, stderr = stderr, stdout = stdout, timedOut = timedOut)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[ExecaReturns]
  }
}

