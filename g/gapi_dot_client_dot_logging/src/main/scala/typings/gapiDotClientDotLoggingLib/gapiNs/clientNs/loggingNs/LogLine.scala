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

object LogLine {
  @scala.inline
  def apply(
    logMessage: java.lang.String = null,
    severity: java.lang.String = null,
    sourceLocation: SourceLocation = null,
    time: java.lang.String = null
  ): LogLine = {
    val __obj = js.Dynamic.literal()
    if (logMessage != null) __obj.updateDynamic("logMessage")(logMessage)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (sourceLocation != null) __obj.updateDynamic("sourceLocation")(sourceLocation)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[LogLine]
  }
}

