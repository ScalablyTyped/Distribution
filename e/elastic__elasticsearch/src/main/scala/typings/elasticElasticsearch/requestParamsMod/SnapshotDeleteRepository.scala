package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotDeleteRepository extends Generic {
  var master_timeout: js.UndefOr[String] = js.native
  var repository: String | js.Array[String] = js.native
  var timeout: js.UndefOr[String] = js.native
}

object SnapshotDeleteRepository {
  @scala.inline
  def apply(repository: String | js.Array[String]): SnapshotDeleteRepository = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotDeleteRepository]
  }
  @scala.inline
  implicit class SnapshotDeleteRepositoryOps[Self <: SnapshotDeleteRepository] (val x: Self) extends AnyVal {
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
    def setRepositoryVarargs(value: String*): Self = this.set("repository", js.Array(value :_*))
    @scala.inline
    def setRepository(value: String | js.Array[String]): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

