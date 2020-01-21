package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecutionInfo extends js.Object {
  /** A mapping from each stage to the information about that stage. */
  var stages: js.UndefOr[Record[String, JobExecutionStageInfo]] = js.undefined
}

object JobExecutionInfo {
  @scala.inline
  def apply(stages: Record[String, JobExecutionStageInfo] = null): JobExecutionInfo = {
    val __obj = js.Dynamic.literal()
    if (stages != null) __obj.updateDynamic("stages")(stages.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecutionInfo]
  }
}

