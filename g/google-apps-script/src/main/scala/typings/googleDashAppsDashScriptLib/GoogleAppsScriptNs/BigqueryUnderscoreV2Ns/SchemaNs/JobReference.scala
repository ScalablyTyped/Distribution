package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobReference extends js.Object {
  var jobId: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

object JobReference {
  @scala.inline
  def apply(
    jobId: java.lang.String = null,
    location: java.lang.String = null,
    projectId: java.lang.String = null
  ): JobReference = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (location != null) __obj.updateDynamic("location")(location)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[JobReference]
  }
}

