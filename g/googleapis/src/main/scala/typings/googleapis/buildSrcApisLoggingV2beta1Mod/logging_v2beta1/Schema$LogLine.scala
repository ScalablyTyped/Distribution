package typings.googleapis.buildSrcApisLoggingV2beta1Mod.logging_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Application log line emitted while processing a request.
  */
@js.native
trait Schema$LogLine extends js.Object {
  /**
    * App-provided log message.
    */
  var logMessage: js.UndefOr[String] = js.native
  /**
    * Severity of this log entry.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * Where in the source code this log message was written.
    */
  var sourceLocation: js.UndefOr[Schema$SourceLocation] = js.native
  /**
    * Approximate time when this log entry was made.
    */
  var time: js.UndefOr[String] = js.native
}

object Schema$LogLine {
  @scala.inline
  def apply(
    logMessage: String = null,
    severity: String = null,
    sourceLocation: Schema$SourceLocation = null,
    time: String = null
  ): Schema$LogLine = {
    val __obj = js.Dynamic.literal()
    if (logMessage != null) __obj.updateDynamic("logMessage")(logMessage.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (sourceLocation != null) __obj.updateDynamic("sourceLocation")(sourceLocation.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LogLine]
  }
}

