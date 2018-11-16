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

