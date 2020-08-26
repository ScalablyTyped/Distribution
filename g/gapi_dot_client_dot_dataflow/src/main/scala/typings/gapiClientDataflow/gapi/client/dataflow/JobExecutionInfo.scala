package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionInfo extends js.Object {
  /** A mapping from each stage to the information about that stage. */
  var stages: js.UndefOr[Record[String, JobExecutionStageInfo]] = js.native
}

object JobExecutionInfo {
  @scala.inline
  def apply(): JobExecutionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionInfo]
  }
  @scala.inline
  implicit class JobExecutionInfoOps[Self <: JobExecutionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStages(value: Record[String, JobExecutionStageInfo]): Self = this.set("stages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStages: Self = this.set("stages", js.undefined)
  }
  
}

