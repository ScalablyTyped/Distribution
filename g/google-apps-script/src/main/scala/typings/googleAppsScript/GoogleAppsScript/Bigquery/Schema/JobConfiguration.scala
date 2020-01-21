package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfiguration extends js.Object {
  var copy: js.UndefOr[JobConfigurationTableCopy] = js.undefined
  var dryRun: js.UndefOr[Boolean] = js.undefined
  var extract: js.UndefOr[JobConfigurationExtract] = js.undefined
  var jobTimeoutMs: js.UndefOr[String] = js.undefined
  var jobType: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[js.Object] = js.undefined
  var load: js.UndefOr[JobConfigurationLoad] = js.undefined
  var query: js.UndefOr[JobConfigurationQuery] = js.undefined
}

object JobConfiguration {
  @scala.inline
  def apply(
    copy: JobConfigurationTableCopy = null,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    extract: JobConfigurationExtract = null,
    jobTimeoutMs: String = null,
    jobType: String = null,
    labels: js.Object = null,
    load: JobConfigurationLoad = null,
    query: JobConfigurationQuery = null
  ): JobConfiguration = {
    val __obj = js.Dynamic.literal()
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (extract != null) __obj.updateDynamic("extract")(extract.asInstanceOf[js.Any])
    if (jobTimeoutMs != null) __obj.updateDynamic("jobTimeoutMs")(jobTimeoutMs.asInstanceOf[js.Any])
    if (jobType != null) __obj.updateDynamic("jobType")(jobType.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobConfiguration]
  }
}

