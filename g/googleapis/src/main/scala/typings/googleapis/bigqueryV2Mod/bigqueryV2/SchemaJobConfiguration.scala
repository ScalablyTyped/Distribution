package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJobConfiguration extends js.Object {
  /**
    * [Pick one] Copies a table.
    */
  var copy: js.UndefOr[SchemaJobConfigurationTableCopy] = js.native
  /**
    * [Optional] If set, don&#39;t actually run this job. A valid query will
    * return a mostly empty response with some processing statistics, while an
    * invalid query will return the same error it would if it wasn&#39;t a dry
    * run. Behavior of non-query jobs is undefined.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  /**
    * [Pick one] Configures an extract job.
    */
  var extract: js.UndefOr[SchemaJobConfigurationExtract] = js.native
  /**
    * [Optional] Job timeout in milliseconds. If this time limit is exceeded,
    * BigQuery may attempt to terminate the job.
    */
  var jobTimeoutMs: js.UndefOr[String] = js.native
  /**
    * [Output-only] The type of the job. Can be QUERY, LOAD, EXTRACT, COPY or
    * UNKNOWN.
    */
  var jobType: js.UndefOr[String] = js.native
  /**
    * The labels associated with this job. You can use these to organize and
    * group your jobs. Label keys and values can be no longer than 63
    * characters, can only contain lowercase letters, numeric characters,
    * underscores and dashes. International characters are allowed. Label
    * values are optional. Label keys must start with a letter and each label
    * in the list must have a different key.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * [Pick one] Configures a load job.
    */
  var load: js.UndefOr[SchemaJobConfigurationLoad] = js.native
  /**
    * [Pick one] Configures a query job.
    */
  var query: js.UndefOr[SchemaJobConfigurationQuery] = js.native
}

object SchemaJobConfiguration {
  @scala.inline
  def apply(
    copy: SchemaJobConfigurationTableCopy = null,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    extract: SchemaJobConfigurationExtract = null,
    jobTimeoutMs: String = null,
    jobType: String = null,
    labels: StringDictionary[String] = null,
    load: SchemaJobConfigurationLoad = null,
    query: SchemaJobConfigurationQuery = null
  ): SchemaJobConfiguration = {
    val __obj = js.Dynamic.literal()
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (extract != null) __obj.updateDynamic("extract")(extract.asInstanceOf[js.Any])
    if (jobTimeoutMs != null) __obj.updateDynamic("jobTimeoutMs")(jobTimeoutMs.asInstanceOf[js.Any])
    if (jobType != null) __obj.updateDynamic("jobType")(jobType.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobConfiguration]
  }
}

