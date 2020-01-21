package typings.gapiClientBigquery.gapi.client.bigquery

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfiguration extends js.Object {
  /** [Pick one] Copies a table. */
  var copy: js.UndefOr[JobConfigurationTableCopy] = js.undefined
  /**
    * [Optional] If set, don't actually run this job. A valid query will return a mostly empty response with some processing statistics, while an invalid
    * query will return the same error it would if it wasn't a dry run. Behavior of non-query jobs is undefined.
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  /** [Pick one] Configures an extract job. */
  var extract: js.UndefOr[JobConfigurationExtract] = js.undefined
  /**
    * [Experimental] The labels associated with this job. You can use these to organize and group your jobs. Label keys and values can be no longer than 63
    * characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are
    * optional. Label keys must start with a letter and each label in the list must have a different key.
    */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /** [Pick one] Configures a load job. */
  var load: js.UndefOr[JobConfigurationLoad] = js.undefined
  /** [Pick one] Configures a query job. */
  var query: js.UndefOr[JobConfigurationQuery] = js.undefined
}

object JobConfiguration {
  @scala.inline
  def apply(
    copy: JobConfigurationTableCopy = null,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    extract: JobConfigurationExtract = null,
    labels: Record[String, String] = null,
    load: JobConfigurationLoad = null,
    query: JobConfigurationQuery = null
  ): JobConfiguration = {
    val __obj = js.Dynamic.literal()
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (extract != null) __obj.updateDynamic("extract")(extract.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobConfiguration]
  }
}

