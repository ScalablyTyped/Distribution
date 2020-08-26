package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotDelete extends Generic {
  var master_timeout: js.UndefOr[String] = js.native
  var repository: String = js.native
  var snapshot: String = js.native
}

object SnapshotDelete {
  @scala.inline
  def apply(repository: String, snapshot: String): SnapshotDelete = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotDelete]
  }
  @scala.inline
  implicit class SnapshotDeleteOps[Self <: SnapshotDelete] (val x: Self) extends AnyVal {
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
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshot(value: String): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
  }
  
}

