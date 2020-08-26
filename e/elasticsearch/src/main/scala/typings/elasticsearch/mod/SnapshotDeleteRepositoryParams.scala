package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotDeleteRepositoryParams extends GenericParams {
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  var repository: String = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
}

object SnapshotDeleteRepositoryParams {
  @scala.inline
  def apply(repository: String): SnapshotDeleteRepositoryParams = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotDeleteRepositoryParams]
  }
  @scala.inline
  implicit class SnapshotDeleteRepositoryParamsOps[Self <: SnapshotDeleteRepositoryParams] (val x: Self) extends AnyVal {
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
    def setMasterTimeout(value: TimeSpan): Self = this.set("masterTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterTimeout: Self = this.set("masterTimeout", js.undefined)
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

