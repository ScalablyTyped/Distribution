package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupStopJob extends Generic {
  var id: String = js.native
  var timeout: js.UndefOr[String] = js.native
  var wait_for_completion: js.UndefOr[Boolean] = js.native
}

object RollupStopJob {
  @scala.inline
  def apply(id: String): RollupStopJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupStopJob]
  }
  @scala.inline
  implicit class RollupStopJobOps[Self <: RollupStopJob] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = this.set("wait_for_completion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_completion: Self = this.set("wait_for_completion", js.undefined)
  }
  
}

