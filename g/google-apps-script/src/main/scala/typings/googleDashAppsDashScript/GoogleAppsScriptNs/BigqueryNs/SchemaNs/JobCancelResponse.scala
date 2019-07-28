package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCancelResponse extends js.Object {
  var job: js.UndefOr[Job] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object JobCancelResponse {
  @scala.inline
  def apply(job: Job = null, kind: String = null): JobCancelResponse = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[JobCancelResponse]
  }
}

