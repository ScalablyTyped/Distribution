package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchableSnapshotsRepositoryStats extends Generic {
  var repository: String = js.native
}

object SearchableSnapshotsRepositoryStats {
  @scala.inline
  def apply(repository: String): SearchableSnapshotsRepositoryStats = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableSnapshotsRepositoryStats]
  }
  @scala.inline
  implicit class SearchableSnapshotsRepositoryStatsOps[Self <: SearchableSnapshotsRepositoryStats] (val x: Self) extends AnyVal {
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
  }
  
}

