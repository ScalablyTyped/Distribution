package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry extends js.Object {
  /**
    * A unique ID for the log entry used for deduplication. If omitted,
    * the implementation will generate one based on operation_id.
    */
  var insertId: js.UndefOr[String] = js.undefined
  /**
    * A set of user-defined (key, value) data that provides additional
    * information about the log entry.
    */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Required. The log to which this log entry belongs. Examples: `"syslog"`,
    * `"book_log"`.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The log entry payload, represented as a protocol buffer that is
    * expressed as a JSON object. The only accepted type currently is
    * AuditLog.
    */
  var protoPayload: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * The severity of the log entry. The default value is
    * `LogSeverity.DEFAULT`.
    */
  var severity: js.UndefOr[String] = js.undefined
  /**
    * The log entry payload, represented as a structure that
    * is expressed as a JSON object.
    */
  var structPayload: js.UndefOr[Record[String, _]] = js.undefined
  /** The log entry payload, represented as a Unicode string (UTF-8). */
  var textPayload: js.UndefOr[String] = js.undefined
  /**
    * The time the event described by the log entry occurred. If
    * omitted, defaults to operation start time.
    */
  var timestamp: js.UndefOr[String] = js.undefined
}

object LogEntry {
  @scala.inline
  def apply(
    insertId: String = null,
    labels: Record[String, String] = null,
    name: String = null,
    protoPayload: Record[String, _] = null,
    severity: String = null,
    structPayload: Record[String, _] = null,
    textPayload: String = null,
    timestamp: String = null
  ): LogEntry = {
    val __obj = js.Dynamic.literal()
    if (insertId != null) __obj.updateDynamic("insertId")(insertId.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (protoPayload != null) __obj.updateDynamic("protoPayload")(protoPayload.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (structPayload != null) __obj.updateDynamic("structPayload")(structPayload.asInstanceOf[js.Any])
    if (textPayload != null) __obj.updateDynamic("textPayload")(textPayload.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
}

