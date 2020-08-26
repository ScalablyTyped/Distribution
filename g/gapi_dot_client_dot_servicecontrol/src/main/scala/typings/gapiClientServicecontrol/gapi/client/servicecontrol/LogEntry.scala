package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEntry extends js.Object {
  /**
    * A unique ID for the log entry used for deduplication. If omitted,
    * the implementation will generate one based on operation_id.
    */
  var insertId: js.UndefOr[String] = js.native
  /**
    * A set of user-defined (key, value) data that provides additional
    * information about the log entry.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /**
    * Required. The log to which this log entry belongs. Examples: `"syslog"`,
    * `"book_log"`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The log entry payload, represented as a protocol buffer that is
    * expressed as a JSON object. The only accepted type currently is
    * AuditLog.
    */
  var protoPayload: js.UndefOr[Record[String, _]] = js.native
  /**
    * The severity of the log entry. The default value is
    * `LogSeverity.DEFAULT`.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * The log entry payload, represented as a structure that
    * is expressed as a JSON object.
    */
  var structPayload: js.UndefOr[Record[String, _]] = js.native
  /** The log entry payload, represented as a Unicode string (UTF-8). */
  var textPayload: js.UndefOr[String] = js.native
  /**
    * The time the event described by the log entry occurred. If
    * omitted, defaults to operation start time.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object LogEntry {
  @scala.inline
  def apply(): LogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEntry]
  }
  @scala.inline
  implicit class LogEntryOps[Self <: LogEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInsertId(value: String): Self = this.set("insertId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertId: Self = this.set("insertId", js.undefined)
    @scala.inline
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProtoPayload(value: Record[String, _]): Self = this.set("protoPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtoPayload: Self = this.set("protoPayload", js.undefined)
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setStructPayload(value: Record[String, _]): Self = this.set("structPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructPayload: Self = this.set("structPayload", js.undefined)
    @scala.inline
    def setTextPayload(value: String): Self = this.set("textPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextPayload: Self = this.set("textPayload", js.undefined)
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

