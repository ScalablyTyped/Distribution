package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$JobCancelResponse extends js.Object {
  /**
    * The final state of the job.
    */
  var job: js.UndefOr[Schema$Job] = js.native
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$JobCancelResponse {
  @scala.inline
  def apply(job: Schema$Job = null, kind: String = null): Schema$JobCancelResponse = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$JobCancelResponse]
  }
}

