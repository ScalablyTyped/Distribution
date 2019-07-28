package typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry extends js.Object {
  /** Optional. Information about the HTTP request associated with this log entry, if applicable. */
  var httpRequest: js.UndefOr[HttpRequest] = js.undefined
  /**
    * Optional. A unique identifier for the log entry. If you provide a value, then Stackdriver Logging considers other log entries in the same project, with
    * the same timestamp, and with the same insert_id to be duplicates which can be removed. If omitted in new log entries, then Stackdriver Logging assigns
    * its own unique identifier. The insert_id is also used to order log entries that have the same timestamp value.
    */
  var insertId: js.UndefOr[String] = js.undefined
  /** The log entry payload, represented as a structure that is expressed as a JSON object. */
  var jsonPayload: js.UndefOr[Record[String, _]] = js.undefined
  /** Optional. A set of user-defined (key, value) data that provides additional information about the log entry. */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
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
  var logName: js.UndefOr[String] = js.undefined
  /** Optional. Information about an operation associated with the log entry, if applicable. */
  var operation: js.UndefOr[LogEntryOperation] = js.undefined
  /** The log entry payload, represented as a protocol buffer. Some Google Cloud Platform services use this field for their log entry payloads. */
  var protoPayload: js.UndefOr[Record[String, _]] = js.undefined
  /** Output only. The time the log entry was received by Stackdriver Logging. */
  var receiveTimestamp: js.UndefOr[String] = js.undefined
  /**
    * Required. The monitored resource associated with this log entry. Example: a log entry that reports a database error would be associated with the
    * monitored resource designating the particular database that reported the error.
    */
  var resource: js.UndefOr[MonitoredResource] = js.undefined
  /** Optional. The severity of the log entry. The default value is LogSeverity.DEFAULT. */
  var severity: js.UndefOr[String] = js.undefined
  /** Optional. Source code location information associated with the log entry, if any. */
  var sourceLocation: js.UndefOr[LogEntrySourceLocation] = js.undefined
  /** The log entry payload, represented as a Unicode string (UTF-8). */
  var textPayload: js.UndefOr[String] = js.undefined
  /**
    * Optional. The time the event described by the log entry occurred. This time is used to compute the log entry's age and to enforce the logs retention
    * period. If this field is omitted in a new log entry, then Stackdriver Logging assigns it the current time.Incoming log entries should have timestamps
    * that are no more than the logs retention period in the past, and no more than 24 hours in the future. See the entries.write API method for more
    * information.
    */
  var timestamp: js.UndefOr[String] = js.undefined
  /**
    * Optional. Resource name of the trace associated with the log entry, if any. If it contains a relative resource name, the name is assumed to be relative
    * to //tracing.googleapis.com. Example: projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824
    */
  var trace: js.UndefOr[String] = js.undefined
}

object LogEntry {
  @scala.inline
  def apply(
    httpRequest: HttpRequest = null,
    insertId: String = null,
    jsonPayload: Record[String, _] = null,
    labels: Record[String, String] = null,
    logName: String = null,
    operation: LogEntryOperation = null,
    protoPayload: Record[String, _] = null,
    receiveTimestamp: String = null,
    resource: MonitoredResource = null,
    severity: String = null,
    sourceLocation: LogEntrySourceLocation = null,
    textPayload: String = null,
    timestamp: String = null,
    trace: String = null
  ): LogEntry = {
    val __obj = js.Dynamic.literal()
    if (httpRequest != null) __obj.updateDynamic("httpRequest")(httpRequest)
    if (insertId != null) __obj.updateDynamic("insertId")(insertId)
    if (jsonPayload != null) __obj.updateDynamic("jsonPayload")(jsonPayload)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (logName != null) __obj.updateDynamic("logName")(logName)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (protoPayload != null) __obj.updateDynamic("protoPayload")(protoPayload)
    if (receiveTimestamp != null) __obj.updateDynamic("receiveTimestamp")(receiveTimestamp)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (sourceLocation != null) __obj.updateDynamic("sourceLocation")(sourceLocation)
    if (textPayload != null) __obj.updateDynamic("textPayload")(textPayload)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (trace != null) __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[LogEntry]
  }
}

