package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlDeleteModelSnapshot extends Generic {
  var job_id: String = js.native
  var snapshot_id: String = js.native
}

object MlDeleteModelSnapshot {
  @scala.inline
  def apply(job_id: String, snapshot_id: String): MlDeleteModelSnapshot = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteModelSnapshot]
  }
  @scala.inline
  implicit class MlDeleteModelSnapshotOps[Self <: MlDeleteModelSnapshot] (val x: Self) extends AnyVal {
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
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshot_id(value: String): Self = this.set("snapshot_id", value.asInstanceOf[js.Any])
  }
  
}

