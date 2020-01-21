package typings.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogSink extends js.Object {
  /**
    * Required. The export destination:
    * "storage.googleapis.com/[GCS_BUCKET]"
    * "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]"
    * "pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]"
    * The sink's writer_identity, set when the sink is created, must have permission to write to the destination or else the log entries are not exported.
    * For more information, see Exporting Logs With Sinks.
    */
  var destination: js.UndefOr[String] = js.undefined
  /** Deprecated. This field is ignored when creating or updating sinks. */
  var endTime: js.UndefOr[String] = js.undefined
  /**
    * Optional. An advanced logs filter. The only exported log entries are those that are in the resource owning the sink and that match the filter. For
    * example:
    * logName="projects/[PROJECT_ID]/logs/[LOG_ID]" AND severity>=ERROR
    */
  var filter: js.UndefOr[String] = js.undefined
  /**
    * Optional. This field applies only to sinks owned by organizations and folders. If the field is false, the default, only the logs owned by the sink's
    * parent resource are available for export. If the field is true, then logs from all the projects, folders, and billing accounts contained in the sink's
    * parent resource are also available for export. Whether a particular log entry from the children is exported depends on the sink's filter expression.
    * For example, if this field is true, then the filter resource.type=gce_instance would export all Compute Engine VM instance log entries from all
    * projects in the sink's parent. To only export entries from certain child projects, filter on the project part of the log name:
    * logName:("projects/test-project1/" OR "projects/test-project2/") AND
    * resource.type=gce_instance
    */
  var includeChildren: js.UndefOr[Boolean] = js.undefined
  /**
    * Required. The client-assigned sink identifier, unique within the project. Example: "my-syslog-errors-to-pubsub". Sink identifiers are limited to 100
    * characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Deprecated. The log entry format to use for this sink's exported log entries. The v2 format is used by default and cannot be changed. */
  var outputVersionFormat: js.UndefOr[String] = js.undefined
  /** Deprecated. This field is ignored when creating or updating sinks. */
  var startTime: js.UndefOr[String] = js.undefined
  /**
    * Output only. An IAM identity&mdash;a service account or group&mdash;under which Stackdriver Logging writes the exported log entries to the sink's
    * destination. This field is set by sinks.create and sinks.update, based on the setting of unique_writer_identity in those methods.Until you grant this
    * identity write-access to the destination, log entry exports from this sink will fail. For more information, see Granting access for a resource. Consult
    * the destination service's documentation to determine the appropriate IAM roles to assign to the identity.
    */
  var writerIdentity: js.UndefOr[String] = js.undefined
}

object LogSink {
  @scala.inline
  def apply(
    destination: String = null,
    endTime: String = null,
    filter: String = null,
    includeChildren: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    outputVersionFormat: String = null,
    startTime: String = null,
    writerIdentity: String = null
  ): LogSink = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(includeChildren)) __obj.updateDynamic("includeChildren")(includeChildren.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputVersionFormat != null) __obj.updateDynamic("outputVersionFormat")(outputVersionFormat.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (writerIdentity != null) __obj.updateDynamic("writerIdentity")(writerIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogSink]
  }
}

