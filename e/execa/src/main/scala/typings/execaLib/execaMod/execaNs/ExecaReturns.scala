package typings
package execaLib.execaMod.execaNs

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

