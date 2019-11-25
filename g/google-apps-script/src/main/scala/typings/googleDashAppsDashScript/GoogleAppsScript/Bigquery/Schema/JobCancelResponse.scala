package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

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
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCancelResponse]
  }
}

