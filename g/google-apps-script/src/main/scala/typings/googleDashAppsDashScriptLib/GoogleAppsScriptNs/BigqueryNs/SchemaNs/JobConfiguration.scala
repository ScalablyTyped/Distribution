package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfiguration extends js.Object {
  var copy: js.UndefOr[JobConfigurationTableCopy] = js.undefined
  var dryRun: js.UndefOr[scala.Boolean] = js.undefined
  var extract: js.UndefOr[JobConfigurationExtract] = js.undefined
  var jobTimeoutMs: js.UndefOr[java.lang.String] = js.undefined
  var jobType: js.UndefOr[java.lang.String] = js.undefined
  var labels: js.UndefOr[js.Object] = js.undefined
  var load: js.UndefOr[JobConfigurationLoad] = js.undefined
  var query: js.UndefOr[JobConfigurationQuery] = js.undefined
}

object JobConfiguration {
  @scala.inline
  def apply(
    copy: JobConfigurationTableCopy = null,
    dryRun: js.UndefOr[scala.Boolean] = js.undefined,
    extract: JobConfigurationExtract = null,
    jobTimeoutMs: java.lang.String = null,
    jobType: java.lang.String = null,
    labels: js.Object = null,
    load: JobConfigurationLoad = null,
    query: JobConfigurationQuery = null
  ): JobConfiguration = {
    val __obj = js.Dynamic.literal()
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (extract != null) __obj.updateDynamic("extract")(extract)
    if (jobTimeoutMs != null) __obj.updateDynamic("jobTimeoutMs")(jobTimeoutMs)
    if (jobType != null) __obj.updateDynamic("jobType")(jobType)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (load != null) __obj.updateDynamic("load")(load)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[JobConfiguration]
  }
}

