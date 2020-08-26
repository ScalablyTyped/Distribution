package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotCreate[T] extends Generic {
  var body: js.UndefOr[T] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var repository: String = js.native
  var snapshot: String = js.native
  var wait_for_completion: js.UndefOr[Boolean] = js.native
}

object SnapshotCreate {
  @scala.inline
  def apply[T](repository: String, snapshot: String): SnapshotCreate[T] = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCreate[T]]
  }
  @scala.inline
  implicit class SnapshotCreateOps[Self <: SnapshotCreate[_], T] (val x: Self with SnapshotCreate[T]) extends AnyVal {
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = this.set("wait_for_completion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_completion: Self = this.set("wait_for_completion", js.undefined)
  }
  
}

