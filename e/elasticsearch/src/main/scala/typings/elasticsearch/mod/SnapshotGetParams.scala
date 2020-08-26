package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotGetParams extends GenericParams {
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  var repository: String = js.native
  var snapshot: NameList = js.native
}

object SnapshotGetParams {
  @scala.inline
  def apply(repository: String, snapshot: NameList): SnapshotGetParams = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotGetParams]
  }
  @scala.inline
  implicit class SnapshotGetParamsOps[Self <: SnapshotGetParams] (val x: Self) extends AnyVal {
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
    def setSnapshot(value: NameList): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = this.set("ignoreUnavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnavailable: Self = this.set("ignoreUnavailable", js.undefined)
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = this.set("masterTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterTimeout: Self = this.set("masterTimeout", js.undefined)
  }
  
}

