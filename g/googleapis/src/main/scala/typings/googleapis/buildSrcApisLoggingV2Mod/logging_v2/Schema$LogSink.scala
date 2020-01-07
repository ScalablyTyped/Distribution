package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a sink used to export log entries to one of the following
  * destinations in any project: a Cloud Storage bucket, a BigQuery dataset, or
  * a Cloud Pub/Sub topic. A logs filter controls which log entries are
  * exported. The sink must be created within a project, organization, billing
  * account, or folder.
  */
@js.native
trait Schema$LogSink extends js.Object {
  /**
    * Output only. The creation timestamp of the sink.This field may not be
    * present for older sinks.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Required. The export destination:
    * &quot;storage.googleapis.com/[GCS_BUCKET]&quot;
    * &quot;bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]&quot;
    * &quot;pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]&quot;
    * The sink&#39;s writer_identity, set when the sink is created, must have
    * permission to write to the destination or else the log entries are not
    * exported. For more information, see Exporting Logs with Sinks.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * Optional. An advanced logs filter. The only exported log entries are
    * those that are in the resource owning the sink and that match the filter.
    * For example: logName=&quot;projects/[PROJECT_ID]/logs/[LOG_ID]&quot; AND
    * severity&gt;=ERROR
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional. This field applies only to sinks owned by organizations and
    * folders. If the field is false, the default, only the logs owned by the
    * sink&#39;s parent resource are available for export. If the field is
    * true, then logs from all the projects, folders, and billing accounts
    * contained in the sink&#39;s parent resource are also available for
    * export. Whether a particular log entry from the children is exported
    * depends on the sink&#39;s filter expression. For example, if this field
    * is true, then the filter resource.type=gce_instance would export all
    * Compute Engine VM instance log entries from all projects in the
    * sink&#39;s parent. To only export entries from certain child projects,
    * filter on the project part of the log name:
    * logName:(&quot;projects/test-project1/&quot; OR
    * &quot;projects/test-project2/&quot;) AND resource.type=gce_instance
    */
  var includeChildren: js.UndefOr[Boolean] = js.native
  /**
    * Required. The client-assigned sink identifier, unique within the project.
    * Example: &quot;my-syslog-errors-to-pubsub&quot;. Sink identifiers are
    * limited to 100 characters and can include only the following characters:
    * upper and lower-case alphanumeric characters, underscores, hyphens, and
    * periods.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. The log entry format to use for this sink&#39;s exported log
    * entries. The v2 format is used by default and cannot be changed.
    */
  var outputVersionFormat: js.UndefOr[String] = js.native
  /**
    * Output only. The last update timestamp of the sink.This field may not be
    * present for older sinks.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Output only. An IAM identity&amp;mdash;a service account or
    * group&amp;mdash;under which Logging writes the exported log entries to
    * the sink&#39;s destination. This field is set by sinks.create and
    * sinks.update based on the value of unique_writer_identity in those
    * methods.Until you grant this identity write-access to the destination,
    * log entry exports from this sink will fail. For more information, see
    * Granting Access for a Resource. Consult the destination service&#39;s
    * documentation to determine the appropriate IAM roles to assign to the
    * identity.
    */
  var writerIdentity: js.UndefOr[String] = js.native
}

object Schema$LogSink {
  @scala.inline
  def apply(
    createTime: String = null,
    destination: String = null,
    filter: String = null,
    includeChildren: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    outputVersionFormat: String = null,
    updateTime: String = null,
    writerIdentity: String = null
  ): Schema$LogSink = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(includeChildren)) __obj.updateDynamic("includeChildren")(includeChildren.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputVersionFormat != null) __obj.updateDynamic("outputVersionFormat")(outputVersionFormat.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (writerIdentity != null) __obj.updateDynamic("writerIdentity")(writerIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LogSink]
  }
}

