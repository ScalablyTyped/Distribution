package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotGetRepository extends Generic {
  var local: js.UndefOr[Boolean] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var repository: js.UndefOr[String | js.Array[String]] = js.native
}

object SnapshotGetRepository {
  @scala.inline
  def apply(): SnapshotGetRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotGetRepository]
  }
  @scala.inline
  implicit class SnapshotGetRepositoryOps[Self <: SnapshotGetRepository] (val x: Self) extends AnyVal {
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
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    @scala.inline
    def setRepositoryVarargs(value: String*): Self = this.set("repository", js.Array(value :_*))
    @scala.inline
    def setRepository(value: String | js.Array[String]): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
  }
  
}

