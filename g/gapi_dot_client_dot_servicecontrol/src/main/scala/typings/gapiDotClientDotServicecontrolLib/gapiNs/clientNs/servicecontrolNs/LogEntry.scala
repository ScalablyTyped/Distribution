package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry extends js.Object {
  /**
    * A unique ID for the log entry used for deduplication. If omitted,
    * the implementation will generate one based on operation_id.
    */
  var insertId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A set of user-defined (key, value) data that provides additional
    * information about the log entry.
    */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
    * Required. The log to which this log entry belongs. Examples: `"syslog"`,
    * `"book_log"`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The log entry payload, represented as a protocol buffer that is
    * expressed as a JSON object. The only accepted type currently is
    * AuditLog.
    */
  var protoPayload: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
    * The severity of the log entry. The default value is
    * `LogSeverity.DEFAULT`.
    */
  var severity: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The log entry payload, represented as a structure that
    * is expressed as a JSON object.
    */
  var structPayload: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /** The log entry payload, represented as a Unicode string (UTF-8). */
  var textPayload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time the event described by the log entry occurred. If
    * omitted, defaults to operation start time.
    */
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
}

object LogEntry {
  @scala.inline
  def apply(
    insertId: java.lang.String = null,
    labels: stdLib.Record[java.lang.String, java.lang.String] = null,
    name: java.lang.String = null,
    protoPayload: stdLib.Record[java.lang.String, _] = null,
    severity: java.lang.String = null,
    structPayload: stdLib.Record[java.lang.String, _] = null,
    textPayload: java.lang.String = null,
    timestamp: java.lang.String = null
  ): LogEntry = {
    val __obj = js.Dynamic.literal()
    if (insertId != null) __obj.updateDynamic("insertId")(insertId)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (name != null) __obj.updateDynamic("name")(name)
    if (protoPayload != null) __obj.updateDynamic("protoPayload")(protoPayload)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (structPayload != null) __obj.updateDynamic("structPayload")(structPayload)
    if (textPayload != null) __obj.updateDynamic("textPayload")(textPayload)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[LogEntry]
  }
}

