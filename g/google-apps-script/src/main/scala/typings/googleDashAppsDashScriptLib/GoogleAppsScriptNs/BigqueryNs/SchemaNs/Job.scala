package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  var configuration: js.UndefOr[JobConfiguration] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var jobReference: js.UndefOr[JobReference] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var statistics: js.UndefOr[JobStatistics] = js.undefined
  var status: js.UndefOr[JobStatus] = js.undefined
  var user_email: js.UndefOr[java.lang.String] = js.undefined
}

object Job {
  @scala.inline
  def apply(
    configuration: JobConfiguration = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    jobReference: JobReference = null,
    kind: java.lang.String = null,
    selfLink: java.lang.String = null,
    statistics: JobStatistics = null,
    status: JobStatus = null,
    user_email: java.lang.String = null
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (jobReference != null) __obj.updateDynamic("jobReference")(jobReference)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (status != null) __obj.updateDynamic("status")(status)
    if (user_email != null) __obj.updateDynamic("user_email")(user_email)
    __obj.asInstanceOf[Job]
  }
}

