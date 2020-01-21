package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCancelResponse extends js.Object {
  /** The final state of the job. */
  var job: js.UndefOr[Job] = js.undefined
  /** The resource type of the response. */
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

