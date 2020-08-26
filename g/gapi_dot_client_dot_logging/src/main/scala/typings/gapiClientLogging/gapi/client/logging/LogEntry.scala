package typings.gapiClientLogging.gapi.client.logging

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEntry extends js.Object {
  /** Optional. Information about the HTTP request associated with this log entry, if applicable. */
  var httpRequest: js.UndefOr[HttpRequest] = js.native
  /**
    * Optional. A unique identifier for the log entry. If you provide a value, then Stackdriver Logging considers other log entries in the same project, with
    * the same timestamp, and with the same insert_id to be duplicates which can be removed. If omitted in new log entries, then Stackdriver Logging assigns
    * its own unique identifier. The insert_id is also used to order log entries that have the same timestamp value.
    */
  var insertId: js.UndefOr[String] = js.native
  /** The log entry payload, represented as a structure that is expressed as a JSON object. */
  var jsonPayload: js.UndefOr[Record[String, _]] = js.native
  /** Optional. A set of user-defined (key, value) data that provides additional information about the log entry. */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /**
    * Required. The resource name of the log to which this log entry belongs:
    * "projects/[PROJECT_ID]/logs/[LOG_ID]"
    * "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
    * "folders/[FOLDER_ID]/logs/[LOG_ID]"
    * A project number may optionally be used in place of PROJECT_ID. The  project number is translated to its corresponding PROJECT_ID internally  and the
    * log_name field will contain PROJECT_ID in queries and exports.[LOG_ID] must be URL-encoded within log_name. Example:
    * "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity". [LOG_ID] must be less than 512 characters long and can only include the
    * following characters: upper and lower case alphanumeric characters, forward-slash, underscore, hyphen, and period.For backward compatibility, if
    * log_name begins with a forward-slash, such as /projects/..., then the log entry is ingested as usual but the forward-slash is removed. Listing the log
    * entry will not show the leading slash and filtering for a log name with a leading slash will never return any results.
    */
  var logName: js.UndefOr[String] = js.native
  /** Optional. Information about an operation associated with the log entry, if applicable. */
  var operation: js.UndefOr[LogEntryOperation] = js.native
  /** The log entry payload, represented as a protocol buffer. Some Google Cloud Platform services use this field for their log entry payloads. */
  var protoPayload: js.UndefOr[Record[String, _]] = js.native
  /** Output only. The time the log entry was received by Stackdriver Logging. */
  var receiveTimestamp: js.UndefOr[String] = js.native
  /**
    * Required. The monitored resource associated with this log entry. Example: a log entry that reports a database error would be associated with the
    * monitored resource designating the particular database that reported the error.
    */
  var resource: js.UndefOr[MonitoredResource] = js.native
  /** Optional. The severity of the log entry. The default value is LogSeverity.DEFAULT. */
  var severity: js.UndefOr[String] = js.native
  /** Optional. Source code location information associated with the log entry, if any. */
  var sourceLocation: js.UndefOr[LogEntrySourceLocation] = js.native
  /** The log entry payload, represented as a Unicode string (UTF-8). */
  var textPayload: js.UndefOr[String] = js.native
  /**
    * Optional. The time the event described by the log entry occurred. This time is used to compute the log entry's age and to enforce the logs retention
    * period. If this field is omitted in a new log entry, then Stackdriver Logging assigns it the current time.Incoming log entries should have timestamps
    * that are no more than the logs retention period in the past, and no more than 24 hours in the future. See the entries.write API method for more
    * information.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Optional. Resource name of the trace associated with the log entry, if any. If it contains a relative resource name, the name is assumed to be relative
    * to //tracing.googleapis.com. Example: projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824
    */
  var trace: js.UndefOr[String] = js.native
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
    def setHttpRequest(value: HttpRequest): Self = this.set("httpRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpRequest: Self = this.set("httpRequest", js.undefined)
    @scala.inline
    def setInsertId(value: String): Self = this.set("insertId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertId: Self = this.set("insertId", js.undefined)
    @scala.inline
    def setJsonPayload(value: Record[String, _]): Self = this.set("jsonPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonPayload: Self = this.set("jsonPayload", js.undefined)
    @scala.inline
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLogName(value: String): Self = this.set("logName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogName: Self = this.set("logName", js.undefined)
    @scala.inline
    def setOperation(value: LogEntryOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setProtoPayload(value: Record[String, _]): Self = this.set("protoPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtoPayload: Self = this.set("protoPayload", js.undefined)
    @scala.inline
    def setReceiveTimestamp(value: String): Self = this.set("receiveTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceiveTimestamp: Self = this.set("receiveTimestamp", js.undefined)
    @scala.inline
    def setResource(value: MonitoredResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setSourceLocation(value: LogEntrySourceLocation): Self = this.set("sourceLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceLocation: Self = this.set("sourceLocation", js.undefined)
    @scala.inline
    def setTextPayload(value: String): Self = this.set("textPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextPayload: Self = this.set("textPayload", js.undefined)
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setTrace(value: String): Self = this.set("trace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
  }
  
}

