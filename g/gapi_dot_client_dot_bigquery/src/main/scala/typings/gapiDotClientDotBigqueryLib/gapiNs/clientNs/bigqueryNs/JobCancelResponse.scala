package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCancelResponse extends js.Object {
  /** The final state of the job. */
  var job: js.UndefOr[Job] = js.undefined
  /** The resource type of the response. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object JobCancelResponse {
  @scala.inline
  def apply(job: Job = null, kind: java.lang.String = null): JobCancelResponse = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[JobCancelResponse]
  }
}

