package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLine extends js.Object {
  /** App-provided log message. */
  var logMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Severity of this log entry. */
  var severity: js.UndefOr[java.lang.String] = js.undefined
  /** Where in the source code this log message was written. */
  var sourceLocation: js.UndefOr[SourceLocation] = js.undefined
  /** Approximate time when this log entry was made. */
  var time: js.UndefOr[java.lang.String] = js.undefined
}

