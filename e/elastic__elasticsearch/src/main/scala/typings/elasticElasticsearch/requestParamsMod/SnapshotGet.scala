package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotGet extends Generic {
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var repository: String = js.native
  var snapshot: String | js.Array[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object SnapshotGet {
  @scala.inline
  def apply(repository: String, snapshot: String | js.Array[String]): SnapshotGet = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotGet]
  }
  @scala.inline
  implicit class SnapshotGetOps[Self <: SnapshotGet] (val x: Self) extends AnyVal {
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
    def setSnapshotVarargs(value: String*): Self = this.set("snapshot", js.Array(value :_*))
    @scala.inline
    def setSnapshot(value: String | js.Array[String]): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnore_unavailable(value: Boolean): Self = this.set("ignore_unavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore_unavailable: Self = this.set("ignore_unavailable", js.undefined)
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

