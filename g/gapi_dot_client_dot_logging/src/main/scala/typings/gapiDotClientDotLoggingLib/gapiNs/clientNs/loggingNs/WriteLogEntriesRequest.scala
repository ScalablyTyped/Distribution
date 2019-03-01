package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteLogEntriesRequest extends js.Object {
  /**
    * Required. The log entries to send to Stackdriver Logging. The order of log entries in this list does not matter. Values supplied in this method's
    * log_name, resource, and labels fields are copied into those log entries in this list that do not include values for their corresponding fields. For
    * more information, see the LogEntry type.If the timestamp or insert_id fields are missing in log entries, then this method supplies the current time or
    * a unique identifier, respectively. The supplied values are chosen so that, among the log entries that did not supply their own values, the entries
    * earlier in the list will sort before the entries later in the list. See the entries.list method.Log entries with timestamps that are more than the logs
    * retention period in the past or more than 24 hours in the future might be discarded. Discarding does not return an error.To improve throughput and to
    * avoid exceeding the quota limit for calls to entries.write, you should try to include several log entries in this list, rather than calling this method
    * for each individual log entry.
    */
  var entries: js.UndefOr[js.Array[LogEntry]] = js.undefined
  /**
    * Optional. Default labels that are added to the labels field of all log entries in entries. If a log entry already has a label with the same key as a
    * label in this parameter, then the log entry's label is not changed. See LogEntry.
    */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
    * Optional. A default log resource name that is assigned to all log entries in entries that do not specify a value for log_name:
    * "projects/[PROJECT_ID]/logs/[LOG_ID]"
    * "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
    * "folders/[FOLDER_ID]/logs/[LOG_ID]"
    * [LOG_ID] must be URL-encoded. For example, "projects/my-project-id/logs/syslog" or
    * "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity". For more information about log names, see LogEntry.
    */
  var logName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. Whether valid entries should be written even if some other entries fail due to INVALID_ARGUMENT or PERMISSION_DENIED errors. If any entry is
    * not written, then the response status is the error associated with one of the failed entries and the response includes error details keyed by the
    * entries' zero-based index in the entries.write method.
    */
  var partialSuccess: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. A default monitored resource object that is assigned to all log entries in entries that do not specify a value for resource. Example:
    * { "type": "gce_instance",
    * "labels": {
    * "zone": "us-central1-a", "instance_id": "00000000000000000000" }}
    * See LogEntry.
    */
  var resource: js.UndefOr[MonitoredResource] = js.undefined
}

object WriteLogEntriesRequest {
  @scala.inline
  def apply(
    entries: js.Array[LogEntry] = null,
    labels: stdLib.Record[java.lang.String, java.lang.String] = null,
    logName: java.lang.String = null,
    partialSuccess: js.UndefOr[scala.Boolean] = js.undefined,
    resource: MonitoredResource = null
  ): WriteLogEntriesRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (logName != null) __obj.updateDynamic("logName")(logName)
    if (!js.isUndefined(partialSuccess)) __obj.updateDynamic("partialSuccess")(partialSuccess)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[WriteLogEntriesRequest]
  }
}

