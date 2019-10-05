package typings.gapiDotClientDotLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLine extends js.Object {
  /** App-provided log message. */
  var logMessage: js.UndefOr[String] = js.undefined
  /** Severity of this log entry. */
  var severity: js.UndefOr[String] = js.undefined
  /** Where in the source code this log message was written. */
  var sourceLocation: js.UndefOr[SourceLocation] = js.undefined
  /** Approximate time when this log entry was made. */
  var time: js.UndefOr[String] = js.undefined
}

object LogLine {
  @scala.inline
  def apply(
    logMessage: String = null,
    severity: String = null,
    sourceLocation: SourceLocation = null,
    time: String = null
  ): LogLine = {
    val __obj = js.Dynamic.literal()
    if (logMessage != null) __obj.updateDynamic("logMessage")(logMessage)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (sourceLocation != null) __obj.updateDynamic("sourceLocation")(sourceLocation)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[LogLine]
  }
}

